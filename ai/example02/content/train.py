# SPDX-FileType: SOURCE
# SPDX-License-Identifier: CC0-1.0

"""
Provides a function to train a FastText model using supervised learning.
"""

import sys
import time

import fasttext


def train(train_data_file_path: str, valid_data_file_path: str, model_file_path: str):
    """
    Trains a FastText model with auto-tuned hyperparameters
    and saves the model to a file.

    Args:
        train_data_file_path (str): Path to the training data file.
        valid_data_file_path (str): Path to the validation data file.
        model_file_path (str): Path to save the trained model.

    Returns:
        None
    """
    # Auto-tune hyperparameters.
    # Limit the duration to 2 hours. Limit the model size to 100K.
    model = fasttext.train_supervised(
        input=train_data_file_path,
        autotuneDuration=7200,
        autotuneModelSize="100K",
        autotuneValidationFile=valid_data_file_path,
    )

    # Print final hyperparameters
    if hasattr(model, "f"):
        print("Final hyperparameters:")
        args_obj = model.f.getArgs()
        for hparam in dir(args_obj):
            if not hparam.startswith("__"):
                print(f"{hparam}: {getattr(args_obj, hparam)}")

    model.save_model(model_file_path)


def main(train_data_path: str, valid_data_path: str, model_path: str):
    """
    Main function to handle the training process and print start and end times.

    Args:
        train_data_path (str): Path to the training data file.
        valid_data_path (str): Path to the validation data file.
        model_path (str): Path to save the trained model.

    Returns:
        None
    """
    start_time = time.time()
    print(f"Starts : {time.strftime('%Y-%m-%dT%H:%M:%SZ', time.gmtime(start_time))}")

    train(train_data_path, valid_data_path, model_path)

    end_time = time.time()
    print(f"Ends   : {time.strftime('%Y-%m-%dT%H:%M:%SZ', time.gmtime(end_time))}")
    elapsed_time = end_time - start_time
    print(f"Elapsed: {elapsed_time} seconds")


if __name__ == "__main__":
    if len(sys.argv) != 4:
        print("Usage: python train.py <train_file> <validation_file> <model_file>")
        sys.exit(1)

    main(sys.argv[1], sys.argv[2], sys.argv[3])
