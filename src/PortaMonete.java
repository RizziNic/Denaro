public class PortaMonete {

    static int monetacinquanta;
    static int moneta1;
    static int moneta2;
    public PortaMonete(){
        this.monetacinquanta = 0;
        this.moneta1 = 0;
        this.moneta2 = 0;
    }

    public PortaMonete(int monetacinquanta, int moneta1, int moneta2){
        this.monetacinquanta = monetacinquanta;
        this.moneta1 = moneta1;
        this.moneta2 = moneta2;
    }

    public static double getMonetacinquanta() {
        return monetacinquanta;
    }

    public static int getMoneta1() {
        return moneta1;
    }

    public static int getMoneta2() {
        return moneta2;
    }

    public static double disponibilita(){
        double soldi = getMoneta1()*1 + getMoneta2()*2 + getMonetacinquanta()*0.50;
        if(soldi == 0){
            System.out.print("SEI AL VERDE ");
        }
        else{
            return soldi;
        }

        return 0;
    }

    public static void conversioneEuro(){
        int n = (int)disponibilita();
        int unita = n%10;
        int decine =(n/10)%10;
        int centinaia = (n/100)%10;
        int migliaia =  n/1000;


        switch (migliaia){
            case 1:
                System.out.print("mille");
                break;

            case 2:
                System.out.print("duemila");
                break;

            case 3:
                System.out.print("tremila");
                break;

            case 4:
                System.out.print("quattromila");
                break;

            case 5:
                System.out.print("cinquemila");
                break;

            case 6:
                System.out.print("seimila");
                break;

            case 7:
                System.out.print("settemila");
                break;

            case 8:
                System.out.print("ottomila");
                break;

            case 9:
                System.out.print("novemila");
                break;
        }
        switch (centinaia) {
            case 1:
                System.out.print("cento");
                break;

            case 2:
                System.out.print("duecento");
                break;

            case 3:
                System.out.print("trecento");
                break;

            case 4:
                System.out.print("quattrcento");
                break;

            case 5:
                System.out.print("cinquecento");
                break;

            case 6:
                System.out.print("seicento");
                break;

            case 7:
                System.out.print("settecento");
                break;

            case 8:
                System.out.print("ottocento");
                break;

            case 9:
                System.out.print("novecento");
                break;
        }
        switch (decine) {
            case 1:
                System.out.print("dieci");
                break;

            case 2:
                System.out.print("venti");
                break;

            case 3:
                System.out.print("trenta");
                break;

            case 4:
                System.out.print("quaranta");
                break;

            case 5:
                System.out.print("cinquanta");
                break;

            case 6:
                System.out.print("sessanta");
                break;

            case 7:
                System.out.print("settanta");
                break;

            case 8:
                System.out.print("ottanta");
                break;

            case 9:
                System.out.print("novanta");
                break;
        }
        switch (unita){
            case 1:
                System.out.print("uno");
                break;

            case 2:
                System.out.print("due");
                break;

            case 3:
                System.out.print("tre");
                break;

            case 4:
                System.out.print("quattro");
                break;

            case 5:
                System.out.print("cinque");
                break;

            case 6:
                System.out.print("sei");
                break;

            case 7:
                System.out.print("sette");
                break;

            case 8:
                System.out.print("otto");
                break;

            case 9:
                System.out.print("nove");
                break;
        }

    }

}

