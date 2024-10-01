import org.example.PasswordValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PasswordValidatorTest {

    @Test
    void passwordTest_whenPasswordIs8OrMoreDigits_expectTrue() {

        // GIVEN
        String password = "mypassword";
        // WHEN
        boolean actual = (PasswordValidator.isValidPassword (password));
        // THEN
        boolean expected = true;
        assertEquals(expected, actual);

    }


}