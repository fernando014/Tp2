package app;

import java.time.LocalDate;

public class Titular {

    private DocumentoiD docID;
    private String nome;
    private LocalDate ddn;
    private String morada;
    private String email;
    private int Telemovel;

    Titular(String codigoDoc,TipoDocumento tipoDoc,String nome,LocalDate ddn,String email )
    {
        this.nome=nome;this.ddn=ddn;this.setEmail(email);this.docID= new DocumentoiD(codigoDoc,tipoDoc);}

    Titular(DocumentoiD docID,String nome,LocalDate ddn, String email ) {
        this.nome = nome;this.ddn = ddn;this.setEmail(email);this.docID = docID;

    }
    Titular(DocumentoiD docID,String nome,LocalDate ddn, String morada, int telemovel ) {
        this.nome = nome;this.ddn = ddn;this.setMorada(morada);this.setEmail(email);this.docID = docID;this.setTelemovel(Telemovel);
    }

    public DocumentoiD getDocID() {
        return docID;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDdn() {
        return ddn;
    }

    public String getMorada() {
        return morada;
    }

    public String getEmail() {
        return email;
    }

    public int getTelemovel() {
        return Telemovel;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelemovel(int telemovel)
    {
        this.Telemovel = telemovel;
    }
}

