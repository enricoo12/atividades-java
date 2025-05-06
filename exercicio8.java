
    import java.util.Scanner;

    public class exercicio8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int[] A = new int[5];
            int[] B = new int[5];
            int[] C = new int[10]; 
    
            System.out.println("Digite 5 números para o vetor A:");
            for (int i = 0; i < 5; i++) {
                System.out.print("A[" + i + "]: ");
                A[i] = scanner.nextInt();
            }
    
    
            System.out.println("\nDigite 5 números para o vetor B:");
            for (int i = 0; i < 5; i++) {
                System.out.print("B[" + i + "]: ");
                B[i] = scanner.nextInt();
            }
    
            
            for (int i = 0; i < 5; i++) {
                C[i] = A[i];
                C[i + 5] = B[i];
            }
    
            
            System.out.println("\nVetor C (união de A e B):");
            for (int i = 0; i < 10; i++) {
                System.out.println("C[" + i + "]: " + C[i]);
            }
    
            scanner.close();
        }
    } 

