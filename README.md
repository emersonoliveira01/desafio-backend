# Desafio-backend

Microservice API Star Wars

### EndPoints Request HTTP
```
Lista toda Saga Star Wars.
GET localhost:8080/api/v1/saga
```

```
Lista todos filmes Star Wars.
GET GET localhost:8080/api/v1/films
```

```
Exibe detalhes de um filme.
GET localhost:8080/api/v1/films/detail/1
```

```
Altera a descrição do filme e incrementa uma versão nova.
PUT localhost:8080/api/v1/film/2?description=descricao
```

### Pre Requires

- JDK 17
- Maven 3.6.0

### Building

````
./mvn clean install
