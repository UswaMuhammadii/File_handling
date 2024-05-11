import java.io.File;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
   File file = new File("file.txt");

        Data data = new Data("uswa@gmail.com","name","bn");

        ArrayList<Data> dataa = new ArrayList<Data>();
        dataa.add(new Data("abc@gmail.com","name1","cv"));
        dataa.add(new Data("xyz@gmail.com","name2","vb"));


        Utility1.writObject(file,dataa);
        ArrayList<Data> data1 = (ArrayList<Data>) Utility1.readObject(file);

        for (Data std : data1)
            System.out.println(std);
    }
}
