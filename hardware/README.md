# SPDX Hardware Usage Examples

This repository includes demonstrations of [SPDX documents](https://spdx.dev) for various examples of hardware scopes.

The examples include artifacts for a variety of scenarios. The examples are intended to be demonstrations of how SPDX can convey information for a variety of real-world products and systems.

## Format of examples

Directories of the form `example#` are structured as follows:

- `content/build/`: contains the example's built artifacts
- `content/src/`: contains the example's source code
- `spdx3.1/`: contains one or more SPDX 3.1 documents for the sources and the
  build artifacts
- `README.md`: more details about the particular example

Each directory contains build metadata which is used to create the build artifacts. It assumes that the necessary tools (make, gcc, etc.) are present on your system, and doesn't do any autoconfiguration or the like.

## Examples

|  # | Scope | Artifacts | SPDX | Comments |
|----|---------|----------|------|----------|
