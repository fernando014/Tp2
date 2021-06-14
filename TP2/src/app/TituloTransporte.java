package app;

public interface TituloTransporte {

    public void Carregar(double n);
    public void PagarViagem(double n);
    public boolean CheckValidade();
    public boolean PassaSaldo(double PassStandard);


}

