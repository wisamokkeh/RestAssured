import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UseParametersTask {
	
    @Parameterized.Parameter(0)
    public String first;
    @Parameterized.Parameter(1)
    public String second;
    @Parameterized.Parameter(2)
    public String Max;
    
	@Parameters
	public static Collection<String[]> input() throws Exception{
		String path = "./parameterData.csv";
		List<String[]> lines = ReadCsvFile.readAllLines(path);
		lines.remove(0);
		return lines;
	}
	
	@Test
	@Parameters
	public void testData() {
		int firstInt = Integer.parseInt(first);
		int secondInt = Integer.parseInt(second);
		int maxInt = Integer.parseInt(Max);
		Assert.assertEquals(Math.max(firstInt, secondInt) , maxInt);
	}
	
	
}
