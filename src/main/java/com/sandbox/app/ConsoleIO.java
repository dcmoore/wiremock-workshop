package com.sandbox.app;

import java.util.Arrays;

class ConsoleIO {
  private String[] trueResponses = {"yes","y","true","t","1","yee","you know"};
  private String[] falseResponses = {"no","n","false","f","0","nah","nah fam"};

  public void display(String stringToPrint) {
    System.out.println(stringToPrint);
  }

  public String getInput() {
    return System.console().readLine();
  }

  public boolean askBoolean(String stringToPrint) {
    display(stringToPrint);
    String response = getInput().toLowerCase();

    if(Arrays.asList(trueResponses).contains(response)) {
      return Boolean.TRUE;
    } else if (Arrays.asList(falseResponses).contains(response)) {
      return Boolean.FALSE;
    } else {
      display("English please (ex: Yes, No)");
      return askBoolean(stringToPrint);
    }
  }
}
