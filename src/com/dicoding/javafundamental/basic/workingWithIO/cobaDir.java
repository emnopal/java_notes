package com.dicoding.javafundamental.basic.workingWithIO;

public class cobaDir {
    public static void main(String[] args){

        // get current directory
        classIO dir = new classIO();
        dir.printDir();

        // Create directory
        String dir_path = dir.getDir();
        //String add_dir = dir_path + "\\coba_path";
        //dir.bikinDir(add_dir);

        //list file in dir
        String dirs = dir_path + "\\src\\com\\dicoding\\javafundamental\\basic";
        dir.listDir(dirs);

    }
}
