package boletin19;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Buzon {

    Correo mail = new Correo();
    ArrayList<Correo> eMail = new ArrayList<Correo>();

    public int numeroDeCorreos() {
        int numail = eMail.size();
        JOptionPane.showMessageDialog(null, "numero de correos: " + numail);
        return numail;
    }

    public boolean pedirLeido() {
        boolean leid = mail.isLeido();
        int lei = JOptionPane.showConfirmDialog(null, "Leiches o correo?");
        if (lei == 0) {
            return leid = true;
        } else {
            return leid = false;
        }
    }

    public void engade(Correo c) {
        String auxCorr;
        boolean auxleid;
        int anotherone;
        do {
            auxCorr = JOptionPane.showInputDialog("Intoduce correo");
            auxleid = this.pedirLeido();
            eMail.add(new Correo(auxCorr, auxleid));
            anotherone = JOptionPane.showConfirmDialog(null, "engadir outro correo?", "AVISO!!", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        } while (anotherone == 0);
    }

    public boolean porLer() {
        boolean read = true;
        for (int i = 0; i < eMail.size(); i++) {
            if (eMail.get(i).isLeido() == false) {
                read = false;
            }
        }
        if (read) {
            JOptionPane.showMessageDialog(null, "Non", "Quedan mensaxes por ler?", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Si", "Quedan mensaxes por ler?", JOptionPane.INFORMATION_MESSAGE);
        }
        return read;
    }

    public String amosaPrimerNonLeido() {
        String primNonLeido = "";
        for (int i = 0; i < eMail.size(); i++) {
            if (eMail.get(i).isLeido() == false) {
                primNonLeido = String.valueOf(eMail.get(i));
                JOptionPane.showMessageDialog(null, primNonLeido);
                break;
            }
        }
        if (primNonLeido == "") {
            JOptionPane.showMessageDialog(null, "Non hai mensaxes por ler");
        }

        return primNonLeido;
    }

    public String amosa(int k) {
        String correoK = "";
        for (int i = 0; i < eMail.size(); i++) {
            if (k == i) {
                correoK = String.valueOf(eMail.get(k));
                JOptionPane.showMessageDialog(null, correoK, "O correo na posición " + k + " é", JOptionPane.PLAIN_MESSAGE);
            }
        }
        if (k >= eMail.size()) {
            JOptionPane.showMessageDialog(null, "Non existe correo na posición " + k, "ERRO!!", JOptionPane.WARNING_MESSAGE);
        }

        return correoK;

    }

    public void elimina(int k) {
        for (int i = 0; i < eMail.size(); i++) {
            if (k == i) {
                JOptionPane.showMessageDialog(null, "Eliminaches:\n" + eMail.get(i), "AVISO!!", JOptionPane.INFORMATION_MESSAGE);
                eMail.remove(i);

            }
        }
        if (k >= eMail.size()) {
            JOptionPane.showMessageDialog(null, "Non existe correo na posición " + k, "", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static int menuSelect() {
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona unha opción", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Numero de correos", "engade", "porLer", "amosa primeiro non leido", "amosa pos:", "elimina", "exit"}, "exit");
        return opcion + 1;

    }

    public int introducePosicion() {
        int k = Integer.parseInt(JOptionPane.showInputDialog("introduce nº de posición\n(posicións dispoñibles:[0," + (eMail.size() - 1) + "])"));
        return k;
    }

}
