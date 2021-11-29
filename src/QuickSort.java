import java.util.Arrays;

public class QuickSort {

    int newTab[];
    int length;

    public QuickSort(Reader r){

        newTab = Arrays.copyOf(r.tab, r.tab.length);
        length = newTab.length;
    }
    public void sort() {

        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = newTab[lowerIndex+(higherIndex-lowerIndex)/2];

        while (i <= j) {

            while (newTab[i] < pivot) {
                i++;
            }
            while (newTab[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = newTab[i];
        newTab[i] = newTab[j];
        newTab[j] = temp;
    }
}


