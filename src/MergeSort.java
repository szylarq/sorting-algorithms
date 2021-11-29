import java.util.Arrays;

public class MergeSort {

    private int[] newTab;
    private int[] temp;

    private int size;

    public MergeSort(Reader r){

        newTab = Arrays.copyOf(r.tab, r.tab.length);

        size = newTab.length;

        temp = new int [size];
    }

    public void sort() {

        mergesort(0, size - 1);
    }

    private void mergesort(int lowIndex, int highIndex) {

        if (lowIndex < highIndex) {

            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;

            mergesort(lowIndex, middleIndex);

            mergesort(middleIndex + 1, highIndex);

            merge(lowIndex, middleIndex, highIndex);
        }
    }

    private void merge(int lowIndex, int middleIndex, int highIndex) {

        for (int i = lowIndex; i <= highIndex; i++) {
            temp[i] = newTab[i];
        }

        int i = lowIndex;
        int j = middleIndex + 1;
        int k = lowIndex;

        while (i <= middleIndex && j <= highIndex) {
            if (temp[i] <= temp[j]) {
                newTab[k] = temp[i];
                i++;
            }
            else {
                newTab[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middleIndex) {
            newTab[k] = temp[i];
            k++;
            i++;
        }
    }
}