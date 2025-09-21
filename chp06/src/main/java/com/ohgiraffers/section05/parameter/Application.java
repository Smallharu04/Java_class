package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {
        ParameterTest parameterTest = new ParameterTest();

        int num = 0;
        parameterTest.testPrimaryTypeParameter(num);
        System.out.println("main num : " + num);

        int[] arr = {1, 2, 3, 4, 5};
        parameterTest.testPrimaryTypeArrayParameter(arr);
        System.out.println("main arr[0] : " + arr[0]);


//        Rectangle rectangle = new Rectangle(5.5, 7.5)
//        ParmeterTest.testClassType

    }
}
