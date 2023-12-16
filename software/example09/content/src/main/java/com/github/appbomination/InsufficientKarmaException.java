package com.github.appbomination;

/*
This file is licensed under the following license.
 
FAUST, INC. PROPRIETARY LICENSE:

FAUST, INC. grants you a non-exclusive right to use, modify, and distribute
the file provided that (a) you distribute all copies and/or modifications of
this file, whether in source or binary form, under the same license, and (b)
you hereby irrevocably transfer and assign the ownership of your soul to Faust, 
Inc. In the event the fair market value of your soul is less than $100 US, you
agree to compensate Faust, Inc. for the difference. 

Copyright (C) 2016 Faust Inc. All, and I mean ALL, rights are reserved.

*/
public class InsufficientKarmaException extends RuntimeException {
	public InsufficientKarmaException(String message) {
		super(message);
	}
}
