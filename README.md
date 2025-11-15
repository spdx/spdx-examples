# SPDX Usage Examples

This repository includes demonstrations of [SPDX](https://spdx.dev) for various
scenarios and use cases.

The repository is organized by profiles which represents a set of scenarios and
use cases for a particular domain (e.g. security, license compliance).

- [AI](./ai/)
- [Dataset](./dataset/)
- [Hardware](./hardware/)
- [Regulatory Conformance](./conformance/)
- [Software](./software/)

Each directory contains a README.md file describing the profile and the
examples contained within that directory.
Please note that they do not contain all supported fields or serialization
formats specified in the latest version of the specification.

## More examples

- The [`presentations`](./presentations/) directory in this repository
  contains examples included in various SPDX presentations.
- The [`conformance`](./conformance/) directory in this repository
  contains demonstrations of SPDX encoded documents needed for
  regulatory conformance submissions for various types of products.
- Moreover, in a page for each field in
  [SPDX Specification](https://spdx.github.io/spdx-spec/), there can also
  be a code snippet demonstrating how to use that particular field.
- Additional version-specific examples can be found in the `examples` directory
  of each specification version in [`spdx-spec`](https://github.com/spdx/spdx-spec/) repository.
  For example:
  - [`3.0`](https://github.com/spdx/spdx-spec/tree/support/3.0/examples)
  - [`2.3.1`](https://github.com/spdx/spdx-spec/tree/support/2.3.1/examples)
- JSON-LD serialization examples can be found in
  [`spdx/spdx-3-model`](https://github.com/spdx/spdx-3-model/blob/main/serialization/jsonld/examples.md)
  repository.
- More guidance on using SPDX, including how to use SPDX License List short
  identifiers in source files and leverage SPDX for compliance with standards
  and regulations, is available in the [`spdx/using`](https://github.com/spdx/using/)
  repository.
- The Playground repository at [`spdx-3-serialization-prototype-playground`](https://github.com/spdx/spdx-3-serialization-prototype-playground)
  contains some examples that may not pass validation.

## Licenses

Copyright Contributors to the spdx-examples project.

Unless otherwise specified, source code in this repository is licensed under
the GNU General Public License, Version 3 or later (GPL-3.0-or-later).
A copy is included in the COPYING file.

Other licenses may be specified as well for certain files for purposes of
illustration or where third-party components are used.

Documentation in this repository is licensed under the Creative Commons
Attribution 4.0 International license (CC-BY-4.0), available at
<https://creativecommons.org/licenses/by/4.0/>.

SPDX documents in this repository are provided under CC0 1.0 Universal
(CC0-1.0), available at
<https://creativecommons.org/publicdomain/zero/1.0/>.
