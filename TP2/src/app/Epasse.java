package app;

import java.time.LocalDate;

public abstract class Epass {

    private long codigo;
    private double precoViagem;
    private double saldo;
    private LocalDate dataCarrega;
    private LocalDate dataValida;


    public Epass(double precoViagem, double saldo)
    {
        this.precoViagem = precoViagem;this.saldo = saldo;
    }

    public Epass(double precoViagem)
    {
        this.precoViagem = precoViagem;
    }

    public Epass(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida)
    {
        this.saldo = saldo;this.precoViagem = precoViagem;this.dataCarrega = dataCarrega;this.dataValida = dataValida;
    }

    public Epass(double saldo, LocalDate dataCarrega) {
        this.saldo = saldo;this.dataCarrega = dataCarrega;
    }


    public long getCodigo() {
        return this.codigo;
    }

    public LocalDate GetDataCarrega() {
        return this.dataCarrega;
    }

    public double GetPrecoViagem() {
        return this.precoViagem;
    }

    public double GetSaldo() {
        return this.saldo;
    }

    public LocalDate getDataValida()
    {
        return this.dataValida;
    }

    public void SetSaldo (double saldo) {
        this.saldo = saldo;
    }

    public void setPrecoViagem (double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public void setDataValida (LocalDate dataValida) {
        this.dataValida = dataValida;
    }

    public void setDataCarrega (LocalDate dataCarrega) {
        this.dataCarrega = dataCarrega;
    }


    public String toString() {
        return "Epass{" + "codigo=" + codigo + ", saldo=" + saldo + ", precoViagem=" + precoViagem + ", dataCarrega=" + dataCarrega + ", dataValida=" + dataValida + '}';
    }

    public boolean equals(Epass outro){
        boolean x=true;
        return  x;
    }

}



