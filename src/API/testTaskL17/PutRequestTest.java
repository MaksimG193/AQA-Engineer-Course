package API.testTaskL17;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static API.specification.Specification.requestSpecification;
import static API.specification.Specification.responseSpecification;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class PutRequestTest {
    @Test
    public void putRequestTest() {
        given()
                .spec(requestSpecification())
                .when()
                .body("This is expected to be sent back as part of response body.")
                .put("put")
                .then()
                .spec(responseSpecification())
                .log().all();
    }
}
