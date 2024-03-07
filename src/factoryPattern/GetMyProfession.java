package factoryPattern;



public class GetMyProfession {
	public static void main(String[] args) {
		ProfessionFactory factory = new ProfessionFactory();
		Profession p = factory.getProfession("Teacher");
		p.byProfession();
		
	}

}
