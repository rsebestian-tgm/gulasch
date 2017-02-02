package rsebestian;

public class Hallo {
	private String N;
	public Hallo(String name){
		this.setN(name);
	}
	
	public String getN() {
		return N;
	}
	
	public void setN(String n) {
		N = n;
	}
	
	public void helloName(){
		System.out.println("Hallo " + getN() + " ich erzähle dir mal nen Witz");
	}
	public void witzName(){
		System.out.println("Wer geht über die Straße? \nNatürlich " + getN());
	}
	
}
