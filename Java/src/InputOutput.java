import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputOutput {


    public static void main(String[] args) throws IOException {

        String line = null;

        Pattern pat;
        Matcher mat;

        pat = Pattern.compile("ra");

        mat = pat.matcher("Amaira Arora is daughter of Sachin Arora and Gunjan Arora");
        //System.out.println(mat.find());

        while(mat.find()) {
            System.out.println(mat.start());
            System.out.println(mat.end());
            System.out.println(mat.group());
        }

        //System.out.println(mat.);




        /*
        File source = new File("D:\\JavaIO\\InputFile.txt");
        Scanner scan = new Scanner(source);
        scan.useDelimiter("/");

        while(scan.hasNext()) {
            //scan.delimiter();

            System.out.println(scan.nextLine());
        }
       */



        /*

        FileReader fr = new FileReader("D:\\JavaIO\\InputFile.txt");

        BufferedReader br = new BufferedReader(fr);

        try {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch(Exception io)
        {
            System.out.println("Exception stack trace is " + io.getMessage());
        }

        FileWriter fw = new FileWriter("D:\\JavaIO\\InputFile.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        try {
            bw.write("I Can't Quit You Baby / BBC Sessions / Led Zeppelin");
            bw.close();
        }
        catch(Exception io)
        {
            System.out.println("Exception stack trace is " + io.getMessage());
        }

         */


    }
}