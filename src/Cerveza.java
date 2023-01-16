
public class Cerveza extends Articulo{
	private String origen;
	private String cereales;
	private double gradosAlcohol;
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getCereales() {
		return cereales;
	}
	public void setCereales(String cereales) {
		this.cereales = cereales;
	}
	public double getGradosAlcohol() {
		return gradosAlcohol;
	}
	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}
	
	public Cerveza(String code, String name, String mark, int capacidadBotella, double precio, int stock, String origen,
			String cereales, double gradosAlcohol) {
		super(code, name, mark, capacidadBotella, precio, stock);
		this.origen = origen;
		this.cereales = cereales;
		this.gradosAlcohol = gradosAlcohol;
	}
	
	@Override
	
	public String toString() {
		return "Cerveza [origen=" + origen + ", cereales=" + cereales + ", gradosAlcohol=" + gradosAlcohol + "]";
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
