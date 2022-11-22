import BasePage from "./BasePage";
const basePage = new BasePage();

let username = "#Username";
let password = "#Password";
let loginBtn =
  "body > div > div:nth-child(4) > form > table > tbody > tr:nth-child(7) > td:nth-child(2) > input.btn.btn-primary";
let msgLogin = ".alert-danger";

export default class LoginPage {
  loginNoSistema() {
    basePage.preencherInput(username, "nosuke");
    basePage.preencherInput(password, "1234567");
    basePage.click(loginBtn);
  }

  loginNoSistemaComSenhaErrada() {
    basePage.preencherInput(username, "test123");
    basePage.preencherInput(password, "1234");
    basePage.click(loginBtn);
    basePage.validarText(msgLogin, "Wrong username or password");
  }
}
