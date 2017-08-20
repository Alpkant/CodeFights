char firstNotRepeatingCharacter(String s) {
char[] chars = s.toCharArray();
    
for (char c : chars) {
    if(s.lastIndexOf(c)==s.indexOf(c)){
        return c;
    }
}
    return '_';
}
