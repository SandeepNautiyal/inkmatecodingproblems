import java.util.Stack;

public class QueueUsingTwoStacks {
    private  Stack<Integer> frontEnd = new Stack<>();
    private  Stack<Integer> rearEnd = new Stack<>();

    public void add(int element){
        frontEnd.push(element);
    }

    public  int remove(){
        if(isEmpty())
            throw new RuntimeException("Queue is Empty");

        if(!rearEnd.isEmpty()){
            return rearEnd.pop();
        }
        else{
            while(!frontEnd.isEmpty()){
                rearEnd.push(frontEnd.pop());
            }
            return rearEnd.pop();
        }
    }

    public boolean isEmpty(){
        return frontEnd.isEmpty() && rearEnd.isEmpty();
    }
}
