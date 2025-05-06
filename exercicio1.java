public class exercicio1 {
    public static void main(String[] args) throws Exception {
        int[] numero= {50,20,90,60,40,85,89,36,90,70};
         int soma=0;

        for (int i=0; i < numero.length; i++){
        soma += numero[i];
    }
    System.out.println("a soma dos numeros é:" + soma);

    
    }
}
