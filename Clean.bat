@echo off

cd ClientNotify && rd /s/q bin && del ClientNotify.jar && cd .. && cd ClientSensor && rd /s/q bin && del ClientSensor.jar && cd .. && cd Common && rd /s/q bin && del Common.jar && cd .. && cd ServerAlert && rd /s/q bin && del ServerAlert.jar && cd .. && cd ServerLogs && rd /s/q bin && del ServerLog.jar && cd .. && echo Limpieza Completada...
