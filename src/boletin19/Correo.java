package boletin19;

import java.util.ArrayList;

public class Correo {
String contido;
boolean leido;
ArrayList <Correo> eMail=new ArrayList<Correo>();

    public Correo(String contido, boolean leido) {
        this.contido = contido;
        this.leido = leido;
    }

    public Correo() {
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public ArrayList<Correo> geteMail() {
        return eMail;
    }

    public void seteMail(ArrayList<Correo> eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Correo{" + "contido=" + contido + ", leido=" + leido + '}';
    }
  
}
