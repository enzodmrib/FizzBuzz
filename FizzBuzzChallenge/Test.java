public class Test {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for(int i=0; i<1000 ; i++){
            arr[i] = i+1;
        }
        FizzBuzz.function(arr);
    }
}