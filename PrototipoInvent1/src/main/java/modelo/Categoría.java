/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jd_6
 */
public enum Categoría {

    ABARROTES, LACTEOS, BEBESTIBLES, CARNES, FRUTAS, VERDURAS;

    public static Categoría getABARROTES() {
        return ABARROTES;
    }

    public static Categoría getLACTEOS() {
        return LACTEOS;
    }

    public static Categoría getBEBESTIBLES() {
        return BEBESTIBLES;
    }

    public static Categoría getCARNES() {
        return CARNES;
    }

    public static Categoría getFRUTAS() {
        return FRUTAS;
    }

    public static Categoría getVERDURAS() {
        return VERDURAS;
    }
}
