---
SPDX-FileType: DOCUMENTATION
SPDX-License-Identifier: CC-BY-4.0
---

# Dataset example 1 - Gas emissions dataset

## Description

An example of a simple dataset in tabular format.

```text
content
├── codebook.csv
└── data.csv
```

Both `codebook.csv` and `data.csv` are plain text files in CSV (comma-separated
values) format.

The file `data.csv` contains records of gas emission data for each year in a
country. It has a header on the first line that defines the column names.
Each record consists mostly of numerical data with some categorical data.

The file `codebook.csv` contains the column names from the header of
`data.csv`, together with their description, unit, and source.

The content of this example is an excerpt of the Our World in Data CO2 and
Greenhouse Gas Emissions dataset. It is available in full, under Creative
Commons Attribution 4.0 International License, at
<https://github.com/owid/co2-data/>.

The SBOM uses `/Dataset/datasetSize` (~200 KB) and `/Dataset/intendedUse`, both
of which are deprecated in SPDX 3.1 in favour of `/Software/artifactSize` and `/Core/intendedUse` respectively.

## SPDX files

| Version | File |
| ------- | ---- |
| SPDX 3.0 | [spdx3.0/example01.spdx3.json](./spdx3.0/example01.spdx3.json) |
| SPDX 3.1 (draft) | [spdx3.1/example01.spdx3.json-draft](./spdx3.1/example01.spdx3.json-draft) |

[![A diagram of Dataset profile example 01 - Simple tabular dataset.](./example01.spdx3.png "A diagram of Dataset profile example 01 - Simple tabular dataset.")](./example01.spdx3.png)
