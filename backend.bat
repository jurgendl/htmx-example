cd backend
cd htmx
call gradle build
start http://localhost:14825/
java -jar build/libs/htmx-backend-0.0.1-SNAPSHOT.jar
cd ..
cd ..
pause