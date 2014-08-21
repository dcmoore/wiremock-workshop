# WireMock Tutorial

__The point of this project is to provide a space where you can remove yourself from all frameworks and experiment with Java Syntax for the sake of learning how something works in Java.__

To execute the program do the following:

```bash
mvn jar:jar
java -jar target/JavaSandbox-1.0-SNAPSHOT.jar
```




1. Setup proxy
2. Record successful response
3. Stub failure response













how we did it

- mvn install
- java -jar $MAVEN_HOME/repository/com/github/tomakehurst/wiremock-standalone/2.6.0/wiremock-standalone-2.6.0.jar
  --proxy-all="https://icanhazdadjoke.com/"
  --record-mappings --verbose

