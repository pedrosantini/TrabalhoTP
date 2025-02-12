public interface calibravel {

    float CALIBRAGEM_BICICLETA = 1.23f;
    float CALIBRAGEM_MOTOCICLETA = 31.5f;
    float CALIBRAGEM_CARRO_PASSEIO = 32.3f;
    float CALIBRAGEM_CARRO_ESPORTIVO = 38.7f;


    void calibrar(); //calibra todos os pneus descalibrados

    void calibrar(int i); // calibra o pneu do indice passado por parametro

    

}
