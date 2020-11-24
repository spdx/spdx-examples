# Example 6

## Description

```
content
├── build
│   └── hello
└── src
    ├── Makefile
    └── hello.go
```

The content is identical to [example5](../example5).
Nothing has changed -- in fact, the comments still refer to "Example 5" -- for illustration purposes, so that the file hashes are identical to those in Example 5.

The differences are in the SPDX documents.
The [sources SPDX document](spdx/example6-src.spdx) is substantively identical to its Example 5 counterpart.
However, we've introduced [a new (third) SPDX document](spdx/example6-lib.spdx), this one describing the Go distribution used to build the Hello World program, along with Packages describing a small portion of its contents.
The [binary SPDX document](spdx/example6-bin.spdx) then includes Relationships describing how some portions of the Go distribution relate to the build results -- e.g., referencing the compiler used to build it, and the standard libraries that are incorporated into / statically linked with the binary.

## Comments

### Describing the Go distribution / standard libraries

The model used here is one where the Go distribution and standard libraries are described in their own separate SPDX document.
It does not need to be structured this way.
For example, the SPDX document creator could incorporate all of the details about the Go libraries directly in the binaries document.

One advantage of creating a separate "libraries" document, though, is that it helps illustrate how SPDX documents can be reused by reference.
A software packager -- e.g., the distributor of the Go libraries -- could create and publish an SPDX document with a full set of details about that distribution.
Downstream folks who use the Go distribution / libraries to build their own software could then refer back to the distributor's SPDX document via an `ExternalDocumentRef` property.
This would enable the distributor's SPDX document to become a "single source of truth" for metadata about the distribution.

### Package details

In this example, I've also gone into greater detail about the Go distribution I used, to demonstrate some of the optional fields.
These fields are fully documented in the [SPDX spec](https://spdx.github.io/spdx-spec/3-package-information/), but here are a few comments:
* I compiled this example using a distribution of Go installed via a Ubuntu snap package. Because of that, the "PackageSupplier" (Canonical) is the immediate / most recent step in the distribution chain, but the "PackageOriginator" (Google) is the primary upstream project organization.
* Even though I have the particular snap file and checksum, from a cursory review I wasn't able to determine a download location for the snap file, so `PackageDownloadLocation` is `NOASSERTION`.
* `FilesAnalyzed: false`: We are not listing out all of the files from the distribution.
* Some of the fields, like `PackageSourceInfo` and `PackageSummary`, are optional free-text fields. There are several others describe in the Package Information section of the SPDX spec.

### Libraries

After defining the Go distribution as a Package, we then define a few other Packages that correspond to subcomponents of the Go distribution:
* `SPDXRef-Package-go-compiler` refers to the `go` command.
* `SPDXRef-Package-go.fmt` refers to the `fmt` standard library package.
* There are also Packages defined for the `reflect` and `strconv` libraries as well.

Each of these Packages is then declared as being contained in the Go distribution via a `CONTAINS` Relationship.

Note that this document intentionally does not include an exhaustive list of all packages or standard libraries in the Go distribution.
There's no reason it couldn't, but for illustrative purposes I am only showing a few libraries.

### Non-standard license

Golang is distributed under a non-standard license: BSD-3-Clause with an additional custom patent license grant.
(For those of you keeping score at home, no, this is not the same as the old "BSD-plus-Patents" license that React used to use which caused some controversy a few years back.)

Because the license is non-standard, it is not on the [SPDX License List](https://spdx.org/licenses).
That means that there is not an existing pre-defined license identifier that we can use for it.
Instead, we can define a "LicenseRef-", also called an "Other License Information" section in the [SPDX spec](https://spdx.github.io/spdx-spec/6-other-licensing-information-detected/).
This defines a new license identifier, beginning with the prefix `LicenseRef-`, which is in scope solely for this single SPDX document.
After defining the License ID and corresponding license text for `LicenseRef-Golang-BSD-plus-Patents`, we can then use that license identifier in e.g. the `PackageLicenseDeclared` field for the Go distribution.

### Binary SPDX document

With an SPDX document defining the Go distribution and standard libraries, we can then reference that document in the binaries document via an `ExternalDocumentRef`.
That enables us to then create Relationships referring to the Go distribution's components, just like we have been doing for SPDX elements defined in the sources SPDX document for our application.

Our [original source file](content/src/hello.go) imports the `"fmt"` library.
Because of that, the binaries document includes a `RUNTIME_DEPENDENCY_OF` Relationship.
There are a variety of `*_DEPENDENCY_OF` [Relationship types](https://spdx.github.io/spdx-spec/7-relationships-between-SPDX-elements/), and the SPDX document creator may use any or all of them depending on their particular use case.
Keep in mind that SPDX is a language, and just like a regular spoken language, multiple words might be usable in place of one another depending on the desired context or connotation.

This SPDX document also lists a `STATIC_LINK` Relationship between the binary and the `fmt` library.
This is because (if I'm understanding the `nm` command's output correctly) the built binary contains content from the `fmt` library, which I believe indicates that some portions of the `fmt` library are statically linked / incorporated into the binary itself.

The `nm` command also indicates that several other Golang standard library packages (including, among others, `reflect` and `strconv`) are also included in the binary.
These might be present because they are subdependencies of `fmt`, or for other purposes.
Since I don't know whether they are in fact dependencies, I have not included any `*_DEPENDENCY_OF` Relationships, but I have included a `STATIC_LINK` Relationship since they are in fact present in the binary.

As shown in the Relationships, SPDX elements (such as Packages and Files) can be referenced from a separate SPDX document via a `DocumentRef-` identifier.
However, custom licenses with a `LicenseRef-` prefix cannot currently be referenced from a separate SPDX document.
(This is under consideration to change in SPDX 3.0.)
For SPDX 2.2 documents, this means that the "other license info" section needs to be re-included in the binary document so that the custom license's `LicenseRef-` ID can be used.
