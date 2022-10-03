package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    @DisplayName("랜덤 숫자 추출시 SET 검증 3개 체크")
    void setCheck(){
        Computer computer = new Computer();
        assertThat(computer.randomNumber().size()).isEqualTo(3);
    }

}