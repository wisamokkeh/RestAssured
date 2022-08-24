import java.util.List;

public class DataDrivenTest {
	public static void main(String[] args) throws Exception {
		String path = "./testData.csv";
		String url = "https://jsonplaceholder.typicode.com";
		List<String[]> lines = ReadCsvFile.readAllLines(path);
		for (String[] line : lines) {
			if(line[0].contains("route")) {
				continue;
			}
			TestGet testGet = new TestGet();
			System.out.println(url + line[0]);
			testGet.runGet(url + line[0]);
			if(testGet.status_code == Integer.parseInt(line[1])) {
				System.out.println("Success");
			}else {
				System.out.println("Failed");
			}
		}
	}
}
