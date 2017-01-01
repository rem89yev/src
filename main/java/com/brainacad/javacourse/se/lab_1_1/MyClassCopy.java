package com.brainacad.javacourse.se.lab_1_1;

import java.io.*;

/**
 * @author Dmytro_Adonin
 * @since 9/9/16
 */
public class MyClassCopy {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Source and destination path to files is expected");
        } else {
            File source = new File(args[0]);
            File destination = new File(args[1]);
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = bis.read(buffer)) > 0) {
                    bos.write(buffer, 0, length);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
