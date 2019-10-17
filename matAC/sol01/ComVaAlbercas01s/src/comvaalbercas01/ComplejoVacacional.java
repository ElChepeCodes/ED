/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comvaalbercas01;

/**
 *
 * @author estructuras00
 */
public class ComplejoVacacional {
    private String nomCom;
    private int numAlb;
    private final int MAX = 10;
    private Rectangulo albercas[];
    
    // Constructor
    public ComplejoVacacional(String nomComp) {
        nomCom = nomComp;
        albercas = new Rectangulo[MAX];
        numAlb = 0;
    }
    
    //ALTAS y CALCULOS
    public boolean altaAlberca(Rectangulo rectan) {
        boolean resp;
        if(numAlb < MAX) {    //agregando una alberca
            albercas[numAlb] = rectan;
            numAlb++;
            resp = true;
        } else {
            resp = false;
        }
        return resp;
    }
    
    // Total de metros cuadrados de lona para todas las albercas
    public double totalLona() {
        double mts2;
        mts2 = 0.0;
        for(int i = 0; i<numAlb; i++) {
            mts2 = mts2 + albercas[i].calculaArea();
        }
        return mts2;
    }
    
    //Total de metros lineales de cerca
    public double totalCerca() {
        double mts;
        mts = 0.0;
        for(int i = 0; i<numAlb; i++) {
            mts = mts + albercas[i].calculaPerimetro();
        }
        return mts;
    }    
    
}
