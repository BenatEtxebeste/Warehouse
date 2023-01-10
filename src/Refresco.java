import java.awt.PageAttributes.PrintQualityType;

public class Refresco {
	private String sabor;
	private boolean zumo;
	private boolean gaseoso;
	private int cantidadAzucar;
	
	
	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public boolean isZumo() {
		return zumo;
	}


	public void setZumo(boolean zumo) {
		this.zumo = zumo;
	}


	public boolean isGaseoso() {
		return gaseoso;
	}


	public void setGaseoso(boolean gaseoso) {
		this.gaseoso = gaseoso;
	}


	public int getCantidadAzucar() {
		return cantidadAzucar;
	}


	public void setCantidadAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}

	

	public Refresco(String sabor, boolean zumo, boolean gaseoso, int cantidadAzucar) {
		super();
		this.sabor = sabor;
		this.zumo = zumo;
		this.gaseoso = gaseoso;
		this.cantidadAzucar = cantidadAzucar;
	}

	
	
	public void visualizarPropiedades() {
		System.out.println();
	}
	
	public boolean esSaludable(){
		boolean esSaludable = false;
		if (cantidadAzucar < 20) {
			esSaludable = true;
		}
		return esSaludable;
	}
}
