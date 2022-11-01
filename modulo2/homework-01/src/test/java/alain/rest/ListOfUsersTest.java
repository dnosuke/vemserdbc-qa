package alain.rest;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ListOfUsersTest {
    private String baseUri = "https://reqres.in/api";

    @Test
    public void deveConsultarPage2ComSucesso(){
        given()
                .log().all()
                .queryParam("page", 2)
        .when()
                .log().all()
                .get(baseUri + "/users")
        .then()
                .log().all()
                .statusCode(200)
                .body("page", equalTo(2))
        ;
    }
    @Test
    public void deveConsultarPaginaUmComSucesso(){
        given()
                .log().all()
                .queryParam("page", 1)
        .when()
                .log().all()
                .get(baseUri + "/users")
        .then()
                .log().all()
                .statusCode(200)
                .body("data", hasSize(6))
                .body("data[2].id", equalTo(3))
        ;
    }
    @Test
    public void deveConsultarUmUserComSucesso(){
        given()
                .log().all()
                .queryParam("id", 1)
        .when()
                .log().all()
                .get(baseUri + "/users")
        .then()
                .log().all()
                .statusCode(200)
                .body("data.first_name", is("George"))
                .body("data.id", equalTo(1))
        ;
    }
    @Test
    public void deveUserNotFoundComSucesso(){
        given()
                .log().all()
                .queryParam("id", 23)
        .when()
                .log().all()
                .get(baseUri + "/users")
        .then()
                .log().all()
                .statusCode(404)
                .body("data.first_name", nullValue())
                .body("data.id", nullValue())
        ;
    }
    @Test
    public void deveCriarUserComSucesso(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\"name\":\"Alain\",\"job\": \"QA\"}")
        .when()
                .log().all()
                .post(baseUri + "/users")
        .then()
                .log().all()
                .statusCode(201)
                .body("name", equalTo("Alain"))
                .body("job", equalTo("QA"))
                .body("createdAt", notNullValue())
        ;
    }
    @Test
    public void deveAtualizarUserComSucesso(){
        Integer id = 2;

        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\"name\":\"Alain\",\"job\": \"Fullstack\"}")
                .pathParams("id", id)
        .when()
                .log().all()
                .put(baseUri + "/users/{id}")
        .then()
                .log().all()
                .statusCode(200)
                .body("name", equalTo("Alain"))
                .body("job", equalTo("Fullstack"))
                .body(containsString("updatedAt"))
        ;
    }
    @Test
    public void deveDeletarUserComSucesso(){
        given()
                .log().all()
                .queryParam("id", 2)
        .when()
                .log().all()
                .delete(baseUri + "/users")
        .then()
                .log().all()
                .statusCode(204)
        ;
    }
    @Test
    public void deveRegistrarUserComSucesso(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\"email\": \"eve.holt@reqres.in\", \"password\":\"pistol\"}")
        .when()
                .log().all()
                .post(baseUri + "/register")
        .then()
                .log().all()
                .statusCode(200)
        ;
    }
    @Test
    public void deveFazerLoginComSucesso(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\"email\": \"eve.holt@reqres.in\", \"password\":\"cityslicka\"}")
        .when()
                .log().all()
                .post(baseUri + "/login")
        .then()
                .log().all()
                .statusCode(200)
                .body(containsString("token"))
        ;
    }
}



