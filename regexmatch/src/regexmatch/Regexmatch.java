package regexmatch;


public class Regexmatch {
    
    public static boolean isTrue(String str){
        return str.matches("true");
    }
 
    
    public static void main(String[] args) {
        System.out.println(isTrue("false"));
    }
    
}
