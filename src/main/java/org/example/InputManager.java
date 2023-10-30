package org.example;

import java.util.Scanner;

public class InputManager {
    static Scanner scanner = new Scanner(System.in);
    public static int get_main_menu_num() {
        System.out.print("메뉴 번호를 입력하세요. >>>");
        String input_str = scanner.nextLine();

        return is_valid_main_menu_input(input_str);
    }

    public static int is_valid_main_menu_input(String inputStr) {
        try{
            int inputNum = Integer.parseInt(inputStr);
            if(inputNum<1 || inputNum>3){
                System.out.println("유효하지 않은 범위의 메뉴입니다.");
                return -1;
            }
            return inputNum;
        }
        catch (NumberFormatException e){
            System.out.println("숫자를 입력해주세요.");
            return -1;
        }
    }
}
