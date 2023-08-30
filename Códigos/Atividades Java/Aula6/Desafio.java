public class Desafio {

	public static void main(String[] args) {
		int[] vetor = criarVetor(10);
		System.out.println("vetor não ordenado: ");
		imprimirVetor(vetor);
		ordenarVetor(vetor);
		System.out.println("vetor ordenado: ");
		imprimirVetor(vetor);
	}
	public static int[] criarVetor(int tamanhoVetor){

		int[] vetor = new int[tamanhoVetor];
		for (int i = 0; i < tamanhoVetor; i++){

			vetor[i] = (int)(Math.random()*20);
			for(int j = 0; j < i ; j++){
				if(vetor[i] == vetor[j]){
					vetor[i] = (int)(Math.random()*21);
					i--;
				}
			}
		}
		return vetor;
	}
	public static void imprimirVetor(int[] vetor){
		for (int i = 0; i < vetor.length; i++){
			System.out.print(" | " + vetor[i]);
		}
		System.out.println();
	}
	public static void ordenarVetor(int[] vetor){
		int aux;
		for(int i = 1; i < vetor.length; i++){
			for (int j = 0; j < i; j++){
				if(vetor[i] < vetor[j]){
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}




			/*if(vetor[i] < vetor [i]){
				aux = vetor[i];
				vetor[i] = vetor[i + 1];
				vetor[i + 1] = aux;
				i = 0;
			} */
		}
	}
}