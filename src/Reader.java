
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

    int tab[];

    public Reader(String fileName, int length) throws FileNotFoundException{

        tab = new int[length];

        Scanner scanner = new Scanner (new File(fileName));

            for (int i=0; i < length; i++){
                tab[i] = scanner.nextInt();
            }
            scanner.close();
    }
}