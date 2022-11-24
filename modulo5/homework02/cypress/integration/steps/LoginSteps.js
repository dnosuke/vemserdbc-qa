import LoginPage from "../pages/LoginPage";
const loginPage = new LoginPage;

context('Login', () => {

    Given("que preencho com login valido", ()=>{
        loginPage.preencherUsername();
    });
      
    And("que preencho a senha valida", ()=>{
        loginPage.preencherPassword();
    });
      
    When("clico em login", ()=>{
        loginPage.clicarNoBtnLogin();
    });

    Then("devo visualizar uma mensagem de boas vindas", ()=>{
        loginPage.validarMsgLogin();
    });

    And("que preencho campo senha com senha invalida", ()=>{
        loginPage.preencherPasswordInvalido();
    });

    Then("devo visualizar uma mensagem de erro", ()=>{
        loginPage.validarMsgErroLogin();
    });

})