package day5_abstract;

public abstract class Shape { // lớp cha/Lớp cơ sở
	private String color = "đỏ";
	
	

	public String getColor() {
		return color;
	}
	public abstract void draw();

}
