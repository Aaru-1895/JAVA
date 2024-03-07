package pack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class URLData {
	
	        public static void main(String[] args)
	        {
	        	String data = getUrlContents("https://api.sampleapis.com/countries/countries");
	        	String[] countries = data.split("},");
	        	System.out.println("countries..."+countries);
	        	List<String> country = Arrays.stream(countries).filter(coun -> coun.contains(",\"name\":\"R")).collect(Collectors.toList());
	        	System.out.println(country);
	        }

	        private static String getUrlContents(String theUrl)
	        {StringBuilder stringBuilder = new StringBuilder();
	        	
	        	try {
					URL url =new URL(theUrl);
					URLConnection urlConnection = url.openConnection();
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
					String line;
					while((line=bufferedReader.readLine())!=null) {
						stringBuilder.append(line);
					}
					bufferedReader.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	
	        	System.out.println(stringBuilder.toString());
				return stringBuilder.toString();
	        	
				
	        	
	    }

}