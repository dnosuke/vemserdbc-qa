package br.com.dbcompany.aceitacao;

import br.com.dbcompany.dto.ResponseDTO;
import br.com.dbcompany.service.ResponseStatusDTO;
import br.com.dbcompany.service.UserService;
import br.com.dbcompany.userDTO.ResponseUserDTO;
import br.com.dbcompany.userDTO.UserPayloadDTO;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Integer.parseInt;
public class UserAceitacaoTest {
    UserService service = new UserService();
    String jsonBody = lerJson("src/test/resources/data/user1.json");
    String jsonBody2 = lerJson("src/test/resources/data/user2.json");
    String jsonBody3 = lerJson("src/test/resources/data/user3.json");

    public UserAceitacaoTest() throws IOException {
    }
    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }

    @Test
    public void testeDeveConsultarUserPorUsername() {

        service.adicionarUser(jsonBody);
        String username = "nosuke";

        UserPayloadDTO resultService = service.consultaUserPorUsername(username);

        Assert.assertTrue(resultService.getId() == 60);
        Assert.assertEquals(resultService.getUsername(), "nosuke");

        service.deletarUser(resultService.getUsername());
    }

    @Test
    public void testeConsultarUsernameNaoCadastradoRetornaUserNotFound() {
        String username = "nosuke";

        ResponseUserDTO resultService = service.consultaUserPorUsername(username);

        Assert.assertEquals(resultService.getMessage(), "User not found");

    }

    @Test
    public void testeDeveAdicionarUserComSucesso() {

        ResponseUserDTO resultService = service.adicionarUser(jsonBody);

        Assert.assertEquals(resultService.getCode(), "200");
        Assert.assertEquals(resultService.getMessage(), "60");

        service.deletarUser("nosuke");
    }
    @Test
    public void testeAdicionarUserSemPassarDadosRetornaMessage0() {

        ResponseUserDTO resultService = service.adicionarUser(jsonBody3);

        Assert.assertEquals(resultService.getCode(), "200");
        Assert.assertEquals(resultService.getMessage(), "0");

    }

    @Test
    public void testeDeveAtualizarUserComSucesso() {

        service.adicionarUser(jsonBody);
        ResponseUserDTO responseUserDTO = service.atualizarUser(jsonBody2, "nosuke");
        Assert.assertEquals(responseUserDTO.getCode(), "200");
        Assert.assertEquals(responseUserDTO.getMessage(), "60");

        service.deletarUser("dnosuke");
    }
    @Test
    public void testeAtualizarSemPassarDadosRetornaMessage0() {

        service.adicionarUser(jsonBody);
        ResponseUserDTO responseUserDTO = service.atualizarUser(jsonBody3, "nosuke");
        Assert.assertEquals(responseUserDTO.getCode(), "200");
        Assert.assertEquals(responseUserDTO.getMessage(), "0");

        service.deletarUser("nosuke");
    }


    @Test
    public void testeDeveDeletarUser() {
        service.adicionarUser(jsonBody);

        ResponseDTO responseService = service.deletarUser("nosuke");

        Assert.assertEquals(responseService.getCode(), "200");
        Assert.assertEquals(responseService.getMessage(), "nosuke");
    }

}
