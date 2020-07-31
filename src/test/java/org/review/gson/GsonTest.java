package org.review.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class GsonTest {

    @Test
    public void shouldAnswerWithTrue() {
        URL myURL;
        URLConnection myURLConnection;
        BufferedReader in = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            myURL = new URL("http://localhost:8080/accounts");
            myURLConnection = myURL.openConnection();
            in = new BufferedReader(new InputStreamReader(
                    myURLConnection.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




        String str = "{\n" +
                "  \"firstName\":\"Frelin\",\n" +
                "  \"lastName\":\"Ampilahy\",\n" +
                "  \"age\":32\n" +
                "}";

        String str1 = "{\n" +
                "  \"firstName\":\"Rando\",\n" +
                "  \"lastName\":\"Frils\",\n" +
                "  \"age\":32\n" +
                "}";

        String personsStr = "[" + str + "," + str1 + "]";

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        List<Person> persons = new ArrayList<>();
        try {
            final JsonReader reader = new JsonReader(new StringReader(personsStr));
            Person currentPerson;
            reader.beginArray();
            while (reader.hasNext()) {
                currentPerson = gson.fromJson(reader, Person.class);
                persons.add(currentPerson);
            }
            reader.endArray();
            reader.close();
        } catch (Exception exception) { }

        System.out.println("==> " + persons);

        //TODO must check this link nextly
       // https://www.javacodegeeks.com/2020/07/expressing-a-conditional-expression-using-json-java-implementation.html
        // must check
    }






    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    class Person {
        private String firstName;
        private String lastName;
        private int age;
    }
}
