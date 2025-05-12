package DynamicStackImplementation;

public class DStack {
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data){

        if(size() == capacity){
            expand();
        }
        stack[top] = data;
        top++;
    }

    private void expand() {
        int length = size();
        int[] nStack = new int[capacity * 2];
        System.arraycopy(stack, 0, nStack, 0, length);
        stack = nStack;
        capacity *= 2;
    }

    public int pop(){

        int data = 0;

        if(isEmpty()){
            System.out.println("stack is empty");
        }else{
            top--;
            data = stack[top];
            stack[top] = 0;
            shirnk();
        }
        return data;

    }

    private void shirnk() {
        int length = size();
        if(length < ((capacity) / 2) / 2)
            capacity = capacity / 2;
            int[] nstack = new int[capacity];
            System.arraycopy(stack, 0 , nstack, 0 , length);
            stack = nstack;
    }

    public int peek(){
        int data = stack[top - 1];
        return data;
    }

    public boolean isEmpty(){
        return top <= 0;
    }

    public int size(){
        return top;
    }

    public void show(){
        for(int i : stack){
            System.out.print(i + " ");
        }
    }
}
