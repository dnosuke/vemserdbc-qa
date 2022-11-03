package br.com.dbcompany.service;

import br.com.dbcompany.dto.ResponseDTO;
import br.com.dbcompany.userDTO.ResponseUserDTO;
import br.com.dbcompany.userDTO.UserPayloadDTO;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class UserService {
    String baseUri = "https://petstore.swagger.io/v2";

    public ResponseUserDTO adicionarUser(String requestBody) {
        ResponseUserDTO result =
                given()
                        .log().all()
                        .contentType(ContentType.JSON)
                        .body(requestBody)
                .when()
                        .post(baseUri + "/user")
                .then()
                        .log().all()
                        .extract().as(ResponseUserDTO.class)
                ;
        return result;
    }
    public UserPayloadDTO consultaUserPorUsername(String username) {
        UserPayloadDTO result =
                given()
                        .log().all()
                        .pathParams("username", username)
                .when()
                        .get(baseUri + "/user/{username}")
                .then()
                        .log().all()
                        .extract().as(UserPayloadDTO.class)
                ;
        return result;
    }

    public ResponseUserDTO atualizarUser(String requestBody, String username) {
        ResponseUserDTO result =
        given()
                .log().all()
                .pathParams("username", username)
                .contentType(ContentType.JSON)
                .body(requestBody)
        .when()
                .put(baseUri + "/user/{username}")
        .then()
                .log().all()
                .extract().as(ResponseUserDTO.class)
        ;
        return result;
    }

    public ResponseDTO deletarUser(String username){
        ResponseDTO result =
                given()
                        .log().all()
                        .pathParams("username", username)
                .when()
                        .delete(baseUri + "/user/{username}")
                .then()
                        .log().all()
                        .extract().as(ResponseDTO.class)
                ;
        return result;
    }
}