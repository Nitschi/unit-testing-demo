Unit Testing Demo
=================

# Getting started

## Installation (on Windows 10)

- Open an admin Powershell to execute the following commands:
    - Install chocolatey package-manager
        - `Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))`
    - `choco install jdk8 intellijidea-ultimate`

## Setup Intellij

- Open IntelliJ and enter this license server: `http://jb-license-server` -> Activate
- Open Intellij and choose `Get from VCS` -> `Git` -> `https://github.com/Nitschi/unit-testing-demo.git`
- Wait for Intellij to load the project
- Right-Click the root folder -> `Run Tests in unit-testing-demo`
- Click the Tick-Symbol ("Show Passed") in the Runner-Window that opened to see all tests

## Alternative: Manually

Clone the repository:

`git clone https://github.com/Nitschi/unit-testing-demo.git`

Navigate to newly created folder and run:

`gradlew test`

# Videos

Complete the exercise after watching this [Video on Mocks, Stubs and Spies](https://youtu.be/tVCSKsMtXn0)

# Referenced articles

Based on https://github.com/kolorobot/unit-testing-demo, which in turn references the following:
Examples in this project are partly coming from blog posts at http://blog.codeleak.pl:

- http://blog.codeleak.pl/2017/06/cleaner-parameterized-tests-with-junit-5.html
- http://blog.codeleak.pl/2017/06/testing-exceptions-with-junit-5.html
- http://blog.codeleak.pl/2015/04/junit-testing-exceptions-with-java-8.html
- http://blog.codeleak.pl/2015/01/testing-with-files-and-directories-in.html
- http://blog.codeleak.pl/2014/07/junit-testing-exception-with-java-8-and-lambda-expressions.html
- http://blog.codeleak.pl/2014/05/spice-up-your-test-code-with-custom-assertions.html
- http://blog.codeleak.pl/2014/04/yet-another-way-to-handle-exceptions-in.html
- http://blog.codeleak.pl/2014/03/junit-expectedexception-rule-beyond.html
- http://blog.codeleak.pl/2013/07/3-ways-of-handling-exceptions-in-junit.html
- http://blog.codeleak.pl/2014/06/test-data-builders-and-object-mother.html
- http://blog.codeleak.pl/2014/11/unit-testing-excercise-with-fizzbuzz.html
- http://blog.codeleak.pl/2013/12/parametrized-junit-tests-with.html