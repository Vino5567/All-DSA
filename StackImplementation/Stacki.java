package StackImplementation;

public class Stacki {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
        stack[top] = data;
        top++;
    }

    public int pop(){

        int data = 0;

        if(isEmpty()){
            System.out.println("stack is empty");
        }else{
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;

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
            System.out.println(i);
        }
    }

}
