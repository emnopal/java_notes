package com.dicoding.javafundamental.basic;

// Beda dari
// printf -> print dengan format
// println -> print dengan sesudahnya new line
// print -> normal print tanpa new line sesudahnya

public class cobaPercabangan{

    public static void cobaIfElse(int a){

        if (a != 0){
            System.out.printf("Returning True because %d is not zero", a);
        } else{
            System.out.printf("Returning False because %d is zero", a);
        }

    }

    public static void cobaIfBoolean(){
        boolean b = true;
        if (b){
            System.out.print("Returning True");
        }
    }

    public static void cobaNestedIf(int a){

        if (a > 0){
            System.out.printf("%d is returning True because is greater than 0", a);
        } else if (a < 0){
            System.out.printf("%d is returning False because is smaller than 0", a);
        } else if (a < -100){
            System.out.printf("%d is too small!", a);
        } else if (a > 100){
            System.out.printf("%d is too big!", a);
        } else if (a == 0){
            System.out.printf("%d is zero", a);
        } else {
            System.out.printf("%d wrong number", a);
        }

    }

    public static void cobaSwitchCase(int a){
        switch(a){
            case 1:
                System.out.print("1");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("8");
                break;
            case 9:
                System.out.print("9");
                break;
            case 10:
                System.out.print("10");
                break;
            default:
                System.out.print("0");
                break;
        }
    }

    public static void cobaSwitchCaseTanpaBreak(int a){
        int output = 0;
        switch(a){
            case 1:
                output++;
            case 2:
                output++;
            case 3: // Program akan menjalankan kode di dalam case ini // Output 1
                output++; // Karena di akhir case 3 tidak ada break, maka program akan menjalankan case selanjutnya
                // Kode dibawah akan dijalankan oleh program
            case 4: // Output 2
                output++;
            case 5: // Output 3
                output++;
            case 6: // Output 4
                output++;
            case 7: // Output 5
                output++;
            case 8: // Output 6
                output++;
            case 9: // Output 7
                output++;
            case 10: // Output 8
                output++;
            default: // Output 9
                output++;
        }
        System.out.printf("Nilai akhirnya adalah %d", output); // 9
    }


    public static void main(String[] args){

        int a = 3;

        System.out.println("Coba if dengan nilai boolean:");
        cobaIfBoolean();
        System.out.println();

        System.out.println("Coba if else: ");
        cobaIfElse(a);
        System.out.println();

        System.out.println("Coba Nested if else: ");
        cobaNestedIf(a);
        System.out.println();

        System.out.println("Coba Switch Case: ");
        cobaSwitchCase(a);
        System.out.println();

        System.out.println("Coba Switch Case tanpa Break: ");
        cobaSwitchCaseTanpaBreak(a);
        System.out.println();


    }
}
