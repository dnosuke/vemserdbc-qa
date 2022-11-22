import BasePage from "./BasePage";
import { faker } from "@faker-js/faker";
const basePage = new BasePage();

export let emailFake = faker.internet.email();
let name = "#Name";
let company = "#Company";
let address = "#Address";
let city = "#City";
let phone = "#Phone";
let email = "#Email";
let createBtn = ".col-md-offset-2 > .btn";
let urlExpected = "https://itera-qa.azurewebsites.net/Dashboard";

export default class Create {
  criarNovoUser() {
    basePage.preencherInput(name, faker.name.firstName());
    basePage.preencherInput(company, faker.company.name());
    basePage.preencherInput(address, faker.address.street());
    basePage.preencherInput(city, faker.address.cityName());
    basePage.preencherInput(phone, faker.phone.number("51 86 9#### ####"));
    basePage.preencherInput(email, emailFake);
    basePage.click(createBtn);
    basePage.validarRedirecionarPagina(urlExpected);
  }
}
