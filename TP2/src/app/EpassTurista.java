package app;

import java.time.LocalDate;

public class EpassTurista extends EpasseSazonal implements CartãoPagamento,TituloTransporte{
      duracao duracao

    EpassTurista(EpassTurista turista){
        this.duracao= turista.duracao;
    }

     EpassTurista(duracao duracao){
        this.duracao=duracao;
    }

    public duracao getDuracao(){
        return duracao;
    }

    public void creditar(double valor){
        if(valor==1)
            super.SetSaldo(500);
        else if(valor==3)super.SetSaldo(700); else if(valor==7)super.SetSaldo(1400);
    }


    public boolean pagar(double valor){
        boolean pv= true;
        return pv;
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
        if(super.GetDataValida().compareTo(LocalDate.now())<0) {
            return x=true;
        }
        else return x=false;


    }
    public boolean passarSaldo(double PasseStandard){
        boolean x= true;
        return x;
    }
}

