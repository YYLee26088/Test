package lab7_2;

public abstract class Student {
	private int id;   // �й�
	private double score;  // ����

	public Student(int id, double score) {
		this.id = id;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	// �߻�޼ҵ� warning()
	public abstract boolean warning();
}