import java.util.ArrayList;
import java.util.List;

public class Cena extends Roteiro {

    private List<Roteiro> cenas;

    public Cena(String nome){
        super(nome);
        this.cenas = new ArrayList<Roteiro>();
    }

    public void addCena(Roteiro roteiro){
        this.cenas.add(roteiro);
    }

    public Integer getDuracao(){

        Integer duracao = 0;
        for(Roteiro cena : cenas){
            duracao += cena.getDuracao();
        }

        return duracao;
    }

    public String getRoteiro(){
        String roteiro = "";
        roteiro = "Cena: " + this.getNome() + "\n";

        for(Roteiro cena : cenas){
            roteiro += cena.getRoteiro();
        }

        return roteiro;
    }
}
