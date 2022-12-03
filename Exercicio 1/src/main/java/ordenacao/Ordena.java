package ordens;

import ordens.Ordem;

public abstract class Ordena
{
    protected Ordena ordenacaoAtual;

    public int[] realizaOrdenacao (int[] array)
    {
        return ordenacaoAtual.executaOrdenacao(array);
    }

    public void setOrdenacaoAtual(Ordem ordenacaoEscolhida) {
        this.ordenacaoAtual = ordenacaoAtual;
    }
    
    public Ordem getOrdenacaoAtual() {
        return ordenacaoAtual;
    }

}
