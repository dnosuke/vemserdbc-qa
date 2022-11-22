import BasePage from "./BasePage";
const basePage = new BasePage();

let deleteBtn = ".btn-outline-danger";
let urlExpected = "https://itera-qa.azurewebsites.net/Dashboard";

export default class DeletePage {
  clicarDeletarUser() {
    basePage.click(deleteBtn);
    basePage.validarRedirecionarPagina(urlExpected);
  }
}
