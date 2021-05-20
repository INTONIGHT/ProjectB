package fixtures;

public class Room extends Fixture{
//index 0 for north 1 for west 2 for south 3 for east.
	private int n , w , s , e ;
	
	
	public Room(String name, String longDescription,int N,int W,int S,int E) {
		super(name, longDescription);
		this.n = N;
		this.w = W;
		this.e = E;
		this.s = S;
	}


	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	public int getW() {
		return w;
	}


	public void setW(int w) {
		this.w = w;
	}


	public int getS() {
		return s;
	}


	public void setS(int s) {
		this.s = s;
	}


	public int getE() {
		return e;
	}


	public void setE(int e) {
		this.e = e;
	}
	
	
}
