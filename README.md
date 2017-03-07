# mutation-testing

A small example to showcase mutation testing.

## Files

Please find the demo files in the `src` respectively the `test` folder.

## Usage

### Requirements
- Java
- make (Optional)
- leiningen (Optional)

### Building the code/Running the tests

#### Using make/lein

Just run `make mutants` from the projects root directory. 
The report will be generated to `report` from where it can be opened with a browser.

#### Manually
Download pitest and junit jars.
Use `javac` to compile the classes from `src/java` to `target/classes`.
Run `java -cp '<your classpath>' org.pitest.mutationtest.commandline.MutationCoverageReport --reportDir report --targetClasses de.* --targetTests de.acme.test.* --sourceDirs src/java,test/java --classPath target/classes --verbose`.
Make sure that you substitute `<your classpath>` with the path you downloaded the jars to.

The report files should now being generated to `report` and can be opened with a browser.

## License

Copyright © 2017 Method Park

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
