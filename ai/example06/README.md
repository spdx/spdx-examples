---
SPDX-FileType: DOCUMENTATION
SPDX-License-Identifier: CC-BY-4.0
---

# AI example 6 - Energy consumption reporting

## Description

This example illustrates an SBOM for a large image classification model used
to monitor land use changes from satellite imagery.

The SBOM demonstrates the **`/AI/energyConsumption` structure** - the primary
focus of this example - covering all three lifecycle stages required by emerging
AI transparency and sustainability regulations.

```text
ai_energyConsumption
├── ai_trainingEnergyConsumption    → 4,823.5 kWh  (32× A100, 14 days)
├── ai_finetuningEnergyConsumption  →   187.2 kWh  (domain adaptation)
└── ai_inferenceEnergyConsumption   →  0.0041 kWh  (per batch job)
```

Each stage uses an `/AI/EnergyConsumptionDescription` object with
`/AI/energyQuantity` (decimal) and `/AI/energyUnit`
(`kilowattHour` / `megajoule` / `other`).

## Profile conformance

`core`, `ai`

## SPDX files

| Version | File |
| ------- | ---- |
| SPDX 3.0 | [spdx3.0/example06.spdx3.json](./spdx3.0/example06.spdx3.json) |
| SPDX 3.1 (draft) | [spdx3.1/example06.spdx3.json-draft](./spdx3.1/example06.spdx3.json-draft) |

[![A diagram of AI example 6 - Model with energy consumption tracking.](./example06.spdx3.png "A diagram of AI example 6 - Model with energy consumption tracking.")](./example06.spdx3.png)

## Key properties demonstrated

| Property | Notes |
| -------- | ----- |
| `/AI/autonomyType` | `noAssertion` - deprecated in SPDX 3.1, use `isoAutomationLevel` |
| `/AI/energyConsumption` | All 3 stages (training, finetuning, inference) |
| `/AI/finetuningEnergyConsumption` | 187.2 kWh |
| `/AI/inferenceEnergyConsumption` | 0.0041 kWh per batch |
| `/AI/standardCompliance` | ISO/IEC 42001:2023 |
| `/AI/trainingEnergyConsumption` | 4,823.5 kWh |
