package br.dev.kauan.tabuada.gui;

import java.awt.Container;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {
	//Atributos
	
	//Label
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	
	//Textfield
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	
	//Button
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	
	//List
	private JList listTabuada;
	
	//ScrollPane
	private JScrollPane scrollTabuada;
	
	//Titulo da tela
	private String tituloDaTela;
	
	//Metodos
	public void criarTela(String tituloDaTela) {
		this.tituloDaTela = tituloDaTela;
		JFrame tela = new JFrame();
		tela.setTitle(this.tituloDaTela);
		tela.setSize(265, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		
		//Obtendo a referência do painel de conteúdo da tela
		Container container = tela.getContentPane();
		
		// Criar o Label Multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando");
		labelMultiplicando.setBounds(20, 20, 100, 30);
		
		// Criar o label MinMultiplicador
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador");
		labelMinMultiplicador.setBounds(20, 60, 130, 30);
		
		// Criar o label MaxMultiplicador
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador");
		labelMaxMultiplicador.setBounds(20, 100, 130, 30);
		
		// Criar o TextField Multiplicando
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(300, 20, 50, 25);
		
		// Criar o TextField MinMultiplicador
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(300, 60, 50, 25);
		
		// Criar o TextField MaxMultiplicador
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(300, 100, 50, 25);
		
		// Criar Button Calcular
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 150, 30);
		
		// Criar Button Limpar
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(200, 140, 150, 30);
		
		// Criar List da Tabuada
		listTabuada = new JList();
		listTabuada.setBounds(20, 200, 350, 300);
		
		// Criar Scroll de navegação
		scrollTabuada = new JScrollPane();
		scrollTabuada.setBounds(360, 200, 10, 300);
		
		// Adicionando os componentes no Painel de conteúdo do JFrame
		container.add(labelMultiplicando);
		container.add(labelMinMultiplicador);
		container.add(labelMaxMultiplicador);
		container.add(textMultiplicando);
		container.add(textMinMultiplicador);
		container.add(textMaxMultiplicador);
		container.add(buttonCalcular);
		container.add(buttonLimpar);
		container.add(listTabuada);
		container.add(scrollTabuada);
		
		// Tornar a tela visível "DEVE!!!" ser a ultima instrução
		tela.setVisible(true);
		
	}
	
	private void exibirTabuada() {
		
	}
	
	private void limparTabuada() {
		
	}
	
}
