https://www.mermaidchart.com/raw/e7915d4c-b2df-49e7-b312-6ca9d6178a69?theme=light&version=v0.1&format=svg



classDiagram
    class iPhone {
    }

    iPhone <|-- ReprodutorMusical
    iPhone <|-- AparelhoTelefonico
    iPhone <|-- NavegadorInternet

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }


    ![alt text](image.png)