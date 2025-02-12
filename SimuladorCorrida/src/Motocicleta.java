
public class Motocicleta extends VeiculoHibrido {

    

    Motocicleta(int id){
        super(id, 0, 2, CALIBRAGEM_MOTOCICLETA);
        getPropulsor().setCilindrada(1.0f);        
    }

    boolean rodasCalibradas(){
        for (int i=0; i < 2; i++){
            if (!this.getRoda(i).getCalibrado())
                return false;
        }
        return true;
    }

    public void carregar() {
        if (this.getPropulsor().getModo() == "eletrico"){
            if(this.getNivelBateria() < 100)
                this.setNivelBateria(100);
        }
    }

    public void abastecer() {
        if (this.getPropulsor().getModo() == "combustao")
            if (this.getTanqueCombustivel() < 15.0f)
                this.setTanqueCombustivel(15.0f);
    }

    public void desenhar(int distanciaPerc){

        for(int i=0; i < distanciaPerc; i++){
            System.out.printf(" "); 

        }
        System.out.println("   ,_oo");
        for(int i=0; i < distanciaPerc; i++){
            System.out.printf(" ");            
        }
        System.out.println(".-/c-//::");
        for(int i=0; i < distanciaPerc; i++){
            System.out.printf(" ");            
        }
        System.out.println("(_)'==(_)\n\n");

    }

    public void calibrar() {
        if (!this.rodasCalibradas()){
            for(int i=0; i < 2; i++){
                if (!this.getRoda(i).getCalibrado()){
                    this.getRoda(i).setCalibrado(true);
                    this.getRoda(i).setCalibragem(CALIBRAGEM_MOTOCICLETA);
                }
            }   
        }     
    }

    public void calibrar(int i){
        if (!this.getRoda(i).getCalibrado()){
            this.getRoda(i).setCalibrado(true);
            this.getRoda(i).setCalibragem(CALIBRAGEM_MOTOCICLETA);
        }
    }

    public void mover(){
        if (this.rodasCalibradas())
            this.setDistanciaPercorrida(getDistanciaPercorrida()+2);
    }





}
