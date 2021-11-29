public class BubbleSortandLinearSearch {


    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    printArray(arr);
                }
    }



    public  int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }



    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            System.out.println("partion index: "+partitionIndex);
            printArray(arr);
            System.out.println("-------------------------------------");


            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);



        }
    }


    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
    public  void merge(
            int[] a, int[] l, int[] r, int left, int right) {
        System.out.println("----- left--------------------");
        printArray(l);
        System.out.println("-------------------------------------");
        System.out.println("----- right--------------------");
        printArray(r);
        System.out.println("-------------------------------------");
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public  void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }


    public static void main(String args[])
    {
        BubbleSortandLinearSearch ob = new BubbleSortandLinearSearch();
        int arr[] = { 85, 78, 45,51, 53,47,49};

        int x,i;
        System.out.println("-----------------unsorted array-----------------");
        ob.printArray(arr);
        System.out.println("------------------------------------------------");
        //ob.bubbleSort(arr);
        /*
        System.out.println("-----------------quick sort-----------------");
        ob.quickSort(arr,0,6);
        System.out.println("---------------------Sorted array---------------");
        ob.printArray(arr);
        */
        System.out.println("-----------------merge sort -----------------");
        ob.mergeSort(arr,arr.length);
        System.out.println("---------------------Sorted array---------------");
        ob.printArray(arr);
        /*
        System.out.println("-----finding an element in an array---------------");

        x=12;

        i= ob.search(arr,  x);
        System.out.println("index of "+x+ " is  " +i);
        */

    }
}
