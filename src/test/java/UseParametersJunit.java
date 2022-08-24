import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.BeforeParam;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UseParametersJunit {
	
    @Parameterized.Parameter(0)
    public String url_prefex;
    @Parameterized.Parameter(1)
    public String statusCode;
    
	@Parameters
	public static Collection<String[]> input() throws Exception{
		String path = "./testData.csv";
		List<String[]> lines = ReadCsvFile.readAllLines(path);
		lines.remove(0);
		return lines;
	}
	
	@Test
	@Parameters
	public void testGet() {
		String url = "https://jsonplaceholder.typicode.com" + url_prefex;
		TestGet testGet = new TestGet();

		testGet.runGet(url);
		Assert.assertEquals(Integer.parseInt(statusCode), testGet.status_code);
	}
	
	@BeforeParam
	public static void beforeParam() {
		System.out.println("before param");
	}
}
