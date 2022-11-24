/// <reference types="cypress" />

export default class BasePage {
 
    click(elemet){ 
       cy.get(elemet).click() 
    }
  
    clickForce(elemet){ 
       cy.get(elemet).click({force:true}) 
    }
  
    preencherInput(element, text){ 
      cy.get(element).type(text)
    }
  
    preencherInputComTeclaNoFinal(element, text, tecla){
       cy.get(element).type(text).type(tecla);
    }
  
    preencherInputForce(element, text){ 
       cy.get(element).type(text, {force:true})
    }


    apagarEPreencherInput(element, text){ 
      cy.get(element).clear().type(text)
    }


    apagarInput(element){ 
      cy.get(element).clear()
    }
    
    tempo(tempo){ 
       cy.wait(tempo) 
    }
  
    select(element, value){ 
       cy.get(element).select(value) 
    }
  
    validarText(element, text){ 
       cy.get(element).should('contain', text) 
    }
  
    validarQuantItemNaLista(element, quant){
       cy.get(element).should('have.length', quant)
    }

    validarUrl(text){ 
      cy.url().should('contain', text) 
    }

}