import calculations.CalcOfModVSFreq;
import inputData.SumOfFunctions;

import java.util.Arrays;
import java.util.HashMap;

public class FourierTransform {
    public static void main(String[] args) {

        CalcOfModVSFreq calcOfMod = new CalcOfModVSFreq(0);
        int samplingFrequency = calcOfMod.samplingFrequency;
        int maxTestedHarmonic = samplingFrequency / 2;

        double[] modules = new double[maxTestedHarmonic + 1];
        int[] frequency = new int[maxTestedHarmonic + 1];

        SumOfFunctions sumOfFunctions = new SumOfFunctions();

        HashMap<Integer, Double> dataMap = new HashMap<>();

        for (int i = 0; i <= maxTestedHarmonic; i++) {
            int testedFrequency = i * sumOfFunctions.baseFrequency;
            CalcOfModVSFreq calcOfModVSFreq = new CalcOfModVSFreq(testedFrequency);

            modules[i] = calcOfModVSFreq.definitionOfModule();
            frequency[i] = testedFrequency;

            dataMap.put(frequency[i], modules[i]);
        }
        System.out.println(Arrays.toString(frequency));
        System.out.println(Arrays.toString(modules));

        for (int freq : dataMap.keySet()) {
            System.out.println(freq);
            //System.out.printf("At a frequency of %d Hz the signal magnitude is %f%n", freq, dataMap.get(freq));
        }
    }
}