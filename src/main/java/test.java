public class test {

   int a=565;
    public  void palindrom(){

        int b=0;
        int n=a;
        int result=0;
        while(a>0){

            b=a%10;

            result=10*result+b;

            a=a/10;
        }
        System.out.println(a);
        if(n==result){

            System.out.println("yes it is palindrome");
        }
        else
            System.out.println("No");


    }

    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }


    public static void main(String args[]){
          test t=new test();
        //t.palindrom();
        int arr[] = {10,20,20,30,30,40,50,50,20};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }

}
