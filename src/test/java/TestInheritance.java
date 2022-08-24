import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestInheritance {
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
	
	@Test
	public void testMehodParent() {
		
	}
}
