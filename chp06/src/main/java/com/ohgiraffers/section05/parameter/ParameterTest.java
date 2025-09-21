package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num) {
        num += 10;
        System.out.println("testPrimaryTypeParameter" + num);
    }

    public void testPrimaryTypeArrayParameter(int[] arr) {
        arr[0] = 100;
        System.out.println("testPrimaryTypeArrayParameter" + arr[0]);
    }

    public void testClassTypeParameter(Rectangle rectangle) {
        rectangle.setWidth(12.5);
        rectangle.setHeight(15.5);
        System.out.println("testClassTypeParameter" + rectangle.getWidth() + rectangle.getHeight());
    }
}
