public abstract class Roteiro {

    private String nome;

    public Roteiro(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Integer getDuracao();
    public abstract String getRoteiro();

}
