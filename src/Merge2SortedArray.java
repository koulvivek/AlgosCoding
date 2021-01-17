public class Merge2SortedArray {

    public static int[] merge2SortedArrrays(int a[],int[] b){

        int[] result= new int[a.length + b.length];

        int i=0;// iterates on a
        int j=0;// iterates on b
        int k=0; //iterates on c
        /*
        iterate 2 arrays together if the ith element of a is < jth element of b, put the ith element
        in array result , then continue with a till ith element of a is !< ith element of b and then continue on b.

         */
        while(i<a.length && j<b.length){

            if(a[i] < b[j]){
                result[k]=a[i];
                i++;
                k++;
            }
            else{
                result[k]=b[j];
                j++;
                k++;
            }
            // copy rest of the elements of a after the comparison to result
            while(i< a.length){
                result[k]=a[i];
                i++;
                k++;
            }
            // copy rest of the elements of b after the comparison to result
            while(j < b.length){
                result[k]=b[j];
                j++;
                k++;
            }
        }


        return result;
    }
}
