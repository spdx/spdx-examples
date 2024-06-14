# SPDX Software Usage Examples

This repository includes demonstrations of [SPDX documents](https://spdx.dev) for various examples of software combinations.

The examples include source code and built / packaged binaries for a variety of scenarios. The software in the repository is (for the most part) not taken from real projects. However, the examples are intended to be demonstrations of how SPDX can convey software bill of materials (SBOM) information for a variety of real-world scenarios.

## Format of examples

Directories of the form `example#` are structured as follows:

- `content/build/`: contains the example's built artifacts
- `content/src/`: contains the example's source code
- `spdx2.2/`: contains one or more SPDX 2.2 documents (in tag-value or JSON
  format) for the sources and the build artifacts
- `spdx3.0/`: contains one or more SPDX 3.0 documents for the sources and the
  build artifacts
- `README.md`: more details about the particular example

Each directory contains build metadata which is used to create the build artifacts. It assumes that the necessary tools (make, gcc, etc.) are present on your system, and doesn't do any autoconfiguration or the like.

## Examples

|  # | Sources | Binaries | SPDX | Comments |
|----|---------|----------|------|----------|
|  1 | 1 C file | compiled with gcc | 1 document | source and binary treated as one package |
|  2 | 1 C file | compiled with gcc | 2 documents | source and binary in separate packages |
|  3 | 2 C files | compiled with gcc | 2 documents | shared library, dynamically linked at runtime |
|  4 | 2 C files | compiled with gcc | 2 documents | shared library, dynamically linked at runtime, including system libs |
|  5 | 1 Go file | compiled with go | 2 documents | source and binary in separate packages |
|  6 | 1 Go file | compiled with go | 3 documents | source and binary in separate packages, separate doc for standard libs |
|  7 | 1 Go file | compiled with go | 4 documents | JSON SPDX doc; source and binary in separate packages, separate docs for go tools and third-party module; thank you @nishakm! |
|  8 | 2 Java files | generated from Maven | 1 document | Simple Maven Java project with a minimal set of dependencies |
|  9 | 2 Java files | generated from Gradle | 1 document |a copy of the [App-BOM-ination SPDX example](https://github.com/yevster/App-BOM-ination) contributed by @yevster for the SPDX spec version 2.0 docfest |
| 10 | 1 Python file | python package | 1 document | packaged using the [instructions from python.org](https://packaging.python.org/en/latest/tutorials/packaging-projects/) |
| 11 | 1 Rust file | compiled with Cargo | 1 document | SBOM describing both source and artifact, related with GENERATED_FROM |
| 12 | 1 Ruby library | built using `bundle` | 1 document | SBOM describing Ruby library packaged in a gem |
| 13 | Bundled app with a package and container | No compiling - hypothetical example | Documents in progress | SBOM describing a hypothetical "Acme Aplication" |
