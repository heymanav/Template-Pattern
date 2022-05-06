abstract class Building{
	public void build(){
	base();
	roof();
	wall();
	window();
	decorate();
	}

	void base(){System.out.println("Constructing Base!");}
	void wall(){System.out.println("Constructing Wall!");}
	void roof(){System.out.println("Constructing Roof!");}
	abstract void window();
	abstract void decorate();
}
