/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civitas;
import java.util.ArrayList;
/**
 *
 * @author andrespiqueras
 */
public class Tablero {
    private int numCasillaCarcel;
    private int porSalida;
    private ArrayList<Casilla> casillas;
    private boolean Juez;
   
    
    public void setnumCasillaCarcel(int numCasillaCarcel){
        this.numCasillaCarcel=numCasillaCarcel;
    }
}

