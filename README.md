# Web Services com Spring Boot e JPA Hibernate

Este projeto é uma aplicação de Web Services desenvolvida com **Spring Boot** e **JPA Hibernate**. A aplicação foi criada com o objetivo de explorar os conceitos de APIs RESTful, integração com banco de dados e boas práticas de desenvolvimento utilizando o ecossistema Spring.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada no desenvolvimento da aplicação.
- **Spring Boot**: Framework que facilita a criação de aplicações Spring, reduzindo a necessidade de configuração manual.
- **JPA Hibernate**: Implementação do Java Persistence API (JPA), que facilita a interação entre a aplicação e o banco de dados.
- **H2 Database**: Banco de dados em memória utilizado para facilitar o desenvolvimento e testes.
- **Spring Tools**: Ambiente de desenvolvimento integrado (IDE) utilizado para o desenvolvimento do projeto.

## Funcionalidades

- **CRUD de Entidades**: A aplicação permite criar, ler, atualizar e deletar entidades no banco de dados.
- **Persistência de Dados**: Utilização do JPA Hibernate para mapear as entidades para o banco de dados H2.
- **API RESTful**: Endpoints criados para permitir a interação com as entidades via HTTP.
- **Banco de Dados em Memória**: Utilização do H2 para armazenar dados temporários durante a execução da aplicação, facilitando o desenvolvimento e os testes.

## Como Executar a Aplicação

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/Scorpionx7/webservice-project.git
   ```
2. **Navegue até o diretório do projeto**:
   ```bash
   cd webservice-project
   ```
3. **Execute o projeto** utilizando sua IDE preferida (como o Spring Tools) ou via linha de comando:
   ```bash
   ./mvnw spring-boot:run
   ```

   A aplicação estará disponível em `http://localhost:8080`.

## Configuração do Banco de Dados

Por padrão, a aplicação está configurada para utilizar o banco de dados H2 em memória. Ao iniciar a aplicação, o banco de dados será inicializado automaticamente e estará disponível em:

- **URL**: `http://localhost:8080/h2-console`
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Usuário**: `sa`
- **Senha**: '`password`

## Estrutura do Projeto

A estrutura principal do projeto é organizada da seguinte maneira:

- **Entities**: Contém as classes de entidades que representam as tabelas no banco de dados.
- **Repositories**: Interfaces que estendem o `JpaRepository` para a persistência das entidades.
- **Services**: Camada de serviço onde a lógica de negócio é implementada.
- **Resources**: Camada responsável por expor os endpoints REST para o consumo da API.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).

