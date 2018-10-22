package com.mahendra;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\users\\mahen"); //FileSystems.getDefault().getPath("/users/mahen");
        System.out.println(path); //Call toString()
        System.out.println(path.toUri());
        System.out.println(path.getName(1));
        Iterator it = FileSystems.getDefault().getRootDirectories().iterator();
        System.out.println("Root Directories (Drives in Windows)");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
