# Example 4

## Description

```
content
├── build
│   ├── lib.so
│   └── main
└── src
    ├── Makefile
    ├── lib.c
    └── main.c
```

The content for example4 is identical to example3.
The only difference is in the SPDX document for the binaries.

Like example3, we are again representing the dependency and dynamic-linking relationship between the binary files.
In example4, however, we are additionally representing the dependency and dynamic-linking relationship with on-disk shared libraries that are expected to be provided by the operating system

## Comments

According to `readelf`, the example4 binary `main` relies on two shared libraries provided by the OS:

```bash
> readelf -d main | grep NEEDED
 0x0000000000000001 (NEEDED)             Shared library: [libdl.so.2]
 0x0000000000000001 (NEEDED)             Shared library: [libc.so.6]
```

In [`example4-bin.spdx`](spdx/example4-bin.spdx), we can create Package Information sections for each of `libdl` and `libc`.
Keep in mind that these are _not_ files that are provided by the software distribution that the SPDX documents reflect: the `content/` directory does not contain libdl.so.2 or libc.so.6.
Because they are not part of the software distribution that the SPDX document is primarily describing, there is _not_ a `DESCRIBES` relationship between the document and these shared libraries.

The Package Information sections for `libdl` and `libc` are not particularly descriptive.
The sections represent these shared libraries, but they do not represent a specific instance of them.
If we wanted to identify the exact, specific file(s) comprising these dependencies, we would specify `FilesAnalyzed: true` and would list a File Information section for each corresponding file.
For purposes of this example, the document does not provide analysis information for the files, so `FilesAnalyzed` is `false`.

Note also that `PackageDownloadLocation` and the licensing and copyright fields are all filled in as `NOASSERTION`.
The 2.2 version of the spec requires these fields to be present even if we are not providing any information (note that these are all likely to become optional in version 3.0 of the SPDX spec).
If the SPDX document creator wished to provide more information about these libraries, any of these fields (and any of the other optional fields) could of course be included.
