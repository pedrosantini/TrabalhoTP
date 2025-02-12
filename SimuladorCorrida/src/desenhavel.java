public interface desenhavel {
 

    static String desenhoCarroEsportivo(){
        return "    _______ \n"
            + "  _/\\______\\\\__\n"
            + " / ,-. -|-  ,-.`-. \n"
            + " `( o )----( o )-'\n"
            + "   `-'      `-'  \n";
    }


    void desenhar(int distanciaPerc);
    
}
