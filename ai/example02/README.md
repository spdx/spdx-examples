---
SPDX-FileType: DOCUMENTATION
SPDX-License-Identifier: CC-BY-4.0
---

# Example 02

## Description

This example illustrates a software bill of materials (SBOM) for an AI
application that employs machine learning to perform a text sentiment analysis.

The SBOM demonstrates the structure between `AIPackage`, `DatasetPackage`,
and their technical documentation through lifecycle-scoped relationship types
(`dependsOn`, `generates`, `hasDataFile`, `hasDocumentation`, `testedOn`, and
`trainedOn`), and captures autonomy level and dataset size --
two properties that migrate in SPDX 3.1:
`ai_autonomyType` is replaced by `isoAutomationLevel: conditionalAutomation`,
and `dataset_datasetSize` is replaced by `software_artifactSize`.

## SPDX files

| Version | File |
| --------- | ------ |
| SPDX 3.0 | [spdx3.0/sbom.spdx3.json](./spdx3.0/sbom.spdx3.json) |
| SPDX 3.1 (draft) | [spdx3.1/sbom.spdx3.json-draft](./spdx3.1/sbom.spdx3.json-draft) |

[![A diagram showing relationships between elements in the Sentiment Demo package (Example 2).](./sbom-spdx3.png "A diagram showing relationships between elements in the Sentiment Demo package (Example 2).")](sbom-spdx3.png)

See the [package README](./content/README.md) inside the
[content/](./content/) directory for more details.
