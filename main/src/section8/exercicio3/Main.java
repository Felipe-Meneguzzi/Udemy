package section8.exercicio3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Felipe", 3, 6);

        aluno.setNota(1, 7);
        aluno.setNota(2, 8);
        //Não setei 3 notas, mas deve fazer a divisão da média por 3 ainda
        //Fora do indice de notas, tem que acusar o erro e não ser usado na media:
        aluno.setNota(4, 4);

        System.out.println("O aluno " + aluno.getNome()
                + " esta com a média de: " + aluno.getMedia());

        if(aluno.isAprovado()){
            System.out.println("O aluno esta Aprovado!");
        }else{
            System.out.println("O aluno não esta aprovado e precisa de mais: " + aluno.getFaltandoPraPassar()
                    + " para atingir a média!");
        }
    }
}
