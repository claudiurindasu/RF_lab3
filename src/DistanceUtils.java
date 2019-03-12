
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
	protected static double getCebisevDistance(double[] row1, double[] row2)
	{
		double result = 0.0;
		for (int n=0 ;n< row1.length; n++) {
			double currentValue = Math.abs(row1[n] - row2[n]);
			if (currentValue > result) {
				result = currentValue;
			}
		}
		return result;
	}
	protected static double getCityBlockDistance(double[] row1, double[] row2)
	{
		double result=0.0;
		for(int n= 0; n<row1.length;n++) {
		result += Math.abs(row1[n] - row2[n]);
		}
		return result;
	}
	protected static void getDistances(double[][] learningSet) {
		int numberOfPatterns = learningSet.length;
		int numberOfFeatures = learningSet[0].length;
		for(int count = 1; count < numberOfPatterns; count++)
		{
			System.out.println("------------------------------------------------------");
			System.out.println("Euclidian Distance: "+ getEuclidianDistance(learningSet[0], learningSet[count]));
			System.out.println("Mahalanobis Distance: "+ getMahalanobisDistance(learningSet[0],learningSet[count], numberOfPatterns));
			System.out.println("Cebisev Distance: "+ getCebisevDistance(learningSet[0], learningSet[count]));
			System.out.println("City Block Distance: " + getCityBlockDistance(learningSet[0], learningSet[count]));
			System.out.println("------------------------------------------------------");
		}
		System.out.println(String.format("The learning set has %s patters and %s features", numberOfPatterns, numberOfFeatures));
		
	}
	
}
