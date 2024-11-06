# Example 1

## Description

An [existing (original) SPDX document](content/examplemaven-0.0.1.spdx.json) is enriched to include additional metadata from an application such as [Parlay](https://github.com/snyk/parlay) producing the [enriched SPDX document](spdx2.3/examplemaven-0.0.1-enriched.spdx.json).  Any process or tool that modifies an existing SPDX document should include the additional metadata referenced in comments below.

## Comments

In addition to any modifications made to the original SPDX document, the following changes are made to the resultant enriched SPDX document:
- Create a new `documentNamespace` - this is required since the enriched document does not contain exactly the same SPDX metadata
- Update the `created` timestamp to the time this document was generated
- Add a tool to the creators for the enrichment tool
- Create an `AMENDS` relationship from the enriched document to the original document
- Add an `externalDocumentRef` for the original document - this is necessary to create the relationship and provides a checksum for verifying the integrity of the original document 


Below is a diff for the above-mentioned changes:

```
6c6
<   "documentNamespace": "http://spdx.org/documents/examplemaven-0.0.1",
---
>   "documentNamespace": "http://spdx.org/documents/examplemaven-0.0.1/enriched",
11c11,12
<       "Tool: spdx-maven-plugin"
---
>       "Tool: spdx-maven-plugin",
>         "Tool: Parlay"
13c14
<     "created": "2022-10-23T15:44:16Z"
---
>     "created": "2024-11-18T10:22:12Z"
14a16,23
>   "externalDocumentRefs" : [ {
>     "externalDocumentId" : "DocumentRef-original",
>     "checksum" : {
>       "algorithm" : "SHA1",
>       "checksumValue" : "3f9deeef2efdbb0eb4b15ec216f5c4e3af2d13e2"
>     },
>     "spdxDocument" : "http://spdx.org/documents/examplemaven-0.0.1"
>   } ],
153a163,168
>     {
>       "spdxElementId": "SPDXRef-DOCUMENT",
>       "relatedSpdxElement": "DocumentRef-original:SPDXRef-DOCUMENT",
>       "relationshipType": "AMENDS",
>       "comment": "The original document and been enriched by the Parlay application"
>     },

```