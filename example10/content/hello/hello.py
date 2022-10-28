import logging


def normal(text):
    logging.basicConfig(level=logging.DEBUG)
    logging.info(f'hello {text}')


def excited(text):
    logging.warning(f'hello {text}!!!')
