package exercico_semana1;

public class Date {

	
	
	/* Comentario de teste gitHub*/
	
	private int month;
	private int day;
	private int year;
	private boolean leapYear;
	
	
	public Date(int month, int day, int year ) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int month() {
		return month;
	}
	public int day() {
		return day;
	}
	public int year() {
		return year;
	}
	
	private void setLeapYear(int year) {
		/*
		 * 
		 */
	}
	
	@Override
	
	public String toString() {
		return "";
	}
	
	public boolean before(Date date) {
		
		return false;
	}
	
	public int daysSinceBeginYear() {
		
		return -1;
	}
	
	public int daysUntilEndYear() {
		
		
		return -1;
	}
	
	public int daysBetween(Date date) {
		
		return -1;
	}
}
