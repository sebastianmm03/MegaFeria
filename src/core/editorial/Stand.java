/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.editorial;

import java.util.ArrayList;

/**
 *
 * @author asmercado
 */
public class Stand {
    
    private int id;
    private double precio;
    private ArrayList<Editorial> editoriales;

    public Stand(int id, double precio, ArrayList<Editorial> editoriales) {
        this.id = id;
        this.precio = precio;
        this.editoriales = editoriales;
    }
    
    
}
