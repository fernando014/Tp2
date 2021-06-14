package app;

import java.time.LocalDate;

    public abstract class PasseStandard extends Epass {
        private Titular titular;
        private int Pontos;
        private int NumeroViagens;
        private String ChaveValida;

        public PasseStandard(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email) {
            super {
            }
            ;
            this.titular = new Titular(DocumentoiD(codigoDoc, tipoDoc), nome, ddn, email);
        }

        public PasseStandard(DocumentoiD docID, LocalDate ddn, String nome, String email) {
            super {
            }
            ;
            this.titular = new Titular(docID, nome, ddn, email);
            this.Chave = New Chave<PasseStandard> (nome, ddn, Super, getCodigo());
        }

        public PasseStandard(DocumentoiD docID, String nome, LocalDate ddn, String morada, String email, int telefone) {
            super {
            }
            ;
            this.titular = new Titular(docID, nome, ddn, morada, email, telefone);

        }

        public PasseStandard(PasseStandard pass) {


            if (pass != null) {
                this.titular = pass.titular;
                this.Pontos = pass.Pontos;
                this.NumeroViagens = pass.NumeroViagens;
                this.ChaveValida = pass.ChaveValida;
            }
        }

        public void setnome(String nome) {
            this.Nome = nome;
        }

        public void setTitular(Titular titular) {
            this.titular = titular;
        }

        public void setPontos(int pontos) {
            this.Pontos = pontos;
        }

        public void setChaveValida(String chaveValida) {
            this.ChaveValida = chaveValida;
        }


        public Titular getTitular() {
            return titular;
        }

        public int getPontos() {
            return Pontos;
        }

        public String getchave() {
            return chave;
        }

        public String getChaveValida() {
            return ChaveValida;
        }

        public void pagarVigemComPontos(int pontosViagem) {
        }
    }







