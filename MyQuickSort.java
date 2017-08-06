package sortingAlgo;

public class MyQuickSort {
    
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        
        while (i <= j) {
           
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
            	System.out.println("exchange i: "+ i+" j: "+j);
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j){
        	System.out.println("lowerIndex: "+lowerIndex + " j: "+j +" pivot: "+pivot);
        	quickSort(lowerIndex, j);
        }if (i < higherIndex)
        {   System.out.println("i: "+i + " higherIndex: "+higherIndex +" pivot: "+pivot);
        	quickSort(i, higherIndex);
    
        }
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        MyQuickSort sorter = new MyQuickSort();
        int[] input = {1,12,5,26,7,14,3,7,2};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}