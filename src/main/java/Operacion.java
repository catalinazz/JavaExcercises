/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EducaciónIT
 */
public abstract class Operacion {
    
    private Double operandoA;
    private Double operandoB;

    public void setOperandoA(Double operandoA) {
        this.operandoA = operandoA;
    }

    public void setOperandoB(Double operandoB) {
        this.operandoB = operandoB;
    }
    
    public abstract Double operar();

    public Double getOperandoA() {
        return operandoA;
    }

    public Double getOperandoB() {
        return operandoB;
    }
    
}
