package com.dicoding.javafundamental.basic.cobaAccessModifier;

public class mainClassA {

    public static void main(String[] args){

        classA classA = new classA();

        //System.out.println(classA.functionA()); not accessible since this is private function
        //System.out.println(classA.memberA); not accessible since this is private member
        System.out.println(classA.memberB); // accessible because this is default member inside package
        System.out.println(classA.functionB()); // accessible because this is default member inside package
        classA.functionD(); // accessible because this is protected function inside package
        classA.functionE(); // accessible because this is public function

        /*

        default access modifier cannot be access outside package

        */

    }

}
