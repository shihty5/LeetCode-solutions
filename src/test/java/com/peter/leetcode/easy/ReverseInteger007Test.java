package com.peter.leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseInteger007Test {

	@Test
	public void test1() {
		assertEquals(ReverseInteger007.reverse(321),123);
		assertEquals(ReverseInteger007.reverse(-321),-123);
	}
	
	@Test
	public void test2() {
		assertEquals(ReverseInteger007.reverse(320129384),483921023);
	}
	
	/*
	 * Overflow
	 */
	@Test
	public void test3() {
		assertEquals(ReverseInteger007.reverse(1000000003),0);
	}

}
