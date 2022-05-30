/*

Ini adalah package lain

 */

package com.dicoding.javafundamental.basic.cobaAccessModifierPackageLain;

import com.dicoding.javafundamental.basic.cobaAccessModifier.classA;
import com.dicoding.javafundamental.basic.cobaAccessModifier.cobaStatic;

public class mainAccessModifier {

    public static void main(String[] args){

        System.out.println("Metode Class");

        classA classA = new classA();
        accessModifierClassB classB = new accessModifierClassB();

        //System.out.println(classA.functionA()); not accessible since this is private function
        //System.out.println(classA.memberA); not accessible since this is private member

        /*

        default access modifier cannot be access outside package

        */

        //System.out.println(classA.memberB); // not accessible because this is default member is outside package
        //System.out.println(classA.functionB()); // not accessible because this is default function is outside package

        System.out.println(classA.functionC());
        //classA.functionD(); // not accessible because this is protected function is outside package
        classB.functionD(); // accessible because this protected function has override to classB
        classA.functionE(); //accessible because this is public function

        System.out.println();
        System.out.println("Metode Static");

        System.out.println(cobaStatic.varA); // gaperlu buat object
        System.out.println(cobaStatic.varB); // gaperlu buat object


    }


}
