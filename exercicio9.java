import java.util.Scanner;
import java.util.ArrayList;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[6];
        int[] B = new int[6];

        
        System.out.println("Digite 6 números para o vetor A:");
        for (int i = 0; i < 6; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

    
        System.out.println("\nDigite 6 números para o vetor B:");
        for (int i = 0; i < 6; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        
        ArrayList<Integer> C = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j] && !C.contains(A[i])) {
                    C.add(A[i]);
                }
            }
        }

        
        System.out.println("\nElementos comuns aos vetores A e B:");
        if (C.isEmpty()) {
            System.out.println("Nenhum elemento em comum.");
        } else {
            for (int i = 0; i < C.size(); i++) {
                System.out.println("C[" + i + "]: " + C.get(i));
            }
        }

        scanner.close();
    }
}
    

