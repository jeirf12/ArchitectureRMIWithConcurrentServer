@echo off

javac -d bin -sourcepath src -cp ..\Common\Common.jar;..\ServerAlert\gson-2.8.2.jar src\server\infra\*
javac -d bin -sourcepath src -cp ..\Common\Common.jar;..\ServerAlert\gson-2.8.2.jar src\server\services\*

jar cfm ServerLog.jar manifest.mf -C bin .

cls
java -jar ServerLog.jar
