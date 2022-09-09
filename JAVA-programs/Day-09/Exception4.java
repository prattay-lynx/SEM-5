//Q4: WAP in java exception handling using the keyword throw

public class Exception4{
	public static void throwMeException(){
		try{
			throw new IllegalAccessException("Prattay throws IllegalAccessException.");	
		}catch(IllegalAccessException e){
			e.printStackTrace();
			System.out.println("Exception handeled Successfully.");
		}
	}
	public static void main(String[] args) {
			throwMeException();	
	}
}

/*
javac Exception4.java && java Exception4

java.lang.IllegalAccessException: Prattay throws IllegalAccessException.
        at Exception4.throwMeException(Exception4.java:4)
        at Exception4.main(Exception4.java:11)
Exception handeled Successfully.
*/