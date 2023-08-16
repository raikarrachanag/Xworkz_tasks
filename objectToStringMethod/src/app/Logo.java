package app;

public class Logo {
	private String shape;
	private int height;
	private int width;
	private String color;
	private String theme;
	
	public Logo() {
		
	}

	public Logo(String shape, int height, int width, String color, String theme) {
		super();
		this.shape = shape;
		this.height = height;
		this.width = width;
		this.color = color;
		this.theme = theme;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape : "+this.shape+"\nHeight : "+this.height+"\nWidth : "+this.width+"\nColor : "+this.color+"\nTheme"+this.theme;
	}
}