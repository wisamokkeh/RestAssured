import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ThirdTry {
	static List<String[]> lines;
	static List<String[]> failedLines;
	static String url = "https://jsonplaceholder.typicode.com";
	@BeforeClass
	public static void beforeClass() throws Exception {
		String path = "./testData.csv";
		failedLines = new ArrayList<String[]>();
		lines = ReadCsvFile.readAllLines(path);
	}
	
	@Test
	public  void testGet() throws Exception {
		for (String[] line : lines) {
			if(line[0].contains("route")) {
				continue;
			}
			TestGet testGet = new TestGet();
			System.out.println(url + line[0]);
			testGet.runGet(url + line[0]);
			String statusCode =  line[1];
			if(testGet.status_code != Integer.parseInt(statusCode)) {
				String[] lineDetails = {line[0],line[1], testGet.status_code+ ""};
				failedLines.add(lineDetails);
			}
			
		}
		Assert.assertEquals("Test have "+failedLines.size()+" failed cases", failedLines.size() , 0);
	}
	
	@AfterClass
	public static void afterClass() {
		String[] headers = {"route","expected status code", "actual status Code"};
		WriteCsvFile.writeDataLineByLine("output.csv", failedLines, headers);
	}
}
