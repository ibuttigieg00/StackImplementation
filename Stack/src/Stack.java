import java.util.EmptyStackException;

public class Stack {
    private int [] stackArray;
    private int maxSize;
    private int top;

    public Stack(int maxSizeIn){
        stackArray = new int[maxSizeIn];
        maxSize = maxSizeIn;
        top = -1;
    }

    public boolean isStackEmpty(){
        return (top == -1);
    }

    public boolean isStackFull(){
        return (top == maxSize - 1);
    }

    public boolean Push(int numberIn){
        if(!isStackFull()){
            top ++;
            stackArray[top] = numberIn;
            return true;
        }
        return false;
    }

    public boolean Pop(){
        if(!isStackEmpty()){
            stackArray[top] = 0;
            top --;
            return true;
        }
        return false;
    }

    public int Peek(){
        if(isStackEmpty()){
            throw new EmptyStackException();
        }
        return stackArray[top];
    }
}
