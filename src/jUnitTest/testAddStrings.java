package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunctions junitstring= new jUnitFunctions();
		String result = junitstring.addString("Capstone","Project");
		assertEquals("CapstoneProject",result);
	}

}
