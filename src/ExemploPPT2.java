import java.util.Scanner;

public class ExemploPPT2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nota1 = 4;
        int nota2 = 6;
        int nota3 = 7;
        int nota4 = 9;
        String aluno1 = "Robson";
        String aluno2 = "Maynara";
        String aluno3 = "Maria";
        String aluno4 = "Junior";

        if (nota1 >= 0 && nota1 <5) {
            System.out.println(aluno1 + ", você está reprovado.");
        } else if (nota1 >= 5 && nota1 < 7) {
            System.out.println(aluno1 + ", você está em recuperação.");
        } else  {
            System.out.println(aluno1 + ", você está aprovado.");
        }

        if (nota2 >= 0 && nota2 <5) {
            System.out.println(aluno2 + ", você está reprovado.");
        } else if (nota2 >= 5 && nota2 < 7) {
            System.out.println(aluno2 + ", você está em recuperação.");
        } else  {
            System.out.println(aluno2 + ", você está aprovado.");
        }

        if (nota3 >= 0 && nota3 <5) {
            System.out.println(aluno3 + ", você está reprovado.");
        } else if (nota3 >= 5 && nota3 < 7) {
            System.out.println(aluno3 + ", você está em recuperação.");
        } else  {
            System.out.println(aluno3 + ", você está aprovado.");
        }

        if (nota4 >= 0 && nota4 <5) {
            System.out.println(aluno4 + ", você está reprovado.");
        } else if (nota4 >= 5 && nota4 < 7) {
            System.out.println(aluno4 + ", você está em recuperação.");
        } else  {
            System.out.println(aluno4 + ", você está aprovado.");
        }
    }
}
