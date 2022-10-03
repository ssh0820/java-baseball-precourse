package baseball.common;

public class ExcMessage {

    public static final String INPUT = "숫자를 입력해주세요 : ";
    public static final String ASK = "3개의 숫자를 모두 맞히셨습니다.! 게임종료\n 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요\n";
    public static final String NUMBER_REGEX = "^[1-9]{3}$";

    public final static String ERROR_EMPTY = "값을 입력해주세요.\n";
    public final static String ERROR_NUMBER_DUC = "중복된 숫자가 있습니다!";
    public final static String ERROR_EXCEPTION = "1~9 사이의 숫자를 입력해주세요.\n";
    public final static String ERROR_LENGTH = "3자리를 입력해주세요.\n";
}
