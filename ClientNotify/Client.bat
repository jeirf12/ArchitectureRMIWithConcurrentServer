@echo off

title ClientNotify
javac -d bin -sourcepath src -cp ..\Common\Common.jar;.\javafx-swing-20-ea+11.jar src\client\view\GUICliente.java
javac -d bin -sourcepath src -cp ..\Common\Common.jar;.\javafx-swing-20-ea+11.jar src\client\controllers\*
javac -d bin -sourcepath src -cp ..\Common\Common.jar;.\javafx-swing-20-ea+11.jar src\client\services\*
javac -d bin -sourcepath src -cp ..\Common\Common.jar;.\javafx-swing-20-ea+11.jar src\client\utilities\*

jar cfm ClientNotify.jar manifest.mf -C bin .

cls

java -jar ClientNotify.jar
