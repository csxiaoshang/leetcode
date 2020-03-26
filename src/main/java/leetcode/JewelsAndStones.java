package main.java;

public class JewelsAndStones {
    public int numJewelsInStones(String J,String S){
        int count=0;
        int Jlength=J.length();
        int Slength=S.length();
        for( int i=0;i<Jlength;i++){
            for(int j=0;j<Slength;j++){
                if(J.charAt(i)==S.charAt(j))
                    count++;
            }
        }
        return count;
    }
}
