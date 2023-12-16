package com.github.appbomination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This file is licensed under the Apache 2.0 License (except where otherwise indicated).
 * 
 * @author yevster
 *
 */
public class Main {
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args){
		logger.info("Started this thing");
		throw new InsufficientKarmaException("Unable to run application. Please verify your worthiness.");
	}
	
	/*Everything below this comment is copied from Apache Commons Math v. 3.6.1, 
	 * https://git1-us-west.apache.org/repos/asf?p=commons-math.git;a=blob_plain;f=src/main/java/org/apache/commons/math3/util/FastMath.java;hb=16abfe5de688cc52fb0396e0609cb33044b15653
	 * 
	 * Lines 142-363
	 * Maven/POM ID: group: 'org.apache.commons', name: 'commons-math3', version: '3.6.1'
	 */
	 private static final double SINE_TABLE_A[] =
	        {
	        +0.0d,
	        +0.1246747374534607d,
	        +0.24740394949913025d,
	        +0.366272509098053d,
	        +0.4794255495071411d,
	        +0.5850973129272461d,
	        +0.6816387176513672d,
	        +0.7675435543060303d,
	        +0.8414709568023682d,
	        +0.902267575263977d,
	        +0.9489846229553223d,
	        +0.9808930158615112d,
	        +0.9974949359893799d,
	        +0.9985313415527344d,
	    };

	    /** Sine table (low bits). */
	    private static final double SINE_TABLE_B[] =
	        {
	        +0.0d,
	        -4.068233003401932E-9d,
	        +9.755392680573412E-9d,
	        +1.9987994582857286E-8d,
	        -1.0902938113007961E-8d,
	        -3.9986783938944604E-8d,
	        +4.23719669792332E-8d,
	        -5.207000323380292E-8d,
	        +2.800552834259E-8d,
	        +1.883511811213715E-8d,
	        -3.5997360512765566E-9d,
	        +4.116164446561962E-8d,
	        +5.0614674548127384E-8d,
	        -1.0129027912496858E-9d,
	    };

	    /** Cosine table (high bits). */
	    private static final double COSINE_TABLE_A[] =
	        {
	        +1.0d,
	        +0.9921976327896118d,
	        +0.9689123630523682d,
	        +0.9305076599121094d,
	        +0.8775825500488281d,
	        +0.8109631538391113d,
	        +0.7316888570785522d,
	        +0.6409968137741089d,
	        +0.5403022766113281d,
	        +0.4311765432357788d,
	        +0.3153223395347595d,
	        +0.19454771280288696d,
	        +0.07073719799518585d,
	        -0.05417713522911072d,
	    };

	    /** Cosine table (low bits). */
	    private static final double COSINE_TABLE_B[] =
	        {
	        +0.0d,
	        +3.4439717236742845E-8d,
	        +5.865827662008209E-8d,
	        -3.7999795083850525E-8d,
	        +1.184154459111628E-8d,
	        -3.43338934259355E-8d,
	        +1.1795268640216787E-8d,
	        +4.438921624363781E-8d,
	        +2.925681159240093E-8d,
	        -2.6437112632041807E-8d,
	        +2.2860509143963117E-8d,
	        -4.813899778443457E-9d,
	        +3.6725170580355583E-9d,
	        +2.0217439756338078E-10d,
	    };


	    /** Tangent table, used by atan() (high bits). */
	    private static final double TANGENT_TABLE_A[] =
	        {
	        +0.0d,
	        +0.1256551444530487d,
	        +0.25534194707870483d,
	        +0.3936265707015991d,
	        +0.5463024377822876d,
	        +0.7214844226837158d,
	        +0.9315965175628662d,
	        +1.1974215507507324d,
	        +1.5574076175689697d,
	        +2.092571258544922d,
	        +3.0095696449279785d,
	        +5.041914939880371d,
	        +14.101419448852539d,
	        -18.430862426757812d,
	    };

	    /** Tangent table, used by atan() (low bits). */
	    private static final double TANGENT_TABLE_B[] =
	        {
	        +0.0d,
	        -7.877917738262007E-9d,
	        -2.5857668567479893E-8d,
	        +5.2240336371356666E-9d,
	        +5.206150291559893E-8d,
	        +1.8307188599677033E-8d,
	        -5.7618793749770706E-8d,
	        +7.848361555046424E-8d,
	        +1.0708593250394448E-7d,
	        +1.7827257129423813E-8d,
	        +2.893485277253286E-8d,
	        +3.1660099222737955E-7d,
	        +4.983191803254889E-7d,
	        -3.356118100840571E-7d,
	    };

	    /** Bits of 1/(2*pi), need for reducePayneHanek(). */
	    private static final long RECIP_2PI[] = new long[] {
	        (0x28be60dbL << 32) | 0x9391054aL,
	        (0x7f09d5f4L << 32) | 0x7d4d3770L,
	        (0x36d8a566L << 32) | 0x4f10e410L,
	        (0x7f9458eaL << 32) | 0xf7aef158L,
	        (0x6dc91b8eL << 32) | 0x909374b8L,
	        (0x01924bbaL << 32) | 0x82746487L,
	        (0x3f877ac7L << 32) | 0x2c4a69cfL,
	        (0xba208d7dL << 32) | 0x4baed121L,
	        (0x3a671c09L << 32) | 0xad17df90L,
	        (0x4e64758eL << 32) | 0x60d4ce7dL,
	        (0x272117e2L << 32) | 0xef7e4a0eL,
	        (0xc7fe25ffL << 32) | 0xf7816603L,
	        (0xfbcbc462L << 32) | 0xd6829b47L,
	        (0xdb4d9fb3L << 32) | 0xc9f2c26dL,
	        (0xd3d18fd9L << 32) | 0xa797fa8bL,
	        (0x5d49eeb1L << 32) | 0xfaf97c5eL,
	        (0xcf41ce7dL << 32) | 0xe294a4baL,
	         0x9afed7ecL << 32  };

	    /** Bits of pi/4, need for reducePayneHanek(). */
	    private static final long PI_O_4_BITS[] = new long[] {
	        (0xc90fdaa2L << 32) | 0x2168c234L,
	        (0xc4c6628bL << 32) | 0x80dc1cd1L };

	    /** Eighths.
	     * This is used by sinQ, because its faster to do a table lookup than
	     * a multiply in this time-critical routine
	     */
	    private static final double EIGHTHS[] = {0, 0.125, 0.25, 0.375, 0.5, 0.625, 0.75, 0.875, 1.0, 1.125, 1.25, 1.375, 1.5, 1.625};

	    /** Table of 2^((n+2)/3) */
	    private static final double CBRTTWO[] = { 0.6299605249474366,
	                                            0.7937005259840998,
	                                            1.0,
	                                            1.2599210498948732,
	                                            1.5874010519681994 };

	    /*
	     *  There are 52 bits in the mantissa of a double.
	     *  For additional precision, the code splits double numbers into two parts,
	     *  by clearing the low order 30 bits if possible, and then performs the arithmetic
	     *  on each half separately.
	     */

	    /**
	     * 0x40000000 - used to split a double into two parts, both with the low order bits cleared.
	     * Equivalent to 2^30.
	     */
	    private static final long HEX_40000000 = 0x40000000L; // 1073741824L

	    /** Mask used to clear low order 30 bits */
	    private static final long MASK_30BITS = -1L - (HEX_40000000 -1); // 0xFFFFFFFFC0000000L;

	    /** Mask used to clear the non-sign part of an int. */
	    private static final int MASK_NON_SIGN_INT = 0x7fffffff;

	    /** Mask used to clear the non-sign part of a long. */
	    private static final long MASK_NON_SIGN_LONG = 0x7fffffffffffffffl;

	    /** Mask used to extract exponent from double bits. */
	    private static final long MASK_DOUBLE_EXPONENT = 0x7ff0000000000000L;

	    /** Mask used to extract mantissa from double bits. */
	    private static final long MASK_DOUBLE_MANTISSA = 0x000fffffffffffffL;

	    /** Mask used to add implicit high order bit for normalized double. */
	    private static final long IMPLICIT_HIGH_BIT = 0x0010000000000000L;

	    /** 2^52 - double numbers this large must be integral (no fraction) or NaN or Infinite */
	    private static final double TWO_POWER_52 = 4503599627370496.0;

	    /** Constant: {@value}. */
	    private static final double F_1_3 = 1d / 3d;
	    /** Constant: {@value}. */
	    private static final double F_1_5 = 1d / 5d;
	    /** Constant: {@value}. */
	    private static final double F_1_7 = 1d / 7d;
	    /** Constant: {@value}. */
	    private static final double F_1_9 = 1d / 9d;
	    /** Constant: {@value}. */
	    private static final double F_1_11 = 1d / 11d;
	    /** Constant: {@value}. */
	    private static final double F_1_13 = 1d / 13d;
	    /** Constant: {@value}. */
	    private static final double F_1_15 = 1d / 15d;
	    /** Constant: {@value}. */
	    private static final double F_1_17 = 1d / 17d;
	    /** Constant: {@value}. */
	    private static final double F_3_4 = 3d / 4d;
	    /** Constant: {@value}. */
	    private static final double F_15_16 = 15d / 16d;
	    /** Constant: {@value}. */
	    private static final double F_13_14 = 13d / 14d;
	    /** Constant: {@value}. */
	    private static final double F_11_12 = 11d / 12d;
	    /** Constant: {@value}. */
	    private static final double F_9_10 = 9d / 10d;
	    /** Constant: {@value}. */
	    private static final double F_7_8 = 7d / 8d;
	    /** Constant: {@value}. */
	    private static final double F_5_6 = 5d / 6d;
	    /** Constant: {@value}. */
	    private static final double F_1_2 = 1d / 2d;
	    /** Constant: {@value}. */
	    private static final double F_1_4 = 1d / 4d;

}

