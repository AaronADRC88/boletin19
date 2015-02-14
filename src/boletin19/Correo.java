package boletin19;

import java.util.ArrayList;

public class Correo {

    private String contido;
    private boolean leido;

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

    @Override
    public String toString() {
        String yes = "Si";
        String no = "Non";
        String resposta;
        if (leido) {
            resposta = yes;
        } else {
            resposta = no;
        }
        return "Correo " + contido + "\n leido: " + resposta;
    }

}
