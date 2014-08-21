package com.sandbox.app;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import java.security.cert.Certificate;

class DadJokeClient {
  public String getNextJoke() throws IOException {
    String httpsURL = "https://icanhazdadjoke.com/";
    URL myurl = new URL(httpsURL);
    HttpsURLConnection con = (HttpsURLConnection)myurl.openConnection();
    con.setRequestProperty("User-Agent", "Greatest Java Application Ever");
    con.setRequestProperty("Accept", "application/json");

    InputStream ins = con.getInputStream();
    InputStreamReader isr = new InputStreamReader(ins);
    BufferedReader in = new BufferedReader(isr);

    String response = in.readLine();
    in.close();

    return extractJokeFromResponse(response);
  }

  private String extractJokeFromResponse(String response) {
    // Gson gson = new Gson();
    // gson.toJson(response);
    return response;
  }
}
