---
SPDX-FileType: DOCUMENTATION
SPDX-License-Identifier: CC-BY-4.0
---

# SPDX Dataset profile examples

This repository includes demonstrations of [SPDX documents](https://spdx.dev)
for a Dataset Profile.

## Format of examples

Directories of the form `example##` are structured as follows:

- `content/`: contains the example's content (data files, source code, etc.)
- `spdx3.0/`: contains SPDX 3.0 documents for the example
- `spdx3.1/`: contains SPDX 3.1 documents for the example
- `README.md`: more details about the particular example

## Examples

| # | Data | Sources | SPDX 3.0 | SPDX 3.1 | Focus |
| - | ---- | ------- | -------- | -------- | ----- |
| [01](./example01/) | 2 CSV files | - | 1 document | 1 document | Tabular CSV dataset; `dataset_datasetType: structured, timestamp`; **3.0→3.1**: `dataset_datasetSize` → `software_artifactSize`, `dataset_intendedUse` → Core `intendedUse` |
