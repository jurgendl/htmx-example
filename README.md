Proof of Concept with minimal setup and dependencies

backend: a Java Spring Boot we app, providing html fragments by Thymeleaf, with optionally a REST layer, build with gradle

frontend: a web application, written in typescript, inserting html fragments provided by the backend, with optionally other web libraries/frameworks (React, Angular, ..., css libraries), with optionally calling the backend REST layer, build with node and vite

start full.bat (builds backend/frontend, starts backend and opens in browser)

14825 is backend port

http://localhost:14825/

http://localhost:14825/index

http://localhost:14825/th-index

http://localhost:14825/th-hx-index

http://localhost:14825/fail

