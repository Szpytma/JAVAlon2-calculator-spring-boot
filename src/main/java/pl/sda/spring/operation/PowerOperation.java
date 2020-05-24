package pl.sda.spring.operation;

import org.springframework.stereotype.Component;


class PowerOperation implements Operation {

    @Override
    public double calculate(double arg1, double arg2) {
        return Math.pow(arg1,arg2);
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.POWER;
    }
}
