<h1 align="center">
  Gerenciamento De Tarefas API
</h1>

API para Gerenciamento de Tarefas

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

Crie uma tabela com o seguinte comando antes de iniciar a aplicação:

```
   CREATE DATABASE gerenciamentotarefas;
```
Execute via IDE ou compilando o código:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/gerenciamento-de-tarefas-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).

## Swagger
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

### ⌨️ Listar todas as tarefas
* URL: GET /gerenciadorTarefas

### ⌨️ Criar uma tarefa.
* URL: POST /gerenciadorTarefas
```
    {
        "titulo":"Titulo da tarefa",
        "descricao": "Descrição da tarefa",
        "status": "PENDENTE",
        "dataConclusao": "Data da conclusão da tarefa se houver - ex: 2024-12-01 11:40"
    }
```

### ⌨️ Alterar uma tarefa.
* URL: PUT /gerenciadorTarefas
```
    {
        "id": numero do ID a ser alterado,
        "titulo":"Titulo da tarefa",
        "descricao": "Descrição da tarefa",
        "status": "PENDENTE",
        "dataConclusao": "Data da conclusão da tarefa se houver - ex: 2024-12-01 11:40"
    }
```
### ⌨️ Deletar uma tarefa.
* URL: DELETE /gerenciadorTarefas/{id}
