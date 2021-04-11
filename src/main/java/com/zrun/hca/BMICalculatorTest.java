package com.zrun.hca;

/**
 * @author arun on 4/10/21
 */
public class BMICalculatorTest {
    private static final double BMI_THRESHOLD = 25.0;

    public static boolean isDietRecommended(double weight, double height) {
        if (height == 0.0 || weight == 0.0) {
            throw new ArithmeticException();
        }

        double bmi = weight / (height * height);

        return !(bmi < BMI_THRESHOLD);
    }
}
