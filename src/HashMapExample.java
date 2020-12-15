import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args){

        HashMap<String,Integer> wordToNum=new HashMap();
        
        wordToNum.put("ONE",1);
        wordToNum.put("TWO",2);
        wordToNum.put("THREE",3);
        wordToNum.put("FOUR",4);
        wordToNum.put("FIVE",5);

        System.out.println(wordToNum.get("THREE"));
        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());
    }
}
