package hadoop.second;

import org.apache.hadoop.io.Text;

public class Airline {
	private int year;
	private int month;
	private int day;
	private int departureDelay;
	private int arrivalDelay;
	private String dayOfWeek;
	private int isCancelled;
	
	public Airline(Text line) {
		try {
			String[] cols = line.toString().split(",");
			year = Integer.parseInt(cols[0]);
			month = Integer.parseInt(cols[1]);
			isCancelled = Integer.parseInt(cols[21]);
			//4	DayOfWeek	1 (Monday) - 7 (Sunday)
//			dayOfWeek = cols[3];
			if (cols[3].contentEquals("1")) {
				dayOfWeek="Mon";
			} else if(cols[3].contentEquals("2")) {
				dayOfWeek="Tue";
			} else if(cols[3].contentEquals("3")) {
				dayOfWeek="Wed";
			} else if(cols[3].contentEquals("4")) {
				dayOfWeek="Thu";
			} else if(cols[3].contentEquals("5")) {
				dayOfWeek="Fri";
			} else if(cols[3].contentEquals("6")) {
				dayOfWeek="Sat";
			} else {
				dayOfWeek="Sun";
			}
			if(!cols[14].equals("NA")) {
				arrivalDelay = Integer.parseInt(cols[14]);
			} else {
				arrivalDelay = 0;
			}
			if(!cols[15].equals("NA")) {
				departureDelay = Integer.parseInt(cols[15]);
			} else {
				departureDelay = 0;
			}
			
		} catch (Exception e) {
			System.out.println("err data="+line);
		}
	}

	public int getIsCancelled() {
		return isCancelled;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public int getArrivalDelay() {
		return arrivalDelay;
	}

	public int getMonth() {
		return month;
	}

	public int getDepartureDelay() {
		return departureDelay;
	}


}
