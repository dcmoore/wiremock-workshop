# WireMock Tutorial

__This is a simple application that tells dad jokes. The tests are intentionally missing to give people the opportunity to write some tests using [WireMock](http://wiremock.org/).__

To execute the program do the following:

```bash
mvn clean package
java -jar target/WireMockWorkshop-1.0-SNAPSHOT.jar
```

## Steps

1. Create a happy path test in DadJokeTellerTest
  a. You'll want to learn about WireMockRule and stubFor
  b. You'll need to use Mockito to assert that io.display is displaying the right stuff
2. Create another test in DadJokeTellerTest that tests the case where unexpected JSON gets returned
3. Experiment with running WireMock as a standalone process. Try doing a record and playback.

Feel free to use the [WireMock Getting Started Guide](http://wiremock.org/docs/getting-started/) to help you along the process.
