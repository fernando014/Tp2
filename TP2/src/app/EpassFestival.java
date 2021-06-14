package app;

import java.time.LocalDate;

public class EpassFestival extends EpasseSazonal implements TituloTransporte{


    private double saldoCartaoPgmt;
    private String nomeEvento;

    EpassFestival(double saldo,String evento){
        setNomeEvento(evento);
        setSaldoCartaoPgmt(saldo);
    }

    EpassFestival(String evento){
        setNomeEvento(evento);
    }

    EpassFestival(EpassFestival outro){
        setSaldoCartaoPgmt(outro.GetSaldo());
        setNomeEvento(outro.getNomeEvento());
    }

    public void carregar(double n){
        super.SetSaldo(n);
    }
    public void pagarViagem(double n){

        if(super.GetSaldo()<0)
            System.out.println("Sem Saldo");
        else
            super.Pagar();
    }
    public boolean checkValidade(){
        boolean x;
        if(super.getDataValida().compareTo(LocalDate.now())<0){
            return x=true;
        }else return x=false;


    }
    public boolean passarSaldo(double PassStandard){
        boolean x= true;
        return x;
    }

    public void setSaldoCartaoPgmt(double saldoCartaoPgmt) {
        this.saldoCartaoPgmt = saldoCartaoPgmt;
    }


    public double getSaldoCartaoPgmt() {
        return saldoCartaoPgmt;
    }


    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
}


