package br.pe.acampos.rest;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredExemplo {
    private String baseUri = "https://reqres.in/api";

    @Test
    public void testeDeveConsultarPagina2(){
        given()
                .log().all()
                .queryParam("page", "2")
                .when()
                .get(baseUri, )
                .then()
                .log().all()
                .statusCode(200)
                .body("page", equalTo(2))
        ;
    }

    @Test
    public void testeDeSalvarUsuario(){
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\"name\": \"Ályson\", \"json\" : \"QA\"}")
                .when()
                .post(baseUri + "/users")
                .then()
                .log().all()
                .statusCode(200)
                .body("name", is("Ályson"))
                .body("job", is("QA"))
                .body("id", not(notNullValue()))
                        .body(containsString("createdAt"))
        ;
    }

}
