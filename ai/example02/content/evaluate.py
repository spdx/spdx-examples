# SPDX-FileType: SOURCE
# SPDX-License-Identifier: CC0-1.0

"""
This script evaluates a FastText model on test data.
It calculates and prints the F1 score, precision, and recall.

Functions:
    load_data(file_path: str) -> tuple[list, list]:
        Loads test data from a specified file.
    main(model_file_path: str, test_data_file_path: str) -> None:
        Main function to evaluate the FastText model on the test data.
"""

import sys

import fasttext
from sklearn.metrics import f1_score, precision_score, recall_score
from sklearn.preprocessing import LabelEncoder


def load_data(data_path: str) -> tuple[list, list]:
    """
    Load data from the specified file.

    Args:
        data_path (str): Path to the data file.

    Returns:
        tuple: A tuple containing labels and data.
    """
    labels = []
    texts = []
    with open(data_path, "r", encoding="utf-8") as file:
        for line in file:
            pair = line.strip().split(" ", 1)  # assumed one label per message

            if len(pair) == 2:
                labels.append(pair[0])
                texts.append(pair[1])

    return labels, texts


def main(model_path: str, test_data_path: str) -> None:
    """
    Main function to evaluate the FastText model on the test data.

    Args:
        model_path (str): Path to the FastText model file.
        test_data_path (str): Path to the test data file.

    Returns:
        None
    """
    labels, data = load_data(test_data_path)
    model = fasttext.load_model(model_path)

    predictions = [model.predict(x)[0][0] for x in data]

    le = LabelEncoder()
    numeric_labels = le.fit_transform(labels)
    numeric_predictions = le.transform(predictions)

    f1 = f1_score(numeric_labels, numeric_predictions, average="weighted")
    precision = precision_score(numeric_labels, numeric_predictions, average="weighted")
    recall = recall_score(numeric_labels, numeric_predictions, average="weighted")

    print(f"F1 Score: {f1}")
    print(f"Precision: {precision}")
    print(f"Recall: {recall}")


if __name__ == "__main__":
    if len(sys.argv) != 3:
        print("Usage: python evaluate.py <model_file> <test_file>")
        sys.exit(1)

    main(sys.argv[1], sys.argv[2])
