public class Main {
    public static void main(String[] args) {
        Aritmetica calculo = new Aritmetica();

        double p1 = 10;
        double p2 = 5;

        double media = (p1 + p2) / 2; // Média aritmética sem o uso de List
        boolean situacao = calculo.estaAprovado(media);

        System.out.println("P1: " + p1 + " P2: " + p2 + " Media: " + media + " Situacao: " + (situacao ? "Aprovado" : "Reprovado"));
    }
}
