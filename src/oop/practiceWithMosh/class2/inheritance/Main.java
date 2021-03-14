package oop.practiceWithMosh.class2.inheritance;

import oop.practiceWithMosh.class1.TextBox;

public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(),new CheckBox()};
        for(var control : controls){
            control.render();
        }
    }

}
