import BasePage from "./BasePage";
const basePage = new BasePage();

let search = "#searching";
let searchBtn = ".container > div > form > .btn";
let msgSearch = "td";
let msgSearchEmail = ":nth-child(2) > :nth-child(6)";
let createBtn = ":nth-child(4) > .btn";
let detailsBtn = ".btn-outline-info";
let editBtn = ".btn-outline-primary";
let deleteBtn = ":nth-child(2) > :nth-child(7) > .btn-outline-danger";
let logoutBtn = ".form-inline > .navbar-nav > :nth-child(2) > .nav-link";

export default class DashboardPage {
  buscarNameEmailValido(email) {
    basePage.preencherInput(search, email);
    basePage.click(searchBtn);
    basePage.validarText(msgSearchEmail, email);
  }

  buscarNomeEmailInexistente(email) {
    basePage.preencherInput(search, email);
    basePage.click(searchBtn);
    basePage.validarText(msgSearch, "No Match");
  }

  clicarCriar() {
    basePage.click(createBtn);
  }
  clicarDetails() {
    basePage.click(detailsBtn);
  }
  clicarEdit() {
    basePage.click(editBtn);
  }
  clicarDeletar() {
    basePage.click(deleteBtn);
  }

  clicarLogout() {
    basePage.click(logoutBtn);
  }
}
