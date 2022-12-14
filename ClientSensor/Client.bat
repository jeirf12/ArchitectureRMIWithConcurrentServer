@echo off

javac -d bin -sourcepath src -cp ..\Common\Common.jar src\client\view\*
javac -d bin -sourcepath src -cp ..\Common\Common.jar src\client\utilities\*
javac -d bin -sourcepath src -cp ..\Common\Common.jar src\client\services\*

jar cfm ClientSensor.jar manifest.mf -C bin .

cls
java -jar ClientSensor.jar
