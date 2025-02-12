public class Simulador {

    public static void main(String[] args) {
        Bicicleta b = new Bicicleta(0);

        //b.desenhar(25);
        System.out.println(b.getRoda(0).getCalibrado());
        System.out.println(b.getRoda(0).getCalibragem());
        
        if (!b.getRoda(0).getCalibrado())
            b.calibrar();
        
        System.out.println(b.getRoda(0).getCalibrado());
        System.out.println(b.getRoda(0).getCalibragem());


    }
    
}
