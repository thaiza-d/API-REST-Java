# Baozi Doces e Biscoitos — API REST

API REST desenvolvida em Java com Spring Boot para o gerenciamento de clientes, produtos e pedidos de uma pequena loja fictícia de doces e biscoitos.

---

## 📌 Sobre o projeto

A Baozi Doces e Biscoitos é uma pequena loja especializada na venda de doces e biscoitos, especialmente chocolates. Para melhorar a organização do negócio, foi desenvolvido um sistema simples para controlar clientes, produtos e pedidos por meio de uma API REST.

A aplicação foi desenvolvida como atividade acadêmica de Desenvolvimento Web Back-End, com o objetivo de aplicar conceitos de desenvolvimento de APIs REST, persistência de dados, integração com banco de dados e operações CRUD.

O sistema permite cadastrar, consultar, listar, atualizar e excluir registros de clientes, produtos e pedidos.

---

## 🎯 Objetivos

O projeto tem como principais objetivos:

- Desenvolver uma API REST utilizando Java e Spring Boot;
- Criar entidades para representar os dados da aplicação;
- Realizar a persistência dos dados utilizando Spring Data JPA;
- Integrar a aplicação com um banco de dados MySQL;
- Implementar operações CRUD;
- Criar endpoints para clientes, produtos e pedidos;
- Testar os endpoints utilizando o Postman;
- Aplicar uma organização básica em camadas, utilizando controllers, models e repositories.

---

## 🛠️ Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman
- IntelliJ IDEA
- Git e GitHub

---

## 📂 Estrutura do projeto

O projeto segue uma estrutura organizada em pacotes de acordo com a responsabilidade de cada parte da aplicação:

```text
src/
└── main/
    ├── java/
    │   └── com/
    │       └── example/
    │           └── baozi/
    │               ├── controller/
    │               │   ├── ClienteController.java
    │               │   ├── ProdutoController.java
    │               │   └── PedidoController.java
    │               │
    │               ├── model/
    │               │   ├── Cliente.java
    │               │   ├── Produto.java
    │               │   └── Pedido.java
    │               │
    │               ├── repository/
    │               │   ├── ClienteRepository.java
    │               │   ├── ProdutoRepository.java
    │               │   └── PedidoRepository.java
    │               │
    │               └── BaoziApplication.java
    │
    └── resources/
        └── application.properties