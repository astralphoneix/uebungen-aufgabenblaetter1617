package uebung3;

import org.junit.*;

public class TestMyWurzel {
	@Test
	public static void testen() {
		Assert.assertEquals(2, MyWurzel.sqrt(4));
	}
}
