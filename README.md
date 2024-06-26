# Zip64File - SIARD ZIP 64 handler

This package contains a ZIP 64 handler. Its main purpose is reading and writing ZIP files which conform to the 64 bit extension of the ZIP standard. It also includes a command-line tool for reading and writing ZIP files in ZIP 64 format.

## Prerequisites

For building the binaries, Java JDK (1.8 or higher) must be installed. 

### Run all tests
```shell
./gradlew check
```

### Build the project
```shell
./gradlew clean build
```

### Create a release
This creates a new tag and pushes the tag to main branch.
```shell
./gradlew release
```

## Documentation
- [User's Manual](./doc/manual/user/index.html)
- [Developer's Manual](./doc/manual/developer/index.html)