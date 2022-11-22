import { faker } from "@faker-js/faker";
import BasePage from "./BasePage";
const basePage = new BasePage();

let saveBtn = ".col-md-offset-2 > .btn";
let backBtn = ".btn-link";
let name = "#Name";
let company = "#Company";
let address = "#Address";
let city = "#City";
let email = "#Email";
export let emailFakeEdit =  faker.internet.email();

export default class EditPage {
  editarUser() {
    basePage.limparInput(name)
    basePage.limparInput(company)
    basePage.limparInput(address)
    basePage.limparInput(city)
    basePage.limparInput(email)
    
    basePage.preencherInput(name, faker.name.firstName());
    basePage.preencherInput(company, faker.company.name());
    basePage.preencherInput(address, faker.address.street());
    basePage.preencherInput(city, faker.address.cityName());
    basePage.preencherInput(email,emailFakeEdit);
    
    basePage.click(saveBtn)

  }

  clicarEdit() {
    basePage.click(logoutBtn);
  }
  clicarBack() {
    basePage.click(backBtn);
  }
}
