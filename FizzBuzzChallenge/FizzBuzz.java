public class FizzBuzz{
    public static void function(int[] n){               //static para utilizar a função sem instanciar
        int fizzBuzzCounter, fizzCounter, buzzCounter;
        fizzBuzzCounter = fizzCounter = buzzCounter = 0;
        
        for(int i=0;i<n.length;i++){                    //loop até o tamanho do conjunto n
            if (n[i]%3==0 && n[i]%5==0){                //comparação para checar multiplos
                fizzBuzzCounter++;                      //soma no contador do caso específico
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
            else{                                       //caso não seja múltiplo, retorna o elemento
                System.out.println(n[i]);
            }
        }
        System.out.println("........................................................................");
        System.out.println("Resumo:\nFizz:"+(fizzCounter)+"\nBuzz:"+(buzzCounter)+"\nFizzBuzz:"+(fizzBuzzCounter));
        System.out.println("........................................................................\n");
    }
}