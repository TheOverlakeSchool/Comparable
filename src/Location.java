public class Location {
	private String name;
	private double latitude;
	private double longitude;

	public Location(String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getName() {
		return name;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public String toString() {
		String result = name + " " + Math.abs(latitude);
		if (latitude < 0) {
			result += "S";
		} else {
			result += "N";
		}
		result += " " + Math.abs(longitude);
		if (longitude < 0) {
			result += "W";
		} else {
			result += "E";
		}
		return result;
	}

//	Location seattle = new Location("Seattle",47.65,-122.3);
//	Location sydney = new Location("Sydney", -34.1,151.1);
//	Location singapore = new Location("Singapore", 1.35, 103.82);

}