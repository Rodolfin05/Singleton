package padraosingleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarNomeMusica() {
        Parametros.getInstance().setNomeMusica("Bohemian Rhapsody");
        assertEquals("Bohemian Rhapsody", Parametros.getInstance().getNomeMusica());
    }

    @Test
    public void deveRetornarNomeCantor() {
        Parametros.getInstance().setNomeCantor("Queen");
        assertEquals("Queen", Parametros.getInstance().getNomeCantor());
    }

    @Test
    public void deveRetornarLancamento() {
        Parametros.getInstance().setAnoLancamento(1975);
        assertEquals(1975, Parametros.getInstance().getAnoLancamento());
    }
}
