---
SPDX-FileType: DOCUMENTATION
SPDX-License-Identifier: CC0-1.0
---

# Instruction for use

This application is designed to predict the sentiment of text.

It was trained on Thai microblogging social media data and may have limitations
in predicting text from other genres or languages.

## Prerequisites

Install the required dependencies using this command:

```shell
pip install -r requirements.txt
```

This will install the following Python libraries:

- `fasttext==0.9.3` - For text classification model training and prediction.
- `newmm-tokenizer==0.2.2` - For tokenizing Thai text.
- `numpy==1.26.4` - For computations with multidimensional arrays.
  Note that NumPy version 2 and later are incompatible with fastText.
- `th-simple-preprocessor==0.10.1` - For preprocessing Thai text.
- and all other libraries required by them.

## Predict a label of a text

```shell
python predict.py <text>
```

The script will print the predicted label for the provided text.

Possible labels are:

- `neg` - negative
- `neu` - neutral
- `pos` - positive
- `q` - question

```shell
$ python predict.py "เป็นไง ไปกินข้าวกัน"
Label: pos, Probability: 0.8054
```

## Train a new model

Training data and validation data have the same structure.
Both are text files, with each line representing a single sample.
Each sample must include a label followed by a tokenized message,
where tokens are separated by spaces. For example:

```text
__label__neu I know you re missin home
__label__q Can you tell her where I am
```

See how to prepare training data and validation data in the
[data preparation document](./dataprepare.md.)

Once you have both training data and validation data, run this command:

```shell
python train.py data/train.txt data/valid.txt model.bin  
```

The new model will be saved to `model.bin`.

Note that the model size is limited to 100 Kilobytes and the duration for
auto-tuning hyperparameters is capped at 2 hours. You can adjust these limits
by changing the `autotuneModelSize` and `autotuneDuration` parameters in
`train.py`.

## Evaluate a model

Given that `data/test.txt` is a test data with the same structure as the
training data, run this command:

```shell
python evaluate.py model.bin data/test.txt 
```
