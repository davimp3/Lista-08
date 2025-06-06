import java.util.Scanner;

public class LacoRepContinuo {
     private int numero;

        public void imprimindoValoresContinuos(){
            try {
                    try(Scanner scanner = new Scanner(System.in)){
                        System.out.println("Digite o numero desejado:");
                            numero = scanner.nextInt();

                                for (int i = 1; i <= numero; i++) {
                                    System.out.println(" ");
                                    for(int j = 1; j  < i; ++j){
                                    System.out.print(j);
                                    }
                                } 
                    }
            } catch (Exception e) {
                    System.out.println("Ops, algo deu errado. Tente novamente.");
            }
        }
}
