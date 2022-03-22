Clean Coders 03.2022: Mocks, Stubs and Spies
=================
Based on https://github.com/kolorobot/unit-testing-demo

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

# Exercise
- Fill in the failing tests with the appropriate mocks, stubs, spies and fakes
