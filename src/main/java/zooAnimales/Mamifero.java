package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	static private ArrayList<Mamifero> listado = new ArrayList<>();
	static public int caballos = 0;
	static public int leones = 0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}

	public Mamifero() {
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	static public Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	static public Mamifero crearLeon(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static int getCaballos() {
		return caballos;
	}

	public static int getLeones() {
		return leones;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
