package CollectionsSession;

import java.util.Scanner;

class SpecialStack
{
    public int size;
    public int top=-1;
    public int[] getMinStack;
    public int minStack=-1;
    public int[] arr;
    SpecialStack(int size)
    {
        this.size=size;
        arr=new int[size];
        getMinStack= new int[size];
    }
    void push(int i)
    {
        if(isFull())
            System.out.println("Cannot input another element !! Stack Full !!");
        else {
            arr[++top] = i;
            System.out.println("\nPushing :- "+i);
            if(minStack==-1 || getMinStack[minStack]>i) getMinStack[++minStack]=i;
        }
    }
    boolean isEmpty()
    {
        return (top<0);
    }
    boolean isFull()
    {
        return (top+1>=size);
    }
    void pop()
    {
        if(isEmpty())
            System.out.println("Cannot pop any element !! Stack Empty !!");
        else
        {
            System.out.println("\nPopping :- "+arr[top]);
            if(arr[top--]==getMinStack[minStack]) minStack--;
        }
    }

    public int getMin() {
        if(minStack==-1)
            throw new RuntimeException("Min Stack is empty");

        return getMinStack[minStack];
    }

    @Override
    public String toString() {
        if (top == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= top; i++) {
            sb.append(arr[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
public class Ques_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the max capacity of stack :- ");
        int n= sc.nextInt();
        SpecialStack st= new SpecialStack(n);

        System.out.println("\nIs stack empty ? "+st.isEmpty());
        st.pop();
        st.push(8);
        st.push(10);
        System.out.println("\nMinimum in stack :- "+st.getMin());

        st.push(6);
        System.out.println("Minimum in stack :- "+st.getMin());
    }

}