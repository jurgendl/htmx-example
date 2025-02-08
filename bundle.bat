cd frontend
cd htmx
call npm run build
xcopy dist ..\..\backend\htmx\target\generated-sources\static /s /e /i /y
cd ..
cd ..
cd backend
cd htmx
call gradle build
cd ..
cd ..
pause