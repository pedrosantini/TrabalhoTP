public abstract class VeiculoHibrido extends Veiculo implements reabastecivel, recarregavel {
    private Motor propulsor;
    private float tanqueCombustivel;
    private int nivelBateria;
    private String tipo;
    private final String pass = "carro Passeio";
    private final String esp = "carro Esportivo";
    private final String moto = "motocicleta";

    public VeiculoHibrido(int id, int distPerc, int quantidadeRodas){
        super(id, distPerc, quantidadeRodas);
    }


    abstract int getNivelBateria();

    abstract float getTanqueCombustivel();

    public String getTipo() {
        return tipo;
    }; // para saber qual é o tipo do veículo (esportivo, motocicleta ou passeio)

    public String getEsp() {
        return esp;
    }

    public String getPass() {
        return pass;
    }

    public String getMoto() {
        return moto;
    }


}
