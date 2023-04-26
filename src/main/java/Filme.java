public class Filme {


    private Roteiro roteiro;

    public void setRoteiro(Roteiro roteiro) {
        this.roteiro = roteiro;
    }

    public Integer getDuracao(){
        if (this.roteiro == null){
            throw new NullPointerException("Não há roteiro");
        }
        return this.roteiro.getDuracao();
    }

    public String getRoteiro(){
        if(this.roteiro == null) {
            throw new NullPointerException("Não há roteiro");
        }
        return this.roteiro.getRoteiro();
    }
}
