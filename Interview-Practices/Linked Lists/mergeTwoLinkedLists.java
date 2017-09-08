ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
    ListNode<Integer> newly = new ListNode<Integer>(0);
    ListNode<Integer> trace = newly;
    try{
        
    while(l1 != null ||l2 != null){
        if(l1.value <= l2.value){
            trace.next = new ListNode<Integer>(l1.value);
            trace = trace.next;
            l1=l1.next;
        }else if(l1.value > l2.value){
            trace.next = new ListNode<Integer>(l2.value);
            trace = trace.next;
            l2=l2.next;
        }
    }
    
    }catch (NullPointerException e){
        
    }
    
    if(l1 == null){
        while(l2!=null){
            trace.next = new ListNode<Integer>(l2.value);
            trace = trace.next;
            l2=l2.next;
        }
    }else if(l2 == null){
        while(l1!=null){
            trace.next = new ListNode<Integer>(l1.value);
            trace = trace.next;
            l1=l1.next;
        }
    }
    newly = newly.next;
    return newly;
}
