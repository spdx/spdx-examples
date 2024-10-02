# Lite/Example 2

## Description

This is a JSON-LD file that conforms to the Lite profile when you provide Package1, a software package provided under ```GPL-2.0-only``` license along with the source code.  

```
Supplier ---> Receiver
 |
 +- Package1 (GPL-2.0-only license)  
 +- Source code of Package1
```

## Comments  

For conformant to the Lite profile, JSON-LD should meet the following:  

1. Properties that are mandatory by the SPDX specification are also mandatory and must be described. (MANDATORY properties)  

2. Software/Package MUST have “downloadLocation” or “packageUrl” if present. (MANDATORY)  

3. for every /Software/Package object MUST exist exactly one /Core/Relationship object of type concludedLicense having that element as its from property and an /SimpleLicensing/AnyLicenseInfo as its to property. (MANDATORY)  

4. for every /Software/Package object MUST exist exactly one /Core/Relationship object of type declaredLicense having that element as its from property and /SimpleLicensing/AnyLicenseInfo object as its to property. (MANDATORY)  

5. Following properties should be described as much as possible. (RECOMMENDED properties)  
```comment```, ```verifiedUsing```, ```sbomType```, ```externalIdentifier```, ```originatedBy```, ```builtTime```, ```releaseTime```, ```validUntilTime```, ```supportLevel```, ```attributionText```, ```homepage``` and ```licenseListVersion```  

6. Other classes and properties may or may not be described. (OPTIONAL properties)  

7. **As an exception, if Software/Package represents the source code to be supplied, rule 2-4 is excluded and only ```name``` is required.**  