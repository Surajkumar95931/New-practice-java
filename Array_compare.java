public class Array_compare {
    public static void main(String[] args) {
//
        int[] arr1 ={1,2,3,4,5};
        int[] arr2 ={1,2,3,4,5,4,3,2};
        boolean t=check(arr1,arr2);
        if (t){
            System.out.println("yes your value is same");
        }else{
            System.out.println("no ");
        }
    }
    public static boolean check(int[] arr1, int[] arr2){
        for (int i=0;i< arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
