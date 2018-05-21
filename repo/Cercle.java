package git_faus;

public class Cercle {

	
	
	private float x;
	 private float y;
	 
	 Cercle(float xx, float yy)

	  {

	     x=xx;

	     y=yy;     

	  }

public Cercle () {
	     this.x = 4.3f;
	     this.y = 4.3f;
	 }
	 

	public Cercle (Cercle cercle) {
	     this.x = cercle.x;
	     this.y = cercle.y;
	 }

	 public String toString() {
	    String tronk = "X: " + this.x + " Y: " + this.y;
	    return tronk;
	 }



	 


}