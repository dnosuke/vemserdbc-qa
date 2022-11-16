///<reference types="cypress" />
let token;
let idPessoa;

context("Pessoa", () => {
  it("POST - logar com sucesso", () => {
    cy.login().should((response) => {
      expect(response.status).to.eq(200);
      token = response.body;
    });
  });

  it("POST - Teste adicionar pessoa", () => {
    cy.adicionarPessoa(token).should((response) => {
      expect(response.status).to.eq(200);
      console.log(response.body[length]);
      idPessoa = response.body.idPessoa;
    });
  });

  it("DELETE - Teste deletar pessoa", () => {
    cy.deletarPessoa(idPessoa, token).should((response) =>
      expect(response.status).to.eq(200)
    );
  });
});
