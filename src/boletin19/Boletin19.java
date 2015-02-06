package boletin19;

public class Boletin19 {

    public static void main(String[] args) {
        Buzon obx = new Buzon();
       
        int op;
        do {
            op = Buzon.menuSelect();
            switch (op) {
                case 1:
                    obx.numeroDeCorreos();
                    break;
                case 2:
                    obx.engade(Correo e);
                    break;
                case 3:
                    //obx.porLer();
                    break;
                case 4:
                    obx.amosaPrimerNonLeido();
                    break;
                case 5:
                    //obx.amosa(k);
                    break;
                case 6:
                    //obx.elimina(k);
                    break;
                case 7:
                   if (op == 6 && op == 0) {
                    System.exit(0); 
                   }
                    break;
            }

        } while (op != 7 && op !=0);

    }

}
