/// <reference types="cypress" />
import LoginPage from "../pages/LoginPage";
import DeletePage from "../pages/DeletePage";
import Dashboard from "../pages/DashboardPage";
import CreatePage, { emailFake } from "../pages/CreatePage";
import BasePage from "../pages/BasePage";
import EditPage from "../pages/EditPage";

const createPage = new CreatePage();
const loginPage = new LoginPage();
const deletePage = new DeletePage();
const dashboardPage = new Dashboard();
const basePage = new BasePage();
const editPage = new EditPage();

context("Detalhes", () => {
  beforeEach(() => {
    loginPage.loginNoSistema();
  });
  it("Redirecionar para detalhes do usuario", () => {
    dashboardPage.clicarCriar();
    createPage.criarNovoUser();
    dashboardPage.buscarNameEmailValido(emailFake);
    dashboardPage.clicarDetails();
    basePage.validarText("h2", "Details");
    editPage.clicarBack();
    dashboardPage.buscarNameEmailValido(emailFake);
    dashboardPage.clicarDeletar();
    deletePage.clicarDeletarUser();
  });
});
