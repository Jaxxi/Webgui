/**
 * Created by olli14 on 2017-01-27.
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class WebModel {
    public static String getText(String url) throws Exception {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null)
            response.append(inputLine);

        in.close();

        return response.toString();
    }
    String out = new Scanner(new URL("http://www.google.com").openStream(), "UTF-8").useDelimiter("\\A").next();

    public static void main(String[] args) throws Exception {
        String content = WebModel.getText(args[0]);
        System.out.println(content);
    }
}