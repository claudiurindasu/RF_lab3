
public class Distance {
	private double cityBlockDistance;
	private double cebisevDistance;
	private double euclidianDistance;
	private double mahalanobisDistance;
	
	public Distance() {
		this.cityBlockDistance = 0.0;
		this.cebisevDistance = 0.0;
		this.euclidianDistance = 0.0;
		this.mahalanobisDistance = 0.0;
	}

	public double getCityBlockDistance() {
		return cityBlockDistance;
	}

	public void setCityBlockDistance(double cityBlockDistance) {
		this.cityBlockDistance = cityBlockDistance;
	}

	public double getCebisevDistance() {
		return cebisevDistance;
	}

	public void setCebisevDistance(double cebisevDistance) {
		this.cebisevDistance = cebisevDistance;
	}

	public double getEuclidianDistance() {
		return euclidianDistance;
	}

	public void setEuclidianDistance(double euclidianDistance) {
		this.euclidianDistance = euclidianDistance;
	}

	public double getMahalanobisDistance() {
		return mahalanobisDistance;
	}

	public void setMahalanobisDistance(double mahalanobisDistance) {
		this.mahalanobisDistance = mahalanobisDistance;
	}

	
	
	
}
