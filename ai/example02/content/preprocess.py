# SPDX-FileContributor: Arthit Suriyawongkul
# SPDX-FileType: SOURCE
# SPDX-License-Identifier: CC0-1.0

"""
Provides text preprocessing function.
"""

import sys

from newmm_tokenizer.tokenizer import word_tokenize
from th_preprocessor.preprocess import preprocess, remove_dup_spaces


def preprocess_text(text: str) -> str:
    """
    Preprocesses a given text string by applying tokenization, removing
    duplicate spaces, and other preprocessing steps.

    Args:
        text (str): The input text to be preprocessed.

    Returns:
        str: The preprocessed text.
    """
    _text = preprocess(text)
    _text = " ".join(word_tokenize(_text))
    _text = remove_dup_spaces(_text)
    return _text


def main(data_dir: str, output_path: str) -> None:
    """
    Main function to preprocess text files from a specified directory and
    write the processed text to an output file with labels.

    Args:
        data_dir (str): The path to the directory containing the input text files.
        output_path (str): The path to the file where the processed text will be written.
    """
    labels = ["neg", "neu", "pos", "q"]

    with open(output_path, "w", encoding="utf-8") as destination:
        for label in labels:
            with open(f"{data_dir}/{label}.txt", "r", encoding="utf-8") as source:
                for line in source:
                    line = preprocess_text(line)
                    if len(line) > 0:
                        destination.write(f"__label__{label} {line}\n")


if __name__ == "__main__":
    if len(sys.argv) != 3:
        print("Usage: python preprocess.py <data_dir> <output_file>")
        sys.exit(1)

    main(sys.argv[1], sys.argv[2])
