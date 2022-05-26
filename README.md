Projeto simples de criacao e busca de produtos.

Testando criar imagem do meu projeto no docker.

1- criei a api com spring boot 
2- criei a imagem da minha api - Dockerfile
    2.1 - docker build -t gabi-test-api .

4- criei o arquivo yml para fazer o docker-compose-
    4.1- defini a variavel de ambiente no code ~/.bash_profile: 
        export DATABASE_USER="postgres"
        export DATABASE_PASSWORD="postgres"
        export DATABASE_URL="postgresql://localhost:5432/armazem?useTimezone=true&serverTimezone=UTC" 
    4.2 - docker-compose up
5- aplicacao rodando no docker e conectado ao postgres.


