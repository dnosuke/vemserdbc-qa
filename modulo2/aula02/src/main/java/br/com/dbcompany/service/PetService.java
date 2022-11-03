package br.com.dbcompany.service;

import br.com.dbcompany.dto.PetPayloadDTO;
import br.com.dbcompany.dto.ResponseDTO;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetService {
    String baseUri = "https://petstore.swagger.io/v2";

    public PetPayloadDTO adicionarPet(String requestBody) {
       PetPayloadDTO result =
       given()
                .log().all()
                .contentType(ContentType.JSON)
                .body(requestBody)
        .when()
                .post(baseUri + "/pet")
        .then()
                .log().all()
               .extract().as(PetPayloadDTO.class)
        ;
    return result;
    }

    public PetPayloadDTO consultarPetPorId(Integer idPet){

        PetPayloadDTO result =
                given()
                        .log().all()
                        .pathParams("idPet", idPet)
                .when()
                        .get(baseUri + "/pet/{idPet}")
                .then()
                        .extract().as(PetPayloadDTO.class)
                ;

        return result;
    }

    public PetPayloadDTO atualizaPet(String requestBody){
        PetPayloadDTO result =
                given()
                        .log().all()
                        .contentType(ContentType.JSON)
                        .body(requestBody)
                .when()
                        .put(baseUri + "/pet")
                .then()
                        .extract().as(PetPayloadDTO.class)
                ;
        return result;
    }

    public ResponseDTO deletarPet(Integer idPet){
        ResponseDTO result =
                given()
                        .log().all()
                        .pathParams("idPet", idPet)
                .when()
                        .delete(baseUri + "/pet/{idPet}")
                .then()
                        .extract().as(ResponseDTO.class)
                ;
        return result;
    }
}
