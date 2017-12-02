package com.maxiannicu.console;

import com.maxiannicu.console.algorithms.*;
import com.maxiannicu.console.collections.CustomList;
import com.maxiannicu.printing.IntegerFormatter;
import com.maxiannicu.printing.PrintFormatter;
import com.maxiannicu.printing.StringFormatter;
import com.maxiannicu.printing.TwoDigitFormatter;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorCommand implements Command {
    private final Scanner scanner = new Scanner(System.in);
    private final PrintFormatter formatter = new IntegerFormatter(
            new StringFormatter(
                    new TwoDigitFormatter(null)
            )
    );

    @Override
    public void execute() {
        System.out.print("Enter number of elements : ");
        int count = scanner.nextInt();

        Double[] elements = new Double[count];
        for (int i = 0; i < count; i++) {
            System.out.printf("[%d] = ",i);
            elements[i] = scanner.nextDouble();
        }

        double result = getAlgorithm().compute(CustomList.fromArray(elements));
        System.out.print("Result is ");
        formatter.print(result);
        System.out.println();
    }

    private Algorithm getAlgorithm() {
        System.out.println("Please select algorithm");
        System.out.println("1. Min");
        System.out.println("2. Max");
        System.out.println("3. Sum");
        System.out.println("4. Multiply");

        Algorithm algorithm = new NullAlgorithm();
        int algorithmId = scanner.nextInt();

        switch (algorithmId) {
            case 1:
                algorithm = new MinAlgorithm();
                break;
            case 2:
                algorithm = new MaxAlgorithm();
                break;
            case 3:
                algorithm = new SumAlgorithm();
                break;
            case 4:
                algorithm = new MultiplyAlgorithm();
                break;
        }


        return algorithm;
    }
}
