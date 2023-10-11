public class Aritmetica {
    public double calcularMedia(double[] notas) {
        if (notas.length == 0) {
            return 0.0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public boolean estaAprovado(double media) {
        return media > 5.0;
    }
}
