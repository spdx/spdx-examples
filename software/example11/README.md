# Example 11: Rust (Cargo)

This directory contains a sample application written
in rust. It uses `cargo` to handle its dependencies.

It is a simple example webserver with just three top
level dependencies:

```
    hello-server v0.1.0
    ├── hyper v0.14.20
    ├── pretty_env_logger v0.4.0
    └── tokio v1.19.2

```

## Contents

The `content/src` directory contains the source (main.rs),
the license and the Cargo configuration files.

The `content/build` directory contains a linux/amd64 binary
built from the source code.

## SBOM

The `spdx` directory contains an SBOM describing the source,
and the binary. They are linked with a GENERATED_FROM relationship.

The source package lists the 3 top level dependencies. Trnasients
are not included to make thins easier. 

The SBOM structure (outlinedgenerate with
[bom](https://github.com/kubernetes-sigs/bom)) looks like this:

```
$ bom document outline example11/spdx/sbom.spdx.json

 📂 SPDX Document SBOM-SPDX-2d85f548-12fa-46d5-87ce-5e78e5e111f4
  │ 
  │ 📦 DESCRIBES 1 Packages
  │ 
  ├ hello-server-src
  │  │ 🔗 3 Relationships
  │  ├ DEPENDS_ON PACKAGE pretty_env_logger (version 0.4.0)
  │  ├ DEPENDS_ON PACKAGE tokio (version 1.19.2)
  │  └ DEPENDS_ON PACKAGE hyper (version 0.14)
  │ 
  │ 
  │ 📄 DESCRIBES 1 Files
  │ 
  └ SPDXRef-File-hello-server (hello-server)
     │ 🔗 1 Relationships
     └ GENERATED_FROM PACKAGE hello-server-src (version 0.4.0)
  

```