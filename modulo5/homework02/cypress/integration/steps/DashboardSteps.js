import LoginPage from "../pages/LoginPage";
const loginPage = new LoginPage;

import DashboardPage from "../pages/DashboardPage";
const dashboardPage = new DashboardPage;

context('Login', () => {

    Given("que estou logado no sistema", () => {
        loginPage.preencherUsername();
        loginPage.preencherPassword();
        loginPage.clicarNoBtnLogin();
    });

    And("clico em create new", () => {
        dashboardPage.clicarNoBtnCreateNew();
    });

    And("que preencho todos os campos validos", () => {
        dashboardPage.preencherCamposCreate();
    });
      
    When("clico em create", () => {
        dashboardPage.clicarNoBtnCreate();
    });

    Then("devo ter um cliente salvo no sistema", () => {
        dashboardPage.validarCustomerCriado();
    });

    And("que nao preencho todos os campos", () => {
        // Na api executa a criação, no teste informa campo não pode ser vazio

        dashboardPage.naoPreencherCamposCreate();
    });

    Then("devo nao ter um cliente salvo no sistema", () => {
        // Deveria exibir mensagem de erro padrão para campos vazios e não salvar

        dashboardPage.validarErroCriacaoCustomer();
    });

    When("clico em back to list", () => {
        dashboardPage.clicarNoBtnBackToList();
    });

    Then("devo retornar para a página Dashboard", () => {
        dashboardPage.validarBotaoBackToList();
    });

    And("que preencho campo pesquisa com nome valido", () => {
        dashboardPage.preencherCampoSearchComNome();
    });
      
    When("clico em search", () => {
        dashboardPage.clicarNoBtnSearch();
    });

    Then("devo visualizar dados do cliente pesquisado na tela", () => {
        dashboardPage.validarSearchComNome();
    });

    And("que preencho campo pesquisa com email valido", () => {
        dashboardPage.preencherCampoSearchComEmail();
    });

    And("que preencho campo pesquisa com nome inexistente", () => {
        dashboardPage.preencherCampoSearchComNomeInexistente();
    });

    Then("devo visualizar mensagem de erro na tela", () => {
        dashboardPage.validarMsgErroSearch();
    });

    And("clico em details", () => {
        dashboardPage.clicarNoBtnDetails();
    });

    Then("devo ser redirecionado para pagina de detalhes e visualizar detalhes do cliente na tela", () => {
        dashboardPage.validarDetails();
    });

    And("clico em edit", () => {
        dashboardPage.clicarNoBtnEdit();
    });

    Then("devo ser redirecionado para pagina de edit", () => {
        dashboardPage.validarBotaoEditDetails();
    });

    And("que altero todos os campos validos", () => {
        dashboardPage.alterarCamposEdit();
    });

    When("clico em save", () => {
        dashboardPage.clicarNoBtnSave();
    });

    Then("devo ter um cliente atualizado no sistema", () => {
        dashboardPage.validarCustomerEditado();
    });

    And("que altero todos os campos sem preencher", () => {
        dashboardPage.alterarCamposVaziosEdit();
    });

    Then("devo nao ter um cliente atualizado no sistema", () => {
        // Deveria exibir mensagem de erro padrão para campos vazios e não salvar

        dashboardPage.validarErroEdicaoCustomer();
    });

    And("clico em delete", () => {
        dashboardPage.clicarNoBtnDelete();
    });

    When("clico em delete na pagina de Delete", () => {
        dashboardPage.clicarNoBtnDeleteCustomer();
    });

    Then("devo ter um cliente deletado do sistema", () => {
        dashboardPage.validarDelete();
    });

})