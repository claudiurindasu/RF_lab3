
public class DistanceUtils {
	
	
	
	protected static float getEuclidianDistance(double[] row1, double[] row2)
	{
		float result;
		result = (float) Math.sqrt(Math.pow(row1[0]-row2[0] , 2) + Math.pow(row1[1]-row2[1],2));
		return result;
	}
	
	protected static float getMahalanobisDistance(double[] row1, double[] row2, double n)
	{
		float result;
		result = (float) Math.pow((Math.pow(row1[0] - row2[0],n)) + Math.pow(row1[1] - row2[1] , n) + Math.pow(row1[2] - row2[2],n),1/n);
		return result;
	}
}
