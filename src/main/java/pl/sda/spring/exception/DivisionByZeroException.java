package pl.sda.spring.exception;

public class DivisionByZeroException extends RuntimeException {

    public DivisionByZeroException() {
        super("Nie wolno dzielić przez 0!");
    }
}
