package org.example;

import java.util.Scanner;

public class InputManager {
    static Scanner scanner = new Scanner(System.in);
    public static String get_main_menu_num() throws Exception {
        System.out.print("메뉴 번호를 입력하세요. >>>");
        String input_str = scanner.nextLine();

        validMainMenuInput(input_str);
        return input_str;
    }

    public static void validMainMenuInput(String inputStr){
        try{
            int inputNum = Integer.parseInt(inputStr);
            if(inputNum<1 || inputNum>3){
                throw new IllegalArgumentException("유효하지 않은 범위의 메뉴입니다.");
            }
        }
        catch (Exception e){
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
    }
}
