package ar.edu.unlam.pb2;

public class Bicicleta {
	
	private String color;
	private Integer id;
	private String tipo;
	private Integer rodado;
	private Boolean conCambio;
	private Integer cambioActual;
	
	public Bicicleta(){//caracteristicas, todas salen iguales
		
		this.id=0;
		this.color="blanca";
		this.tipo="playera";
		this.rodado=20;
		this.cambioActual=0;
		
	}
	
	public Bicicleta(Integer id,Integer rodado){//Metodo particular, SOBRECARGA
		
		this.id=id;
		this.rodado=rodado;
		this.color="blanca";
		this.tipo="playera";
		
	}
//getters y setters de todo. Los Getters (Devuelve valores) y los Setters(me permite cambiarlo)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRodado() {
		return rodado;
	}

	public void setRodado(Integer rodado) {
		this.rodado = rodado;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void frenar(){
	
		this.color = color;
		this.rodado = rodado;
		this.cambioActual = 0;
		
	}
	
	incrementar cambio
	
	decrementar
	

}