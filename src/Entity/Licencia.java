package Entity;
// Generated 21/10/2018 17:24:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Licencia generated by hbm2java
 */
public class Licencia  implements java.io.Serializable {


     private int numerolicencia;
     private Categorialicencia categorialicencia;
     private Claselicencia claselicencia;
     private Titular titular;
     private Usuario usuario;
     private Date fechaemision;
     private Date horaemision;
     private Short vigencia;
     private String observacion;
     private boolean vigente;
     private Date fechavencimiento;

    public Licencia() {
    }

	
    public Licencia(int numerolicencia, Categorialicencia categorialicencia, Titular titular, Usuario usuario, Date fechaemision, Date horaemision, boolean vigente, Date fechavencimiento) {
        this.numerolicencia = numerolicencia;
        this.categorialicencia = categorialicencia;
        this.titular = titular;
        this.usuario = usuario;
        this.fechaemision = fechaemision;
        this.horaemision = horaemision;
        this.vigente = vigente;
        this.fechavencimiento = fechavencimiento;
    }
    public Licencia(int numerolicencia, Categorialicencia categorialicencia, Claselicencia claselicencia, Titular titular, Usuario usuario, Date fechaemision, Date horaemision, Short vigencia, String observacion, boolean vigente, Date fechavencimiento) {
       this.numerolicencia = numerolicencia;
       this.categorialicencia = categorialicencia;
       this.claselicencia = claselicencia;
       this.titular = titular;
       this.usuario = usuario;
       this.fechaemision = fechaemision;
       this.horaemision = horaemision;
       this.vigencia = vigencia;
       this.observacion = observacion;
       this.vigente = vigente;
       this.fechavencimiento = fechavencimiento;
    }
   
    public int getNumerolicencia() {
        return this.numerolicencia;
    }
    
    public void setNumerolicencia(int numerolicencia) {
        this.numerolicencia = numerolicencia;
    }
    public Categorialicencia getCategorialicencia() {
        return this.categorialicencia;
    }
    
    public void setCategorialicencia(Categorialicencia categorialicencia) {
        this.categorialicencia = categorialicencia;
    }
    public Claselicencia getClaselicencia() {
        return this.claselicencia;
    }
    
    public void setClaselicencia(Claselicencia claselicencia) {
        this.claselicencia = claselicencia;
    }
    public Titular getTitular() {
        return this.titular;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaemision() {
        return this.fechaemision;
    }
    
    public void setFechaemision(Date fechaemision) {
        this.fechaemision = fechaemision;
    }
    public Date getHoraemision() {
        return this.horaemision;
    }
    
    public void setHoraemision(Date horaemision) {
        this.horaemision = horaemision;
    }
    public Short getVigencia() {
        return this.vigencia;
    }
    
    public void setVigencia(Short vigencia) {
        this.vigencia = vigencia;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public boolean isVigente() {
        return this.vigente;
    }
    
    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
    public Date getFechavencimiento() {
        return this.fechavencimiento;
    }
    
    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }




}


