@echo off
setlocal EnableDelayedExpansion

::captures the ESC character (ASCII 27) into the variable ESC
::You then use %ESC% to emit ANSI sequences
for /f %%A in ('echo prompt $E ^| cmd') do set "ESC=%%A"

PROMPT $g 

cd frontend
cd htmx
echo on

@echo:
@ECHO %ESC%[38;2;0;0;0;48;2;255;180;0m prepare frontend(packages) %ESC%[0m
call npm install

@echo:
@ECHO %ESC%[38;2;0;0;0;48;2;255;180;0m build frontend %ESC%[0m
call npm run build

@echo off
cd ..
cd ..
cd backend
cd htmx
echo on

@echo:
@ECHO %ESC%[38;2;0;0;0;48;2;255;180;0m build backend %ESC%[0m
call gradle build

@echo:
@ECHO %ESC%[38;2;0;0;0;48;2;255;180;0m open backend %ESC%[0m
start http://localhost:14825/

@echo:
@ECHO %ESC%[38;2;0;0;0;48;2;255;180;0m start backend %ESC%[0m
java -jar build/libs/htmx-backend-0.0.1-SNAPSHOT.jar

@echo off
cd ..
cd ..
pause