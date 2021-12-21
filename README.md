# Zip64File - ZIP 64 handler for SIARD 2.1

This package contains a ZIP 64 handler.
Its main intention reading and writing ZIP files which conform to the 
64 bit extension of the ZIP standard.

It also includes a command-line tool for reading and
writing ZIP files in ZIP 64 format.

## Getting started (for devs)

For building the binaries, Java JDK (1.8 or higher), Ant, and Git must
have been installed. A copy of build.properties.template must be called
build.properties. In it using a text editor the local values must be
entered as directed by the comments.

Run all tests:

```shell
ant test
```

Build and deploy:

```shell
ant deploy
```

More information about the build process can be found in
[./doc/manual/developer/build.html](./doc/manual/developer/build.html).

You may use an IDE of your choice for development (tested with intellij idea and eclipse)

## Documentation

[./doc/manual/user/index.html](./doc/manual/user/index.html) contains the manual for using the binaries.
[./doc/manual/developer/index.html](./doc/manual/user/index.html) is the manual for developers wishing
build the binaries or work on the code.
