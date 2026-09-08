public class Sistema {

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double nota1 = 8.0;
        double nota2 = 7.0;

        double media = calcularMedia(nota1, nota2);
        String situacao = verificarSituacao(media);

        exibirRelatorio(nomeAluno, media, situacao);
    }

    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }

    public static String verificarSituacao(double media) {
        double notaMinimaAprovacao = 6.0;
        if (media >= notaMinimaAprovacao) {
            return "Aprovado";
        }
        return "Reprovado";
    }
    public static void exibirRelatorio(String nomeAluno, double media, String situacao) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}