package com.anu.githubrest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class filetest {

   public static void main(String args[]) throws FileNotFoundException{		
      File file=new File("file.txt");
      FileReader fr = new FileReader(file); 
   }
   
}