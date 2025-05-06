import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) throws Exception {
        int[] numero=new int[8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite 8 numeros:");
        for (int i=0; i<8; i++){
            System.out.print("numero"+ (i+1)+":");
            numero[i]=scanner.nextInt();
        }
        System.out.println("vetor inverso:");
        for (int i=7; i>=0; i--){
            System.out.print(numero[i] + " ");
        }
        scanner.close();

        }
}

