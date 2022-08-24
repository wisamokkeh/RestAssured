import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestShelf {
	static Shelf shelf;
	@BeforeClass
	public static void beforeClass() {
		shelf = new Shelf();
	}
	@Test
	public void testCaseOne() {
		shelf.addBook("The secret");
		shelf.addBook("The secret 2");
		Assert.assertTrue(shelf.getBooks().contains("The secret"));
	}
	
	@Test
	public void testCaseTwo() {
		shelf.addBook("The secret");
		shelf.addBook("Invisibles");
		shelf.removeBook("The secret");
		shelf.removeBook("Invisibles");
		Assert.assertFalse(shelf.getBooks().contains("The secret"));
		Assert.assertFalse(shelf.getBooks().contains("Invisibles"));
	}
	
	@Test
	public void testEmpty() {
		
		Assert.assertEquals(0, shelf.getBooks().size());
	}
	
	
	
	@After
	public void after() {
		shelf.DeleteAll();
	}
}
