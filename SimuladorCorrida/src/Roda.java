import java.util.Random;

public class Roda {
    private boolean calibrado;
    private float calibragem;

    Roda(float VC){
        Random r = new Random();
        calibragem = r.nextFloat()*VC*2;
        if (calibragem >= VC)
            calibrado = true;
        else
            calibrado = false;
    }

    public void setCalibrado(boolean calibrado) {
        this.calibrado = calibrado;
    }

    public void setCalibragem(float calibragem) {
        this.calibragem = calibragem;
    }

    public float getCalibragem() {
        return calibragem;
    }

    public boolean getCalibrado() {
        return calibrado;
    }
}
