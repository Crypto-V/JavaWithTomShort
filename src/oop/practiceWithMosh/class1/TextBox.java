package oop.practiceWithMosh.class1;

import oop.practiceWithMosh.class2.inheritance.UIControl;

public class TextBox extends UIControl {
    private String text = ""; // Filed

//    public TextBox() {
//
//    }


    @Override
    public void render() {

        System.out.println("Render textbox");
    }

    @Override
    public String toString(){

        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

    public String getText(){
        return text;
    }




}
