import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FilmeTest {

    @Test
    void deveRetornarExcecaoFilmeSemDuracao(){
        try{
            Filme filme = new Filme();
            filme.getDuracao();
            fail();
        }
        catch (NullPointerException exception){
            assertEquals("Não há roteiro", exception.getMessage());
        }
    }

    @Test
    void deveRetornarDuracaoFilme(){

        Cena cena1 = new Cena("Primeira cena");
        Cena cena2 = new Cena("Segunda Cena");

        Corte corte11 = new Corte("Era uma vez uma princesa", 180);
        Corte corte21 = new Corte("Os habitantes de um vilarejo saem atrás de um ogro", 200);
        Corte corte22 = new Corte("Chegada dos habitantes no pântano do ogro", 20);

        cena1.addCena(corte11);
        cena2.addCena(corte21);
        cena2.addCena(corte22);

        Cena roteiro = new Cena("Roteiro Shrek");
        roteiro.addCena(cena1);
        roteiro.addCena(cena2);

        Filme filme = new Filme();
        filme.setRoteiro(roteiro);

        assertEquals(400, filme.getDuracao());
    }

    @Test
    void deveRetornarRoteiroFilme(){
        Cena cena1 = new Cena("Primeira Cena");
        Cena cena2 = new Cena("Segunda Cena");

        Corte corte11 = new Corte("Era uma vez uma princesa", 180);
        Corte corte21 = new Corte("Os habitantes de um vilarejo saem atrás de um ogro", 200);
        Corte corte22 = new Corte("Chegada dos habitantes no pântano do ogro", 20);

        cena1.addCena(corte11);
        cena2.addCena(corte21);
        cena2.addCena(corte22);

        Cena roteiro = new Cena("Roteiro Shrek");
        roteiro.addCena(cena1);
        roteiro.addCena(cena2);

        Filme filme = new Filme();
        filme.setRoteiro(roteiro);

        assertEquals(
                "Cena: Roteiro Shrek\n" +
                "Cena: Primeira Cena\n" +
                "- Corte: Era uma vez uma princesa\n" +
                "Cena: Segunda Cena\n" +
                "- Corte: Os habitantes de um vilarejo saem atrás de um ogro\n" +
                "- Corte: Chegada dos habitantes no pântano do ogro\n"
                ,
                filme.getRoteiro()
        );
    }
}
