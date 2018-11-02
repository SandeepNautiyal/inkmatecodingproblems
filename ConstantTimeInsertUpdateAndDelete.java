class RandomizedSet {

    /** Initialize your data structure here. */
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    List<Integer> list = new ArrayList<Integer>();
    
    public RandomizedSet() {
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        boolean result = map.containsKey(val);
        if(!result){
            list.add(val);
            map.put(val, list.size()-1);
        }
        return !result;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        boolean result = map.containsKey(val);
        System.out.println("remove  = "+val+" "+result);
        if(result){
            int index  = map.get(val);
            if(index < list.size()-1){
                int lastVal = list.get(list.size()-1);
                list.set(list.size()-1, val);
                list.set(index, lastVal);
                map.put(val, list.size()-1);
                map.put(lastVal, index);
            }
            list.remove(list.size()-1);
            //System.out.println("index = "+index+" "+list);
            map.remove(val);
        }
        return result;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        //System.out.println("index = "+index+" ");
        return list.get(index);
    }
}
