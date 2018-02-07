/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja07agendaclase;

/**
 *
 * @author joshu
 */
public class Cita {
    private int hora;
    private int minutos;
    private String titulo;
    private String texto;
    
    Cita(){
        
    }
    
    Cita(int h, int m, String tit, String txt){
        this.hora = h;
        this.minutos = m;
        this.titulo = tit;
        this.texto = txt;
    }
    
    public String leerCita(){
        StringBuilder st = new StringBuilder();
        
        st.append("").append(this.getHora()).append(":").append(this.getMinutos()).append(" - ");
        st.append(this.getTitulo()).append("\n");
        st.append(this.getTexto()).append("\n\n");
        
        return st.toString();
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
