public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligado? "+smartTv.ligada);
        System.out.println("Canal Atual "+smartTv.canal);
        System.out.println("Volume Atual "+ smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual "+ smartTv.volume);
        smartTv.mudarCanal(15);
        System.out.println("Canal Atual "+smartTv.canal);
    }
}
