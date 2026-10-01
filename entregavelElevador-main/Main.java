public class Main {
    static void main(String[] args) {
        Elevador elevador = new Elevador(1, 500);
        System.out.println("elevador subiu");
        elevador.adicionarPeso(345);
        elevador.subir();

        System.out.println("elevador nao subiu");
        elevador.adicionarPeso(250);
        elevador.subir();
    }
}