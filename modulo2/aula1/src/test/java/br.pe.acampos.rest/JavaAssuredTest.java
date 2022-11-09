package br.pe.acampos.rest;

import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class JavaAssuredTest {
    @Test
    public void estruturaDoTeste(){

    }

    @Test
    public void testeDEveConsultarUsuariosComId2(){
        given()
        .when()
                .get("https://reqres.in/api/users/2"
)       .then()
                .statusCode(200)
                .body("data.id", Matchers.is(2))
        ;


    }
}
