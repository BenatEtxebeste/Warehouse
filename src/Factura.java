import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Factura {
	public static int IVA = 21;
	private int numero;
	private String nombreEmpresa;
	private Date fecha;
	private String conceptos;
	
	ArrayList<LineaFactura> lineas = new ArrayList<LineaFactura>();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getConceptos() {
		return conceptos;
	}
	public void setConceptos(String conceptos) {
		this.conceptos = conceptos;
	}
	
	public Factura(int numero, String nombreEmpresa, Date fecha, String conceptos) {
		super();
		this.numero = numero;
		this.nombreEmpresa = nombreEmpresa;
		this.fecha = fecha;
		this.conceptos = conceptos;
	}
	
	public void addLinea(LineaFactura LineaFactura) {
		lineas.add(LineaFactura);
	}
	
	public void eliminarLinea(int numeroLinea) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el numero de linea que desea eliminar");
		numeroLinea = scan.nextInt();
		lineas.remove(numeroLinea);
	}
	
	public double precioTotal() {
		//TODO
		return 0;
	}
	
	public void mostrarEnPantalla() {
		//TODO
	}
	
	public void guardarEnFichero() {
		//TODO
	}
}
