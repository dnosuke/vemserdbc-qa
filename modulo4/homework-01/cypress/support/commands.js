// ***********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************
//
//
// -- This is a parent command --
// Cypress.Commands.add('login', (email, password) => { ... })
//
//
// -- This is a child command --
// Cypress.Commands.add('drag', { prevSubject: 'element'}, (subject, options) => { ... })
//
//
// -- This is a dual command --
// Cypress.Commands.add('dismiss', { prevSubject: 'optional'}, (subject, options) => { ... })
//
//
// -- This will overwrite an existing command --
// Cypress.Commands.overwrite('visit', (originalFn, url, options) => { ... })
import { faker } from "@faker-js/faker";

const BASE_URL = "https://fakerestapi.azurewebsites.net/api/v1/Activities";

function createDate() {
  const date = new Date();
  return date.toISOString();
}
Cypress.Commands.add("criarAtividade", () => {
  cy.request({
    method: "POST",
    url: BASE_URL,
    failOnStatusCode: false,
    body: {
      id: 100,
      title: "string",
      dueDate: createDate(),
      completed: true,
    },
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("pegarTodasAtividades", () => {
  cy.request({
    method: "GET",
    url: BASE_URL,
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("pegarAtividadePorId", (id) => {
  cy.request({
    method: "GET",
    url: `${BASE_URL}/${id}`,
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("atualizarAtividadePorId", (id) => {
  cy.request({
    method: "PUT",
    url: `${BASE_URL}/${id}`,
    failOnStatusCode: false,
    body: {
      id: 110,
      title: "string",
      dueDate: createDate(),
      completed: false,
    },
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("deletarAtividadePorId", (id) => {
  cy.request({
    method: "DELETE",
    url: `${BASE_URL}/${id}`,
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

// COMANDOS PARA PESSOA API

const BASE_URL_PESSOA =
  "http://vemser-dbc.dbccompany.com.br:39000/vemser/dbc-pessoa-api/";

Cypress.Commands.add("adicionarPessoa", (token) => {
  cy.request({
    method: "POST",
    url: `${BASE_URL_PESSOA}pessoa`,
    headers: {
      Authorization: token,
      "Content-Type": "application/JSON",
    },
    body: {
      nome: faker.name.firstName(),
      dataNascimento: faker.date.birthdate(),
      cpf: "123145152",
      email: faker.internet.email(),
    },
    failOnStatusCode: false,
  })
    .as("response")
    .get("@response");
});

Cypress.Commands.add("deletarPessoa", (idPessoa, token) => {
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

Cypress.Commands.add("login", () => {
  cy.request({
    method: "POST",
    url: `${BASE_URL_PESSOA}/auth`,
    failOnStatusCode: false,
    body: {
      login: "admin",
      senha: "123",
    },
  });
});
