package boletin19;

import javax.swing.JOptionPane;

public class Boletin19 {

    public static void main(String[] args) {
        Buzon obx = new Buzon();
        Correo obxM = new Correo();
        boolean mailCreated = false;
        int op;
        do {
            op = Buzon.menuSelect();
            switch (op) {
                case 1:
                    obx.numeroDeCorreos();

                    break;
                case 2:
                    obx.engade(obxM);
                    mailCreated = true;
                    break;
                case 3:
                    obx.porLer();
                    break;
                case 4:
                    if (mailCreated) {
                        obx.amosaPrimerNonLeido();
                    } else {
                        JOptionPane.showMessageDialog(null, "Engade correo/s", "ERRO!!", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 5:
                    if (mailCreated) {
                        obx.amosa(obx.introducePosicion());
                    } else {
                        JOptionPane.showMessageDialog(null, "Engade correo/s", "ERRO!!", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 6:
                    if (mailCreated) {
                        obx.elimina(obx.introducePosicion());
                    } else {
                        JOptionPane.showMessageDialog(null, "Engade correo/s", "ERRO!!", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 7:
                    if (op == 6 && op == 0) {
                        System.exit(0);
                    }
                    break;
            }

        } while (op != 7 && op != 0);

    }

}
