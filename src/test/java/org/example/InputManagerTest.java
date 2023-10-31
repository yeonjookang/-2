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
        assertDoesNotThrow(()-> InputManager.validMainMenuInput(input_str));
    }

    @Test
    public void 메인메뉴_공백포함_2_입력(){
        //given
        String input_str="2";
        //then
        assertDoesNotThrow(()-> InputManager.validMainMenuInput(input_str));
    }

    @Test
    public void 메인메뉴_3_입력(){
        //given
        String input_str="3";
        //then
        assertDoesNotThrow(()-> InputManager.validMainMenuInput(input_str));
    }

    @Test
    public void 메인메뉴_4_입력_오류(){
        //given
        String input_str="4";
        //then
        assertThrows(IllegalArgumentException.class, () -> InputManager.validMainMenuInput(input_str));
    }

    @Test
    public void 메인메뉴_문자_입력_오류(){
        //given
        String input_str="a";
        //then
        assertThrows(IllegalArgumentException.class, () -> InputManager.validMainMenuInput(input_str));
    }

    @Test
    public void 메인메뉴_특수문자_입력_오류(){
        //given
        String input_str="@";
        //then
        assertThrows(IllegalArgumentException.class, () -> InputManager.validMainMenuInput(input_str));
    }

    @Test
    public void 메인메뉴_빈문자_입력_오류(){
        //given
        String input_str="";
        //then
        assertThrows(IllegalArgumentException.class, () -> InputManager.validMainMenuInput(input_str));
    }

    @Test
    public void 메인메뉴_공백문자_입력_오류(){
        //given
        String input_str=" ";
        //then
        assertThrows(IllegalArgumentException.class, () -> InputManager.validMainMenuInput(input_str));
    }
}