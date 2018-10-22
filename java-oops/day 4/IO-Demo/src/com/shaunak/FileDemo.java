package com.shaunak;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\web");
            if(file.exists()){
                System.out.println("It does exists");
            }
            if(file.isDirectory()){
                System.out.println("It's a Directory");
            }
            else
            {
                System.out.println("It's not a Directory");
            }

            File newFile = new File(file,"abc.txt");
            if(newFile.exists()){
                System.out.println("File Already Exists");

            }
            else {
                System.out.println("Creating a New One");
                newFile.createNewFile();
            }
        }catch(IOException ex){
            System.out.println("Unable to Create!!");
        }
    }
}
