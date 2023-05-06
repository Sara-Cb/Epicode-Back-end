package multimedia;

public abstract class Multimedia {

	public String title;

	public Multimedia (String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Multimedia element: " + title;
	}
}
