/*
3. Crie uma função recursiva que exiba o resultado 
do fatorial de um número (Pela limitação da recursividade, 
o número de entrada deverá ser baixo para não dar estouro
(limite de entrada = 12)):
O código deve trazer como comentários:
A condição de parada;
Como escrever a função para o termo n em função do termo anterior
*/

package controller;

public class FatorialRecController {
	
	public FatorialRecController() {
		super();
	}

	public static long calcularFatorial(int n) {
	        
			// Condição de parada: fatorial de 0 ou 1 é 1
	        if (n == 0 || n == 1) {
	            return 1;
	        }

	        // Chamada recursiva: fatorial de n em função do fatorial de (n - 1)
	        return n * calcularFatorial(n - 1);
	}

}

/*Análise lógica
*Pegando como exemplo fatorial de 5:
*fatorial(5) = 5 * fatorial(4) = 5 * 24 = 120
*fatorial(4) = 4 * fatorial(3) = 4 * 6 = 24
*fatorial(3) = 3 * fatorial(2) = 3 * 2 = 6
*fatorial(2) = 2 * fatorial(1) = 2 * 1 = 2
*fatorial(1) = 1 * fatorial(0) = 1 * 1 = 1
*fatorial(0) = 1
*/

/*
* Condição de Parada: 
* A condição de parada é quando n é igual a 0 ou 1. 
* Nesses casos, o fatorial é 1.
* Função em Função do Termo Anterior: 
* O cálculo do fatorial de n é feito multiplicando n pelo fatorial de n - 1. 
* Isso é o que garante o aspecto recursivo, 
* pois o fatorial de n - 1 é calculado usando a mesma função. 
* Para valores maiores que 12, 
* o cálculo pode resultar em estouro, 
* uma vez que o fatorial cresce exponencialmente.
*/
