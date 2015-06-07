package com.searchAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class HttpURLConnectionExample_POST {

  public static void main(String[] args) throws Exception {
    URL url = new URL("https://itunes.apple.com");
    URLConnection conn = url.openConnection();
    conn.setDoOutput(true);
    OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());

    writer.write("search?term=apple+watch&country=US&limit=58");
    writer.flush();
    String line;
    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }
    writer.close();
    reader.close();

  }
}
