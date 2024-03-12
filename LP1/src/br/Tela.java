package br;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * 
 * @author heloise
 *
 */
public class Tela extends JFrame{
	public Tela() {
		JButton botao = new JButton("Java Archive");
		this.add(botao);
		this.setSize(500,500);
		this.setVisible(true);
		
	}
	
	public static void main(String[]args) {
		Tela t = new Tela();
	}

}
