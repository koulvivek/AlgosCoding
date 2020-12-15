public class Strings {
    // reverse a string.
    public static String reverseString(String s)
    {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            stringBuilder.append(s.charAt(i));
        }
       return stringBuilder.toString();
    }

    public static void findNumberOfVowelsConsonents(String input){
        int vowelsCount=0;
        int consonantCount=0;

        String vowels="aeiouy";
        String normalized=(input.toLowerCase().trim());

        char[] inputCharArray=normalized.toCharArray();

        for(char c : inputCharArray){
            if(vowels.indexOf(c) !=-1) {
                vowelsCount++;
            }
            else if(c!=' '){
                consonantCount++;
                }
            }
        System.out.println("Vowels Count in "+input+" is "+vowelsCount);
        System.out.println("Consonant Count in "+input+ " is " +consonantCount);
        }

    public static void main(String[] args) {
        // String p="  Panda";
        // String f="  Fish  ";
        String h = "Horse  ";
        String c = "  Cat ";
        String nothing = " ";
        //  String[] strings={p, f, c, h, nothing };

       /* for(String s:strings){
            System.out.println(s);
            s=s.trim();
            System.out.println(s);

            if(!s.isEmpty()){
                System.out.println("Not Empty" +s);
            }

            if(s.length()>3){
                System.out.println("More than 3" +s);
            }
        } */

        String a = "Apples";
        String b = "Bananas";
        String o = "Oranges";
        String bp = "Banana Peels";
        String p = "Pears";
        String[] fruits = {a, b, o, bp, p};



        /* for(String f:fruits){
            // character at specific index...
            int index=1;
            System.out.println(f.charAt(index));
            int indexOfLetterE=f.indexOf('e');
            System.out.println(indexOfLetterE);

            // Specific substring.
            f=f.toLowerCase();
            if(f.contains("app")){
                System.out.println("Contains app"+ f);
            }
            // sybstring by index
           System.out.println(f.substring(1,4));
            // reverse string
            System.out.println(reverseString(f));



        } */


        /*
        String text = "The giant panda has an insatiable appetite " +
                "for bamboo. A typical animal eats half the day—a " +
                "full 12 out of every 24 hours—and relieves itself " +
                "dozens of times a day. It takes 28 pounds of " +
                "bamboo to satisfy a giant panda's daily dietary " +
                "needs. Pandas will sometimes eat birds or rodents" +
                " as well.";
        //manipulation
           // how many sentences..
        String[] sentences= text.split("\\.");
        System.out.println("Number of sentences" +sentences.length);
        // how many words
        String[] words=text.split(" ");
        System.out.println("Number of words" +words.length);

        // how many characters.
        System.out.println("How many characters"+text.length());
        // change bamboo to fish

        String fishText=text.replace("bamboo","fish");
        System.out.println(fishText);  */

        String s1="Hello";
        String s2="Quick brown foox jumped";
        String s3="i am happy";

        findNumberOfVowelsConsonents(s1);
        findNumberOfVowelsConsonents(s2);
        findNumberOfVowelsConsonents(s3);

    }
}