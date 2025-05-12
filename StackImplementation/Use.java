package StackImplementation;

public class Use {
    public static void main(String[] args) {
        Stacki stack = new Stacki();

        stack.push(2);
        stack.push(4);
        stack.push(6);
        System.out.println(stack.pop()  + "\n ---------");
        System.out.println(stack.peek()  + "\n ---------");
        System.out.println(stack.size()  + "\n ---------");
        System.out.println(stack.isEmpty()  + "\n ---------");
        stack.show();
    }
}
