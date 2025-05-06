import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

        
        System.out.println("Digite 15 números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        
        System.out.print("Digite um número para contar quantas vezes ele aparece no vetor: ");
        int numeroBusca = scanner.nextInt();

    
        int ocorrencias = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBusca) {
                ocorrencias++;
            }
        }

    
        System.out.println("O número " + numeroBusca + " aparece " + ocorrencias + " vez(es) no vetor.");

        scanner.close();
    }
}
