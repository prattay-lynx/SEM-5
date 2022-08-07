/*Question->Accept a number N and a string S from user
  print string S, N number of times

C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-01>javac PrintN.java  
C:\Users\tapas\Music\Semester-5\SEM-5\JAVA-programs\Day-01>java PrintN 5 SquidGame*/

public class PrintN {
    public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        String s=args[1];
        for(int i=1;i<=N;i++)
        System.out.println("String is "+s);

    }
}

/*Output:-> 
String is SquidGame
String is SquidGame
String is SquidGame
String is SquidGame
String is SquidGame
*/