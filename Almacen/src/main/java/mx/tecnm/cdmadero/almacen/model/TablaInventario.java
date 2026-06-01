/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.tecnm.cdmadero.almacen.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Fernando Manzanares
 */
public class TablaInventario extends AbstractTableModel {
    
    List<Producto> productos;

    public TablaInventario() {
        this.productos = new ArrayList<>();
    }
    
    

    @Override
    public int getRowCount() {
        return this.productos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0)
            return this.productos.get(rowIndex).nombre;
                    else return this.productos.get(rowIndex).existencia;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) return "Nombre del producto";
        else return "Existencia";
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return  columnIndex == 0? true : false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                this.productos.get(rowIndex).nombre = (String)aValue;
        }
        
        
    }
    
    

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
   
    
    
}
