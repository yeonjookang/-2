package org.example;

import org.example.domain.UserMoney;

public class PurchaseManager {

    public void start() {
        System.out.println("=== 음료 구매 ===");
        String userMoney1000 = getUserMoney(1000);
        String userMoney500 = getUserMoney(500);

        UserMoney user_money = new UserMoney(Integer.parseInt(userMoney1000),Integer.parseInt(userMoney500));
    }

    public static String getUserMoney(int billValue) {
        while (true) {
            try {
                System.out.println("금액(" + billValue + "원권)을 투입하세요.");
                String input_str = InputManager.get_bill_num();
                System.out.println("\n"+billValue + "원권 " + input_str + "개가 투입되었습니다.");
                return input_str;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
