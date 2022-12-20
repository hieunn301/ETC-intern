package oop.workspace.Algorithm;

import java.util.Arrays;

class LinearSearch{
    // Danh sách hoặc mảng được duyệt tuần tự và mọi phần tử đều được kiểm tra. Time O(N)
    // duyệt từ cuối mảng, lần lượt duyệt về đầu mảng để tìm ra key cần tìm
    static int linearSearch(int[] array, int size, int key) {
        if (size == 0) {
            return -1;
        } else if (array[size - 1] == key) {
            return size - 1;
        } else {
            return linearSearch(array, size - 1, key);
        }
    }

    public static void main(String[] args) {
        int[] array = { 10, 50, 30, 70, 80, 60, 20, 90 };
        int key = 20;
        int index = linearSearch(array, array.length, key);
        if (index != -1)
            System.out.println("The element " + key + " is found at " + index + " index of the given array.");
        else
            System.out.println("The element " + key + " is not found.");
    }
}

class BinarySearch {
    //Chia để trị, chia đôi khoảng thời gian tìm kiếm nhiều lần. Time O (log n)
    public static int binarySearch(int[] array, int left, int right, int key) {
        if (right >= left) {
            int middle = left + (right - left) / 2;
            if (array[middle] == key)
                return middle;
            else if (array[middle] > key)
                return binarySearch(array, left, middle - 1, key);
            else if (array[middle] < key)
                return binarySearch(array, middle + 1, right, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 8, 9, 11 , 13, 14, 18};
        int key = 14;
        int index = binarySearch(array, 0, array.length - 1, key);
        if (index == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + index);
    }
}

class TernarySearch{
//Kỹ thuật trong khoa học máy tính dùng để tìm kiếm giá trị lớn nhất (maximum) hay nhỏ nhất (minimum) của một unimodal function
//Time O (log [n]) trong đó cơ số của log = 3
    static int ternarySearch(int[] array, int left, int right, int key) {
        if (left <= right) {
            int middle1 = left + (right - left) / 3;
            int middle2 = right - (right - left) / 3;
            if (array[middle1] == key) {
                return middle1;
            }
            if (array[middle2] == key) {
                return middle2;
            }
            if (array[middle1] > key) {
                return ternarySearch(array, left, middle1 - 1, key);
            }
            else if (array[middle2] < key) {
                return ternarySearch(array, middle2 + 1, right, key);
            }
            else {
                return ternarySearch(array, middle1 + 1, middle2 - 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int left, right, index, key;
        int[] array = {2, 8, 9, 11 , 13, 14, 18};
        left = 0;
        right = 6;

        key = 11;
        index = ternarySearch(array, left, right, key);
        System.out.println("Index of " + key + " is " + index);

        key = 14;
        index = ternarySearch(array, left, right, key);
        System.out.println("Index of " + key + " is " + index);
    }
}

class JumpSearch {
    //Phần tử tìm kiếm sẽ nằm trong khoảng của nhảy mà chứa phần từ lớn hơn giá trị tìm kiếm. Time 0(sqrt(n))
    public static int jumpSearch(int[] array, int key) {
        int n = array.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;
        while (array[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
        while (array[prev] < key) {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }
        if (array[prev] == key)
            return prev;

        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int key = 89;
        int index = jumpSearch(array, key);
        if (index != -1)
            System.out.println("Number " + key + " is at index " + index);
        else
            System.out.println("Element not found.");
    }
}

class InterpolationSearch {
//Tìm kiếm một từ trong từ điển. Thuật toán tìm kiếm nội suy cải thiện thuật toán tìm kiếm nhị phân.
// Công thức tìm giá trị là: K = (data-low/arr[high]-arr[low])*(x - arr[low])
    public static int interpolationSearch(int[] array, int left, int right, int key) {
        if ((left <= right) && (key >= array[left]) && (key <= array[right])) {
            int mid = left + (((right - left) / (array[right] - array[left])) * (key - array[left]));
            if (array[mid] == key)
                return mid;
            if (array[mid] < key)
                return interpolationSearch(array, mid + 1, right, key);
            if (array[mid] > key)
                return interpolationSearch(array, left, mid - 1, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 10, 12, 13, 16, 18, 19, 20, 21, 22};
        int key = 11;
        int index = interpolationSearch(array, 0, array.length - 1, key);
        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }
}
class ExponentialSearch{
//Time O(Log n)
    static int exponentialSearch(int[] array, int length, int key) {
        if (array[0] == key)
            return 0;
        int i = 1;
        while (i < length && array[i] <= key)
            i = i * 2;
        return Arrays.binarySearch(array, i/2, Math.min(i, length-1), key);
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int key = 3;
        int index = exponentialSearch(array, array.length, key);
        System.out.println((index < 0) ? "Element is not present in array" : "Element is present at index " + index);
    }
}

class Fibonacci {
    public static int min(int x, int y) {
        return (x <= y) ? x : y;
    }

    public static int fibSearch(int[] array, int key, int length) {
        int fib1 = 0;
        int fib2 = 1;
        int fib = fib1 + fib2;
        while (fib < length) {
            fib1 = fib2;
            fib2 = fib;
            fib = fib1 + fib2;
        }
        int offset = -1;
        while (fib > 1) {
            int i = min(offset + fib1, length - 1);
            if (array[i] < key) {
                fib = fib2;
                fib2 = fib1;
                fib1 = fib - fib2;
                offset = i;
            }
            else if (array[i] > key) {
                fib = fib1;
                fib2 = fib2 - fib1;
                fib1 = fib - fib2;
            }
            else
                return i;
        }
        if (fib2 == 1 && array[length-1] == key)
            return length - 1;
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100,235};
        int length = 12;
        int key = 10;
        int index = fibSearch(array, key, length);
        if(index >= 0)
            System.out.println("Found at index: " + index);
        else
            System.out.println(key + " isn't present in the array");
    }
}

class SublistSearch {
    static class Node {
        int data;
        Node next;
    };
    static boolean findList(Node first, Node second) {
        Node ptr1 = first, ptr2 = second;
        if (first == null && second == null)
            return true;
        if (first == null ||
                (first != null && second == null))
            return false;
        while (second != null) {
            ptr2 = second;
            while (ptr1 != null) {
                if (ptr2 == null)
                    return false;
                else if (ptr1.data == ptr2.data) {
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                else break;
            }
            if (ptr1 == null)
                return true;
            ptr1 = first;
            second = second.next;
        }
        return false;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.printf("%d ", node.data);
            node = node.next;
        }
    }
    static Node newNode(int key) {
        Node temp = new Node();
        temp.data= key;
        temp.next = null;
        return temp;
    }
    public static void main(String[] args) {
        Node a = newNode(1);
        a.next = newNode(2);
        a.next.next = newNode(3);
        a.next.next.next = newNode(4);

        Node b = newNode(1);
        b.next = newNode(2);
        b.next.next = newNode(1);
        b.next.next.next = newNode(2);
        b.next.next.next.next = newNode(3);
        b.next.next.next.next.next = newNode(4);

        if(findList(a, b) == true)
            System.out.println("LIST FOUND");
        else
            System.out.println("LIST NOT FOUND");
    }
}



