package vendingmachine.utils;

public class Message {

    public static String VENDINGMACHINE_INPUT = "자판기가 보유하고 있는 금액을 입력해 주세요.";
    public static String PRODUCTS_INPUT = "상품명과 가격, 수량을 입력해 주세요.";
    public static String AMOUNT_INPUT = "투입 금액을 입력해 주세요.";
    public static String PRODUCT_NAME_INPUT = "구매할 상품명을 입력하세요";
    public static String BALANCE = "투입 금액: %s원\n";
    public static String NULL_INPUT = "입력은 비어있을 수 없습니다";
    public static String DUPLICATE_PRODUCT = "중복된 상품입니다";

    public static String ERROR = "[ERROR]";
    public static String IS_NOT_NUMERIC = "입력값은 숫자여야 합니다.";
    public static String IS_NOT_POSITIVE_VALUE = "입력값은 0 이상의 양수만 가능합니다.";

    public static String IS_NOT_COLLECT_FORM = "상품정보는 [로 시작하여 ]로 끝나야합니다.";
    public static String IS_LOWER_THAN_100 = "상품가격은 100원 이상이어야 합니다";
    public static String IS_UNDIVISIBLE = "상품가격은 10으로 나누어 떨어져야 합니다";

    public static String IS_NOT_FOUNDED_PRODUCT = "존재하지 않는 상품입니다";
    public static String IS_OVER_BALANCE = "잔액이 부족합니다";
    public static String IS_OUT_OF_STOCK = "재고가 부족합니다";
}
