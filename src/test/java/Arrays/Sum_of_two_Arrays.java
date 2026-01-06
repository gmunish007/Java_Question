package Arrays;

public class Sum_of_two_Arrays {
    public static int[] sumArr(int [] arr1, int []arr2){
        if(arr1.length != arr2.length){
            System.out.println("Array length not matchong.");
            return null;
        }

        int [] arrResult=new int[arr1.length];

        for(int i=0; i<arr1.length; i++){
            arrResult[i]=arr1[i]+arr2[i];
        }
        return arrResult;
    }
    public static void main(String[] args){
        int arr1[]={1,3,4,5};
        int [] arr2={5,6,7,8};

        int newArr[]=sumArr(arr1, arr2);
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
