# 💿 Desafio Cloud Humans - Backend Take Home Assignment


## 📚 Sobre o projeto

<p> Este é um <a href="https://github.com/cloudhumans/backend-take-home">Desafio</a> da empresa Cloud Humans. O objetivo deste projeto é receber algumas informações do "Pro" (Idade, Nível de educação, Experiências, Teste de Internet, Nota do teste de escrita e Código de indicação), e retornar um "Score" junto com o projeto adequado ao "Pro".</p>

## 💻 Tecnologias
O projeto utiliza a linguagem de programação <b>Kotlin</b> junto com framework <b>Spring Boot</b>. É utilizando o banco de dados <b>Mysql</b> junto com a biblioteca <b>Flyway</b> para realizar as migrações. Por fim, é utilizado o Gradlew como gerenciador de dependências.

## ⚡ Funcionamento
<p>
É necessário ter instalado na máquina o <b>Java SE Development kit</b>, onde utilizo na versão 11. Além disso, foi utilizado a IDE <b>IntelliJ</b>. Importante ter instalado Mysql na máquina. É necessário configurar o arquivo <b>"application-dev.yml"</b>, com as informações do banco de dados.Para o funcionamento do projeto, basta executar o arquivo <b>BackendTakeHomeAssignmentApplication.ktl</b>, onde o mesmo iniciará o Spring e criará uma nova tabela no banco de dados. Por se tratar de uma API Backend, é necessário ter alguma ferramenta para fazer requisições (POST, GET, DELETE, PUT, etc.), como o programa Postman ou Insomnia. 
</p>

## ➡️ Requisições
<p>
  <b>"localhost:8080/project" (POST) -></b> Cadastra os projetos.<br>
  <b><u>Exemplo de entrada:</u></b><br>

``` 
{
	"name":"Collect specific people information from their social media for XPTO Company",
	"required_score": 2
} 
```

</p>
<p>
  <b>"localhost:8080/pro" (GET) -></b> Retorna a lista de pros cadastrados.<br>
</p>

<p>
  <b>"localhost:8080/pro" (POST) -></b> Cadastra um novo PRO e retorna com o projeto alocado ao mesmo.<br>
  <b><u>Exemplo de entrada:</u></b><br>

  ```
  {
  "age": 35,
  "education_level": "HIGH_SCHOOL",
  "past_experiences": {
    "sales": false,
    "support": false
  },
  "internet_test": {
    "download_speed": 40.0,
    "upload_speed": 40.2
  },
  "writing_score": 0.6,
  "referral_code": "token1234"
}
```
</p>

## 🔗 Links úteis

<a href="https://spring.io/guides/tutorials/spring-boot-kotlin/">https://spring.io/guides/tutorials/spring-boot-kotlin/</a>

<a href="https://flywaydb.org/documentation/">https://flywaydb.org/documentation/</a>

<a href="https://github.com/cloudhumans/backend-take-home">https://github.com/cloudhumans/backend-take-home</a>
