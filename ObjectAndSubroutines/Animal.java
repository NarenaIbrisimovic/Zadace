
public class Animal {
	
	private static final Integer g = 10;
	private String vrsta;
	private String spol;
	private String zvuk;
	private Integer tezina;
	private Integer masa;
	
	public Animal (String vrsta, String spol,String zvuk, Integer tezina, Integer masa){
		super();
		this.vrsta = vrsta;
		this.spol = spol;
		this.zvuk = zvuk;
		this.tezina = tezina;
		this.masa =  masa;
	}
	
	private String napraviZvuk(){
		return this.zvuk;
	}
	
	private Integer racynajMasu(){
		return this.masa;
	}
	private Integer racunajTazinu(){
		return this.tezina = this.masa *g;
	}
	

}
