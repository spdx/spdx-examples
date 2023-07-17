# Example 10

## Description
This is an example python3 project with a minimal set of dependencies. Included in the `content` folder is the source code and a packaged python package using the [instructions from python.org](https://packaging.python.org/en/latest/tutorials/packaging-projects/). This is but one way of packaging a python project.

```
.
├── hello
│   ├── hello.py
│   ├── __init__.py
│   ├── LICENSE
│   ├── pyproject.toml
│   └── README.md
└── hello-dist
    ├── hello-0.0.1-py3-none-any.whl
    └── hello-0.0.1.tar.gz
```

## Comments

## Building the Python package

The package was built on a Ubuntu 22 system with Python 3.10 installed. The package requires Python 3 pre-installed on a Linux or Windows OS in order to function. The SPDX documents do not reflect this.

The `build` package is required to build this project.

```
$ python3 -m pip install --upgrade build
```

This downloads some extra packages.

```
$ pip freeze                                                                       build==0.9.0
packaging==21.3
pep517==0.13.0
pyparsing==3.0.9
tomli==2.0.1
```

Once done, `cd` into the `hello` directory and run the following:
```
$ python3 -m build
```

This will create a `dist` folder within the hello directory. The resulting directory is provided in this repository. 
