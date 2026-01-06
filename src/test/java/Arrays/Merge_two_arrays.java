package Arrays;

public class Merge_two_arrays {
    public static void main(String[] args){
        int [] arr1={1,2,3};
        int [] arr2={2,5,6};
        int cLen=arr1.length+arr2.length;
        int []c1=new int[cLen];

        for(int i=0; i<arr1.length; i++){
            c1[i]=arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            c1[arr1.length+i]=arr2[i];
        }

        for(int i=0;i<c1.length;i++){
            System.out.print(c1[i]+" ");
        }
    }
}
