package Entity;
// Generated 21/10/2018 17:24:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Nacionalidad generated by hbm2java
 */
public class Nacionalidad  implements java.io.Serializable {


     private int idnacionalidad;
     private String nacionalidad;
     private Set titulars = new HashSet(0);

    public Nacionalidad() {
    }

	
    public Nacionalidad(int idnacionalidad, String nacionalidad) {
        this.idnacionalidad = idnacionalidad;
        this.nacionalidad = nacionalidad;
    }
    public Nacionalidad(int idnacionalidad, String nacionalidad, Set titulars) {
       this.idnacionalidad = idnacionalidad;
       this.nacionalidad = nacionalidad;
       this.titulars = titulars;
    }
   
    public int getIdnacionalidad() {
        return this.idnacionalidad;
    }
    
    public void setIdnacionalidad(int idnacionalidad) {
        this.idnacionalidad = idnacionalidad;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public Set getTitulars() {
        return this.titulars;
    }
    
    public void setTitulars(Set titulars) {
        this.titulars = titulars;
    }




}


