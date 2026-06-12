# Lite/Example 1

## Description

This is a JSON-LD file that conforms to the Lite profile when you provide Package1, a software package provided under ```MIT``` license.

```
Supplier ---> Receiver
 |
 +- Package1 (MIT license)  
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
