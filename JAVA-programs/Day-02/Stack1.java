/*Question->Create 2 stacks capable of holding 10 integer values
Write push pop functions
After pushing,popping, display the contents */

/*Output-> Inserted: 5
Inserted: 8
Removed 8
Stack contents:
5
Inserted: 10
Inserted: 11
Inserted: 10
Inserted: 1
Removed 1
Stack contents:
10 
11
10
5
Removed 10
Stack contents:
11 
10
5
Removed 11
Stack contents:
10
5
The size of the stack:2
The top element is10
Removed 10
Stack contents:
5
the Stack is not empty*/

class Stack{
    int arr[];
    int capacity;
    int top;
    Stack(int size)
    {
       arr = new int[size];
       capacity = size;
       top = -1;

    }
    void push(int x)
    {
        if(isFull())
        {
            System.out.println("Overflow!!");
            return;
        }
        System.out.println("Inserted: "+ x);
        arr[++top]=x;
    }
    void display(int top)
    {  System.out.println("Stack contents:");
        while(top > 0)
        {
            System.out.println(arr[top-1]+" ");
            top--;
            
        }
    }
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Underflow!!"); 
            return -1;
        }
        
        System.out.println("Removed "+p());
        display(top);
        return arr[top--];
        
    }
    int p()
    {
        if(!isEmpty())
        {
            return arr[top];
        }
        return -1;
    }
    int isSize()
    {
        return top+1;
    }
    boolean isFull()
    {
        return top == capacity-1;
    }
    boolean isEmpty()
    {
        return top == -1;
    }
  
} 



public class Stack1 {
    public static void main(String [] args)
    {
        Stack s = new Stack(10);
        s.push(5);
        s.push(8);
        s.pop();
        s.push(10);
        s.push(11);
        s.push(10);
        s.push(1);
        s.pop();
        s.pop();
        s.pop();
        System.out.println("The size of the stack:"+s.isSize());
        System.out.println("The top element is"+s.p());
        s.pop();
        if(s.isEmpty())
        {
            System.out.println("the Stack is empty");
        }
        else{
            System.out.println("the Stack is not empty");
        }
    }
    
}
