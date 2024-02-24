/*
3. Crie uma fun��o recursiva que exiba o resultado 
do fatorial de um n�mero (Pela limita��o da recursividade, 
o n�mero de entrada dever� ser baixo para n�o dar estouro
(limite de entrada = 12)):
O c�digo deve trazer como coment�rios:
A condi��o de parada;
Como escrever a fun��o para o termo n em fun��o do termo anterior
*/

package controller;

public class FatorialRecController {
	
	public FatorialRecController() {
		super();
	}

	public static long calcularFatorial(int n) {
	        
			// Condi��o de parada: fatorial de 0 ou 1 � 1
	        if (n == 0 || n == 1) {
	            return 1;
	        }

	        // Chamada recursiva: fatorial de n em fun��o do fatorial de (n - 1)
	        return n * calcularFatorial(n - 1);
	}

}

/*An�lise l�gica
*Pegando como exemplo fatorial de 5:
*fatorial(5) = 5 * fatorial(4) = 5 * 24 = 120
*fatorial(4) = 4 * fatorial(3) = 4 * 6 = 24
*fatorial(3) = 3 * fatorial(2) = 3 * 2 = 6
*fatorial(2) = 2 * fatorial(1) = 2 * 1 = 2
*fatorial(1) = 1 * fatorial(0) = 1 * 1 = 1
*fatorial(0) = 1
*/

/*
* Condi��o de Parada: 
* A condi��o de parada � quando n � igual a 0 ou 1. 
* Nesses casos, o fatorial � 1.
* Fun��o em Fun��o do Termo Anterior: 
* O c�lculo do fatorial de n � feito multiplicando n pelo fatorial de n - 1. 
* Isso � o que garante o aspecto recursivo, 
* pois o fatorial de n - 1 � calculado usando a mesma fun��o. 
* Para valores maiores que 12, 
* o c�lculo pode resultar em estouro, 
* uma vez que o fatorial cresce exponencialmente.
*/
