/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EducaciónIT
 */
public class Multiplicacion extends Operacion {
    @Override
    public Double operar() {
        return getOperandoA() * getOperandoB();
    }
    
}
