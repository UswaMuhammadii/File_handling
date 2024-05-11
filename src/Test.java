import java.io.File;
import java.util.ArrayList;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        File file = new File("file.txt");
        ArrayList<Data> list=new ArrayList<>();
        String data=Utility.readFromFile(file);
        System.out.println(data);
        String dataa[]=data.split("\n");
        for(String temp:dataa){
            String arr[]=temp.split(",");
            System.out.println(arr[0]);
        }

    }
}
