boolean isCryptSolution(String[] crypt, char[][] solution) {
    String t1 = new String();
    String t2 = new String();
    String t3 = new String();
    
    for(int i=0;i<crypt[0].length() ; i++){
        char tmp = crypt[0].charAt(i);
        for(int j=0 ; j<solution.length ;j++){
            if(solution[j][0] == tmp)
                t1 += solution[j][1];
        }
    }
    
    for(int i=0;i<crypt[1].length() ; i++){
        char tmp = crypt[1].charAt(i);
        for(int j=0 ; j<solution.length ;j++){
            if(solution[j][0] == tmp)
                t2 += solution[j][1];
        }
    }
    
    for(int i=0;i<crypt[2].length() ; i++){
        char tmp = crypt[2].charAt(i);
        for(int j=0 ; j<solution.length ;j++){
            if(solution[j][0] == tmp)
                t3 += solution[j][1];
        }
    }
    double intT1 = Double.parseDouble(t1);
    double intT2 = Double.parseDouble(t2);
    double intT3 = Double.parseDouble(t3);
    
    if( (t1.charAt(0) == '0' || t2.charAt(0) == '0' || t3.charAt(0) == '0') && t1.length() >1 && t2.length() > 1 )
        return false;
    
    if(intT1+intT2 == intT3)
        return true;
    
    return false;
}
