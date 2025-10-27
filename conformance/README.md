# SPDX Examples - Regulatory Conformance

This repository includes representative content of systems which must conform to one or more regulations.
The representative content is intended to cover the types and relationships of information that must be
provided for regulatory conformance assessments. Each of these examples is a preliminary validation check 
that SPDX meets identified needs.  (Note that 'validation' checks that SPDX effort "did the right thing",
while 'verification' checks that the SPDX effort "did the thing right".)

## Format of examples

Directories of the form `example#/` are structured as follows:

- `content/build/`: contains the example's built artifacts
- `content/src/`: contains the example's source code
- `spdx3.1/`: contains one or more SPDX 3.1 documents generated from the example system
- `README.md`: more details about the particular example

Each directory contains build metadata which is used to create the build artifacts. It assumes that the necessary tools (make, gcc, etc.) are present on your system, and doesn't do any autoconfiguration or the like.

## Examples

|  # | System | Regulations | Comments |
|----|--------|-------------|----------|
|  1 | [Consumer Electronics Product Line: Rebrandable Network Interface vi USB Dongle](./example1/README.md) | EU CRA, | Draft (CRA horizontal stds net yet released) |
