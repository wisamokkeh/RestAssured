import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGet {
	int status_code;
	String response_txt;
	public void runGet(String url) {
		Response response = RestAssured.get(url);
		this.status_code =response.getStatusCode();
		this.response_txt = response.asPrettyString();
	}
	
}
