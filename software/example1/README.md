# Example 1

## Description

```
content
├── build
│   └── hello
└── src
    ├── Makefile
    └── hello.c
```

One [C source file](content/src/hello.c) with a simple "hello world" program, compiled into a [single binary](content/build/hello) with no dependencies via a [Makefile](content/src/Makefile).
(Assumed dependencies such as the operating system kernel, C standard library, etc. are not addressed here.)

One [SPDX document](spdx2.2/example1.spdx) showing the Makefile, source file and binary, together as a single package.

This assumes of course that all three files are in fact being distributed together as a single package.

## Comments

The `DESCRIBES` relationship near the top of the file is not mandatory in this case, because there is only a single Package in this document.
(See the `DESCRIBES` relationship in [Section 7.1](https://spdx.github.io/spdx-spec/7-relationships-between-SPDX-elements/) of the spec.)

The three relationships at the end of the document (`GENERATED_FROM` and `BUILD_TOOL_OF`) are also not mandatory.
They are included here to demonstrate how SPDX can be used to communicate that a binary is built from particular source files and build tools.

The `SPDXID` for each Package and File does not have to be something that would be meaningful to a human reader, if generated by a tool and/or intended for consumption primarily by a tool.
They could just as easily have been `SPDXRef-File0`, `SPDXRef-File1`, etc.
(In fact, that's what they originally were from the tool that generated this SPDX document, but they have been given clearer identifiers here for ease of understanding.)

FileType fields were also added in manually and are not mandatory.
