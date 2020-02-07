#!/bin/bash
export PATH=/opt/apache-maven-3.6.3/bin/:$PATH
mvn -v
mvn package
java -cp target/corda-generator-1.0-SNAPSHOT.jar pl.gdynia.amw.App