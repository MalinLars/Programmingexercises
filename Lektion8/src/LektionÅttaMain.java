
public class LektionÅttaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			LektionÅttaPerson myPerson = new LektionÅttaPerson("Malin", 33, "Female", "Swedish");
			System.out.println(myPerson);
			
			myPerson.setName("Axel");
			myPerson.setAge(1);
			myPerson.setGender("Male");
			myPerson.setNationality("Babyworld");
			
			System.out.println(myPerson);
		
	}

}
