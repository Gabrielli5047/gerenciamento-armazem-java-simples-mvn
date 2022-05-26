export USER='postgres' 
export PASSWORD='postgres' 
export DATABASE_URL='postgresql://postgresql:5432/armazem?useTimezone=true&serverTimezone=UTC'

docker run -e USER -e PASSWORD -e DATABASE_URL -p 8081:8080 --name gabi-teste-api2 gabi-teste-api 
docker start crud-java-login