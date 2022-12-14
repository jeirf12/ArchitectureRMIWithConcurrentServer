@echo off

javac -d bin -sourcepath src src\common\entities\*
javac -d bin -sourcepath src src\common\interfaces\*
javac -d bin -sourcepath src src\common\infra\*

jar cf Common.jar -C bin .

