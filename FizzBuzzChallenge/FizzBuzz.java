
public class FizzBuzz{
    public static void function(int[] n){
        int fizzBuzzCounter, fizzCounter, buzzCounter;
        fizzBuzzCounter = fizzCounter = buzzCounter = 0;
        
        for(int i=0;i<n.length;i++){
            if (n[i]%3==0 && n[i]%5==0){
                fizzBuzzCounter++;
                System.out.println("FizzBuzz");
            } 
            else if (n[i]%3==0){
                System.out.println("Fizz");
                fizzCounter++;
            } 
            else if(n[i]%5==0){
                System.out.println("Buzz");
                buzzCounter++;
            } 
            else{
                System.out.println(n[i]);
            }
        }
        System.out.println("........................................................................");
        System.out.println("Resumo:\nFizz:"+(fizzCounter)+"\nBuzz:"+(buzzCounter)+"\nFizzBuzz:"+(fizzBuzzCounter));
        System.out.println("........................................................................\n");
    }
}