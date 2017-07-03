package com.peter.leetcode.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSum001Test {

	@Test
	public void TestSum1() {

		int arr[] = { 2, 7, 11, 15 };
		assertArrayEquals(TwoSum001.twoSum(arr, 9), new int[] { 0, 1 });

	}

	@Test
	public void TestSum2() {

		int arr[] = { 2, 7, 11, 15, 1, 8, 6 };
		assertArrayEquals(TwoSum001.twoSum(arr, 16), new int[] { 3, 4 });

	}
}
