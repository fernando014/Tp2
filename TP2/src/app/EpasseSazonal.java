package app;

import java.time.LocalDate;

    public abstract class EpasseSazonal extends Epass {
        private String chaveValida;

        public EpasseSazonal() {
        }

        public void setChaveValida(String chaveValida) {
            this.chaveValida = chaveValida;
        }

        public String getChaveValida()
        {
            return chaveValida;
        }
    }
