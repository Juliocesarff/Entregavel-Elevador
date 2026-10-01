public class Elevador {
    private int andar;
    private double pesoM;
    private double pesoA;
    public Elevador(int andar, double pesoM){
        this.andar = andar;
        this.pesoM = pesoM;
        this.pesoA = 0;
    }
    public void adicionarPeso(double peso){
        if(peso > 0){
            pesoA += peso;
            System.out.println("Peso somado: " + peso + " kg");
            System.out.println("Peso atual: " + pesoA + " kg");
        }
    }
    public void subir() {
        if(pesoA > pesoM){
            System.out.println("nao pode subir");
            System.out.println("excesso de peso");
        }else{
            andar++;
            System.out.println("elevador subiu");
        }
    }
}
