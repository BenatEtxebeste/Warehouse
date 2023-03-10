
public class Vino extends Articulo{
	private String color;
	private String origen;
	private int anio;
	private String tipoDeUva;
	private double gradosAlcohol;
	
	public Vino(String code, String name, String mark, int capacidadBotella, double precio, int stock, String color,
			String origen, int anio, String tipoDeUva, double gradosAlcohol) {
		super(code, name, mark, capacidadBotella, precio, stock);
		this.color = color;
		this.origen = origen;
		this.anio = anio;
		this.tipoDeUva = tipoDeUva;
		this.gradosAlcohol = gradosAlcohol;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getTipoDeUva() {
		return tipoDeUva;
	}
	public void setTipoDeUva(String tipoDeUva) {
		this.tipoDeUva = tipoDeUva;
	}
	public double getGradosAlcohol() {
		return gradosAlcohol;
	}
	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}
	
	@Override
	public String toString() {
		return "Vino [color=" + color + ", origen=" + origen + ", anio=" + anio + ", tipoDeUva=" + tipoDeUva
				+ ", gradosAlcohol=" + gradosAlcohol + "]";
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