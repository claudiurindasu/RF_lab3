

public class MainClass {
	
	
	public static void main(String[] args) {

		double[][] learningSet;
		try {
			learningSet = FileUtils.readLearningSetFromFile("in.txt");
			
			
			int numberOfPatterns = learningSet.length;
			int numberOfFeatures = learningSet[0].length;
			for(int count = 1; count < numberOfPatterns; count++)
			{
				System.out.println("Euclidian Distance: "+ DistanceUtils.getEuclidianDistance(learningSet[0], learningSet[count]));
				System.out.println("Mahalanobis Distance: "+DistanceUtils.getMahalanobisDistance(learningSet[0],learningSet[count], numberOfPatterns));
			}
			System.out.println(String.format("The learning set has %s patters and %s features", numberOfPatterns, numberOfFeatures));
			
		} catch (USVInputFileCustomException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finished learning set operations");
		}
	}

}
