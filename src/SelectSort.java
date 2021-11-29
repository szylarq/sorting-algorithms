import java.util.Arrays;

public class SelectSort {

    private int [] newTab;

    public SelectSort(Reader r) {

        newTab = Arrays.copyOf(r.tab, r.tab.length);
    }

    public void sort(){

        int minIndex;
        int minValue;

        for (int i = 0; i < newTab.length -1; i++){
            minIndex = i;
            minValue = newTab[i];

            for (int j = i; j < newTab.length; j++){
                if (newTab[j] < minValue){
                    minValue = newTab[j];
                    minIndex = j;
                }
            }
            newTab[minIndex] = newTab[i];
            newTab[i] = minValue;
        }
    }
}
