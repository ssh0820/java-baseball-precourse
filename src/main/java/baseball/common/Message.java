package baseball.common;

public class Message {
    public static final int NUMBER_LENGTH = 3;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;
    public final static String BALL = "볼";
    public final static String STRIKE = "스트라이크";
    public final static String TREE_STRIKE = "3스트라이크";
    public final static String NOTHING = "낫싱";
    public final static String GAME_END = "게임 종료";
    public final static String CONTINUE = "1";
    public final static String END = "2";
    public final static String INPUT = "숫자를 입력해주세요 : ";
    public final static String ASK = "3개의 숫자를 모두 맞히셨습니다.! 게임종료\n 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요\n";
    public final static String NUMBER_REGEX = "^[1-9]{3}$";
    public final static String ERROR_EMPTY = "값을 입력해주세요.\n";
    public final static String ERROR_NUMBER_DUC = "중복된 숫자가 있습니다!";
    public final static String ERROR_EXCEPTION = "1~9 사이의 숫자를 입력해주세요.\n";
    public final static String ERROR_LENGTH = "3자리를 입력해주세요.\n";
}
