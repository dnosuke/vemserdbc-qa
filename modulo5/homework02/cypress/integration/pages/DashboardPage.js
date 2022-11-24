import BasePage from "./BasePage";
const basePage = new BasePage;

import { faker } from '@faker-js/faker';

let createNewBtn = "body > div > div > p:nth-child(4) > a";
let createBtn = "body > div > form > div > div:nth-child(9) > div > input";
let searchBtn = "body > div > div > form > input.btn.btn-secondary.my-2.my-sm-0";
let editBtn = ".btn-outline-primary";
let saveBtn = "body > div > form > div > div:nth-child(10) > div > input";
let detailsBtn = "body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a.btn.btn-outline-info";
let deleteBtn = "body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a.btn.btn-outline-danger";
let deleteCustomerBtn = "body > div > div > form > div > input";
let backToListBtn = ".btn-link";
let name = "#Name";
let company = "#Company";
let address = "#Address";
let city = "#City";
let phone = "#Phone";
let email = "#Email";
let search = "#searching";
let textSearchName = "body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(1)";
let textSearchEmail = "body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(6)";
let msgErroSearch = "body > div > div > table > tbody > tr:nth-child(2) > td";
let textDetails = "body > div > h2";
let msgDelete = "body > div > h3";

export default class DashboardPage {

    clicarNoBtnCreateNew() {
        basePage.click(createNewBtn);   
        basePage.validarUrl("https://itera-qa.azurewebsites.net/Customer/Create") 
    }

    preencherCamposCreate() {
        basePage.preencherInput(name, "Alain");
        basePage.preencherInput(company, faker.company.name());
        basePage.preencherInput(address, faker.address.street());
        basePage.preencherInput(city, faker.address.city());
        basePage.preencherInput(phone, faker.phone.number());
        basePage.preencherInput(email, "nosuke@gmail.com");   
    }

    clicarNoBtnCreate() {
        basePage.click(createBtn);    
    }
    validarCustomerCriado() {
        basePage.preencherInput(search,"Alain");
        basePage.click(searchBtn);
        basePage.validarText(textSearchName, "Alain");      
    }

    naoPreencherCamposCreate() {
        
    }

    validarErroCriacaoCustomer() {      
        basePage.validarUrl("https://itera-qa.azurewebsites.net/Dashboard");       
    }

    clicarNoBtnBackToList() {
        basePage.click(backToListBtn);
        basePage.validarUrl("https://itera-qa.azurewebsites.net/Dashboard");       
    }

    validarBotaoBackToList() {
        basePage.validarUrl("https://itera-qa.azurewebsites.net/Dashboard");       
    }

    preencherCampoSearchComNome() {
        basePage.preencherInput(search, "Alain");  
    }

    clicarNoBtnSearch() {
        basePage.click(searchBtn);
    }

    validarSearchComNome() {      
        basePage.validarText(textSearchName, "Alain");
        basePage.validarText(textSearchEmail, "nosuke@gmail.com");
    }

    preencherCampoSearchComEmail() {
        basePage.preencherInput(search, "nosuke@gmail.com");  
    }

    preencherCampoSearchComNomeInexistente() {
        basePage.preencherInput(search, "nosuke131231"); 
    }

    validarMsgErroSearch() {
        basePage.validarText(msgErroSearch, "No Match");
    }

    clicarNoBtnDetails() {
        basePage.click(detailsBtn);        
    }

    validarDetails() {
        basePage.validarText(textDetails, "Details");      
        basePage.validarUrl("https://itera-qa.azurewebsites.net/Customer/Details"); 
    }

    clicarNoBtnEdit() {
        basePage.click(editBtn);      
    }

    validarBotaoEditDetails() {
        basePage.validarUrl("https://itera-qa.azurewebsites.net/Customer/Edit");          
    }

    alterarCamposEdit() {
        basePage.apagarEPreencherInput(name, "Alain");     
    }

    clicarNoBtnSave() {
        basePage.click(saveBtn);
    }

    validarCustomerEditado() {
        basePage.preencherInput(search, "Alain");
        basePage.click(searchBtn);
        basePage.validarText(textSearchName, "Alain");        
    }

    alterarCamposVaziosEdit() {
        basePage.apagarInput(name);
        basePage.apagarInput(company);
        basePage.apagarInput(address);
        basePage.apagarInput(city);
        basePage.apagarInput(phone);
        basePage.apagarInput(email); 
    }

    clicarNoBtnDelete() {
        basePage.click(deleteBtn);
    }

    clicarNoBtnDeleteCustomer() {
        basePage.click(deleteCustomerBtn);   
    }

    validarDelete() {
        basePage.preencherInput(search, "Alain");
        basePage.click(searchBtn);
        basePage.validarText(textSearchName, "Alain");
    }

}