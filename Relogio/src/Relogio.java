package Relogio.src;

public class Relogio {
    public int hora,minuto,segundo;
    
    public int setHora(int x){
        return x;
    }
        public int setMinuto(int x){
        return x;
    }
        public int setSegundo(int x){
        return x;
    }

    public void reinicio(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public long cronometro (long x, long y){
        long tempo = System.currentTimeMillis();
        long tempoInicio = tempo + x; 
        long tempoFim = tempo + y;
        do{
            tempo = System.currentTimeMillis();
            if (tempo >= tempoInicio)
                System.out.println(tempo-tempoInicio);
        } while (tempo<=tempoFim);
        return tempoFim-tempoInicio;
    }

    public int imprimir (int x, int y){
        int hora=0;
        if (x == 1){
            hora = y;
        }
        else if (x == 2){
            while(y>=13){
             y = y - 12;
            }
            hora = y;
        }
        return hora;
    }

    public long atualizar (){
        return System.currentTimeMillis();
    }
}
