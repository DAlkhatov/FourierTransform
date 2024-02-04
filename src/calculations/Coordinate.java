package calculations;

import inputData.SumOfFunctions;

public class Coordinate {
    SumOfFunctions sumOfFunctions;
    int testedFrequency;

    Coordinate(int testedFreq) {
        sumOfFunctions = new SumOfFunctions();
        testedFrequency = testedFreq;
    }

    double calcX(double time) {
        if (testedFrequency == 0) {
            return sumOfFunctions.sumOfFunc(time) * Math.cos(2 * Math.PI * testedFrequency * time);
        } else {
            return Math.sqrt(2) * sumOfFunctions.sumOfFunc(time) * Math.cos(2 * Math.PI * testedFrequency * time);
        }
    }

    double calcY(double time) {
        if (testedFrequency == 0) {
            return sumOfFunctions.sumOfFunc(time) * Math.sin(2 * Math.PI * testedFrequency * time);
        } else {
            return Math.sqrt(2) * sumOfFunctions.sumOfFunc(time) * Math.sin(2 * Math.PI * testedFrequency * time);
        }
    }
}