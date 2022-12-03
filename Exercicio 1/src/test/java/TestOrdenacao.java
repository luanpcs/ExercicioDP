import ordens.BubbleSort;
import ordens.InsertionSort;
import ordens.Ordenacao;
import ordens.SelectionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestOrdenacao
{
    Ordenacao ordenacao;

    int[] array;
    int[] expected;

    @Before
    void inicializaDadosParaTestes()
    {
        array = {9, 3, 4, 5, 6};
        expected = {3, 4, 5, 6, 9};
    }

    @Test
    public void testSelectionSort()
    {
        ordenacao = new SelectionSort();
        int[] resultadoAlg = ordenacao.executaOrdenacao(array);
        assertArrayEquals(resultadoAlg, expected);
    }

    @Test
    public void testBubbleSort()
    {
        ordenacao = new BubbleSort();
        int[] resultadoAlg = ordenacao.executaOrdenacao(array);
        assertArrayEquals(resultadoAlg, expected);
    }

    @Test
    public void testInsertionSort()
    {
        ordenacao = new InsertionSort();
        int[] resultadoAlg = ordenacao.executaOrdenacao(array);
        assertArrayEquals(resultadoAlg, expected);
    }
}
