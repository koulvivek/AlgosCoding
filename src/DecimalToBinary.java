public class  DecimalToBinary{
    public static Integer Decimal2Binary(Integer myDecimalNumber) {
        int binary[] = new int[40];
        int index = 0;
        while(myDecimalNumber > 0){
            binary[index++] = myDecimalNumber%2;
            myDecimalNumber = myDecimalNumber/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();//new line
        // Write your code here
        return 0;
    }

    public static void main(String args[])
    {
        System.out.println("Decimal of 2 is: ");
        Decimal2Binary(2);
        System.out.println("Decimal of 5 is: ");
        Decimal2Binary(5);
        System.out.println("Decimal of 10 is: ");
        Decimal2Binary(10);
    }}


