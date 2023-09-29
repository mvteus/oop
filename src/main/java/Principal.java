public class Principal {
    public static void main(String[] args) {
        Carro mustang = new Carro();
        mustang.exibirAutonomia();
        System.out.println("A autonomia do carro é: " + mustang.obterAutonomia() + " km");
    }
}
