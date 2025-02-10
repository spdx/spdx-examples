# SPDX-FileType: SOURCE
# SPDX-License-Identifier: CC0-1.0

"""
Provides a function to predict the label of a given text.

The text is preprocessed before prediction, including tokenization,
stopword removal, and space normalization.
"""

import sys

import fasttext
from newmm_tokenizer.tokenizer import word_tokenize
from th_preprocessor.preprocess import preprocess, remove_dup_spaces, remove_stopwords

model = fasttext.load_model("model.bin")


def predict(text: str):
    """
    Predict the label of the given text using the loaded FastText model.

    Args:
        text (str): The input text to be classified.

    Returns:
        None
    """
    _text = preprocess(text)
    _text = " ".join(remove_stopwords(word_tokenize(_text)))
    _text = remove_dup_spaces(_text)

    labels, probabilities = model.predict(_text)
    print(f"Label: {labels[0][9:]}, Probability: {probabilities[0]:.4f}")


if __name__ == "__main__":
    if len(sys.argv) != 2:
        print('Usage: python predict.py "<text>"')
        sys.exit(1)

    predict(sys.argv[1])
