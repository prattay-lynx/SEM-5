// implicit nested try block
public class Exception3{
	public static int getDivision(int a, int b){
		// returns a/b;
		int r;
		try{
			r = a/b;
			return r;
		}catch(ArithmeticException e){
			System.out.println("Division by Zero is Handeled.");
		}
		return 0;
	}

	public static void main(String[] args) {

		int arr[] = {1,0};
		try{
			getDivision(arr[0], arr[1]);
			int p = arr[5];
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException is Handeled.");
		}
		catch(Exception e){
			System.out.println("Unknown Exception is Handeled.");
			e.printStackTrace();
		}
	}
}

/*
javac Exception3.java && java Exception3

Division by Zero is Handeled.
ArrayIndexOutOfBoundsException is Handeled.
*/