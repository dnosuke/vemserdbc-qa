import { faker } from "@faker-js/faker";

const BASE_URL_PESSOA =
  "http://vemser-dbc.dbccompany.com.br:39000/vemser/dbc-pessoa-api/";
let token;

before(() => {
  cy.login();
  cy.saveLocalStorage();
  cy.getLocalStorage("token").then((response) => {
    token = response;
  });
});

Cypress.Commands.add("adicionarPessoa", (body) => {
  cy.request({
    method: "POST",
    url: `${BASE_URL_PESSOA}pessoa`,
    headers: {
      Authorization: token,
      "Content-Type": "application/JSON",
    },
    body: body,
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("deletarPessoa", (idPessoa) => {
  cy.request({
    method: "DELETE",
    url: `${BASE_URL_PESSOA}pessoa/${idPessoa}`,
    headers: {
      Authorization: token,
      "Content-Type": "application/json",
    },
    failOnStatusCode: false,
  });
});

Cypress.Commands.add("listarPessoas", (page, tamanho) => {
  cy.request({
    method: "GET",
    url: `${BASE_URL_PESSOA}pessoa`,
    headers: {
      Authorization: token,
      "Content-Type": "application/json",
    },
    qs: {
      pagina: page,
      tamanhoDasPaginas: tamanho,
    },
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("atualizarPessoa", (idPessoa) => {
  cy.request({
    method: "PUT",
    url: `${BASE_URL_PESSOA}pessoa/${idPessoa}`,
    headers: {
      Authorization: token,
      "Content-Type": "application/json",
    },
    body: {
      nome: "Delon",
      dataNascimento: "2003-12-08",
      cpf: "56448825002",
      email: "superman@dbccompany.com.br",
    },
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("listarPessoaPeloNome", (nome) => {
  cy.request({
    method: "GET",
    url: `${BASE_URL_PESSOA}pessoa/byname`,
    headers: {
      Authorization: token,
      "Content-Type": "application/json",
    },
    qs: {
      nome: nome,
    },
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("listarRelatorio", (idPessoa) => {
  cy.request({
    method: "GET",
    url: `${BASE_URL_PESSOA}pessoa/relatorio`,
    headers: {
      Authorization: token,
      "Content-Type": "application/json",
    },
    qs: {
      idPessoa: idPessoa,
    },
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("listaCompleta", (idPessoa) => {
  cy.request({
    method: "GET",
    url: `${BASE_URL_PESSOA}pessoa/lista-completa`,
    headers: {
      Authorization: token,
      "Content-Type": "application/json",
    },
    qs: {
      idPessoa: idPessoa,
    },
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("listaEnderecos", (_idPessoa) => {
  cy.request({
    method: "GET",
    url: `${BASE_URL_PESSOA}pessoa/lista-com-enderecos`,
    headers: {
      Authorization: token,
      "Content-Type": "application/json",
    },
    qs: {
      idPessoa: _idPessoa,
    },
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("listaContatos", (_idPessoa) => {
  cy.request({
    method: "GET",
    url: `${BASE_URL_PESSOA}pessoa/lista-com-contatos`,
    headers: {
      Authorization: token,
      "Content-Type": "application/json",
    },
    qs: {
      idPessoa: _idPessoa,
    },
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("login", () => {
  cy.request({
    method: "POST",
    url: `${BASE_URL_PESSOA}/auth`,
    failOnStatusCode: false,
    body: {
      login: "admin",
      senha: "123",
    },
  })
    .its("body")
    .then((response) => cy.setLocalStorage("token", response));
});

Cypress.Commands.add("listaPessoasDataNascimento", (data, dtFinal) => {
  cy.request({
    method: "GET",
    url: `${BASE_URL_PESSOA}pessoa/data-nascimento`,
    headers: {
      Authorization: token,
      "Content-Type": "application/json",
    },
    qs: {
      data: data,
      dtFinal: dtFinal,
    },
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});
