import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner Scanner= new Scanner(System.in);
        int[] numeros= new int [12];
        int soma =0;

        System.out.println("digite 12 numeros:");
         for (int i=0; i<numeros.length; i++){
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = Scanner.nextInt();
            soma += numeros[i]; 
        }
         double media= (double)soma/numeros.length;
         
         int maioresQueMedia = 0;

         for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                maioresQueMedia++;
            }
        }
        System.out.println("\nMédia dos valores: " + media);
        System.out.println("Quantidade de elementos maiores que a média: " + maioresQueMedia);

        Scanner.close();
    }        
}    


