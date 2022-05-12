package com.wipro.task;

import java.util.Arrays;

public class DailyTasks {

	public String doStringConcat(String s1, String s2) {
		return s1 + " " + s2;
	}

	public int[] sortValues(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	public boolean checkPresence(String str, String a) {
		return str.contains(a);
	}

}
