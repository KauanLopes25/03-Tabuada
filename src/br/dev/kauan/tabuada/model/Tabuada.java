package br.dev.kauan.tabuada.model;

public class Tabuada {
	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	public void mostrarTabuada() {
		if (minimoMultiplicador > maximoMultiplicador) {
			double troca = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = troca;
		}

		System.out.println("----------------------------------");
		System.out.println("TABUADA DO " + multiplicando);
		System.out.println("----------------------------------");

		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			System.out.println(multiplicando + " X " + minimoMultiplicador + " = " + produto);
			minimoMultiplicador++;
		}

		System.out.println("----------------------------------");
		System.out.println("FIM DA TABUADA DO " + multiplicando);
		System.out.println("----------------------------------");
	}
}
