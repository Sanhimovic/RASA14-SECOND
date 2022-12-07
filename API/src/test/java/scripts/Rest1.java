package scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import genric.Spec_Builder_api;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Rest1 {
	public static void main(String[] args) throws IOException {
		Response res = given().spec(Spec_Builder_api.req_builder()).when().get("/api/users/2")
		.then().spec(Spec_Builder_api.res_builder(200)).extract().response();
		
		System.out.println(res.asString());
	}

}
