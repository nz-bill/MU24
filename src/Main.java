public class Main {
    public static void main(String[] args) {

        IOmanager iOmanager = IOmanager.getInstance();

        //iOmanager.WriteToFileOutputstream();
       // iOmanager.readFromfileInputStream();
        //iOmanager.WriteToffileFileWriter();

        //iOmanager.readFromfileFileReader();
        //iOmanager.writeToFilePrintWriter();
        //iOmanager.readFromFileScanner();
        //iOmanager.readFromFileBufferedreader();
        iOmanager.writeWithBufferedWriter();
    }
}