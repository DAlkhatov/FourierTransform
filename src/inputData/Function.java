package inputData;

public class Function {
    final double module;
    final int frequency;
    final double startingAngleInDegrees;

    public Function(double module, int frequency, double startingAngleInDegrees) {
        this.module = module;
        this.frequency = frequency;
        this.startingAngleInDegrees = startingAngleInDegrees;
    }

    public double startingAngelToRadians() {
        return Math.toRadians(startingAngleInDegrees);
    }

    public double calcFuncValue(double time) {
        return Math.sqrt(2) * module * Math.sin(2.0 * Math.PI * frequency * time + startingAngelToRadians());
    }
}