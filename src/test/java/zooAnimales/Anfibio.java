package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	static private ArrayList<Anfibio> listado = new ArrayList<>();
	static public int ranas = 0;
	static public int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;

	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}

	public Anfibio() {
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	static public Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	static public Anfibio crearSalamandra(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static int getRanas() {
		return ranas;
	}

	public static int getSalamandras() {
		return salamandras;
	}
	
	
}
