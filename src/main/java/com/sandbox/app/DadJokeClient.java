package com.sandbox.app;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

import java.io.IOException;

class DadJokeClient {

    private final OkHttpClient httpClient = new OkHttpClient();
    private final Gson gson = new Gson();

    private final String url;

    DadJokeClient() {
        this("https://icanhazdadjoke.com/");
    }

    DadJokeClient(String url) {
        this.url = url;
    }

    final String getNextJoke() throws IOException {
        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(url)
                .build();

        ResponseBody response = httpClient.newCall(request).execute().body();
        if (response != null) {
            return extractJokeFromResponse(response.string());
        }

        return null;
    }

    private String extractJokeFromResponse(String response) {
        return gson.fromJson(response, Response.class).joke;
    }

    private class Response {
        String joke;
    }
}
