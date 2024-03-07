package Java8Feature;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		String s=null;
		
		Optional<String> optionnal = Optional.ofNullable(s);
		System.out.println(optionnal.isPresent());
		//System.out.println(optionnal.get());
		System.out.println(optionnal.orElse("String is null"));
		
		 
	}

}
