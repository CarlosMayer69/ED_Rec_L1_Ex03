package view;

import javax.swing.JOptionPane;

import controller.FatorialRecController;

public class Principal {

	public static void main(String[] args) {
    	
    	FatorialRecController fr = new FatorialRecController();
    	
        int numero = Integer.parseInt(JOptionPane.showInputDialog
	    		(null, "Digite um número: ")); // Ou, 
        //alterar, deixando (digitando) o número conforme necessidade.
        long resultado = fr.calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

}
