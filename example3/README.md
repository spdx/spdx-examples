# Example 3

## Description

```
content
├── build
│   ├── lib.so
│   └── main
└── src
    ├── Makefile
    ├── lib.c
    └── main.c
```

The content now contains two C source files.
One is a [library file](content/src/lib.c) providing a simple function that adds 5 to its input.
This file carries a BSD-3-Clause license.
The other [contains a main function](content/src/main.c) which dynamically loads and uses the function from the library file.
This file carries a GPL-3.0-or-later license.

As with example2, there are separate SPDX documents for [source](spdx/example3-src.spdx) and [binary](spdx/example3-bin.spdx).

This describes a scenario where there are multiple binary files, and we want to represent the dependency and dynamic-linking relationship between the binary files.

## Comments

Note that the [binary SPDX document](spdx/example3-bin.spdx) includes the `RUNTIME_DEPENDENCY_OF` relationship between the main binary and the library binary.
There are many different dependency types of Relationships defined in [v2.2 of the SPDX spec](https://spdx.github.io/spdx-spec/7-relationships-between-SPDX-elements/).
We could have also used, e.g., `DEPENDENCY_OF` and/or `PREREQUISITE_FOR`.
`RUNTIME_DEPENDENCY_OF` was chosen here because of the extra specificity that the library is 'required for the execution' of the main binary.

Note also that the two source files are each under different licenses, as are the two binary files.
The file sections of the SPDX documents reflect the individual license for each file.
However, the package section for the binary package as well as the source package reflects that the overall license for the package as a whole is GPL-3.0-or-later AND BSD-3-Clause.
