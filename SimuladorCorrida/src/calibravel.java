public interface calibravel {

    public static float calibragemPneuBicicleta(){ return 1.23f; }
    public static float calibragemPneuMotocicleta(){ return 31.5f; }
    public static float calibragemPneuCarroPasseio(){ return 32.3f; }
    public static float calibragemPneuCarroEsportivo(){ return 38.7f; }


    void calibrar(); //calibra todos os pneus descalibrados

    void calibrar(int i); // calibra o pneu do indice passado por parametro

}
