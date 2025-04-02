/*Atividade de criação de tabuada para aula de lógica de programação
Professor: Celso Furtado
Data: 02/04/2025
*/

package br.dev.kauan.tabuada;

import javax.swing.JFrame;

import br.dev.kauan.tabuada.model.Tabuada;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello Word");
		Tabuada tabuada = new Tabuada();
		tabuada.setMultiplicando(5);
		tabuada.setMinimoMultiplicador(1);
		tabuada.setMaximoMultiplicador(10);
		tabuada.mostrarTabuada();
		
		Tabuada tabuada2 = new Tabuada();
		tabuada.setMultiplicando(6);
		tabuada.setMinimoMultiplicador(1);
		tabuada.setMaximoMultiplicador(10);
		tabuada.mostrarTabuada();
		
		System.out.println(tabuada.getMultiplicando());
		
		JFrame tela = new JFrame();
		tela.setTitle("DS1MA");
		tela.setSize(500, 600);
		tela.setVisible(true);
	}

}
