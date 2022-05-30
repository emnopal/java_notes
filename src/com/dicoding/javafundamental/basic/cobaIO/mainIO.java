package com.dicoding.javafundamental.basic.cobaIO;

public class mainIO {

    public static void main(String[] args) {

        String in = "Input.txt";
        String out = "Output.txt";

        // ByteStream
        cobaIO IOByte = new cobaIO(in, out);
        IOByte.ByteIO();

        //CharStream
        cobaIO IOStream = new cobaIO(in, out);
        IOStream.CharIO();

        /*

        Penggunaan komponen byte streams FileInputStream dan FileOutputStream
        tidak jauh beda. Sebabnya, di dalam FileReader dan FileWriter terdapat
        komponen byte streams tersebut. Yang membedakan adalah FileReader dan
        FileWriter dapat membaca data 2 bytes dalam satu waktu.

        Lalu apakah kita harus menggunakan byte streams atau character streams?
        Byte streams termasuk low-level I/O, jadi gunakanlah ketika ingin memproses
        data primitive. Ketika data yang ingin kita proses memiliki character dengan
        Unicode conventions maka sebaiknya gunakan character streams.

         */

    }
}
