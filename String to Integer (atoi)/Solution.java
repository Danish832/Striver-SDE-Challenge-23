import java.util.*;

class solution {

    public static void main (String args[]){
        String s = "   -42" ;
       int ans = myAtoi(s);
       System.out.println("Ans is :"+ans);
      
    }
    public static int myAtoi(String str) {
        str = str.trim() ;
    if(str.length()==0) return 0 ;
    int sign = 1 ;
    int index = 0 ;
        if(str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        long result = 0L ;
        for(int i=index ; i<str.length() ; i++){
            char ch = str.charAt(i) ;

            int value = ch - '0' ;

            if(value<0 || value>9)break ;

            result = result*10 + value ;

        if(sign ==-1 && -1*result<Integer.MIN_VALUE) return Integer.MIN_VALUE ;
        if(sign == 1 && result>Integer.MAX_VALUE) return Integer.MAX_VALUE ;
        }

    return (int)result*sign ;
    }
}