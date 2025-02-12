public class Bicicleta extends Veiculo {

    Bicicleta(int id){
        super(id, 0, 2, CALIBRAGEM_BICICLETA);
    } 
    
    public void mover(){
        if (this.rodasCalibradas())
            this.setDistanciaPercorrida(getDistanciaPercorrida()+1);
    }

    boolean rodasCalibradas(){
        for (int i=0; i < 2; i++){
            if (!this.getRoda(i).getCalibrado())
                return false;
        }
        return true;
    }

    public void desenhar(int distanciaPerc){

        for(int i=0; i < distanciaPerc; i++){
            System.out.printf(" "); 

        }
        System.out.println("   __o");
        for(int i=0; i < distanciaPerc; i++){
            System.out.printf(" ");            
        }
        System.out.println(" _`\\<,_");
        for(int i=0; i < distanciaPerc; i++){
            System.out.printf(" ");            
        }
        System.out.println("(*)/ (*)\n\n");

    }



    public void calibrar() {
        if (!this.rodasCalibradas()){
            for(int i=0; i < 2; i++){
                if (!this.getRoda(i).getCalibrado()){
                    this.getRoda(i).setCalibrado(true);
                    this.getRoda(i).setCalibragem(CALIBRAGEM_BICICLETA);
                }
            }   
        }     
    }

    public void calibrar(int i){
        if (!this.getRoda(i).getCalibrado()){
            this.getRoda(i).setCalibrado(true);
            this.getRoda(i).setCalibragem(CALIBRAGEM_BICICLETA);
        }
    }
}

// falta a parte gráfica;
