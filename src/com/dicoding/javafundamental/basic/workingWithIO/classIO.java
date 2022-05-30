package com.dicoding.javafundamental.basic.workingWithIO;

import java.io.File;

public class classIO implements interfaceIO {

    public String getDir(){
        return dir;
    }

    public void printDir(){
        System.out.printf("Current dir: %s\n", dir);
    }

    public void bikinDir(String dirs){

        File file = new File(dirs);
        file.mkdirs();

        System.out.println("Success Created " + dirs);

        /*

        mkdirs() will create the specified directory path in its entirety where
        mkdir() will only create the bottom most directory, failing if it can't
        find the parent directory of the directory it is trying to create.

         */
    }

    public void listDir(String dirname){

        File file = null;
        String[] paths;

        try {
            // Instansiasi objek File
            file = new File(dirname);
            // Ambil list files dan masukkan ke string paths
            paths = file.list();
            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
