package section8.exercicio3;

public class Aluno {
    private final String NOME;
    private final int QUANTIDADE_NOTAS;
    private double[] notas;
    private double mediaParaPassar;

    public Aluno(String NOME, int QUANTIDADE_NOTAS, double mediaParaPassar) {
        this.NOME = NOME;
        this.QUANTIDADE_NOTAS = QUANTIDADE_NOTAS;
        this.notas = new double[QUANTIDADE_NOTAS];
        this.mediaParaPassar = mediaParaPassar;
    }

    public double getNota(int numNota) {
        return this.notas[numNota];
    }

    public void setNota(int numNota, double nota) {
        numNota -= 1;
        if(numNota > this.QUANTIDADE_NOTAS - 1){
            System.out.println("ERRO!! Setando mais notas do que a quantidade definida");
            return;
        }
        this.notas[numNota] = nota;
    }

    public String getNome() {
        return NOME;
    }

    public double getMediaParaPassar() {
        return mediaParaPassar;
    }

    public int getQuantidadeNotas() {
        return this.QUANTIDADE_NOTAS;
    }

    public double getMedia() {
        double somaNotas = 0;
        for (double nota:notas){
            somaNotas += nota;
        }
        return somaNotas / this.QUANTIDADE_NOTAS;
    }

    public boolean isAprovado() {
        return getMedia() >= this.mediaParaPassar;
    }

    public double getFaltandoPraPassar(){
        return this.mediaParaPassar - getMedia();
    }
}
