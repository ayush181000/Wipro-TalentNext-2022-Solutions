package com.wipro.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DailyTasksTest2 {

	@Test
	public void test() {
		DailyTasks d = new DailyTasks();
		String output = d.doStringConcat("abc", "null");
		assertEquals("abc null", output);
	}

}
