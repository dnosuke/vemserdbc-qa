///<reference types="cypress" />
import userPayload from "../../../fixtures/addUser.payload.json";
import addEnderecoPayload from "../../../fixtures/addEndereco.payload.json";

context("Endereco", () => {
  it("GET - Teste listar endereco por idEndereco", () => {
    cy.adicionarPessoa(userPayload).then((pessoa) => {
      cy.adicionarEndereco(pessoa.body.idPessoa, addEnderecoPayload).then(
        (endereco) => {
          cy.listaEndereco(endereco.body.idEndereco).should((response) => {
            expect(response.status).to.eq(200);
            expect(response.body.logradouro).to.eq(
              "Rua Deputado Álvares Florence"
            );
          });
        }
      );
      cy.deletarPessoa(pessoa.body.idPessoa);
    });
  });

  it("DELETE - Teste deletar endereco por idEndereco", () => {
    cy.adicionarPessoa(userPayload).then((pessoa) => {
      cy.adicionarEndereco(pessoa.body.idPessoa, addEnderecoPayload).then(
        (endereco) => {
          cy.deletarEndereco(endereco.body.idPessoa).should((response) => {
            expect(response.status).to.eq(200);
          });
        }
      );
      cy.deletarPessoa(pessoa.body.idPessoa);
    });
  });
});
