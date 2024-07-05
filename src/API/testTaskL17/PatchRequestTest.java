package API.testTaskL17;

import org.testng.annotations.Test;

import static API.specification.Specification.requestSpecification;
import static API.specification.Specification.responseSpecification;
import static io.restassured.RestAssured.given;

public class PatchRequestTest {

    @Test
    public void patchRequestTest() {

        given()
                .spec(requestSpecification())
                .when()
                .body("This is expected to be sent back as part of response body.")
                .patch("patch")
                .then()
                .spec(responseSpecification())
                .log().all();

    }
}
