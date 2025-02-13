# Containers: MultiArch Image Index

## Design Goals

* Having an design through which an SBOM can represent the
structure of a container image index.
* Separation of single-arch images to allow referencing SBOMs
for each or adding a detailed structure for them in the packages
representing each image.
* No registry or repository information to ensure the SBOM is
portable across registries when images are copied around.
* Data detailing metadata about the single arch images is packaged
in the purl external reference.

## Structure Diagram

```mermaid
classDiagram
  direction LR
class ImageIndex{
  PackageName: sha256:923784e51e709f
  ExternalRef: PACKAGE_MANAGER purl pkg:oci/alpine@sha256:923[...]
  PackageChecksum: SHA256 923784e51e709f
}
class Image{
  PackageName: sha256:5fbbc2112ee51e709f374c9c01e
  ExternalRef: PACKAGE_MANAGER purl pkg:oci/alpine@sha256:5fb[...]?arch=amd64&os=linux
  PackageChecksum: SHA256 5fbbc2112ee51e709f374c9c01e
}
class Image2 {
  PackageName: sha256:c3e3b1394f8b8fa1e8768
  ExternalRef: PACKAGE_MANAGER purl pkg:oci/alpine@sha256:c3e[...]?arch=arm64&os=darwin
  PackageChecksum: SHA256 c3e3b1394f8b8fa1e8768
}

    ImageIndex --> Image: VARIANT_OF
    ImageIndex --> Image2: VARIANT_OF
```

## Design Specification

### Package Structure

The top level package represents the image index. The name of the package should be
the digest of its manifest, preceded as usual by the algorithm,
eg `sha256:923784e51e709f...`.

Each container image fronted by the image must be represented by another package, also
named as its digest. Each of these packages should be related to the index using a 
`VARIANT_OF` SPDX relationship.

### Software Identifiers

Each of the packages in this design should contain a reference to the OCI object using
a [purl of type `oci`](https://github.com/package-url/purl-spec/blob/master/PURL-TYPES.rst#oci).
Packages representing the single arch images must contain the os/arch metadata and optionally
can add tag and repository metadata.
