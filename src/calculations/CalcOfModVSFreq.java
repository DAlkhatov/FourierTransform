package calculations;

import inputData.SumOfFunctions;

public class CalcOfModVSFreq {
    SumOfFunctions sumOfFunctions;
    int testedFrequency;
    int startedDegree = 90;
    public int samplingFrequency = 120;
    int quantityOfPeriods = 1;
    int quantityOfSamples;
    double deltaTime;
    double deltaOfDegree;

    public CalcOfModVSFreq(int testedFrequency) {
        this.testedFrequency = testedFrequency;
        sumOfFunctions = new SumOfFunctions();
        quantityOfSamples = sumOfFunctions.baseFrequency * samplingFrequency * quantityOfPeriods;
        deltaTime = 1.0 / (sumOfFunctions.baseFrequency * samplingFrequency);
        deltaOfDegree = 360.0 / samplingFrequency;
    }

    public double definitionOfModule() {
        Coordinate coordinate = new Coordinate(testedFrequency);

        double startTime = startedDegree / deltaOfDegree * deltaTime;
        double coordinateX = 0;
        double coordinateY = 0;
        double resultXY;
        for (int j = 0; j <= quantityOfSamples; j++) {
            double coordX = coordinate.calcX(startTime);
            double coordY = coordinate.calcY(startTime);
            startTime += deltaTime;
            coordinateX += coordX;
            coordinateY += coordY;
        }
        coordinateX /= quantityOfSamples;
        coordinateY /= quantityOfSamples;
        resultXY = Math.sqrt(((coordinateX * coordinateX) + (coordinateY * coordinateY)));
        if (resultXY > 0.1) {
            System.out.println("At a frequency of " + testedFrequency + " Hz the signal magnitude is " + resultXY);
        }
        return resultXY;
    }
}