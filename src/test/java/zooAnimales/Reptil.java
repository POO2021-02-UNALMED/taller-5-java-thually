package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	static private ArrayList<Reptil> listado = new ArrayList<>();
	static public int iguanas = 0;
	static public int serpientes = 0;
	private String colorEscamas;
	private int largoCola;

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}

	public Reptil() {
		listado.add(this);
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	static public Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	static public Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public static int getIguanas() {
		return iguanas;
	}

	public static int getSerpientes() {
		return serpientes;
	}
	
}
