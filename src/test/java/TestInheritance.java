import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestInheritance {
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("before class Parent");
		
	}
	@Before
	public void before() {
		
		System.out.println("before Parent");
		
	}
	
	@After
	public void afterParent() {
		
		System.out.println("after Parent");
		
	}
	@Ignore
	@Test
	public void testMehodParent() {
		
	}
}
