class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        if(wall.size() == 0)
            return 0;
        Map<Integer, Integer> sums = new HashMap<>();
        int max  = 0;
        for(int i = 0; i < wall.size(); i++){
            int sum = 0;
            for(int j = 0; j < wall.get(i).size(); j++){
                sum = sum + wall.get(i).get(j);
                if(j == wall.get(i).size()-1)
                    continue;
                
                if(sums.get(sum) == null){
                    sums.put(sum ,1);
                    max = Math.max(max, 1);
                } 
                else{
                    int times = sums.get(sum);
                    sums.put(sum ,++times);
                    max = Math.max(max, times);
                }
            }
        }
        return wall.size()-max;
    }
}