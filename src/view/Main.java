package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.FatController;

public class Main {

	public static void main(String[] args) {
		JFrame popup = new JFrame ();
		FatController fatorial = new FatController();
		
		JOptionPane.showMessageDialog(popup, "Digite um Número de 0 a 10. Esse programa mostrará o fatorial do n° utilizando uma estrutura de Pilhas.");
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de 0 a 10:"));
		do {	
			if(n < 0 || n > 10){
				n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor Inválido! Valores válidos são números de 0 a 10. \nDigite novamente:", "Erro", JOptionPane.WARNING_MESSAGE));			}
		}while(n < 0 || n > 10);
		System.out.println(fatorial.fatorial(n));
		JOptionPane.showMessageDialog(popup, "O fatorial de "+n+" é igua a: "+fatorial.fatorial(n));
	}

}
