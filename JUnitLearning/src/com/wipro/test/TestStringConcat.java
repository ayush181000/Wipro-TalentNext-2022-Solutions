package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

class TestStringConcat {

	@Test
	void test() {
//		System.out.println("asdsa");
		DailyTasks test = new DailyTasks();
		String output = test.doStringConcat("Wipro", "Technologies");
		assertEquals("Wipro Technologies", output);
	}

}
