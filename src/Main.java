import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno A:");
        String alunoA= scanner.nextLine();
        System.out.println("Digite o nome do aluno B:");
        String alunoB= scanner.nextLine();
        System.out.println("Digite o nome do aluno C:");
        String alunoC= scanner.nextLine();
        System.out.println("------------");
        System.out.println("Agora vamos dar as notas dos alunos, vamos dar 3 notas para eles:");
        System.out.printf("Digite a nota do "+alunoA+":");
        double primeiraNotaAlunoA= scanner.nextDouble();
        double segundaNotaAlunoA= scanner.nextDouble();
        double terceiraNotaAlunoA= scanner.nextDouble();

        System.out.println("------------");
        System.out.printf("Digite a nota do "+alunoB+":");
        double primeiraNotaAlunoB= scanner.nextDouble();
        double segundaNotaAlunoB= scanner.nextDouble();
        double terceiraNotaAlunoB= scanner.nextDouble();

        System.out.println("------------");
        System.out.printf("Digite a nota do "+alunoC+":");
        double primeiraNotaAlunoC= scanner.nextDouble();
        double segundaNotaAlunoC= scanner.nextDouble();
        double terceiraNotaAlunoC= scanner.nextDouble();

        System.out.println("--------------");

        double media_AlunoA=(primeiraNotaAlunoA+segundaNotaAlunoA+terceiraNotaAlunoA)/3;
        double media_AlunoB=(primeiraNotaAlunoB+segundaNotaAlunoB+terceiraNotaAlunoB)/3;
        double media_AlunoC=(primeiraNotaAlunoC+segundaNotaAlunoC+terceiraNotaAlunoC)/3;

        String aprovados="";
        String reprovados="";
        System.out.println("Agora vamos pegar a média dos alunos e descobrir o resultado");
        if(media_AlunoA>=7){
            aprovados +=alunoA + ". Nota:"+media_AlunoA+ ". Aprovado \n";
        } else if(media_AlunoA<7){
            reprovados +=alunoA + ". Nota:"+media_AlunoA+ ". Reprovado \n";
        }
        if(media_AlunoB>=7){
            aprovados +=alunoB + ". Nota:"+media_AlunoB+ ". Aprovado \n";
        } else if(media_AlunoB<7){
            reprovados +=alunoB + ". Nota:"+media_AlunoB+ ". Reprovado \n";
        }
        if(media_AlunoC>=7){
            aprovados +=alunoC + ". Nota:"+media_AlunoC+ ". Aprovado \n";
        } else if(media_AlunoC<7){
            reprovados +=alunoC + ". Nota:"+media_AlunoC+ ". Reprovado \n";
        }

        System.out.println("Aprovados \n"+aprovados);
        System.out.println("Reprovados \n"+reprovados);
    }
}