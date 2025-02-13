public class usaSimulador {
    public static void main(String[] args) {
        Simulador sim = new Simulador();
        sim.incluirVeiculo(new Bicicleta(1), 0);
        sim.incluirVeiculo(new Motocicleta(2), 1);
        sim.incluirVeiculo(new CarroEsportivo(3), 2);
        sim.moverVeiculos();
        sim.imprimirPista();
    }
}
