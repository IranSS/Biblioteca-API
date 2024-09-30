# API de Catálogo de Livros 📚

Este projeto será uma API RESTful simples para gerenciar um catálogo de livros, desenvolvida com **Spring Boot** e utilizando **PostgreSQL** como banco de dados. A API permite realizar operações básicas de CRUD (Criar, Ler, Atualizar, Excluir) sobre livros, com foco em uma arquitetura robusta e extensível.

## Tecnologias Utilizadas 🚀

- **Java 17**: Linguagem de programação principal.
- **Spring Boot 3.3.x**: Framework para desenvolvimento rápido de APIs.
- **PostgreSQL**: Banco de dados relacional para armazenar os livros.
- **Spring Data JPA**: Para simplificar a integração com o banco de dados.
- **Maven**: Gerenciamento de dependências e build.

## Estrutura incial do Projeto 🗂

- **BookController**: Controlador principal criado para gerenciar as operações básicas sobre livros.
- Configurações iniciais de ambiente e dependências foram ajustadas para facilitar o desenvolvimento.

## Como Iniciar o Projeto 🔧

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/nome-do-projeto.git
   ```

2. **Acesse a API:**

- Por padrão, o projeto estará disponível em http://localhost:2565.
- Se as propriedades de desenvolvedor estiverem habilitadas, a aplicação será acessível em http://localhost:8080.

3. Após iniciar o projeto, você poderá acessar o endpoint para listar os livros em:
```bash
http://localhost:2565/book/get
```
ou se as propriedades de desenvolvedor estiverem habilitadades.
```bash
http://localhost:8080/book/get 
```

## Funcionalidades Implementadas 🛠

- Neste momento, apenas o controlador inicial BookController foi criado, com um método(GET). Novas funcionalidades e endpoints serão adicionados conforme o desenvolvimento avançar. 

## Atualizações Futuras 🔮

- Implementação completa das operações CRUD.
- Validações de dados de entrada.
- Documentação da API com Swagger.
- Autenticação e Autorização utilizando Spring Security.
- Conectar ao banco de dados(PostgreSQL)
- Deploy da aplicação.