/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mhg
 */

public class TipoOperacionIncorrectaException extends Exception {
    
    private String tipoOperacion;

    public TipoOperacionIncorrectaException(String tipoOperacion) {
        super("Tipo de operacion incorreta: " + tipoOperacion);
        this.tipoOperacion = tipoOperacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

}
