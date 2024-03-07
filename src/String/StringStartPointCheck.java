package String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartPointCheck {
	public static void main(String[] args) {
        String string1 = "Hello! How are your hey";
        String string2 = "Hey You are from?";
        //System.out.println(checkStringStartPoint(string2,getSingleWord(string1)));
    }

	/*
	 * public static boolean checkStringStartPoint(String str2,String word){ return
	 * str2.toLowerCase().startsWith(word); }
	 */

    public static String getSingleWord(String str){
        List<String> words =  Arrays.stream(str.split(" ")).peek(s -> {}).collect(Collectors.toList());
        System.out.println(words);
        return words.get(words.size()-1);
    }

}
