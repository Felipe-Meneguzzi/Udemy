package section8.exercicio3;

public class Aluno {
    private final String nome;
    private int quantidadeNotas;
    private double[] notas;
    private double mediaParaPassar;

    public Aluno(String nome, int quantidadeNotas, double mediaParaPassar) {
        this.nome = nome;
        this.quantidadeNotas = quantidadeNotas;
        this.notas = new double[quantidadeNotas];
        this.mediaParaPassar = mediaParaPassar;
    }

    public double getNota(int numNota) {
        return this.notas[numNota];
    }

    public void setNota(int numNota, double nota) {
        numNota -= 1;
        if(numNota > this.quantidadeNotas - 1){
            System.out.println("ERRO!! Setando mais notas do que a quantidade definida");
            return;
        }
        this.notas[numNota] = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getMediaParaPassar() {
        return mediaParaPassar;
    }

    public int getQuantidadeNotas() {
        return this.quantidadeNotas;
    }

    public void setQuantidadeNotas(int quantidadeNotas) {
        this.quantidadeNotas = quantidadeNotas;
    }

    public double getMedia() {
        double somaNotas = 0;
        for (double nota:notas){
            somaNotas += nota;
        }
        return somaNotas / this.quantidadeNotas;
    }

    public boolean isAprovado() {
        return getMedia() >= this.mediaParaPassar;
    }

    public double getFaltandoPraPassar(){
        return this.mediaParaPassar - getMedia();
    }
}
