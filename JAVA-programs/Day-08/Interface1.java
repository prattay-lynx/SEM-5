
/*Output:->
Inserted: 4
Inserted: 5
Inserted: 6
Inserted: 7
Inserted: 8
Removed 8
Removed 7
 */
interface Stack{
    public void push(int x);
    public int pop();
    public boolean isEmpty();
    public boolean isFull();

}

class Stack1 implements Stack
{   int top;
    int arr[],capacity;
    Stack1(int size)
    {
       arr = new int[size];
       capacity = size;
       top = -1;

    }
   public void push(int x)
   {
     if(isFull())
     {
        System.out.println("Overflow!!");
     }
     else
     {
        System.out.println("Inserted: "+ x);
       arr[++top] = x;
     }
   }
   public int pop()
   {
    if(isEmpty())
        {
            System.out.println("Underflow!!"); 
            return -1;
        }
        
        System.out.println("Removed "+p());
        return arr[top--];
   }
   public int p()
   {
       if(!isEmpty())
       {
           return arr[top];
       }
       return -1;
   }

   public boolean isFull()
   {
       return top == capacity-1;
   }
   public boolean isEmpty()
   {
       return top == -1;
   }
} 

public class Interface1 {
    public static void main(String[] args) {
        Stack1 s = new Stack1(5);
        for(int i = 0; i < 5; i++)
        {
           s.push(i+4);
        }
        s.pop();
        s.pop();
    
    }
}
