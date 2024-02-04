package inputData;

public class SumOfFunctions {
    public double baseModule = 100;
    public int baseFrequency = 50;
    int quantityOfFunctions;
    int[] arrayOfBaseModuleDivisor = {1, 2, 3, 4, 5, 10, 20};
    int[] arrayOfBaseFrequencyMultiplier = {1, 2, 3, 4, 5, 59, 60};
    double function0 = baseModule / 2;

    public SumOfFunctions() {
    }

    public SumOfFunctions(double baseModule, int baseFrequency, int[] arrayOfBaseModuleDivisor,
                          int[] arrayOfBaseFrequencyMultiplier) {
        this.baseModule = baseModule;
        this.baseFrequency = baseFrequency;
        this.arrayOfBaseModuleDivisor = arrayOfBaseModuleDivisor;
        this.arrayOfBaseFrequencyMultiplier = arrayOfBaseFrequencyMultiplier;
        function0 = baseModule / 2;
    }

    public double sumOfFunc(double time) {
        double sum = 0;
        for (int i = 0; i < arrayOfBaseModuleDivisor.length; i++) {
            Function function = new Function(baseModule / arrayOfBaseModuleDivisor[i],
                    baseFrequency * arrayOfBaseFrequencyMultiplier[i], 0);
            sum += function.calcFuncValue(time);
        }
        return sum + function0;
    }
}