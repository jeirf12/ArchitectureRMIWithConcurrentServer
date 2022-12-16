@echo off

title ServerAlert
javac -d bin -sourcepath src -cp ..\Common\Common.jar src\server\utilities\*
javac -d bin -sourcepath src -cp ..\Common\Common.jar src\server\domain\*
javac -d bin -sourcepath src -cp ..\Common\Common.jar src\server\controllers\*
javac -d bin -sourcepath src -cp gson-2.8.2.jar;..\Common\Common.jar src\server\services\*
javac -d bin -sourcepath src -cp gson-2.8.2.jar;..\Common\Common.jar src\server\access\*

jar cfm ServerAlert.jar manifest.mf -C bin .

cls
java -jar ServerAlert.jar
