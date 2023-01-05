package br.com.maratonajava.exceptions.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest4 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Dentro do IllegalArgumentException ArrayIndexOutOfBoundsException ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
