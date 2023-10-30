package org.example;

public class VendingMachine {
    public boolean start() {
        print_main_menu();
        int mainMenuInput = InputManager.get_main_menu_num();
        return handle_main_menu(mainMenuInput);
    }

    private boolean handle_main_menu(int mainMenuInput) {
        if(mainMenuInput==1){
            //음료 구매 메뉴
            return true;
        } else if (mainMenuInput==2) {
            //유지 보수 메뉴
            return true;
        } else if (mainMenuInput==3) {
            //프로그램 종료
            System.out.println("프로그램이 종료되었습니다.");
            return false;
        }
        return true; //입력 오류
    }

    private void print_main_menu() {
        System.out.println("==== 음료 자판기 ====");
        System.out.println("1. 음료 구매");
        System.out.println("2. 유지 보수");
        System.out.println("3. 자판기 종료\n");
    }
}
