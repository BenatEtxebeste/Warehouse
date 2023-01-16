
public class Refresco extends Articulo{
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
 
	public Refresco(String code, String name, String mark, int capacidadBotella, double precio, int stock, String sabor,
			boolean zumo, boolean gaseoso, int cantidadAzucar) {
		super(code, name, mark, capacidadBotella, precio, stock);
		this.sabor = sabor;
		this.zumo = zumo;
		this.gaseoso = gaseoso;
		this.cantidadAzucar = cantidadAzucar;
	}
	
	@Override
	public String toString() {
		return "Refresco [sabor=" + sabor + ", zumo=" + zumo + ", gaseoso=" + gaseoso + ", cantidadAzucar="
				+ cantidadAzucar + "]";
	}
	
	
	public void visualizarPropiedades() {
		System.out.println("Sabor :" + this.sabor + " Es un zumo? " + this.zumo + " Gas? " + this.gaseoso + "Cantidad de azucar: " + this.cantidadAzucar);
	}
	
	public boolean esSaludable(){
		boolean esSaludable = false;
		if (cantidadAzucar < 20) {
			esSaludable = true;
		}
		return esSaludable;
	}


	@Override
	public void visualizarArticulo() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void saludable() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void precioTotal() {
		// TODO Auto-generated method stub
		
	}
}
