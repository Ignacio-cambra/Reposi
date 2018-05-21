package jeje;

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

	 Cercle(float xx, float yy)

	  {

	     x=xx;

	     y=yy;     

	  }
}