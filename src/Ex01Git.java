import java.util.Scanner;

public class Ex01Git {
	public static void main(String[] args) {
		Scanner batata = new Scanner(System.in);
		int[] notas = new int[5];
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota do %do aluno: ", i+1);
			notas[i] = batata.nextInt();
		}
		int totalN = 0;
		for (int i : notas) {
			totalN += i;
		}
		System.out.printf("A nota de todos alunos é: %d", totalN);
	}
}
