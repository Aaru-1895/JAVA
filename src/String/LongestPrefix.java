package String;

public class LongestPrefix {
	public static void main(String[] args) {
        String[] string = {"Flow","Flower","Float"};
    System.out.println(longestPrefix(string));
}

public static String longestPrefix(String[] strings){
    if(strings.length==0) return "";
    String prefix = strings[0];
    for (int i = 1; i < strings.length; i++) {
        while (strings[i].indexOf(prefix)!=0){
            prefix = prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty()) return "";
        }
    }
    return prefix;
}
}
