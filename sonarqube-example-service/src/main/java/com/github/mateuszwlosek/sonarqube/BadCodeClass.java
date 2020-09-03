package com.github.mateuszwlosek.sonarqube;

import java.rmi.AccessException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BadCodeClass {

	public String testMethod1() {
		Long nullValue = null;
		return nullValue.toString();
	}

	public List<String> testMethod2() {
		List<String> lI_st = new ArrayList<>();
		lI_st.add("test");
		return lI_st;
	}

	public long testMethod3(boolean parameter) {
		long a;
		if (parameter = true) {
			a = 3;
		} else {
			a = 5;
		}

		return a;
	}

	public long testMethod4(long parameter) {
		long a = (long) parameter;
		a += 3;
		return a;
	}

	public long testMethod5(long parameter) {
		long a = parameter + parameter;
		a = a;
		a += 1;
		return a;
	}

	public String testMethod6() {
		String a = "rdafafwaefasdf";
		String b = "rdafafwaefasdf";
		String c = "rdafafwaefasdf";
		String d = "rdafafwaefasdf";
		String e = "rdafafwaefasdf";
		String f = "rdafafwaefasdf";
		String g = "rdafafwaefasdf";
		String h = "rdafafwaefasdf";
		return a + b + c + d + e + f + g + h;
	}

	public String testMethod7(String parameter) {
		Optional<String> parameter1 = Optional.ofNullable(parameter);
		String test = parameter1.get().concat("test");
		test = test.concat("test2");
		return test;
	}

	public int testMethod8() throws AccessException {
		int a = 0;
		try {
			a = 2 + 1;
		} catch (Exception exc) {

		}
		return a;
	}

	public boolean testMethod9(String parameter) {
		if (parameter.equals("abc")) {
			return true;
		}

		if (parameter.concat("abc").equals("qabc")) {
			return true;
		}

		return true;
	}

	public String testMethod10() {
		String password = "admin";
		password += "123";
		return password;
	}

	public float testMethod11(float a, float b) {
		int x = 3;
		float q = a + b;
		return q + 10;
	}

	public float testMethod12(float a, float b) {
//		float x = a + a + b + c;
		return a + b;
	}

	public float TestMethod13(float A) {
		return A + 1;
	}

	public void testMethod14() {
		System.out.println("Very important info!");
	}

	public ArrayList<String> testMethod15() {
		ArrayList<String> test = new ArrayList<String>();
		test.add("test");
		return test;
	}
}
