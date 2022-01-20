package fr.miage.script;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ScriptApplicationTests {

    @LocalServerPort
    int port;

    @BeforeEach
	void contextLoads() {
        RestAssured.port = port;
	}

    @Test
    void getDefault(){
        Response r = given()
                .when().get("/helloworld")
                .then().statusCode(HttpStatus.SC_OK
                ).extract().response();
        assertThat(r.asPrettyString(), containsString("Hello World"));
    }

    @Test
    void getParam(){
        Response r = given()
                .when().get("/helloworld?student=tristan")
                .then().statusCode(HttpStatus.SC_OK
                ).extract().response();
        assertThat(r.asPrettyString(), containsString("Hello World tristan !"));
    }

    @Test
    void getNotFound(){
        given().when().get("/hello").then().statusCode(HttpStatus.SC_NOT_FOUND);
    }

}
