package pack;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class UrlConnectionReader
    {
	public static void main(String[] args)
    {
        String output  = getUrlContents("https://api.sampleapis.com/countries/countries");
        System.out.println(output);

        String[] countries = output.split("},");

        for (String country:countries) {
            System.out.println(country + "\n");
        }



       List<String> countryFromR = Arrays.stream(countries).filter(country-> country.contains(",\"name\":\"R")).collect(Collectors.toList());
        System.out.println("Contries from R : \n");
        System.out.println(countryFromR);
    }

    private static String getUrlContents(String theUrl)
    {
        StringBuilder content = new StringBuilder();
        // Use try and catch to avoid the exceptions
        try
        {
            URL url = new URL(theUrl); // creating a url object
            URLConnection urlConnection = url.openConnection(); // creating a urlconnection object

            // wrapping the urlconnection in a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            // reading from the urlconnection using the bufferedreader
            while ((line = bufferedReader.readLine()) != null)
            {
                content.append(line + ";"+ "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("\n String from website :  \n" + content.toString());
        return content.toString();
    }
}


