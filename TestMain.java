/**
 * 
 */
package com.hsung.tdd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author LONGTUNG
 *
 */
public class TestMain {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_one_to_eight() {
		boolean ret = false;
		for(int i=0; i<8; i++)
		{
			ret = new Farey().start(i+1);
		}
		
		assertEquals(ret, true);
	}
	
	@Test
	public void test_zero() {
		assertEquals(new Farey().start(0), false);
	}
	
	@Test
	public void test_negative() {
		assertEquals(new Farey().start(-1), false);
	}

}
