import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    private void quickSort(String typeOfSeries, int length) throws FileNotFoundException {

        String name;
        double timeStop;
        double timeStart;
        String number = chooseNumber(length);

        timeStart = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {

            name = i + "." + number + " " + typeOfSeries + ".txt";

            new QuickSort(new Reader(name, length)).sort();
        }
        timeStop = System.currentTimeMillis();

        System.out.println("QuickSort " + number + " " + typeOfSeries + ": " + (timeStop - timeStart));
    }

    private void selectSort(String typeOfSeries, int length) throws FileNotFoundException{

        String name;
        double timeStop;
        double timeStart;
        String number = chooseNumber(length);

        timeStart = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {

            name = i + "." + number + " " + typeOfSeries + ".txt";

            new SelectSort(new Reader(name, length)).sort();
        }
        timeStop = System.currentTimeMillis();

        System.out.println("SelectSort " + number + " " + typeOfSeries + ": " + (timeStop - timeStart));
    }

    private void mergeSort(String typeOfSeries, int length) throws FileNotFoundException{

        String name;
        double timeStop;
        double timeStart;
        String number = chooseNumber(length);

        timeStart = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {

            name = i + "." + number + " " + typeOfSeries + ".txt";

            new MergeSort(new Reader(name, length)).sort();
        }
        timeStop = System.currentTimeMillis();

        System.out.println("MergeSort " + number + " " + typeOfSeries + ": " + (timeStop - timeStart));
    }

    private String chooseNumber(int length){

        if(length == 10000){
            return "10k";
        }
        else if(length == 50000){
            return "50k";
        }
        else if(length == 100000){
            return "100k";
        }
        else if(length == 500000){
            return "500k";
        }
        else if(length == 1000000){
            return "1M";
        }
        return null;
    }

    public static void main(String[] args) throws IOException {

        Main main = new Main();

        // Sorting series 10k long:

        main.quickSort("FullSorted", 10000);
        main.quickSort("SortedInAHalf", 10000);
        main.quickSort("ReverseSorted", 10000);
        main.quickSort("RandomOrder", 10000);

        System.out.println("");

        main.selectSort("FullSorted", 10000);
        main.selectSort("SortedInAHalf", 10000);
        main.selectSort("ReverseSorted", 10000);
        main.selectSort("RandomOrder", 10000);

        System.out.println("");

        main.mergeSort("FullSorted", 10000);
        main.mergeSort("SortedInAHalf", 10000);
        main.mergeSort("ReverseSorted", 10000);
        main.mergeSort("RandomOrder", 10000);

        System.out.println("");
        System.out.println("");

        // Sorting series 50k long:

        main.quickSort("FullSorted", 50000);
        main.quickSort("SortedInAHalf", 50000);
        main.quickSort("ReverseSorted", 50000);
        main.quickSort("RandomOrder", 50000);

        System.out.println("");

        main.selectSort("FullSorted", 50000);
        main.selectSort("SortedInAHalf", 50000);
        main.selectSort("ReverseSorted", 50000);
        main.selectSort("RandomOrder", 50000);

        System.out.println("");

        main.mergeSort("FullSorted", 50000);
        main.mergeSort("SortedInAHalf", 50000);
        main.mergeSort("ReverseSorted", 50000);
        main.mergeSort("RandomOrder", 50000);

        System.out.println("");
        System.out.println("");

        // Sorting series 100k long:

        main.quickSort("FullSorted", 100000);
        main.quickSort("SortedInAHalf", 100000);
        main.quickSort("ReverseSorted", 100000);
        main.quickSort("RandomOrder", 100000);

        System.out.println("");

        main.selectSort("FullSorted", 100000);
        main.selectSort("SortedInAHalf", 100000);
        main.selectSort("ReverseSorted", 100000);
        main.selectSort("RandomOrder", 100000);

        System.out.println("");

        main.mergeSort("FullSorted", 100000);
        main.mergeSort("SortedInAHalf", 100000);
        main.mergeSort("ReverseSorted", 100000);
        main.mergeSort("RandomOrder", 100000);

        System.out.println("");
        System.out.println("");

        // Sorting series 500k long:

        main.quickSort("FullSorted", 500000);
        main.quickSort("SortedInAHalf", 500000);
        main.quickSort("ReverseSorted", 500000);
        main.quickSort("RandomOrder", 500000);

        System.out.println("");
        main.selectSort("FullSorted", 500000);
        main.selectSort("SortedInAHalf", 500000);
        main.selectSort("ReverseSorted", 500000);
        main.selectSort("RandomOrder", 500000);

        System.out.println("");

        main.mergeSort("FullSorted", 500000);
        main.mergeSort("SortedInAHalf", 500000);
        main.mergeSort("ReverseSorted", 500000);
        main.mergeSort("RandomOrder", 500000);

        System.out.println("");
        System.out.println("");

        // Sorting series 1M long:

        main.quickSort("FullSorted", 1000000);
        main.quickSort("SortedInAHalf", 1000000);
        main.quickSort("ReverseSorted", 1000000);
        main.quickSort("RandomOrder", 1000000);

        System.out.println("");

        main.selectSort("FullSorted", 1000000);
        main.selectSort("SortedInAHalf", 1000000);
        main.selectSort("ReverseSorted", 1000000);
        main.selectSort("RandomOrder", 1000000);

        System.out.println("");

        main.mergeSort("FullSorted", 1000000);
        main.mergeSort("SortedInAHalf", 1000000);
        main.mergeSort("ReverseSorted", 1000000);
        main.mergeSort("RandomOrder", 1000000);
    }

}