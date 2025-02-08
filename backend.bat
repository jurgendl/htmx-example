start http://localhost:8080/
cd backend
cd htmx
call mvnw.cmd install -DskipTests
java -jar target/htmx-0.0.1-SNAPSHOT.jar
cd ..
cd ..
pause