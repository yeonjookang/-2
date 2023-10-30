package org.example;

public class VendingMachine {
    public void start() throws Exception {
        while(true){
            try{
                print_main_menu();
                int mainMenuInput = Integer.parseInt(InputManager.get_main_menu_num());
                handle_main_menu(mainMenuInput);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    private void handle_main_menu(int mainMenuInput) {
        if(mainMenuInput==1){
            //음료 구매 메뉴
        } else if (mainMenuInput==2) {
            //유지 보수 메뉴
        } else if (mainMenuInput==3) {
            //프로그램 종료
            System.out.println("프로그램이 종료되었습니다.");
        }
        //입력 오류
    }

    private void print_main_menu() {
        System.out.println("==== 음료 자판기 ====");
        System.out.println("1. 음료 구매");
        System.out.println("2. 유지 보수");
        System.out.println("3. 자판기 종료\n");
    }
}
