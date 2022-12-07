package genric;

import java.io.IOException;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_Builder_api {
	
	public static RequestSpecification req_builder() throws IOException {
		RequestSpecBuilder reqspec=new RequestSpecBuilder();
		RequestSpecification req_bui = reqspec.setBaseUri(Fetch_properties.getProp())
		.setContentType(ContentType.JSON).build();
		return req_bui;
	}
	
	public static ResponseSpecification res_builder(int scode)
	{
		ResponseSpecBuilder res_bui=new ResponseSpecBuilder();
		ResponseSpecification res1 = res_bui.expectStatusCode(scode).expectContentType(ContentType.JSON).build();
		return res1;
	}
}
