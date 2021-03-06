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
public class Agenda {
    private int anyo;
    private Pagina[] paginas = new Pagina[365];
    public Pagina abierta;

    Agenda(){
        
    }

    Agenda(int anyo) {
        this.anyo = anyo;
        if(this.anyo % 4 == 0){
            inicializa(true);
        }else inicializa(false);
    }
    
    private void inicializa(boolean b){
        this.paginas = new Pagina[b ? 366 : 365];
        int dia = 0;
        for(int i = 1; i <=31; i++){
            paginas[dia++] = new Pagina(i, 1);
        }
        for(int i = 1; i <= (b ? 29 : 28); i++){
            paginas[dia++] = new Pagina(i, 2);
        }
        for(int i = 1; i <= 31; i++){
            paginas[dia++] = new Pagina(i, 3);
        }
        for(int i = 1; i <= 30; i++){
            paginas[dia++] = new Pagina(i, 4);
        }
        for(int i = 1; i <= 28; i++){
            paginas[dia++] = new Pagina(i, 5);
        }
    }
     
    public Pagina buscarPagina(int dia, int mes){
        Pagina busqueda = null, temp;
        int cont = 0;
        boolean encontrado = false;
        
        while(cont < paginas.length && encontrado == false){
            temp = paginas[cont++];
            if(temp.getDia() == dia && temp.getMes() == mes){
                busqueda = temp;
                encontrado = true;
            }
        }
        
        return busqueda;
    }
    
    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Pagina[] getPaginas() {
        return paginas;
    }

    public void setPaginas(Pagina[] paginas) {
        this.paginas = paginas;
    }

    public Pagina getAbierta() {
        return abierta;
    }

    public void setAbierta(Pagina abierta) {
        this.abierta = abierta;
    }
    
}
