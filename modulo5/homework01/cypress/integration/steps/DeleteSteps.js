/// <reference types="cypress" />
import LoginPage from "../pages/LoginPage";
import DeletePage from "../pages/DeletePage";
import Dashboard from "../pages/DashboardPage";
import CreatePage, { emailFake } from "../pages/CreatePage";

const createPage = new CreatePage();
const loginPage = new LoginPage();
const deletePage = new DeletePage();
const dashboardPage = new Dashboard();

context("Deletar", () => {
  beforeEach(() => {
    loginPage.loginNoSistema();
  });
  it("Deletar user com sucesso", () => {
    dashboardPage.clicarCriar();
    createPage.criarNovoUser();
    dashboardPage.buscarNameEmailValido(emailFake);
    dashboardPage.clicarDeletar();
    deletePage.clicarDeletarUser();
    dashboardPage.buscarNomeEmailInexistente(emailFake);
  });
});
