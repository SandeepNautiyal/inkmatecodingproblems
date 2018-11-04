class NextGreaterElement {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        int [] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = -1;
        }
        for(int i = 0; i < arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        
        for(int i = 0; i < arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                result[stack.pop()] = arr[i];
            }
        }
        return result;
    }
}
