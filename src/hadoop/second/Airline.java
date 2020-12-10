package hadoop.second;

import org.apache.hadoop.io.Text;

public class Airline {
	private int year;
	private int month;
	private int departureDelay;
	
	public Airline(Text line) {
		try {
			String[] cols = line.toString().split(",");
			year = Integer.parseInt(cols[0]);
			month = Integer.parseInt(cols[1]);
			if(!cols[15].equals("NA")) {
				departureDelay = Integer.parseInt(cols[15]);
			} else {
				departureDelay = 0;
			}
			
		} catch (Exception e) {
			System.out.println("err data="+line);
		}
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDepartureDelay() {
		return departureDelay;
	}
}
