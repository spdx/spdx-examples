# Example 7

## Description

```
content
├── build
│   └── hello
└── src
    └── hello
        ├── hello.go
        ├── go.mod
        └── go.sum
```

The content is similar to [example6](../example6) except an external module has been imported. The source is from the [Go Tutorial](https://golang.org/doc/tutorial/getting-started#call) on using an external package. The development workflow uses go modules to create a manifest file called `go.mod` and a checksum file called `go.sum`. You will see from the go.mod file that the go version used is go 1.16. The go binary was downloaded from [golang.org](https://golang.org/dl/) which is the canonical URL to download new go versions, including via the `go get` command. I have downloaded the linux amd64 build of the golang binary.

## Comments

### Describing the Go binary, Go standard libraries, and external go modules

As in example6, the Go binary, The Golang distribution, and the external go modules are described in their own separate SPDX documents.

The advantage of creating separate documents is that it reduces the load on SPDX document producers. Ideally, the supplier of each component generates their own SPDX document and downstream consumers can reference those documents in their document via an `ExternalDocumentRef` property.
This would also enable the supplier's SPDX document to become a "single source of truth" for metadata about the distribution.

### Package details

This example reflects the workflow of a golang developer. As such, there are some differences with example6:
* The Golang binary is downloaded from Golang.org as per the website's instructions. Therefore, I assume the originator is "Golang.org". In this case I know the exact URL where I had downloaded the golang distribution from.
* The external modules downloaded from `rsc.io` is less certain because go supports vanity import paths which redirect the network call to a VCS. Therefore `rsc.io` is not the canonical download location. I have used [pURL](https://github.com/package-url/purl-spec) to describe the download location.
* `FilesAnalyzed: false`: Developers think in terms of modules and the final binary distribution. File level knowledge is only restricted to their module. Here, I do not include `go.mod`, `go.sum`, and `hello.go` in my `Package` definition.
* Some of the fields, like `PackageSourceInfo` and `PackageSummary`, are optional free-text fields. There are several others describe in the Package Information section of the SPDX spec.

### hello module

This is the source code for the hello module. Go modules require a namespace. Here the namespace is `example.com` but if this code were to be hosted in a Github repository, the namespace would be the repository path. The `go.mod` and the `go.sum` files were generated using the `go` command. So the actual source file is `hello.go`.

### Third party modules

The list of third party modules was taken from the output of `go list -m all` which will list the hello module as well. Ideally, this document would have external references to each of the module's SPDX document, but we are not there yet. So we will include all the module information in one SPDX document. Each module is a package. I haven't added `FilesAnalyzed` but they can be accessed in the `mod` folder.

## Go Distribution and binary

The SPDX document for the golang distribution has more information than the `go` binary itself. Ideally, the suppliers of the golang distribution would have a corresponding SPDX document with all the components listed. In this case, I have only included the distribution and the `go` binary as the "compiler".

## Hello binary

The SPDX documents for the hello module, the third party modules and the golang distribution do not have any relationships in them for simplicity. The hello binary SPDX document references these three documents and describes the relationships between the hello binary and the other documents.

For external document references, the documents need to be checksummed from the bottom of the tree on up. So the hello module, golang dist module and third party module SPDX documents where checksummed first before adding them to the hello binary SPDX document. If someone were to use the hello module, they will reference this document's checksum.
