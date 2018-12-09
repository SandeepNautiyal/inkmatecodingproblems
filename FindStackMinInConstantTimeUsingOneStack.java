import java.util.Stack;

public class FindStackMinInConstantTimeUsingOneStack {
    private Stack<Element> elements = new Stack<>();
    public void push(int value){
        if(!elements.isEmpty() && value >= elements.peek().getValue()){
            elements.push(new Element(value, elements.peek().getValue()));
        }
        else{
            elements.push(new Element(value, value));
        }
    }

    public int pop(){
        if(elements.isEmpty())
            throw new RuntimeException("Stack is Empty");

        return elements.pop().getValue();
    }

    public int getMin(){
        if(elements.isEmpty())
            throw new RuntimeException("Stack is Empty");

        return elements.peek().getMin();
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }
}

class Element{
    private int value;
    private int min;
    public Element(int value, int min){
        this.value = value;
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public int getValue() {
        return value;
    }
}
