package com.wipro.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DailyTasksTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		DailyTasks d = new DailyTasks();
		String output = d.doStringConcat("abc", "null");
//		assertEquals("abc null", output);

//		assertArrayEquals(new int[] { 1, 2, 3 }, d.sortValues(new int[] { 3, 2, 1 }));

		assertTrue(d.checkPresence("abcdeeee", "ab"));
	}

}
