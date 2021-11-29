import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Generator {

    private int lengthOfSeries;
    private int tab[];

    private Generator(int lengthOfSeries) {
        this.lengthOfSeries = lengthOfSeries;
        tab = new int[lengthOfSeries];
    }

    private void fill() {

        Random random = new Random();
        int value;

        for (int i = 0; i < tab.length; i++) {
            value = random.nextInt();
            tab[i] = value;
        }
    }

    private int[] copy() {

        int[] newTab;
        newTab = Arrays.copyOf(tab, lengthOfSeries);
        return newTab;
    }

    private void sortedInAHalf(String nameOfFile) throws IOException {

        File file = newFile(nameOfFile);
        int temp[] = copy();

        Arrays.sort(temp, 0, (int) (0.5 * lengthOfSeries));
        writer(temp, file);
    }

    private void fullSorted(String nameOfFile) throws IOException {

        File file = newFile(nameOfFile);
        int[] temp = copy();

        Arrays.sort(temp);
        writer(temp, file);
    }

    private void reverseSorted(String nameOfFile) throws IOException {

        File file = newFile(nameOfFile);
        int[] temp = copy();
        Arrays.sort(temp);

        int[] newTab = new int[lengthOfSeries];
        int length = lengthOfSeries;

        for (int i = 0; i < lengthOfSeries; i++) {
            newTab[i] = temp[length - 1];
            length--;
        }
        writer(newTab, file);
    }

    private File newFile(String nameOfFile) {

        return new File(nameOfFile);
    }

    private void randomOrder(String nameOfFile) throws IOException {

        File file = newFile(nameOfFile);

        writer(tab, file);
    }

    private void writer(int[] t, File file) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter(file, true));

        for (int i = 0; i < t.length; i++) {
            pw.print(t[i] + " ");
        }
        pw.println("");
        pw.println("");
        pw.close();

    }

    public static void main(String[] args) throws IOException {

        Generator gen;

        gen= new Generator(10000);

        for(int i =0;i < 100;i++) {

            String name1=i+".10k FullSorted.txt";
            String name2=i+".10k SortedInAHalf.txt";
            String name3=i+".10k ReverseSorted.txt";
            String name4=i+".10k RandomOrder.txt";

            gen.fill();
            gen.fullSorted(name1);
            gen.sortedInAHalf(name2);
            gen.reverseSorted(name3);
            gen.randomOrder(name4);
        }

        gen= new Generator(50000);

        for(int i =0;i < 100;i++) {

            String name1=i+".50k FullSorted.txt";
            String name2=i+".50k SortedInAHalf.txt";
            String name3=i+".50k ReverseSorted.txt";
            String name4=i+".50k RandomOrder.txt";

            gen.fill();
            gen.fullSorted(name1);
            gen.sortedInAHalf(name2);
            gen.reverseSorted(name3);
            gen.randomOrder(name4);
        }

        gen= new Generator(100000);

        for(int i =0;i < 100;i++) {

            String name1=i+".100k FullSorted.txt";
            String name2=i+".100k SortedInAHalf.txt";
            String name3=i+".100k ReverseSorted.txt";
            String name4=i+".100k RandomOrder.txt";

            gen.fill();
            gen.fullSorted(name1);
            gen.sortedInAHalf(name2);
            gen.reverseSorted(name3);
            gen.randomOrder(name4);
        }

        gen= new Generator(500000);

        for(int i =0;i < 100;i++) {

            String name1=i+".500k FullSorted.txt";
            String name2=i+".500k SortedInAHalf.txt";
            String name3=i+".500k ReverseSorted.txt";
            String name4=i+".500k RandomOrder.txt";

            gen.fill();
            gen.fullSorted(name1);
            gen.sortedInAHalf(name2);
            gen.reverseSorted(name3);
            gen.randomOrder(name4);
        }

        gen= new Generator(1000000);

        for(int i =0;i < 100;i++) {

            String name1=i+".1M FullSorted.txt";
            String name2=i+".1M SortedInAHalf.txt";
            String name3=i+".1M ReverseSorted.txt";
            String name4=i+".1M RandomOrder.txt";

            gen.fill();
            gen.fullSorted(name1);
            gen.sortedInAHalf(name2);
            gen.reverseSorted(name3);
            gen.randomOrder(name4);
        }
    }
}


