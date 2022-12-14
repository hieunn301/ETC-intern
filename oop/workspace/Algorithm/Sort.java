package oop.workspace.Algorithm;

class SelectionSort {
    static void selectionSort(int[] array) {
        for (int step = 0; step < array.length - 1; step++) {
            int min = step;
            for (int i = step + 1; i < array.length; i++)
                if (array[i] < array[min])
                    min = i;
            int temp = array[step];
            array[step] = array[min];
            array[min] = temp;
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {
        int[] array = { 29, 72, 98, 13, 87, 66, 52 };
        System.out.println("Sorted array");
        selectionSort(array);
        printArray(array);
    }
}

class BubbleSort {
    static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {
        int[] array = { 29, 72, 98, 13, 87, 66, 52 };
        System.out.println("Sorted array");
        bubbleSort(array);
        printArray(array);
    }
}

class InsertionSort {
    static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6 };
        System.out.println("Insertion Sort ");
        insertionSort(array);
        printArray(array);
    }
}

class MergeSort {
    static void merge(int array[], int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int Left[] = new int[n1];
        int Right[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            Left[i] = array[left + i];

        for (int j = 0; j < n2; ++j)
            Right[j] = array[middle + 1 + j];
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                array[k] = Left[i];
                i++;
            } else {
                array[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = Left[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = Right[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int array[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given Array");
        printArray(array);
        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted array");
        printArray(array);
    }
}

class QuickSort {
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {
        int[] array = { 10, 7, 8, 9, 1, 5 };
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array: ");
        printArray(array, array.length);
    }
}

class HeapSort {
    public void sort(int arr[]) {
        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);
        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    void heapify(int array[], int N, int i) {
        int largest = i;
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2
        if (left < N && array[left] > array[largest])
            largest = left;
        if (right < N && array[right] > array[largest])
            largest = right;
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapify(array, N, largest);
        }
    }
    static void printArray(int array[]) {
        int N = array.length;
        for (int i = 0; i < N; ++i)
            System.out.print(array[i] + " ");
    }
    public static void main(String args[]) {
        int array[] = { 12, 11, 13, 5, 6, 7 };
        int N = array.length;
        HeapSort object = new HeapSort();
        object.sort(array);
        System.out.println("Sorted array is");
        printArray(array);
    }
}