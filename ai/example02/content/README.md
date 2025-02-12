---
SPDX-FileContributor: Arthit Suriyawongkul
SPDX-FileType: DOCUMENTATION
SPDX-License-Identifier: CC0-1.0
---

# Sentiment Demo: A Simple AI Application and its AI BOM Example

A simple text classification application, published solely to demonstrate
a software bill of materials (SBOM).
*Not recommended for actual text classification tasks.*

## Content

```text
.
├── LICENSE               License information
├── README.md             This README file
├── data                  Dataset, preprocessed and tokenized
│   ├── test.txt          Testing data
│   ├── train.txt         Training data
│   └── valid.txt         Validation data
├── evaluate.py           A script to evaluate prediction performance
├── model.bin             A sentiment analysis model
├── predict.py            A script to predict a label of a text
├── preprocess.py         A script to prepare training data
├── requirements.txt      List of required Python libraries
├── techdocs              Technical documentation
│   ├── dataprepare.md    Data preparation
│   └── instructions.md   Instruction for use
└── train.py              A script to build a model
```

## Usage

See [instruction for use](./techdocs/instructions.md) for how to use the
application.

## Data preparation

See [data preparation](./techdocs/dataprepare.md).

## Licenses

This example was originally published at
<https://github.com/bact/sentimentdemo/>.

Apart from the data and components listed in the table below, the code and
content in this directory are dedicated to the public domain under the terms
of Creative Commons Zero ("CC0") 1.0 Universal, which have no copyright and
related or neighboring rights worldwide to the extent allowed by law.

| Component | Name | License | Notes |
| --------- | ---- | ------- | ----- |
| Training data | [Wisesight Sentiment Corpus](https://github.com/PyThaiNLP/wisesight-sentiment) | Creative Commons Zero v1.0 Universal | Samples from the corpus are in `rawdata/`. Preprocessed data is in `data/`. See [data preparation](./techdocs/dataprepare.md) for details. |
| Text preprocessor | [th-simple-preprocessor](https://pypi.org/project/th-simple-preprocessor/) |  Apache License 2.0 | |
| Word tokenizer | [newmm-tokenizer](https://pypi.org/project/newmm-tokenizer/) | Apache License 2.0 | Inherited the license from [PyThaiNLP](https://pypi.org/project/pythainlp/). |
| Text classifier | [fastText](https://pypi.org/project/fasttext/) | MIT License | |
| Array package | [NumPy](https://pypi.org/project/numpy/) | BSD License | |

The specific version information can be found in
[requirements.txt](./requirements.txt).
