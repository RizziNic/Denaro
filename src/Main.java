public class Main {
    public static void main(String[] args) {
        PortaMonete prova = new PortaMonete(2, 3, 4);
        //PortaMonete prova2 = new PortaMonete();

        System.out.print("Disponibilità: ");
        System.out.println(PortaMonete.disponibilita() + " euro");

        System.out.print("Conversione in lettere: ");
        PortaMonete.conversioneEuro();
        System.out.println("\n");

        PortaMonete.inserisci();
        System.out.println();
        PortaMonete.inserisciDiPiu();


    }
}