---
SPDX-FileType: DOCUMENTATION
SPDX-License-Identifier: CC-BY-4.0
---

# Example 02

## Description

This example illustrates a software bill of materials (SBOM) for an AI
application that employs machine learning to perform a text sentiment analysis.

The SBOM ([spdx3.0/sbom.spdx.json](./spdx3.0/sbom.spdx.json)) demonstrates
the structure between `AIPackage`, `DatasetPackage`, and their technical
documentation through (lifecycle-scoped) relationship types such as
`dependsOn`,
`generates`,
`hasDataFile`,
`hasDocumentation`,
`testedOn`, and
`trainedOn`.

[![A diagram showing relationships between elements in the Sentiment Demo package (Example 2).](./sbom-spdx3.png "A diagram showing relationships between elements in the Sentiment Demo package (Example 2).")](sbom-spdx3.png)

See the [package README](./content/README.md) inside the
[content/](./content/) directory for more details.
