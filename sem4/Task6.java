package sem4;

public class Task6 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        System.out.println(myStack.empty());

        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        myStack.push("4");

        System.out.println(myStack.size());


    }
}
