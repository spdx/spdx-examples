# Example 13

## Description

This is a hypothetical example of a "simple" piece of software, Acme
Application version 1.3. This example shows what an SPDX-3.0 document looks
like for said Acme Application. The idea for this example is that other
profiles will be able to build on top of this and demonstrate how all the
profiles can work in harmony.

In this specific example, Acme Application is a bundled and distributed piece
of software. When Acme Application is run, it pulls in the `alpine:latest`
container image which runs in parallel to the `npm-elliptic` library that is
packaged and distributed within the Acme Application binary. Among others not
depicted for the sake of simplicity, `openssl` is a package included in the
`alpine:latest` container image. The example-13 SBOM describes the Acme
Application top level piece of software.
