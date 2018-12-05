[![Build Status](https://travis-ci.org/AshleyByeUK/tictactoe-java-core.svg?branch=master)](https://travis-ci.org/AshleyByeUK/tictactoe-java-core)
[![codecov](https://codecov.io/gh/AshleyByeUK/tictactoe-java-core/branch/master/graph/badge.svg)](https://codecov.io/gh/AshleyByeUK/tictactoe-java-core)

# tictactoe-java-core

## Introduction

A Tic Tac Toe game library. Features include Human vs Human, Human vs Computer and Computer vs Computer modes.
The computer player can be configured for easy and hard difficulties.

## Requirements

This project was written using OpenJDK 11. To run this project, you will need to have a compatible version of the
JDK installed. The JDK can be obtained from the following links:

- [OpenJDK 11](https://jdk.java.net/11/)

You can also use your operating system's native or third-party package managers to obtain the JDK. Whilst this game 
has not been tested with older versions of Java, you may find that versions as old as JDK 8 are sufficient.

## Usage

To use this library in your project, include the Maven repository location in your Gradle build file:

```
repositories {
    maven { url "https://raw.githubusercontent.com/AshleyByeUK/tictactoe-java-core/repo/" }
    mavenCentral()
}
```

Include the required dependency in the `dependencies` section of `build.gradle`:

```
compile "uk.ashleybye.tictactoe:tictactoe-core:1.0"
```

## To Play

This repository is intended to provide a library that Tic tac Toe clients can use to play games ot Tic tac Toe. See:
- [Console Client](https://github.com/AshleyByeUK/tictactoe-java-console)
- [Graphical Client](https://github.com/AshleyByeUK/tictactoe-java-graphical)

## Testing

Execute all tests with Gradle:

```
./gradlew test
```

Gradle can also generate code coverage reports:

```
./gradlew test jacocoTestReport
```

Test reports are generated in both XML and HTML format and are located in the following directory, relative to the
project root directory:

```
build/reports/jacoco/test
```

To open the HTML test reports, type the following (on macOS):

```
open build/reports/jacoco/test/html/index.html
```

## Cleaning Up

You can clean up the files and directories created by Gradle with the following command:

`./gradlew clean`
