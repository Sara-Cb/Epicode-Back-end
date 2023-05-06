package multimedia;

public class Image extends Multimedia implements lighting {
	
	protected int light = 1;
	
	public Image(String title, int light) {
		super(title);
		this.light = light;
	}
	
	public Image(String title) {
		super(title);
	}

	@Override
	public void lightingUp(int n) {
		this.light += n;
	}

	@Override
	public void lightingDown(int n) {
		this.light -= n;
	}
	
	@Override
	public String toString() {
		return "Image file: " + this.title;
	}
	
	public void showImage() {
		int l = this.light;
		String light = "Brightness: ";
		
		for (int i=0; i<l; i++) {
			light += "*";
		}
			
		System.out.println(this.toString() + " - " + light);
	}
}
