# poo2T2
![image](https://github.com/devJoseOtavio/poo2T2/assets/101358660/4ce050f1-656a-4980-b55b-713247bddc48)

Guia de Documentação da API de Produtos

Este é o guia de documentação para a API de Produtos. Esta API permite a criação, leitura, atualização e exclusão de produtos em um sistema. Ela foi desenvolvida em Java usando o framework Spring Boot e na parte do frontend utilizei html e javascript puro, irei utilizar angular para estudos em uma futura atualização.

Base URL
A base URL para todos os endpoints é:
http://localhost:8080/products
Certifique-se de substituir localhost e 8080 pelo host e porta apropriados, se necessário, para o ambiente em que sua aplicação está rodando.

Endpoints Disponíveis

1. Cadastrar um Produto
Método HTTP: POST
Endpoint: /
Descrição: Este endpoint permite que você crie um novo produto.

{
    "name": "Nome do Produto",
    "description": "Descrição do Produto",
    "price": 19.99
}

2. Listar Produtos
Método HTTP: GET
Endpoint: /
Descrição: Este endpoint permite que você liste todos os produtos disponíveis.

Parâmetros de Paginação (Opcionais):
page (número da página, padrão: 0)
size (tamanho da página, padrão: 10)
sort (ordenação, padrão: "name")

3. Atualizar um Produto
Método HTTP: PUT
Endpoint: /{id}
Descrição: Este endpoint permite que você atualize os detalhes de um produto existente com base no ID.

Parâmetros da URL:
id (ID do produto a ser atualizado)
Corpo da Solicitação (JSON):
{
    "name": "Novo Nome do Produto",
    "description": "Nova Descrição do Produto",
    "price": 29.99
}

4. Excluir um Produto
Método HTTP: DELETE
Endpoint: /{id}
Descrição: Este endpoint permite que você exclua um produto com base no ID.

Parâmetros da URL:
id (ID do produto a ser excluído)
Exemplos de Uso
Aqui estão alguns exemplos de como você pode usar os endpoints da API:

Cadastrar um Produto
curl -X POST -H "Content-Type: application/json" -d '{
    "name": "Novo Produto",
    "description": "Descrição do Novo Produto",
    "price": 39.99
}' http://localhost:8080/products/

Listar Produtos
curl http://localhost:8080/products/

Atualizar um Produto
curl -X PUT -H "Content-Type: application/json" -d '{
    "name": "Produto Atualizado",
    "description": "Descrição Atualizada",
    "price": 49.99
}' http://localhost:8080/products/{id}

Excluir um Produto
curl -X DELETE http://localhost:8080/products/{id}
Lembre-se de substituir {id} pelo ID do produto específico que você deseja atualizar ou excluir.

