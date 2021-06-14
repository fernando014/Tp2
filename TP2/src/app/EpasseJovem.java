package app;

import java.time.LocalDate;

public class EpassJovem extends PasseStandard implements TituloTransporte
{
    protected void clone(PasseStandard pass) {
    }

    public void carregar(double n){
        super.SetSaldo(n);
    }
    public void pagarViagem(double n){

        if(super.GetSaldo() <0)
            System.out.println("Sem Saldo");
        else
             super.PagarSaldO(); }

    public boolean checkValidade(){
        boolean x;
        if(super.GetDataValida().Compareto(LocalDate.now())<0) {
            return x=true;
        }
        else return x=false;
    }

    public boolean passarSaldo(double PassStandard){
        boolean x= true;
        return x;
    }
}

