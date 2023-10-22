# Desafio-Cloud-RestAPI

Repositório para armazenar API RESTful para o desafio Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway.
Foram utilizadas as seguintes tecnologias:
Spring web, Spring data JPA, Postgres database, Lombok, OpenApi(Swagger) e Railway.

link Railway: cloud-restapi-prd.up.railway.app/swagger-ui.html

```mermaid
classDiagram
  class User {
    -id: Number
    -name: String
    -book: Book
    -film: Film
  } 
  class Book{
    -title: String
    -category: String
    -author: String
    -publicationYear: String
  }
   class Film{
    -title: String
    -category: String
    -author: String
    -publicationYear: String
  }


  User "*" *-- "*" Film
  User "*" -- "*" Book
```
