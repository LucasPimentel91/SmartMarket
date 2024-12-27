# SmartMarket

## Descrição do Projeto

Este projeto é um **sistema de mercado** desenvolvido em **Java** que visa gerenciar as operações de um mercado, incluindo cadastro de produtos, controle de estoque, vendas, e relatórios gerenciais. A aplicação foi construída utilizando o **Spring Boot** para o backend e conta com integração com banco de dados para persistência de dados.

## Funcionalidades

- Cadastro, atualização e remoção de produtos.
- Controle de estoque (entrada e saída de produtos).
- Gerenciamento de vendas e geração de notas fiscais.
- Relatórios de desempenho e vendas.
- Autenticação e autorização de usuários (diferentes níveis de acesso: administrador e operador de caixa).

## Tecnologias Utilizadas

- **Java 17**: Linguagem principal de desenvolvimento.
- **Spring Boot 3**: Framework para criação do backend e APIs RESTful.
- **Spring Data JPA**: Abstração para persistência de dados com banco de dados.
- **Hibernate**: ORM (Object-Relational Mapping) utilizado para comunicação com o banco de dados.
- **MySQL**: Sistema de Gerenciamento de Banco de Dados Relacional.
- **Thymeleaf**: Template engine para renderização de páginas HTML (se aplicável).
- **Spring Security**: Controle de autenticação e autorização.
- **Swagger**: Documentação interativa da API.
- **Maven**: Gerenciamento de dependências e ciclo de vida do projeto.
- **Docker** (opcional): Para containerização da aplicação.

## Requisitos

- **Java 17** ou superior.
- **Maven** 3.6 ou superior.
- **MySQL** 8.0 ou superior.
- **Docker** (opcional, para containerização).

## Instalação e Execução

### 1. Clonar o repositório

```bash
git clone https://github.com/usuario/sistema-mercado.git
cd sistema-mercado
