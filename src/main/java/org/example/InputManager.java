package org.example;

import java.util.Scanner;

public class InputManager {
    public static String get_main_menu_num() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("메뉴 번호를 입력하세요. >>>");
        String input_str = scanner.nextLine();

        validMainMenuInput(input_str);
        return input_str;
    }


    public static String get_bill_num(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("투입할 지폐 개수를 입력하세요(0~100 사이 숫자) >>>");
        String input_str = scanner.nextLine();

        validBillNumInput(input_str);
        return input_str;
    }

    public static void validMainMenuInput(String inputStr){
        try{
            int inputNum = Integer.parseInt(inputStr);
            if(inputNum<1 || inputNum>3){
                throw new IllegalArgumentException("유효하지 않은 범위의 메뉴입니다.");
            }
        }
        catch (NumberFormatException e){
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
    }

    private static void validBillNumInput(String inputStr) {
        try{
            int inputNum = Integer.parseInt(inputStr);
            if(inputNum<0 || inputNum>100){
                throw new IllegalArgumentException("유효하지 않은 범위의 개수입니다.");
            }
        }
        catch (NumberFormatException e){
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
    }
}
