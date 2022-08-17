# SPDX Semantics Reference Archive

This directory holds a number of semantic structure designs representing
different types of repositories, artifacts and other commonly used software.
The goal of these designs is to act as a source of reference for tool makers to 
ensure a unified structure in documents produced by SPDX tools.

## Semantic Reference Designs

The following types of software are represented in this directory:

* OCI Container Images
  * [MultiArch Index](oci-multiarch-index.md)
  * [Container Image](oci-image.md)
  * [Container Layer with Operating System Packages](oci-layer.md)
* Software Repository
  * [Universal Model for Code Repository](code-repository.md)
* Operating System Package
  * [Universal Model for OS Package](os-package.md)
  * [rpm Package](os-rpm.md)
  * [deb Package](os-deb.md)
  * [apk Package](os-apk.md)


## Design Considerations and Objectives

Each of the designs contained here attempts to abstract th object as an SPDX
package which can be referenced by itself, moved to its own ot to another SBOM
while allowing for a flexible details.

For example, the SBOM of a container image can be referenced by itself to fully
describe a container. But that same package can be moved to an SBOM describing 
a multi-arch index while preserving its structure.

Another example: An RPM package can provide its own SBOM and the package in it can 
be repurposed by a container layer SBOM to describe all software installed via the 
OS package manager.