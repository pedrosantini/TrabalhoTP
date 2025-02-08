public abstract class Veiculo implements calibravel, desenhavel {
    private int id;
    private int distanciaPercorrida;
    private Roda[] rodas;
    private int quantidadeRodas;

    public Veiculo(int id, int distPerc, int quantidadeRodas){
        this.id = id;
        this.distanciaPercorrida = distPerc;
        this.rodas = new Roda[quantidadeRodas];
    }

    abstract void mover();

    public String toString(){
        return id +" "+ distanciaPercorrida +" "+ quantidadeRodas +" ";
    }
    
    abstract void desenhar();
}
