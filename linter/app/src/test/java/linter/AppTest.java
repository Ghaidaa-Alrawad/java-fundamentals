package linter.app.src.test.java.linter;

import linter.app.src.main.java.linter.App;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testNoErrorFile() {
        Path filePath = Path.of("linter/app/src/test/resources/noError.js");
        List<String> errors = App.findMissingSemicolons(filePath);
        List<String> expected = new ArrayList<>();
        Assertions.assertEquals(expected, errors);

        if (errors.isEmpty()) {
            System.out.println("No errors found in noError.js");
        } else {
            System.out.println("Errors found in noError.js:");
            for (String error : errors) {
                System.out.println(error);
            }
        }
    }

    @Test
    public void testOneErrorFile() {
        Path filePath = Path.of("linter/app/src/test/resources/oneError.js");
        List<String> errors = App.findMissingSemicolons(filePath);
        List<String> expected = new ArrayList<>();
        expected.add("Line 3: Missing semicolon.");
        Assertions.assertEquals(expected, errors);

        if (!errors.isEmpty()) {
            System.out.println("Errors found in oneError.js:");
            for (String error : errors) {
                System.out.println(error);
            }
        }
    }

    @Test
    public void testEmptyFile() {
        Path filePath = Path.of("linter/app/src/test/resources/empty.js");
        List<String> errors = App.findMissingSemicolons(filePath);
        List<String> expected = new ArrayList<>();
        Assertions.assertEquals(expected, errors);

        if (errors.isEmpty()) {
            System.out.println("No errors found in empty.js");
        } else {
            System.out.println("Errors found in empty.js:");
            for (String error : errors) {
                System.out.println(error);
            }
        }
    }

    @Test
    public void testFewErrorsFile() {
        Path filePath = Path.of("linter/app/src/test/resources/fewErros.js");
        List<String> errors = App.findMissingSemicolons(filePath);
        List<String> expected = new ArrayList<>();
        expected.add("Line 3: Missing semicolon.");
        expected.add("Line 5: Missing semicolon.");
        expected.add("Line 9: Missing semicolon.");
        expected.add("Line 13: Missing semicolon.");
        Assertions.assertEquals(expected, errors);

        if (!errors.isEmpty()) {
            System.out.println("Errors found in fewErrors.js:");
            for (String error : errors) {
                System.out.println(error);
            }
        }
    }
}

