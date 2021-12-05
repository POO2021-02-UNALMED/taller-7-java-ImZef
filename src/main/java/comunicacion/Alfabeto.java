package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String c = null;
		for(int i = 0; i < letras.length; i++) {
			c += i;
			c += ", ";
		}
		return c;
	}
	
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public String[] getLetras() {
		return letras;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
}