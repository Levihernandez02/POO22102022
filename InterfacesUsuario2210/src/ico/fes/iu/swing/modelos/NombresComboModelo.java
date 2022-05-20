/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu.swing.modelos;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author brain
 */
public class NombresComboModelo implements ComboBoxModel<String>{
    //Los metodos de esta clase seran invocados de forma AUTOMATICA por el objeto de la vista, en este caso un JComboBox, nosotros 
    //como programadores proporcionaremos la informacion que reuqiere la vista para mostrarles la infoormacion al usuaria.
    
    private ArrayList<String> datos;
    private String selectedItem;

    public NombresComboModelo() {
    }

    public NombresComboModelo(ArrayList<String> datos, String selectedItem) {
        this.datos = datos;
        this.selectedItem = selectedItem;
    }

    public ArrayList<String> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<String> datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "NombresComboModelo{" + "datos=" + datos + ", selectedItem=" + selectedItem + '}';
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selectedItem =(String)o;
    }

    @Override
    public int getSize() {
       return datos.size();
    }

    @Override
    public String getElementAt(int i) {
       return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }

    @Override
    public Object getSelectedItem() {
        return this.selectedItem;
    }  
    
    public void addNombre (String nombre){
        datos.add(nombre);
    }
}
