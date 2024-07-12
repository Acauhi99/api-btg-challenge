
## Documentação da API


#### Retorna informacoes do pedido

```http
  GET customers/${id}/orders
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do cliente |



## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/Acauhi99/api-btg-challenge.git
```

Dentro do diretório do projeto entre na pasta local

```bash
  cd local
```

Subir a instancia do docker

```bash
  docker compose up
```

Inicie o servidor

src/main/java/acauhi/btgpactual/orderms/OrdermsApplication.java


## Stack utilizada

**Mensageria:** RabbitMq

**Banco de Dados:** MongoDB

**Back-end:** Java, Spring Boot

