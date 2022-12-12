package oop.workspace.Algorithm;

public class SortArr {
    int[] sortArr(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i] >arr[j]) {      //swap elements if not in order
                   int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return  arr;
    }
}
