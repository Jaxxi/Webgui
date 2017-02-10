import java.net.*;
import java.io.*;
import java.util.Scanner;
/**
 * Created by olli14 on 2017-01-27.
 */

public class WebModel {


    public static void main(String[] args) throws Exception {

        int i = 0;

        System.out.println("Enter URL: ");
        Scanner urlInput = new Scanner(System.in);
        String urlString = urlInput.nextLine();

        URL website = new URL(urlString);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null){
            System.out.println(inputLine);
            i++;
        }
        System.out.println("The URL contains " + i + " rows.");

        in.close();

    }
}