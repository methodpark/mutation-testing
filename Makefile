home = $(wildcard ~)
cp = $(home)/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:$(home)/.m2/repository/org/pitest/pitest/1.1.11/pitest-1.1.11.jar:$(home)/.m2/repository/org/pitest/pitest-command-line/1.1.11/pitest-command-line-1.1.11.jar:$(home)/.m2/repository/junit/junit/4.12/junit-4.12.jar

build:
	lein javac

mutants: build
	java -cp $(cp) org.pitest.mutationtest.commandline.MutationCoverageReport --reportDir report --targetClasses de.* --targetTests de.acme.test.* --sourceDirs src/java,test/java --classPath target/classes --verbose

junit: build
	java -cp $(cp):target/classes org.junit.runner.JUnitCore de.acme.test.AcmeTest
