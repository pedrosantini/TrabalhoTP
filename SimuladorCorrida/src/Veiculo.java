public abstract class Veiculo implements calibravel, desenhavel {
    private int id;
    private int distanciaPercorrida;
    private Roda[] rodas;
    private int quantidadeRodas;

    public Veiculo(int id, int distPerc, int quantidadeRodas, float VALOR_CALIBRAGEM){
        this.id = id;
        this.distanciaPercorrida = distPerc;
        this.rodas = new Roda[quantidadeRodas];

        for (int i=0; i < quantidadeRodas; i++){
            this.rodas[i] = new Roda(VALOR_CALIBRAGEM);
        }
    }

    abstract void mover();

    abstract boolean rodasCalibradas();

    public String toString(){
        return id +" "+ distanciaPercorrida +" "+ quantidadeRodas +" ";
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public int getId() {
        return id;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public Roda getRoda(int i){
        return this.rodas[i];
    }
}
