package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("사용자가 3개의 값만 입력했을때")
    void inputlength3(){
        User user = new User();
        assertTrue(user.inputValidation("123"));
    }

    @Test
    @DisplayName("사용자가 2개의 값만 입력했을때")
    void inputlength2(){
        User user = new User();
        assertThatIllegalArgumentException().isThrownBy(()-> user.inputValidation("12"));
    }

    @Test
    @DisplayName("사용자가 4개의 값만 입력했을때")
    void inputlength4(){
        User user = new User();
        assertThatIllegalArgumentException().isThrownBy(()-> user.inputValidation("1234"));
    }

    @Test
    @DisplayName("사용자가 특수문자를 입력했을때")
    void inputlength_(){
        User user = new User();
        assertThatIllegalArgumentException().isThrownBy(()-> user.inputValidation("@@"));
    }

}