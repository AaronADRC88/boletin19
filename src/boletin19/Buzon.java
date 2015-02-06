
package boletin19;

import javax.swing.JOptionPane;

public class Buzon {
  Correo mail=new Correo();
    
    public int numeroDeCorreos(){
        int numail;
        for(numail=0;numail<mail.eMail.size();numail++)
        if(numail==mail.eMail.size())
            JOptionPane.showMessageDialog(null, " "+numail);
      return numail;
      }
public void engade(Correo c){
     String auxCorr;
        boolean auxleid;
        int pos = Integer.parseInt(JOptionPane.showInputDialog("introduce a posición na que queres engadir\n(posicións permitidas :(0,"  + "))"));
        auxCorr = mail.getContido();
        
        auxleid = mail.isLeido();
        mail.eMail.add(pos, new Correo(auxCorr, auxleid));
}
public boolean porLer(){
    mail.leido=true;
    return mail.leido;
}
public String amosaPrimerNonLeido(){
    String primNonLeido="";
    return primNonLeido;
}
public String amosa(int k){
    String correoK="";
    return correoK;
}
public void elimina(int k){
    
}
public static int menuSelect() {
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona unha opción", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Numero de correos", "engade", "porLer", "amosa todo","amosa pos:", "elimina", "exit"}, "Sair do programa");
        return opcion + 1;
        
    }
}

