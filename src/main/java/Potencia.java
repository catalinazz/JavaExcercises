/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EducaciónIT
 */
public class Potencia extends Operacion {
    @Override
    public Double operar() {
        return Math.pow(getOperandoA(), getOperandoB());
    
}
}