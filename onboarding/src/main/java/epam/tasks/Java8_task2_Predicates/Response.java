package epam.tasks.Java8_task2_Predicates;

public class Response {

	public String responseBody;
	public int statusCode;
	public String responseType;

	public Response(String responseBody, int statusCode, String responseType) {
		this.responseBody = responseBody;
		this.statusCode = statusCode;
		this.responseType = responseType;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getResponseBody() {
		return responseBody; 
	}
	
	public String getResponseType() {
		return responseType; 
	}

	@Override
	public String toString() {
		return "Response{" +
				"responseBody='" + responseBody + '\'' +
				", statusCode=" + statusCode +
				", responseType='" + responseType + '\'' +
				'}';
	}
}
