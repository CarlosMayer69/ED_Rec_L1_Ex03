package view;

import javax.swing.JOptionPane;

import controller.FatorialRecController;

public class Principal {

	public static void main(String[] args) {
    	
    	FatorialRecController fr = new FatorialRecController();
    	
        int numero = Integer.parseInt(JOptionPane.showInputDialog
	    		(null, "Digite um n�mero: ")); // Ou, 
        //alterar, deixando (digitando) o n�mero conforme necessidade.
        long resultado = fr.calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " �: " + resultado);
    }

}
