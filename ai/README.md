---
SPDX-FileType: DOCUMENTATION
SPDX-License-Identifier: CC-BY-4.0
---

# SPDX AI Profile Usage Examples

This repository includes demonstrations of [SPDX documents](https://spdx.dev)
for various examples of AI applications and models.

## Format of examples

Directories of the form `example##` are structured as follows:

- `content/`: contains the example's content (data files, source code, etc.)
- `spdx3.0/`: contains one or more SPDX documents for the example
- `spdx3.1/`: contains SPDX 3.1 documents for the example
- `README.md`: more details about the particular example

## Examples

| # | Sources | Binaries | Data | SPDX | Comments |
| - | ------- | -------- | ---- | ---- | -------- |
| [1](./example01/) | - | - | - | 1 document | Demonstrating `dependsOn`, `testedOn`, and `trainedOn` relationships |
| [2](./example02/) | 4 Python files | 1 model file | 3 data files | 1 document | Demonstrating `generates`, `hasDataFile`, and `hasDocumentation` (lifecycle-scoped) relationships |
| [3](./example03/) | - | - | - | 1 document | Demonstrating `/AI/safetyRiskAssessment`, `/AI/standardCompliance`, and `/AI/limitation` (medical AI) |

## Implementing SBOM for AI systems

For more information about implementing AI BOM using SPDX specification,
see *Karen Bennet, Gopi Krishnan Rajbahadur, Arthit Suriyawongkul, and
Kate Stewart, [“Implementing AI Bill of Materials (AI BOM) with SPDX 3.0: A Comprehensive Guide to Creating AI and
Dataset Bill of Materials”](https://www.linuxfoundation.org/research/ai-bom), The Linux Foundation, October 2024*.
