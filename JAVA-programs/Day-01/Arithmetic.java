//Qs->Take input of 2 numbers
//then add,subtract and multiply them


// C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-01>javac Arithmetic.java
// C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-01>java Arithmetic 5 6 

class Arithmetic
{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("Sum is "+(a+b));
        System.out.println("Difference is "+(a-b));
        System.out.println("Product is "+(a*b));
    }
}

//Output:-
// Sum is 11
// Difference is -1
// Product is 30