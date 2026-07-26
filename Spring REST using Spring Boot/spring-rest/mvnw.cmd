@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM ----------------------------------------------------------------------------

@REM ----------------------------------------------------------------------------
@REM Maven Wrapper startup batch script, version 3.3.2
@REM ----------------------------------------------------------------------------

@IF "%__MVNW_ARG0_NAME__%"=="" (SET "__MVNW_ARG0_NAME__=%~nx0")
@SET __ MVNW_CMD__=%~dp0mvnw.cmd
@SET "__MVNW_DIR__=%~dp0"
@SET "__MAVEN_PROJECT_BASEDIR__=%__MVNW_DIR__%"
@SET "__MVNW_REPOURL__=https://repo.maven.apache.org/maven2"

@SET "__MVNW_SETTINGS_FILE__="

@IF NOT "%MVNW_VERBOSE%"=="" (
  @ECHO "[DEBUG] __MVNW_DIR__=%__MVNW_DIR__%"
)

@SETLOCAL EnableExtensions
@SET "JAVA_HOME_CANDIDATE="

@FOR /F "usebackq tokens=1,2,*" %%A IN (`REG QUERY "HKLM\SOFTWARE\JavaSoft\JDK" /v CurrentVersion 2^>NUL`) DO (
    @IF "%%A"=="CurrentVersion" SET "JDK_VERSION=%%C"
)
@IF NOT "%JAVA_HOME%"=="" GOTO init

:findJavaFromRegistry
@FOR /F "usebackq tokens=1,2,*" %%A IN (`REG QUERY "HKLM\SOFTWARE\JavaSoft\JDK\%JDK_VERSION%" /v JavaHome 2^>NUL`) DO (
    @IF "%%A"=="JavaHome" SET "JAVA_HOME_CANDIDATE=%%C"
)
@IF NOT "%JAVA_HOME_CANDIDATE%"=="" SET "JAVA_HOME=%JAVA_HOME_CANDIDATE%"

:init
@SET "MAVEN_WRAPPER_JAR=%__MVNW_DIR__%\.mvn\wrapper\maven-wrapper.jar"
@SET "MAVEN_WRAPPER_PROPERTIES=%__MVNW_DIR__%\.mvn\wrapper\maven-wrapper.properties"
@SET "DOWNLOAD_URL="

@FOR /F "usebackq tokens=1,2 delims==" %%A IN ("%MAVEN_WRAPPER_PROPERTIES%") DO (
    @IF "%%A"=="distributionUrl" SET "DOWNLOAD_URL=%%B"
)

@IF "%MVNW_VERBOSE%"=="true" (ECHO Downloading Maven from: %DOWNLOAD_URL%)

@SET "M2_HOME=%__MVNW_DIR__%\.mvn\wrapper\dists\apache-maven-3.9.6"
@SET "PATH=%M2_HOME%\bin;%PATH%"

@IF NOT EXIST "%MAVEN_WRAPPER_JAR%" GOTO downloadMaven

:executeMaven
@SET "MAVEN_OPTS=%MAVEN_OPTS% -Xmx512m"
@"%JAVA_HOME%\bin\java" %MAVEN_OPTS% ^
  "-Dmaven.multiModuleProjectDirectory=%__MAVEN_PROJECT_BASEDIR__%" ^
  -classpath "%MAVEN_WRAPPER_JAR%" ^
  org.apache.maven.wrapper.MavenWrapperMain ^
  %*
@SET "WRAPPER_EXIT_CODE=%ERRORLEVEL%"
@EXIT /B %WRAPPER_EXIT_CODE%

:downloadMaven
@IF NOT EXIST "%__MVNW_DIR__%\.mvn\wrapper" (
  @MKDIR "%__MVNW_DIR__%\.mvn\wrapper"
)
@SET "DOWNLOAD_SCRIPT=%TEMP%\download_mvnw_%RANDOM%.ps1"
@(
  ECHO $webclient = New-Object System.Net.WebClient
  ECHO $webclient.DownloadFile^("%DOWNLOAD_URL%", "%MAVEN_WRAPPER_JAR%"^)
) > "%DOWNLOAD_SCRIPT%"
@PowerShell -ExecutionPolicy Bypass -File "%DOWNLOAD_SCRIPT%" 2>NUL
@DEL "%DOWNLOAD_SCRIPT%" 2>NUL
@GOTO executeMaven
