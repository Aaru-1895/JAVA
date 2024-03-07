package factoryPattern;

public class ProfessionFactory {
	
	public Profession getProfession(String myFactory) {
		
		if(myFactory == null) {
			return null;
		}
		else if(myFactory.equals("Doctor")) {
			return new Doctor();
		}
		else if(myFactory.equals("Engineer")) {
			return new Engineer();
		}
		else if(myFactory.equals("Teacher")) {
			return new Teacher();
		}
		return null;
	}

}
