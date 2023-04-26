public class Corte extends Roteiro{

    private Integer duracao;

    public Corte(String nome, Integer duracao){
        super(nome);
        this.duracao = duracao;
    }

    public Integer getDuracao(){
        return duracao;
    }

    public void setDuracao(Integer duracao){
        this.duracao = duracao;
    }

    public String getRoteiro(){
        return "- Corte: " + this.getNome() + "\n";
    }
}
