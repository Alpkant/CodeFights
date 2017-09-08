ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
  
    ListNode<Integer> mainhead = null, currhead = l, nextheadtolink = null,
        firstheadtolink = null, prevcurrhead = null, prevcurrnext = null;
    
    int index = 1;
    
    while(l != null){
        
        if(index == k){
            mainhead = l;
        }
        
        if(index%k == 0){
            prevcurrnext = prevcurrhead;
            prevcurrhead = currhead;
            firstheadtolink = l;
            nextheadtolink = l.next;
            l.next = null;
            currhead = reverse(currhead);       
            if(prevcurrnext != null) prevcurrnext.next = firstheadtolink; 
            currhead = nextheadtolink;
            prevcurrhead.next = nextheadtolink;
            l = nextheadtolink;
        }
        else{
            
            l = l.next;
        }
        index++;
    }
   return mainhead;
}
 
ListNode<Integer> reverse(ListNode<Integer> l){
    ListNode<Integer> next = null;
    ListNode<Integer> prev = null;
    ListNode<Integer> curr = l;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;    
    }
    return prev;
}
