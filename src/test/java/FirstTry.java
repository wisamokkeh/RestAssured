import org.junit.Assert;
import org.junit.Test;

public class FirstTry {
	
	@Test
	public void testGet() {
		String url_prefex = "/posts/1";
		String statusCode = "200";
		String url = "https://jsonplaceholder.typicode.com" + url_prefex;
		TestGet testGet = new TestGet();

		testGet.runGet(url);
		Assert.assertEquals(testGet.status_code , Integer.parseInt(statusCode));
		
	}
	
	@Test
	public void testGetAll() {
		String url_prefex = "/posts";
		String statusCode = "200";
		String url = "https://jsonplaceholder.typicode.com" + url_prefex;
		TestGet testGet = new TestGet();

		testGet.runGet(url);
		Assert.assertEquals(testGet.status_code , Integer.parseInt(statusCode));
		
	}
}
