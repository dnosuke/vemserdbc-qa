Feature: Login

   Scenario: Validar login com sucesso
      Given que preencho com login valido
      And que preencho a senha valida
      When clico em login
      Then devo visualizar uma mensagem de boas vindas

   Scenario: Validar login com senha errada
      Given que preencho com login valido
      And que preencho campo senha com senha invalida
      When clico em login
      Then devo visualizar uma mensagem de erro
   