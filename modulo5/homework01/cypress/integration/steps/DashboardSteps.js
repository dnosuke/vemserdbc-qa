/// <reference types="cypress" />
import LoginPage from "../pages/LoginPage";
import Dashboard from "../pages/DashboardPage";
import BasePage from "../pages/BasePage";
import DeletePage from "../pages/DeletePage";
import CreatePage, { emailFake } from "../pages/CreatePage";

const basePage = new BasePage();
const createPage = new CreatePage();
const loginPage = new LoginPage();
const dashboardPage = new Dashboard();
const deletePage = new DeletePage();

context("Dashboard", () => {
  beforeEach(() => {
    loginPage.loginNoSistema();
  });
  it("Validar buscar nome/email valido", () => {
    dashboardPage.clicarCriar();
    createPage.criarNovoUser();
    dashboardPage.buscarNameEmailValido(emailFake);
    dashboardPage.clicarDeletar();
    deletePage.clicarDeletarUser();
  });

  it("Validar buscar nome/email inexistente", () => {
    dashboardPage.clicarCriar();
    createPage.criarNovoUser();
    dashboardPage.buscarNameEmailValido(emailFake);
    dashboardPage.clicarDeletar();
    deletePage.clicarDeletarUser();
    dashboardPage.buscarNomeEmailInexistente(emailFake);
  });

  it("Validar Logout com sucesso", () => {
    dashboardPage.clicarLogout();
    basePage.validarRedirecionarPagina(
      "https://itera-qa.azurewebsites.net/Login"
    );
    basePage.validarText(
      ".form-inline > .navbar-nav > :nth-child(2) > .nav-link",
      "Login"
    );
  });
});
