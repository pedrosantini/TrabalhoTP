import java.util.Random;
public class Motor {
    private int giroAtual;
    private float cilindrada;
    private String modo;
    private static final float fatorConsumoCombustao = 0.001f;
    private static final float fatorConsumoEletrico = 0.0001f;

    public Motor(VeiculoHibrido n){
        String s = n.getTipo();
        Random r = new Random();
        if (s == n.getEsp()){
            cilindrada = 2.5f;
        }
        else if (s == n.getPass()) {
            cilindrada = 1.5f;
        }
        else if (s == n.getMoto()) {
            cilindrada = 1.0f;
        }

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
    
}
