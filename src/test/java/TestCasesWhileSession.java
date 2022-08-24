import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCasesWhileSession {
	@Test
	public void testData() {
		System.out.println("Test Data");
		Assert.assertEquals(20, 20);
		System.out.println("Dana Dana Dana");
	}
	@Test
	public void testValue() {
		System.out.println("Test Value");
		TestGet testGet = new TestGet();
		testGet.runGet("https://jsonplaceholder.typicode.com/posts/101");
		Assert.assertEquals("expected status code not as actual",404, testGet.status_code);
	}
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before Class");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
