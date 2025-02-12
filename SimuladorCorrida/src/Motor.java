import java.util.Random;
public class Motor {
    private int giroAtual;
    private float cilindrada;
    private String modo;
    private static final float fatorConsumoCombustao = 0.001f;
    private static final float fatorConsumoEletrico = 0.0001f;

    public Motor(VeiculoHibrido n){
        Random r = new Random();

        boolean m = r.nextBoolean();

        if (m){
            modo = "combustao";

        }
        else{
            modo = "eletrico";
        }



        giroAtual = 0;        
    }

    public static float getFatorconsumocombustao() {
        return fatorConsumoCombustao;
    }

    public static float getFatorconsumoeletrico() {
        return fatorConsumoEletrico;
    }

    public void setGiroAtual(int giroAtual) {
        this.giroAtual = giroAtual;
    }

    public void acelerar(int a){
        this.giroAtual += a;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getModo() {
        return modo;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public int getGiroAtual() {
        return giroAtual;
    }
    
}
