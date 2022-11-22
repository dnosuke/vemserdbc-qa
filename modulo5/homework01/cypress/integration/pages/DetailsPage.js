import BasePage from "./BasePage";
const basePage = new BasePage();

let editBtn = ".btn-outline-primary";
let backBtn = ".btn-link";

export default class EditPage {
  clicarEdit() {
    basePage.click(editBtn);
  }
  clicarBack() {
    basePage.click(backBtn);
  }
}
