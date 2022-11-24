Feature: Dashboard

    Scenario: Validar criação de cliente com sucesso
        Given que estou logado no sistema
        And clico em create new
        And que preencho todos os campos validos
        When clico em create
        Then devo ter um cliente salvo no sistema

    Scenario: Validar tentativa de criação de cliente com campos vazios
        Given que estou logado no sistema
        And clico em create new
        And que nao preencho todos os campos
        When clico em create
        Then devo nao ter um cliente salvo no sistema

    Scenario: Validar botão back to list de create com sucesso
        Given que estou logado no sistema
        And clico em create new
        When clico em back to list
        Then devo retornar para a página Dashboard

    Scenario: Validar busca de cliente por nome com sucesso
        Given que estou logado no sistema
        And que preencho campo pesquisa com nome valido
        When clico em search
        Then devo visualizar dados do cliente pesquisado na tela

    Scenario: Validar busca de cliente por email com sucesso
        Given que estou logado no sistema
        And que preencho campo pesquisa com email valido
        When clico em search
        Then devo visualizar dados do cliente pesquisado na tela

    Scenario: Validar tentativa de busca de cliente com nome inexistente
        Given que estou logado no sistema
        And que preencho campo pesquisa com nome inexistente
        When clico em search
        Then devo visualizar mensagem de erro na tela

    Scenario: Validar visualização de cliente com sucesso
        Given que estou logado no sistema
        And clico em details
        Then devo ser redirecionado para pagina de detalhes e visualizar detalhes do cliente na tela

    Scenario: Validar botão back to list de details com sucesso
        Given que estou logado no sistema
        And clico em details
        When clico em back to list
        Then devo retornar para a página Dashboard

    Scenario: Validar botão edit de details com sucesso
        Given que estou logado no sistema
        And clico em details
        And clico em edit
        Then devo ser redirecionado para pagina de edit

    Scenario: Validar atualização de cliente com sucesso
        Given que estou logado no sistema
        And clico em edit
        And que altero todos os campos validos
        When clico em save
        Then devo ter um cliente atualizado no sistema

    Scenario: Validar tentativa de atualização de cliente com campos vazios
        Given que estou logado no sistema
        And clico em edit
        And que altero todos os campos sem preencher
        When clico em save
        Then devo nao ter um cliente atualizado no sistema

    Scenario: Validar deleção de cliente com sucesso
        Given que estou logado no sistema
        And clico em delete
        When clico em delete na pagina de Delete
        Then devo ter um cliente deletado do sistema

    Scenario: Validar botão back to list de delete com sucesso
        Given que estou logado no sistema
        And clico em delete
        When clico em back to list
        Then devo retornar para a página Dashboard
