public class SmartTv {
    boolean ligada=false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o Volume -> "+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o Volume -> "+volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o Volume -> "+canal);
    }
    public void diminuirCanal(){
        volume--;
        System.out.println("Diminuindo o Volume -> "+canal);
    }

    public void mudarCanal(int NovoCanal){
        canal = NovoCanal;
    }
}
