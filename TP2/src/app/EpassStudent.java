package app;

import java.util.ArrayList;


public abstract class EpassStudent extends PasseStandard implements TituloTransporte {
    private int ano;
    private String escola;
    private ArrayList<Zona> zonas;

    public EpassStudent(int ano,String escola){
        this.ano=ano;this.escola=escola;
    }
    public EpassStudent(EpassStudent outro){
        this.ano= outro.getAno();this.escola=outro.escola;this.zonas=outro.getZonas();
    }

    public int getAno() {
        return ano;
    }

    public String getEscola() {
        return escola;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void addzona(String nome){}

    public void addzona(Zona zonaViagem){}


    public void carregar(double n){}

    public void pagarViagem(double n){}


    public boolean checkValidade(){
        boolean x= true;
        return x;
    }


     public boolean passarSaldo(double PasseStandard){
        boolean x= true;
        return x;
     }

}

