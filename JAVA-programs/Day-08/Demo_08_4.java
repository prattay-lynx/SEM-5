// output
/*
* SecondInterface.anotherHello() Implemented.
* FirstInterface.hello() Implemented.
*/

interface FirstInterface{
	public void hello();
}
interface SecondInterface extends FirstInterface{
	public void anotherHello();
}

class TodaysClass implements SecondInterface{
	public void hello(){
		System.out.println("FirstInterface.hello() Implemented.");
	}
	public void anotherHello(){
		System.out.println("SecondInterface.anotherHello() Implemented.");
	}
}

public class Demo_08_4{
	public static void main(String[] args) {
		TodaysClass obj = new TodaysClass();
		obj.anotherHello();
		obj.hello();
	}
}