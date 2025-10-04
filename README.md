# 🧾 MeuEstoque Backend

**MeuEstoque** é um projeto pessoal desenvolvido para estudos de **CRUD** com **Java Spring Boot**.  
Este backend fornece uma **API RESTful** para gerenciamento de produtos, permitindo operações de **criação**, **leitura**, **atualização** e **exclusão** (CRUD).

## 🚀 Tecnologias utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **PostgreSQL**
- **Flyway Migration** 
- **Lombok**
- **Maven**

### 1️⃣ Clonar o repositório
```
git clone https://github.com/2Rovian/meu-estoque-backend.git
```
### 2️⃣ Abrir o projeto em sua IDE favorita
Use o IntelliJ IDEA ou VS Code com extensão Java, por exemplo
## ⚙️ Pré-requisitos

Antes de executar o projeto, é necessário ter instalado:

- **Java 21**
- **Maven**
- **PostgreSQL** rodando localmente

### Banco de dados PostgreSQL

Crie um banco de dados local com o nome `meu-estoque` (ou o nome definido no `application.properties`).  
O Spring Boot, junto com o **Flyway**, cuidará da criação e migração das tabelas automaticamente na inicialização.

Exemplo de configuração no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/meu-estoque
spring.datasource.username=postgres
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=none
spring.flyway.enabled=true
```

### 🧠 Endpoints principais

| Método | Endpoint | Descrição |
|:-------|:----------|:-----------|
| **GET** | `/api/produtos` | Lista todos os produtos |
| **GET** | `/api/produtos/{id}` | Busca um produto pelo ID |
| **GET** | `/api/produtos?nome={valor}` | Filtra produtos pelo nome |
| **GET** | `/api/produtos?categoria={valor}` | Filtra produtos pela categoria |
| **POST** | `/api/produtos` | Adiciona um novo produto |
| **PUT** | `/api/produtos` | Atualiza um produto existente |
| **DELETE** | `/api/produtos/{id}` | Deleta um produto pelo ID |

### 🔗 Conexão com o frontend
👉 [MeuEstoque Frontend](https://github.com/2Rovian/meu-estoque-frontend)
