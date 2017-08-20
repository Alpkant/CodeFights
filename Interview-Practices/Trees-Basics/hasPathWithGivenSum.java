int a=0;
boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
        
        
    if(t==null && s!=0) return false;
    else if(t==null) return true;
    
    if(a==0 && s== t.value && (t.left!=null || t.right!=null) ){
        a=1;
        return false;
    }
    
    if(a==0)
        a=1;
        
    if(t.left==null && t.right==null){
        if(t.value==s) 
            return true;
        else return false;
    }

    boolean leftValid=hasPathWithGivenSum(t.left,s-t.value);
    boolean rightValid=hasPathWithGivenSum(t.right,s-t.value);
    return leftValid|rightValid;
}
