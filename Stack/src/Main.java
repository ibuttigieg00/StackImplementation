public class Main {
    public static void main (String [] args){
        Stack stack = new Stack(5);

        System.out.println(stack.isStackEmpty());
        System.out.println(stack.isStackFull());
        System.out.println(stack.Push(10));
        System.out.println(stack.Push(12));
        System.out.println(stack.Push(3));
        System.out.println(stack.Peek());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
        System.out.println(stack.Peek());
        System.out.println(stack.Pop());
        System.out.println(stack.Pop()); // here it should be empty, returns false instead of breaks program
        System.out.println(stack.isStackEmpty()); // true
        System.out.println(stack.isStackFull()); // false`
    }
}
