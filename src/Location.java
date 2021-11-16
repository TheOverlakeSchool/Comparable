public class Location implements Comparable<Location>{
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

	@Override
	public int compareTo(Location o) {
		if (Math.abs(latitude) != Math.abs(o.latitude)) {
			return Double.compare(Math.abs(latitude), Math.abs(o.latitude));
		}

		return Double.compare(Math.abs(longitude), Math.abs(o.longitude));
	}

//	Location sydney = new Location("Sydney", -34.1,151.1);
//	Location singapore = new Location("Singapore", 1.35, 103.82);
//	Location kirkland = new Location("Kirkland", 47.67, -122.2);
//	Location redmond = new Location("Redmond",47.67,-122.12);

}