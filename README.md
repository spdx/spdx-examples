# SPDX Examples

This repository includes demonstrations of [SPDX documents](https://spdx.dev) for various examples of software combinations.

The examples include source code and built / packaged binaries for a variety of scenarios. The software in the repository is (for the most part) not taken from real projects. However, the examples are intended to be demonstrations of how SPDX can convey software bill of materials (SBOM) information for a variety of real-world scenarios.

## Format of examples

Each example directory is structured as follows:

- `content/src/`: contains the example's source code
- `content/build/`: contains the example's built artifacts
- `spdx/`: contains one or more tag-value SPDX documents for the sources and the build artifacts
- `README.md`: more details about the particular example

Each directory contains a Makefile which is used to create the build artifacts. It assumes that the necessary tools (make, gcc, etc.) are present on your system, and doesn't do any autoconfiguration or the like. If somebody else wants to add that for greater build flexibility, they are welcome to do so, but that isn't really my goal here  :)

## Examples

|  # | Sources | Binaries | SPDX | Comments |
|----|---------|----------|------|----------|
|  1 | 1 C file|compiled with gcc|1 document|source and binary treated as one package|
|  2 | 1 C file|compiled with gcc|2 documents|source and binary in separate packages|
|  3 | 2 C files|compiled with gcc|2 documents|shared library, dynamically linked at runtime|
|  4 | 2 C files|compiled with gcc|2 documents|shared library, dynamically linked at runtime, including system libs|
|  5 | 2 Go files|compiled with go|2 documents|source and binary in separate packages|
|  6 | 2 Go files|compiled with go|3 documents|source and binary in separate packages, separate doc for standard libs|

## Licenses

Copyright Contributors to the spdx-examples project.

Unless otherwise specified, source code in this repository is licensed under the GNU General Public License, Version 3 or later (GPL-3.0-or-later). A copy is included in the COPYING file.

Other licenses may be specified as well for certain files for purposes of illustration or where third-party components are used.

Documentation in this repository is licensed under the Creative Commons Attribution 4.0 International license (CC-BY-4.0), available at https://creativecommons.org/licenses/by/4.0/.

SPDX documents in this repository are provided under CC0 1.0 Universal (CC0-1.0), available at https://creativecommons.org/publicdomain/zero/1.0/.
