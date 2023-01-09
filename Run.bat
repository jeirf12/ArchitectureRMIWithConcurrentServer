@echo off

cd Common && Common.bat && cd ..\ServerAlert && pwsh -command "iwr -uri https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.2/gson-2.8.2.jar -OutFile gson-2.8.2.jar" > NUL && start cmd /K Server.bat && cd ..\ServerLogs && timeout /t 20 /nobreak > NUL  && start cmd /K Server.bat && cd ..\ClientNotify && pwsh -command "iwr -uri https://repo1.maven.org/maven2/org/openjfx/javafx-swing/20-ea+11/javafx-swing-20-ea+11.jar -OutFile javafx-swing-20-ea+11.jar" > NUL && start cmd /K Client.bat && cd ..\ClientSensor && timeout /t 20 /nobreak > NUL && Client.bat

