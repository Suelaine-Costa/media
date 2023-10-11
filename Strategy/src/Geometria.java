class Geometrica {
    public double calcularMedia(double[] notas) {
        if (notas.length == 0) {
            return 0;
        }

        double produto = 1;
        for (double nota : notas) {
            produto *= nota;
        }

        return Math.pow(produto, 1.0 / notas.length);
    }

    public boolean estaAprovado(double media) {
        return media > 7.0;
    }
}
