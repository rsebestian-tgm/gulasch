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
		System.out.println("Hallo " + getN() + " du siehst aber furchtbar aus!");
	}
	public void byeName(){
		System.out.println("Tsch�ss " + getN() + " und auf nimmerwiedersehen!");
	}
}
