package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputManagerTest {
    @Test
    public void 메인메뉴_1_입력(){
        //given
        String input_str="1";
        //then
        Assertions.assertEquals(1,InputManager.is_valid_main_menu_input(input_str));
    }

    @Test
    public void 메인메뉴_공백포함_2_입력(){
        //given
        String input_str="2";
        //then
        Assertions.assertEquals(2,InputManager.is_valid_main_menu_input(input_str));
    }

    @Test
    public void 메인메뉴_3_입력(){
        //given
        String input_str="3";
        //then
        Assertions.assertEquals(3,InputManager.is_valid_main_menu_input(input_str));
    }

    @Test
    public void 메인메뉴_4_입력_오류(){
        //given
        String input_str="4";
        //then
        Assertions.assertEquals(-1,InputManager.is_valid_main_menu_input(input_str));
    }

    @Test
    public void 메인메뉴_문자_입력_오류(){
        //given
        String input_str="a";
        //then
        Assertions.assertEquals(-1,InputManager.is_valid_main_menu_input(input_str));
    }

    @Test
    public void 메인메뉴_특수문자_입력_오류(){
        //given
        String input_str="@";
        //then
        Assertions.assertEquals(-1,InputManager.is_valid_main_menu_input(input_str));
    }

    @Test
    public void 메인메뉴_빈문자_입력_오류(){
        //given
        String input_str="";
        //then
        Assertions.assertEquals(-1,InputManager.is_valid_main_menu_input(input_str));
    }

    @Test
    public void 메인메뉴_공백문자_입력_오류(){
        //given
        String input_str=" ";
        //then
        Assertions.assertEquals(-1,InputManager.is_valid_main_menu_input(input_str));
    }
}