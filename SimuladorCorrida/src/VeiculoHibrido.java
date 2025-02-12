public abstract class VeiculoHibrido extends Veiculo implements reabastecivel, recarregavel {
    private Motor propulsor;
    private float tanqueCombustivel;
    private int nivelBateria;

    public VeiculoHibrido(int id, int distPerc, int quantidadeRodas, float VALOR_CALIBRAGEM){
        super(id, distPerc, quantidadeRodas, VALOR_CALIBRAGEM);
        propulsor = new Motor(this);
    }


    public int getNivelBateria(){
        if (this.getPropulsor().getModo() == "eletrico")
            return nivelBateria;
        else return 0;    
    }

    public float getTanqueCombustivel(){
        if (this.getPropulsor().getModo() == "combustao")
            return tanqueCombustivel;
        else return 0; 
    }

    public Motor getPropulsor() {
        return propulsor;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public void setTanqueCombustivel(float tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }


}
