package com.rumwei.typeconvert;


public class TypeConvert {

    /*
    * @Param: String input
    * @Return: Integer
    * */
    public static Integer StringToInteger(String input){
        if (input != null){
            return Integer.parseInt(input);
        }
        return null;
    }
}
