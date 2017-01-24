package test;

public abstract class Human {

	private int height;
	private int weight;
	private int BMI;
	private String sex;

	public Human() {
	}

	public Human(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	public abstract void popMessage();

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getBMI() {
		return BMI;
	}

	public void setBMI(int bMI) {
		BMI = bMI;
	}

}
