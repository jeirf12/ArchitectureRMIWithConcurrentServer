@echo off

cd Common && Common.bat && cd ..\ServerAlert && pwsh -command "iwr -uri https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.2/gson-2.8.2.jar -OutFile gson-2.8.2.jar" && start cmd /K Server.bat && cd ..\ServerLogs  && start cmd /K Server.bat && cd ..\ClientNotify && pwsh -command "iwr -uri https://repo1.maven.org/maven2/org/openjfx/javafx-swing/20-ea+11/javafx-swing-20-ea+11.jar -OutFile javafx-swing-20-ea+11.jar" && start cmd /K Client.bat && cd ..\ClientSensor && start cmd /K Client.bat && cd ..

