/// <reference types="cypress" />
import LoginPage from "../pages/LoginPage";
import CreatePage from "../pages/CreatePage";
import Dashboard from "../pages/DashboardPage";

const loginPage = new LoginPage();
const createPage = new CreatePage();
const dashboardPage = new Dashboard();

context("Criar", () => {
  beforeEach(() => {
    loginPage.loginNoSistema();
  });
  it("Criar user com sucesso", () => {
    dashboardPage.clicarCriar();
    createPage.criarNovoUser();
  });
});
