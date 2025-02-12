public class CarroEsportivo extends VeiculoHibrido {

    CarroEsportivo(int id){
        super(id, 0, 4, CALIBRAGEM_CARRO_ESPORTIVO);
        getPropulsor().setCilindrada(2.0f);        
    }

    boolean rodasCalibradas(){
        for (int i=0; i < 4; i++){
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
            if (this.getTanqueCombustivel() < 45.0f)
                this.setTanqueCombustivel(45.0f);
    }

    public void desenhar(int distanciaPerc){

        for(int i=0; i < distanciaPerc; i++){
            System.out.printf(" "); 

        }
        System.out.println("    _______ ");
        for(int i=0; i < distanciaPerc; i++){
            System.out.printf(" ");            
        }
        System.out.println("  _/\\\\______\\\\\\\\__");
        for(int i=0; i < distanciaPerc; i++){
            System.out.printf(" ");            
        }
        System.out.println("/ ,-. -|-  ,-.`-. ");
        for(int i=0; i < distanciaPerc; i++){
            System.out.printf(" ");            
        }
        System.out.println(" `( o )----( o )-'");
        for(int i=0; i < distanciaPerc; i++){
            System.out.printf(" ");            
        }
        System.out.println("   `-'      `-'  \n\n");
        
    }

    public void calibrar() {
        if (!this.rodasCalibradas()){
            for(int i=0; i < 4; i++){
                if (!this.getRoda(i).getCalibrado()){
                    this.getRoda(i).setCalibrado(true);
                    this.getRoda(i).setCalibragem(CALIBRAGEM_CARRO_ESPORTIVO);
                }
            }   
        }     
    }

    public void calibrar(int i){
        if (!this.getRoda(i-1).getCalibrado()){
            this.getRoda(i-1).setCalibrado(true);
            this.getRoda(i-1).setCalibragem(CALIBRAGEM_CARRO_ESPORTIVO);
        }
    }

    public void mover(){
        if (this.rodasCalibradas())
            this.setDistanciaPercorrida(getDistanciaPercorrida()+4);
    }
    
}
