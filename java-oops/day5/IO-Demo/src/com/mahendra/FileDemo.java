package com.mahendra;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\web");
            if(file.exists()){
                System.out.println("It does Exists!");
            }
            if(file.isDirectory()){
                System.out.println("Its a directory!");
            }
            else
            {
                System.out.println("Its not a directory!");
            }
            File newFile = new File(file,"data.txt");
            if(newFile.exists()){
                System.out.println("File already exists!");
            }else{
                System.out.println("Creating a new one");
                newFile.createNewFile();
            }
        }catch(IOException ex){
            System.out.println("Unable to create!");
        }
    }
}
