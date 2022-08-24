import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestClass extends TestInheritance {
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("before class");
		
	}
	@Before
	public void before() {
		
		System.out.println("before");
		
	}
	
	@After
	public void after() {
		
		System.out.println("after");
		
	}
	@Ignore
	@Test
	public void testValidateValues() {
		Assert.assertEquals(10, 10);
	}
	
	@Test
	public void testMultiAsserts() {
		Assert.assertEquals(10,10);
		System.out.println("after fail");
		Assert.assertEquals(20, 20);
		Assert.assertEquals("test", "test");
	}
	@Ignore
	@Test
	public void testFalse() {
		Assert.assertFalse("10".equals("10"));
	}
	@Ignore
	@Test
	public void testCompareArrays() {
		String[] array1 = {"1","2","3"};
		String[] array2 = {"1","2","3"};
		Assert.assertArrayEquals(array1, array2);
	}
	
	
}
