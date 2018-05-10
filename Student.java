package lab7_2;

public abstract class Student {
	private int id;   // 학번
	private double score;  // 학점

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
	// 추상메소드 warning()
	public abstract boolean warning();
}