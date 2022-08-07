// Question:->Write a program to define a method within a class
// that returns an object when called from main

/*Output:->
 * C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-04>javac AnotherBoxDemo.java
  C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-04>java AnotherBoxDemo      
Box object  height=2, width=3, depth=4.
Box object (Incremented) height=12, width=13, depth=14.
 */
class AnotherBox{
	int height, width, depth;
	AnotherBox(int h, int w, int d){
		height = h; width = w; depth = d;
	}

	AnotherBox giveINCRBoxObject(){
		return (new AnotherBox(height+10, width+10, depth+10));
	}
}

class AnotherBoxDemo{
	public static void main(String[] args) {
		AnotherBox ob = new AnotherBox(2,3,4);
		AnotherBox ob2 = ob.giveINCRBoxObject();
		System.out.printf("Box object  height=%d, width=%d, depth=%d.\n",
							ob.height, ob.width, ob.depth);
		System.out.printf("Box object (Incremented) height=%d, width=%d, depth=%d.\n",
							ob2.height, ob2.width, ob2.depth);
	}
}