package jim.guillaume.comparejoboffers;

public abstract class Job {
	
	String title;
	Location location;
	Salary salary;
	
	
	/**
	 * Calculate a score for this job based on
	 * scores from Location, Salary, Benefits
	 * @return the score for this job
	 */
	public double getScore() {
		return location.getScore() + salary.getscore();
		
	}
	
	public String toString() {
		return "The position " + title + " located in " + location.getName() + " pays " + salary.getPay() + " and scores " + this.getScore();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * Accessors
	 */
	

	
	
	

}
