cd frontend
cd htmx
call npm.cmd build
cd ..
cd ..

cd backend
cd htmx
call gradle build
start http://localhost:8080/
java -jar build/libs/htmx-backend-0.0.1-SNAPSHOT.jar
cd ..
cd ..
pause