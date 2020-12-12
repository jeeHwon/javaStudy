package hadoop.second;

import org.apache.hadoop.io.Text;

public class Airline {
	private int year;
	private int month;
	private int day;
	private int departureDelay;
	private int arrivalDelay;
	
	public Airline(Text line) {
		try {
			String[] cols = line.toString().split(",");
			year = Integer.parseInt(cols[0]);
			month = Integer.parseInt(cols[1]);
			//4	DayOfWeek	1 (Monday) - 7 (Sunday)
			day = Integer.parseInt(cols[3]);
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
