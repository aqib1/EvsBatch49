package com.example.evsandroid49_sqlite.rest;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ResterationAPI extends AsyncTask {
    @Override
    protected Object doInBackground(Object... objects) {
        String userName = (String) objects[0];
        String password = (String) objects[1];
        URL url = null;
        URLConnection urlConnection = null;
        StringBuilder response = new StringBuilder();
        OutputStreamWriter writer = null;
        BufferedReader reader = null;
        String requestData = null;
        try {
            requestData = URLEncoder.encode("name", "UTF-8") +"="+ URLEncoder.encode(userName,"UTF-8")+"&"
            +URLEncoder.encode("password", "UTF-8")+"="+URLEncoder.encode(password, "UTF-8");
            url = new URL("https://wwww.testserver.com/api/login");
            urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            writer = new OutputStreamWriter(urlConnection.getOutputStream());
            writer.write(requestData);
            writer.flush();
            reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while((line = reader.readLine()) != null){
                response.append(line);
            }

        } catch (UnsupportedEncodingException | MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return response.toString();
    }
}
