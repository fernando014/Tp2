package app;
public interface CartãoPagamento {
    boolean pagar (double valor);
    void creditar (double valor);
}
