[SPDX Examples](../../README.md)

[Regulatory Conformance](../README.md)

# Example 1 - SEBoK Product as System : Commodity Consumer Electronics

## Description

In this example the "system" is
a commodity-level consumer electronics OEM product (line)
intended to be offered to System Manufacturers initially in the EU and NA markets.

The current product line scope consists of:
  - Rebrandable product-with-digital-elements with a physical communication interface

The current set of products provided by this product line are:
  - TBD


The (re)branding requires setting persistent product identification 
data (digital and physical identifiers) and packaging the product:
  - Manufacturer
  - Marketing Brand
  - Model
  - Serial Number

## Demonstrated System Engineering Process and Tools

### System Engineering Body of Knowledge (SEBoK)

This example is attempting to follow the best practices described in the
[Guide to the Systems Engineering Body of Knowledge (SEBoK)](https://sebokwiki.org/wiki/Guide_to_the_Systems_Engineering_Body_of_Knowledge_(SEBoK)).

The SEBoK Wiki Glossary quotes the following definition for the
[Vee (V) Model](https://sebokwiki.org/wiki/Vee_(V)_Model_(glossary)):

> The technical aspect of the project cycle is envisioned as a "Vee", starting with User needs on the upper left and ending with a User-validated system on the upper right. (Forsberg and Mooz 1991)

The SEBoK considers Users to be a subset of the set of Stakeholders.
This results in approximately the following Vee Model:

```
  Stakeholder Needs
        ^
        \  Stakeholder Requirements <-- proven met by -- System Validations
         \   (solution constraints)                    ^
          \                                           /
  +--> System Requirements <--- verified by ---- System Verifications
  | repeat  ^                                       ^
  | until    \  System Architecture                 /
  | directly  \  decomposes System into            /
  | implement  \                                  /
  +--------- SysElement Requirements <------ sysElement Verification
```

Each resulting SysElement then is treated as a new System-of-interest (SOI)
and is further decomposed until it is small enough to be directly implemented
and verified.


### International Council on System Engineering (INCOSE)

This example also attempts to write requirements following the
[International Council on Systems Engineering](https://www.incose.org/) recommendations. 
A soft copy of their [Guide to Writing Requirements Summary Sheet](https://portal.incose.org/commerce/store?productId=commerce-merchandise%23INCOSE-GUIDEWRITINGREQSUM)
may be purchased from the INCOSE store by non-members for $0.00 (zero).

The example content is initially being captured using the open-source
tool [StrictDoc](https://github.com/strictdoc-project/strictdoc),
which is a FOSS software tool for technical documentation and requirements management.
StrictDoc has been successfully used for technical documentation certified by
the European Space Agency. It supports the following features key to this example:
- document creators can specify their own document node types,
- node relationship directions and trace analysis,
- support for generating graphs from editable textual graph descriptions (Mermaid UML)


## Comments

- EU CRA Annex III identifies "physical and virtual network interfaces" as
Important Products with Digital Elements - Class I. 

- EU CRA Article 21 - "Cases in which obligations of manufacturers apply to importers and distributors" states

> An importer or distributor shall be considered to be a manufacturer for the purposes of this Regulation and shall be subject to Articles 13 and 14, where that importer or distributor places a product with digital elements on the market under its name or trademark or carries out a substantial modification of a product with digital elements already placed on the market.

- EU CRA Article 45 states:

> Important products with digital elements as referred to in this Regulation should be understood as products which 
have the core functionality of a category of important products with digital elements that is set out in this 
Regulation. ...

Being a commodity-level product:

- the entire software source for this product (other than digital signatures)
  could be provided as FOSS by an Open Source Steward;

- the entire OEM product could be manufactured and provided using commercially
  available computer hardware evaluation kits;
