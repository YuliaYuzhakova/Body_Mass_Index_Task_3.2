public class BmiService {
    public double calculate(int weight, double height) {
        double heightInMeters = (height / 100);
        int exponent = 2;
        double heightInExp = Math.pow(heightInMeters, exponent);

        double bmi = (weight / heightInExp);

        return bmi;

        //Формула: bmi = m/h2
        //Где m - масса тела (weight), h - рост в метрах, 2 - степень
        //Рост указывают в см, поэтому отдельно переводим в метры
    }
}

