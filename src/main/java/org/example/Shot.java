package org.example;

public class Shot extends Coctel{

    private String tipoLicor;

    public Shot() {
    }

    public Shot(String nombre, Long precio, String tipoLicor) {
        super(nombre, precio);
        this.tipoLicor = tipoLicor;
    }


}
