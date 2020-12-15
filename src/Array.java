import java.util.*;
public class Array {

    public static void main(String[] args){
        //declare array
        int[] nums;
        // declare and allocate ..
        double[] otherNums =new double[5];
        //declaring ..allocating and intializing array
        String[] availablePets= {"cat","dog","fish"};
        String[] unavailablePets={"bird","rabbit","hamster","gerbil"};

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));
        //swap fish with bird
        int indexOfAvailablePet=2;//fish
        int indexOfUnAvailablePet=0;//bird

        String availablePet = availablePets[indexOfAvailablePet];
        String unavailablePet=unavailablePets[indexOfUnAvailablePet];

        // swap
        availablePets[indexOfAvailablePet]=unavailablePet;
        unavailablePets[indexOfUnAvailablePet]=availablePet;

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));



    }
}
