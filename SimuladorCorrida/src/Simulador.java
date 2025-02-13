public class Simulador {
    private Veiculo[] veiculos;
    private static final int MAX_VEICULOS = 10;
    
    public Simulador() {
        veiculos = new Veiculo[MAX_VEICULOS];
    }
    
    public void incluirVeiculo(Veiculo v, int index) {
        if (index >= 0 && index < MAX_VEICULOS) {
            veiculos[index] = v;
        }
    }
    
    public void moverVeiculos() {
        for (Veiculo v : veiculos) {
            if (v != null) {
                v.mover();
            }
        }
    }
    
    public void imprimirPista() {
        for (Veiculo v : veiculos) {
            if (v != null) {
                v.desenhar(v.getDistanciaPercorrida());
            }
        }
    }
}
