/**
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) 2022 Source Auditor Inc.
 */
package org.spdx.examplemaven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Hello world!
 *
 */
public class App 
{
	static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.info("We're starting the app");
        System.out.println( "Hello World!" );
    }
}
