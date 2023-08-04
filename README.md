# Aplicação Spring Boot com JWT Token e Spring Security

Esta é uma aplicação de exemplo que demonstra como criar um serviço Spring Boot que oferece autenticação e autorização usando JWT Tokens e Spring Security. Além disso, a aplicação possui um endpoint que verifica se um determinado dia é útil ou não.

## Pré-requisitos

- Java JDK 8 ou superior instalado
- Maven instalado (ou use o Maven Wrapper fornecido)

## Configuração

1. Clone este repositório para o seu ambiente local.
2. Navegue até o diretório do projeto.

## Configuração do Banco de Dados 

A aplicação utiliza o banco de dados mysql. Você pode modificar as configurações de banco de dados no arquivo `application.properties` ou `application.yml` de acordo com sua preferência.

## Build e Execução

Você pode compilar e executar a aplicação usando o seguinte comando:

```bash
./mvnw spring-boot:run
A aplicação estará disponível em: http://localhost:9797

Autenticação e Autorização
A aplicação utiliza JWT Tokens para autenticação e autorização. Você pode usar a rota /api/authenticate para obter um token JWT válido, passando as credenciais no corpo da solicitação. Esse token deve ser incluído no cabeçalho Authorization para acessar os endpoints protegidos.

Endpoints
1. Autenticação
Rota: POST /api/authenticate
Essa rota permite a autenticação do usuário e a geração de um token JWT válido para uso futuro.

Corpo da solicitação (JSON):

json
Copy code
{
  "username": "seu_usuario",
  "password": "sua_senha"
}
2. Verificação de Dia Útil
Rota: GET /api/is-business-day/{date}
Essa rota verifica se um determinado dia é útil ou não. Substitua {date} pela data que você deseja verificar no formato "yyyy-MM-dd".

Cabeçalho da solicitação:

makefile
Copy code
Authorization: Bearer SEU_TOKEN_JWT
Contribuições
Sinta-se à vontade para enviar pull requests com melhorias, correções de bugs ou novos recursos.
