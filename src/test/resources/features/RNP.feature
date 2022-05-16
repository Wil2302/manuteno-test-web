#language: pt
#encoding: UTF-8


@Project @TesteRegressivo
Funcionalidade: Login

  @Login
  Esquema do Cenario: Login com sucesso
    Dado que estou na pagina "<URL>"
    Quando preencho o campo usuario com o valor "<Usuario>"
    E preencho o campo senha com o valor "<Usuario>"
    Entao clico no botão "Entrar"

    Exemplos: 
      | URL												   |   Usuario                 |
      | https://mvp.manuteno.com.br/ | gomez.alexandre@gmail.com |
 