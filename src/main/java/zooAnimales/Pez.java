package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	static private ArrayList<Pez> listado = new ArrayList<>();
	static public int salmones = 0;
	static public int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;

	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}

	public Pez() {
		listado.add(this);
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	static public Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	static public Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public static int getSalmones() {
		return salmones;
	}

	public static int getBacalaos() {
		return bacalaos;
	}
	
	
}
