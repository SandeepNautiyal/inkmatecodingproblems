class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int length = 0;
        ListNode head  =  root;
        while(head != null){
            length++;
            head = head.next;
        }
        head  = root;
        int remainder = length % k;
        int sublistLength = length/k;
        if(length < k){
            sublistLength = 1;
            remainder = 0;
        }
        ListNode [] nodes = new ListNode[k];  
        int i = 0;
        while(i < k){
            nodes[i] = head;
            int curentLength = 1;
            int requiredLength = sublistLength + (remainder > 0 ? 1 : 0);
            remainder--;
            for(int j = curentLength; j < requiredLength; j++){
                head = head.next;
            }
            if(head != null){
                ListNode end = head;
                head = head.next;
                end.next = null; 
            }
            i++;
        }
        return nodes;
    }
}