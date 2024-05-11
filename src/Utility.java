import java.io.*;

    public class Utility {

        public static void writeToFile(File file, String text) {

            try {
                FileWriter fileWriter=new FileWriter(file, true);
                BufferedWriter writer=new BufferedWriter(fileWriter);

                fileWriter.write(text);
                writer.newLine();
                writer.close();
            }
            catch (Exception e) {

            }
        }

        public static String readFromFile(File file) {
            String data="";
            try {

                FileReader fileReader=new FileReader(file);
                BufferedReader reader=new BufferedReader(fileReader);
                String text="";
                while((text=reader.readLine())!=null){
                    data+=text+"\n";
                }

            }
            catch (FileNotFoundException e){

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            return data;
        }
}


