
import java.util.Scanner;

public class ConversaoHoras {
    private final String [] menu = {
        "Digite o horário:",
        "PM",
        "AM",
        "A conversão é:",
        "Gostaria de repetir a operação? [S | N]"
    };
    String controlador;
    private int hora, conversor, converter;
    boolean novaConversao;

        public ConversaoHoras(){
            this.hora = hora;
            this.conversor = 1200;
            this.novaConversao = true;
        }

            public void calculoConversao(){
                try {

                    while(novaConversao){
                        try(Scanner scanner = new Scanner(System.in)){

                            System.out.println(menu[0]);
                                hora = scanner.nextInt();

                                converter = hora - conversor;

                            
                                if(converter >= 12 ){
                                    System.out.println(menu[3]+" "+converter+" "+menu[1]);
                                } else if(hora <= conversor){
                                    System.out.println(menu[3]+" "+hora+" "+menu[2]);
                                }
                                
                                System.out.println(menu[4]);
                                    controlador = scanner.next();
                                        if(controlador.equals("N")){
                                            novaConversao = false;
                                        } else{
                                            return;
                                        }
                            }
                        }

                } catch (Exception e) {
                    System.out.println("Algo deu errado, tente novamente!");
                }
            }
    
}
