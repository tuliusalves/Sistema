import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alunos[]= new String[3];
        double notasAluno1[] = new double[3];
        double notasAluno2[] = new double[3];
        double notasAluno3[] = new double[3];
        double media_Aluno1=0,media_Aluno2=0,media_Aluno3=0;
        /*----------------------------------------------*/
        for(int i=0;i< alunos.length;i++){
            System.out.println("Digite o nome do aluno número :"+(i+1));
            alunos[i]= scanner.nextLine();
        }
        System.out.println("Agora vamos dar as notas dos alunos, vamos dar 3 notas para cada um:");

        for(int i=0; i< notasAluno1.length; i++){
            System.out.println("Digite a "+(i+1)+"° do aluno 1:");
            notasAluno1[i]= scanner.nextDouble();
        }
        for(int i=0; i< notasAluno2.length; i++){
            System.out.println("Digite a "+(i+1)+"° do aluno 2:");
            notasAluno2[i]= scanner.nextDouble();
        }
        for(int i=0; i< notasAluno3.length; i++){
            System.out.println("Digite a "+(i+1)+"° do aluno 3:");
            notasAluno3[i]= scanner.nextDouble();
        }
        /*------------------------------------------------*/
        System.out.println("--------------");

       media_Aluno1= Arrays.stream(notasAluno1).sum() /3;
       media_Aluno2= Arrays.stream(notasAluno2).sum() /3;
       media_Aluno3= Arrays.stream(notasAluno3).sum() /3;

        String aprovados="";
        String reprovados="";
        System.out.println("Agora vamos pegar a média dos alunos e descobrir o resultado");
        if(media_Aluno1>=7){
            aprovados +=alunos[0] + ". Nota:"+media_Aluno1+ ". Aprovado \n";
        } else if(media_Aluno1<7){
            reprovados +=alunos[0] + ". Nota:"+media_Aluno1+ ". Reprovado \n";
        }
        if(media_Aluno2>=7){
            aprovados +=alunos[1] + ". Nota:"+media_Aluno2+ ". Aprovado \n";
        } else if(media_Aluno2<7){
            reprovados +=alunos[1] + ". Nota:"+media_Aluno2+ ". Reprovado \n";
        }
        if(media_Aluno3>=7){
            aprovados +=alunos[2] + ". Nota:"+media_Aluno3+ ". Aprovado \n";
        } else if(media_Aluno3<7){
            reprovados +=alunos[2] + ". Nota:"+media_Aluno3+ ". Reprovado \n";
        }

        System.out.println("Aprovados \n"+aprovados);
        System.out.println("Reprovados \n"+reprovados);
    }
}