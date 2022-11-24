import BasePage from "./BasePage";
const basePage = new BasePage;

let username = "#Username";
let password = "#Password";
let loginBtn = "body > div > div:nth-child(4) > form > table > tbody > tr:nth-child(7) > td:nth-child(2) > input.btn.btn-primary";
let msgLogin = "body > div > div > h3";
let msgErroLogin = ".alert-danger";

export default class LoginPage {

    preencherUsername() {
        basePage.preencherInput(username, "teste123");
    }

    preencherPassword() {
        basePage.preencherInput(password, "12345");
    }

    clicarNoBtnLogin() {
        basePage.click(loginBtn);
    }

    validarMsgLogin() {
        basePage.validarText(msgLogin, "Welcome teste123");
        basePage.validarUrl("https://itera-qa.azurewebsites.net/Dashboard");
    }

    preencherPasswordInvalido() {
        basePage.preencherInput(password, "abc123");
    }

    validarMsgErroLogin() {
        basePage.validarText(msgErroLogin, "Wrong username or password");
        basePage.validarUrl("https://itera-qa.azurewebsites.net/Login/Authorize");
    }

}