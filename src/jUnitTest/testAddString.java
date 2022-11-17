package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addString("Capstone","Project");
		assertEquals("CapstoneProject", result);
	}

}
