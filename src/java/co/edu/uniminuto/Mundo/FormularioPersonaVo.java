/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.uniminuto.Mundo;

/**
 *
 * @author Alejandro Gonzalez
 */
public class FormularioPersonaVo {
    
    private String val1;
    private String val2;
    
    public FormularioPersonaVo(String nNombre, String nPass){
        val1 = nNombre;
        val2 = nPass;
    }

    public FormularioPersonaVo()
    {
        
    }
    
    public String getVal1() {
        return val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public void setSigno(String cedula){
        this.val2 = cedula; 
    }
    
}
