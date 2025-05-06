import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new  Scanner(System.in);
        int[][] numeros= new int[2][2];

        System.out.println("digite 4 numeros:");
        for (int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println("Elemento i[" + i + "][" + j + "]: ");
                numeros[i][j]= scanner.nextInt();
            }
        }
       System.out.println("matriz:");
       for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(numeros[i][j]+" "); 
    
}
System.out.println();
}
scanner.close();
    }
}