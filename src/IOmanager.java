import java.io.*;
import java.util.Scanner;

public class IOmanager {

    private String fileName = "text.txt";

    private String textContent = "Detta är innehållet som vi vill ska hamna i en textfil";
    private static IOmanager instance;


    private IOmanager(){}

    public static IOmanager getInstance() {

        if(instance == null){
            instance = new IOmanager();
        }
        return instance;
    }

    public void WriteToFileOutputstream()  {


        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(textContent.getBytes());
            System.out.println("text skrevs till fil");
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("nåt gick snett...");
        }

    }

    public void readFromfileInputStream(){

        int content;

        try{
            FileInputStream fileInputStream = new FileInputStream(fileName);
            while((content = fileInputStream.read()) != -1 ){
                System.out.print((char) content);
            }
            fileInputStream.close();

        } catch (IOException e){
            System.out.println("kunde inte läsa från fil");
        }

    }

    public void WriteToffileFileWriter(){

        try{
            FileWriter fileWriter = new FileWriter(fileName);

            fileWriter.write(textContent);
            fileWriter.close();
            System.out.println("text written to file");

        } catch (IOException e){
            System.out.println("nåt gick fel..");
        }
    }

    public void readFromfileFileReader(){
        int content;
        try {
            FileReader fileReader = new FileReader(fileName);
            while((content = fileReader.read()) != -1 ){
                System.out.print((char) content);
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("nåt gick fel...");
        }
    }

    public void writeToFilePrintWriter(){


        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println(textContent);
            printWriter.println(textContent);
            printWriter.println(textContent);
            printWriter.println(textContent);
            printWriter.println(textContent);
            printWriter.println(textContent);
            printWriter.close();

            System.out.println("text sparad");
        } catch (IOException e) {
            System.out.println("nåt gick fel...");
        }

    }

    public void readFromFileScanner(){

        try {
            Scanner scanner = new Scanner(new File(fileName));

            String s = "";

            while (scanner.hasNextLine()){
                s = s + scanner.nextLine() + "\n";
            }

            System.out.println(s);
            scanner.close();

        } catch (IOException e) {
            System.out.println("nåt gick fel");
        }

    }

    public void writeWithBufferedWriter(){


        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(textContent);


            System.out.println("text sparad");
            bufferedWriter.close();


        } catch (IOException e) {
            System.out.println("nåt gick fel");;
        }


    }

    public void readFromFileBufferedreader(){

        String line;
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e){
            System.out.println("nåt gick fel");
        }




    }




}
