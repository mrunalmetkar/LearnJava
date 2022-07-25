package Collections;

public class DSStackUsingArray {
    int top;
    int size;
    int arr[];

    public DSStackUsingArray(int size){
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){

        return (size-1==top);
    }

    public void push(int element){
        if(isFull()){
            System.out.println("Stack is full, can't push!!");
        }
        else {
            top++;
            arr[top]=element;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, nothing to pop");
            return -1;
        }
        else {
            int poppedElement=arr[top];
            top--;
            return poppedElement;
        }
    }

    //time complexity of all operations is O(1)
    public static void main(String[] args) {
        DSStackUsingArray stack=new DSStackUsingArray(5);
        stack.isEmpty();
        stack.push(1);
        stack.isFull();
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(5);
        stack.pop();
        stack.push(3);
        stack.pop();

    }
}
