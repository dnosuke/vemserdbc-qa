package br.com.dbcompany.aceitacao;

import br.com.dbcompany.dto.PetPayloadDTO;
import br.com.dbcompany.dto.ResponseDTO;
import br.com.dbcompany.service.PetService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Integer.parseInt;

public class PetAceitacaoTestJava {
    String jsonBody = lerJson("src/test/resources/data/pet1.json");
    PetService service = new PetService();

    public PetAceitacaoTestJava() throws IOException {

    }

    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }

    @Test
    public void testeDeveAdicionarPet() {



        PetPayloadDTO resultService = service.adicionarPet(jsonBody);

        Assert.assertEquals(resultService.getId(), "20221101");
        Assert.assertEquals(resultService.getName(), "Scooby");

        service.deletarPet(parseInt(resultService.getId()));
    }

    @Test
    public void testeDeveConsultarPetPorId() throws IOException {

        service.adicionarPet(jsonBody);
        Integer idPet = 20221101;

        PetPayloadDTO resultService = service.consultarPetPorId((idPet));

        Assert.assertEquals(resultService.getId(), "20221101");
        Assert.assertEquals(resultService.getName(), "Scooby");

        service.deletarPet(parseInt(resultService.getId()));
    }

    @Test
    public void testeDeveAtualizarPetPut() throws IOException {

        service.adicionarPet(jsonBody);

        PetPayloadDTO resultService = service.atualizaPet(jsonBody);

        Assert.assertEquals(resultService.getId(), "20221101");
        Assert.assertEquals(resultService.getName(), "Scooby-Doo");

        service.deletarPet(parseInt(resultService.getId()));
    }

    @Test
    public void testeDeveDeletarPet() {

        service.adicionarPet(jsonBody);
        Integer idPet = 20221101;

        ResponseDTO responseService = service.deletarPet(idPet);

        Assert.assertEquals(responseService.getCode(), "200");
    }
}
