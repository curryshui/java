package test;

public class Woman extends Human {
	public Woman() {
	}

	public Woman(int height, int weight) {
		super(height, weight);
		this.setSex("èó");

	}

	public void popMessage() {
		String s = this.getHeight() + "," + this.getWeight() + ","
				+ this.getSex();
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		new Man(2,2).popMessage();
	}

}
