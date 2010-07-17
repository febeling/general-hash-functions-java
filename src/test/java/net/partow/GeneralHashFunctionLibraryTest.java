/*
 **************************************************************************
 *                                                                        *
 *           General Purpose Hash Function Algorithms Test                *
 *                                                                        *
 * Author: Arash Partow - 2002                                            *
 * URL: http://www.partow.net                                             *
 * URL: http://www.partow.net/programming/hashfunctions/index.html        *
 *                                                                        *
 * Copyright notice:                                                      *
 * Free use of the General Purpose Hash Function Algorithms Library is    *
 * permitted under the guidelines and in accordance with the most current *
 * version of the Common Public License.                                  *
 * http://www.opensource.org/licenses/cpl1.0.php                          *
 *                                                                        *
 **************************************************************************
*/
package net.partow;

import java.io.*;
import java.lang.*;

import junit.framework.TestCase;

import static net.partow.GeneralHashFunctionLibrary.*;


public class GeneralHashFunctionLibraryTest extends TestCase
{
    private String key;

    protected void setUp()
    {
	key = "abcdefghijklmnopqrstuvwxyz1234567890";
    }

    public void testRSHash()
    {
      RSHash(key);
    }

    public void testJSHash() 
    {
	JSHash(key);
    }

    public void testPJWHash()
    {
	PJWHash(key);
    }

    public void testELFHash()
    {
	ELFHash(key);
    }

    public void testBKDRHash()
    {
	BKDRHash(key);
    }

    public void testSDBMHash()
    {
	SDBMHash(key);
    }

    public void testDJBHash()
    {
	DJBHash(key);
    }

    public void testDEKHash()
    {
	DEKHash(key);
    }

    public void testBPHash()
    {
	BPHash(key);
    }

    public void testFNVHHash()
    {
	FNVHash(key);
    }

    public void testAPHash()
    {
	APHash(key);
    }
}
