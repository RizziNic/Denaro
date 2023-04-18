public class Main {
    public static void main(String[] args) {
        PortaMonete prova = new PortaMonete(2, 3, 4);
        //PortaMonete prova2 = new PortaMonete();

        System.out.print("Disponibilità: ");
        System.out.println(prova.disponibilita() + " euro");

        System.out.print("Conversione in lettere: ");
        prova.conversioneEuro();
        System.out.println("\n");

        prova.inserisci();
        System.out.println();
        prova.inserisciDiPiu();

        prova.denaroPerTipo();


    }
}