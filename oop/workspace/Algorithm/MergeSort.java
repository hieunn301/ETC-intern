//package oop.workspace.Algorithm;
//
//public class MergeSort {
//    static void mergeSort(int array[]){
//        int length = array.length;
//        if (length <= 1) return;
//
//        int middle = length / 2;
//        int[] leftArray = new int[middle];
//        int[] rightArray = new int[length - middle];
//
//        int i = 0;
//        int j = 0;
//        for(int i = 0; i < length; i++){
//            if(i < middle){
//                leftArray[i] = array[i];
//            }else{
//                rightArray[j] = array[i];
//                j++;
//            }
//        }
//        mergeSort(leftArray);
//        mergeSort(rightArray);
//        merge(int array[], int leftArray, int rightArray);
//    }
//
//    static void merge(int[] leftArray, int[] right, int[] array){
//        int leftSize = array.length / 2;
//        int rightSize = array.length - leftSize;
//        int i = 0;
//    }
//}
