package oop.workspace.Algorithm;

import java.util.Arrays;

class
LinearSearch{
    // Danh sách hoặc mảng được duyệt tuần tự và mọi phần tử đều được kiểm tra. Time O(N)
    static int[] arr = { 5, 15, 6, 9, 4 };
    static int linearSearch(int arr[], int size, int key) {
        if (size == 0) {
            return -1;
        } else if (arr[size - 1] == key) {
            return size - 1;
        } else {
            return linearSearch(arr, size - 1, key);
        }
    }

    public static void main(String[] args) {
        int key = 9;
        int index = linearSearch(arr, arr.length, key);
        if (index != -1)
            System.out.println("The element " + key + " is found at " + index + " index of the given array.");
        else
            System.out.println("The element " + key + " is not found.");
    }
}

class BinarySearch {
    //Chia để trị, chia đôi khoảng thời gian tìm kiếm nhiều lần. Time O (log n)
    public static int binarySearch(int arr[], int left, int right, int key) {
        if (left <= right) {
            int middle = (right - left) / 2;
            if (arr[middle] == key)
                return middle;
            if (arr[middle] > key)
                return binarySearch(arr, left, middle - 1, key);
            if (arr[middle] < key)
                return binarySearch(arr, middle + 1, right, key);
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch object = new BinarySearch();
        int arr[] = {2, 3, 4, 5, 6 ,7 ,8 ,9,10};
        int n = arr.length;
        int key = 10;
        int result = object.binarySearch(arr, 0, n - 1, key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

class TernarySearch{
//Kỹ thuật trong khoa học máy tính dùng để tìm kiếm giá trị lớn nhất (maximum) hay nhỏ nhất (minimum) của một unimodal function
//Time O (log [n]) trong đó cơ số của log = 3
    static int ternarySearch(int arr[], int left, int right, int key) {
        if (left <= right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;
            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }
            if (key < arr[mid1]) {
                return ternarySearch(arr, left, mid1 - 1, key);
            }
            else if (key > arr[mid2]) {
                return ternarySearch(arr, mid2 + 1, right, key);
            }
            else {
                return ternarySearch(arr, mid1 + 1, mid2 - 1, key);
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int left, right, object, key;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        left = 0;
        right = 9;
        key = 5;
        object = ternarySearch(arr, left, right, key);
        System.out.println("Index of " + key + " is " + object);
        key = 50;
        object = ternarySearch(arr, left, right, key);
        System.out.println("Index of " + key + " is " + object);
    }
}

class JumpSearch {
    //Phần tử tìm kiếm sẽ nằm trong khoảng của nhảy mà chứa phần từ lớn hơn giá trị tìm kiếm. Time 0(sqrt(n))
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;
        while (arr[Math.min(step, n)-1] < x) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
        while (arr[prev] < x) {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }
        if (arr[prev] == x)
            return prev;

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 55;
        int index = jumpSearch(arr, x);
        System.out.println("Number " + x + " is at index " + index);
    }
}

class InterpolationSearch {
//Tìm kiếm một từ trong từ điển. Thuật toán tìm kiếm nội suy cải thiện thuật toán tìm kiếm nhị phân.
// Công thức tìm giá trị là: K = data-low/high-low.
    public static int interpolationSearch(int arr[], int left, int right, int x) {
        int position;
        if (left <= right && x >= arr[left] && x <= arr[right]) {
            position = left + (((right - left) / (arr[right] - arr[left])) * (x - arr[left]));
            if (arr[position] == x)
                return position;
            if (arr[position] < x)
                return interpolationSearch(arr, position + 1, right, x);
            if (arr[position] > x)
                return interpolationSearch(arr, left, position - 1, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };
        int n = arr.length;
        int x = 18;
        int index = interpolationSearch(arr, 0, n - 1, x);
        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }
}
class ExponentialSearch{
//Bắt đầu với kích thước mảng con 1, so sánh phần tử cuối cùng của nó với x, sau đó thử kích thước 2, rồi 4. Time O(Log n)
    static int exponentialSearch(int arr[], int n, int x) {
        if (arr[0] == x)
            return 0;
        int i = 1;
        while (i < n && arr[i] <= x)
            i = i*2;
        return Arrays.binarySearch(arr, i/2, Math.min(i, n-1), x);
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int result = exponentialSearch(arr, arr.length, x);
        System.out.println((result < 0) ? "Element is not present in array" : "Element is present at index " + result);
    }
}



