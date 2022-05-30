package com.dicoding.javafundamental.basic.cobaIO;

import java.io.*;

public class cobaIO {

    // 8 Bit IO aka ByteStream
    private FileInputStream inByte = null;
    private FileOutputStream outByte = null;

    // 16 Bit IO aka CharacterStream
    private FileReader inChar = null;
    private FileWriter outChar = null;

    private String input = null;
    private String output = null;

    /// Constructor
    public cobaIO(String input, String output){
        this.input = input;
        this.output = output;
    }

    // Byte Stream, to store 8 bit data
    public void ByteIO(){
        try {
            FileInputStream inByte = new FileInputStream(input);
            FileOutputStream outByte = new FileOutputStream(output);
            int c;
            while ((c = inByte.read()) != -1) {
                outByte.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inByte != null) {
                    inByte.close();
                }
                if (outByte != null) {
                    outByte.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void CharIO(){
        try {
            FileReader inChar = new FileReader(input);
            FileWriter outChar = new FileWriter(output);
            int c;
            while ((c = inChar.read()) != -1) {
                outChar.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inChar != null) {
                    inChar.close();
                }
                if (outChar != null) {
                    outChar.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
