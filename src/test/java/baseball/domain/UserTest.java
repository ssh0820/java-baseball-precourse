package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("사용자 입력값 유효성 체크")
    void inputlengthCheck(){
        User user = new User();

        assertTrue(user.inputValidation("123"));
        assertTrue(user.inputValidation("456"));
        assertTrue(user.inputValidation("789"));

        assertThatIllegalArgumentException().isThrownBy(()-> user.inputValidation("12"));
        assertThatIllegalArgumentException().isThrownBy(()-> user.inputValidation("1234"));
        assertThatIllegalArgumentException().isThrownBy(()-> user.inputValidation("12345"));
        assertThatIllegalArgumentException().isThrownBy(()-> user.inputValidation("aa"));
        assertThatIllegalArgumentException().isThrownBy(()-> user.inputValidation("@@"));
        assertThatIllegalArgumentException().isThrownBy(()-> user.inputValidation("   "));
        assertThatIllegalArgumentException().isThrownBy(()-> user.inputValidation("  1 "));
    }

}