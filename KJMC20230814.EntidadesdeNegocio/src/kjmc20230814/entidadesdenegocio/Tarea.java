/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kjmc20230814.entidadesdenegocio;

/**
 *
 * @author kevin
 */
public class Tarea {
 
    private int id;
    private String descripcionTarea;
    private boolean statusTarea;

    public Tarea() {
    }

    public Tarea(int id, String descripcionTarea, boolean statusTarea) {
        this.id = id;
        this.descripcionTarea = descripcionTarea;
        this.statusTarea = statusTarea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public boolean isStatusTarea() {
        return statusTarea;
    }

    public void setStatusTarea(boolean statusTarea) {
        this.statusTarea = statusTarea;
    }
    
    
}
