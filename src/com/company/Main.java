package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("Alpabet.txt");
        fileWriter.write("Англиcче алфавитти жана сандарды файлга жазыныз:\n"+
                "Aa\n"+ "Bb\n"+"Cc\n"+"Dd\n"+"Ee\n"+"Ff\n"+"Gg\n"+"Hh\n"+"Ii\n"+
                "Jj\n"+ "Kk\n"+"Ll\n"+"Mm\n"+"Nn\n"+"Oo\n"+"Pp\n"+"Qq\n"+
                "Rr\n"+ "Ss\n"+"Tt\n"+"Uu\n"+"Vv\n"+"Ww\n"+"Xx\n"+"Yy\n"+"Zz\n"+
                "0\n"+ "1\n"+"2\n"+"3\n"+"4\n"+"5\n"+"6\n"+"7\n"+"8\n"+"9");
        fileWriter.close();

        FileReader fileReader=new FileReader("Alpabet.txt");
        Scanner scanner=new Scanner(fileReader);
        System.out.println(scanner.nextLine());
                while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }
}
