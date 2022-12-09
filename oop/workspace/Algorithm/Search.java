package oop.workspace.Algorithm;

class LinearSearch<T>{
    // Danh sách hoặc mảng được duyệt tuần tự và mọi phần tử đều được kiểm tra
    public static int[] arr = { 5, 15, 6, 9, 4 };
    public static int linearSearch(int arr[], int size, int key) {
        if (size == 0) {
            return -1;
        } else if (arr[size - 1] == key) {
            return size - 1;
        } else {
            return linearSearch(arr, size - 1, key);
        }
    }

    public static void main(String[] args) {
        int key = 4;
        int index = linearSearch(arr, arr.length, key);
        if (index != -1)
            System.out.println("The element " + key + " is found at " + index + " index of the given array.");
        else
            System.out.println("The element " + key + " is not found.");
    }
}

class BinarySearch {
    //Chia để trị, chia đôi khoảng thời gian tìm kiếm nhiều lần
    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

class JumpSearch {
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
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610};
        int x = 55;
        int index = jumpSearch(arr, x);
        System.out.println("\nNumber " + x + " is at index " + index);
    }
}

class InterpolationSearch {
//Thuật toán này hoạt động theo cách chúng ta tìm kiếm một từ trong từ điển.
// Thuật toán tìm kiếm nội suy cải thiện thuật toán tìm kiếm nhị phân.
// Công thức tìm giá trị là: K = data-low/high-low.
    public static int interpolationSearch(int arr[], int lo, int hi, int x) {
        int pos;
        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
            pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]));
            if (arr[pos] == x)
                return pos;
            if (arr[pos] < x)
                return interpolationSearch(arr, pos + 1, hi, x);
            if (arr[pos] > x)
                return interpolationSearch(arr, lo, pos - 1, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47 };
        int n = arr.length;
        int x = 18;
        int index = interpolationSearch(arr, 0, n - 1, x);
        if (index != -1)
            System.out.println("Element found at index "
                    + index);
        else
            System.out.println("Element not found.");
    }
}

