public interface desenhavel {

    static String desenhoBicicleta(){
        return "   __o\n"
              +" _`\\<,_\n"
              +"(*)/ (*)\n\n";
    }
    
    static String desenhoMotocicleta(){
        return "    ____\n" 
             + " __/  |_\\_\n"
             + "|  _     _``-.\n"
             + "'-(_)---(_)--'\n\n\n";
    }

    static String desenhoCarroEsportivo(){
        return "           _______ \n"
                   + "  _/\\______\\\\__\n"
                   + " / ,-. -|-  ,-.`-. \n"
                   + " `( o )----( o )-'\n"
                   + "   `-'      `-'  \n";
    }

    static String desenhoCarroPasseio(){
        return "  ______\n"
             + " /|_||_\\`.__\n" 
             + "(   _    _ _\\ \n" 
             + "=`-(_)--(_)-'\n\n";
    }


    void desenhar(int distanciaPerc);
    
}
