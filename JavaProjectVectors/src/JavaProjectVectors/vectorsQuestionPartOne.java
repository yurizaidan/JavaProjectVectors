package JavaProjectVectors;

public class vectorsQuestionPartOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vectorA = {5,6,7,8};
		int[] vectorB = {1,2,3,4};
		
		//Question #1
		showVector(vectorA);
		showVector(vectorB);
		showVector(vectorSubtraction(vectorA,vectorB));

	}
	//Subtracting two vectors with the same length
	public static int[] vectorSubtraction (int[] vectorA, int[]vectorB){
		int size = vectorA.length;
		int[] vectorC= new int[size];
		for (int i=0;i<size;i++) {
			vectorC[i]=vectorA[i]-vectorB[i];
		}
		return vectorC;
	}
	//Printing vector
	public static void showVector(int[] vector) {
		for (int x:vector) {
			System.out.print(x+" ");
		}
		System.out.println();
		
	}
	

}
/*
Exercícios de fixação – Vetores 

Parte 1
1) A main deve conter a chamada dos métodos criados
2) Crie um método subtrai que cria um 3o vetor cujos elementos resultam da subtração dos outros dois vetro1-vetor2 -> vetor 3
 3) Crie um método que troque os elementos das posições pares pelos elementos das posições ímpares (o vetor original deve ser mantido)
 4) crie um método que substitua os elementos das posições pares por -2 e os elementos das posições ímpares por -1 (detalhe o vetor original deve ser mantido)
 5) crie um método que receba dois vetores e devolve os vetores concatenados "colados em sequência"
 6) crie um método que clone um vetor
 7) Crie um Menu para escolha da opção

** faça tudo em um arquivo .java
*/