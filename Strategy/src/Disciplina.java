public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private boolean situacao;

    public Disciplina(String nome, double p1, double p2, Aritmetica aritmetica) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.media = (p1 + p2) / 2;
        this.situacao = aritmetica.estaAprovado(this.media);
    }

    public Disciplina(String nome, double p1, double p2, Geometrica geometrica) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.media = Math.sqrt(p1 * p2); // Usando a média geométrica.
        this.situacao = geometrica.estaAprovado(this.media);
    }

    public String getNome() {
        return nome;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getMedia() {
        return media;
    }

    public boolean getSituacao() {
        return situacao;
    }
}
