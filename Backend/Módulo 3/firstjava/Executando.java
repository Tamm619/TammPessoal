public class Executando {
    
    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("GIOVANNA")){
            System.out.println("Eu amo a Giovanna");
        } else if (ambiente.equalsIgnoreCase("MATEUS")){
            System.out.println("Mateus ama a Giovanna");
        } else {
            System.out.println("Independente de qualquer coisa, eu amo a Giovanna!");
        }
    }
}
