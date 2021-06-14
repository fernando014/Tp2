package app;

import java.time.LocalDate;

public class EpassFuncionario extends PasseStandard implements TituloTransporte{


    public void carregar(double n){
        super.SetSaldo(n);
    }

    public void pagarViagem(double n){

        if(super.GetSaldo()<0)
            System.out.println("Sem Saldo");
        else
            return Pagar();
    }


    public boolean checkValidade(){
        boolean x;
        if(super.GetDataValida().compareTo(LocalDate.now())<0){
            return x=true;
        }else return x=false;


    }
    public boolean passarSaldo(double PassStandard){
        boolean x= true;
        return x;
    }


}

