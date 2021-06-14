package app;

import java.time.LocalDate;

public class Ticket {

    private String numero;
    private LocalDate data;
    String nome;

    public Ticket(String nome, String numero, LocalDate data ){
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setData(LocalDate data)
    {
        this.data = data;
    }
}

