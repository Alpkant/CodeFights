ListNode<Integer> removeKFromList(ListNode<Integer> r, int k) {
if(r==null)
return r;

ListNode<Integer> root=new ListNode<Integer> (0);
    root.next=r;
ListNode<Integer> l=root;
while(l.next!=null){
    if(l.next.value==k){
       l.next=l.next.next;       
    }else{
        l=l.next;
    }
}
return root.next;
}
