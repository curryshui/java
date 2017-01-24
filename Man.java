package test;

public class Man extends Human {

	public Man() {
	}

	public Man(int height, int weight) {
		super(height, weight);
		this.setSex("’j");

	}

	public void popMessage() {
		String s = this.getHeight() + "," + this.getWeight() + ","
				+ this.getSex();
		System.out.println(s);
	}

}
