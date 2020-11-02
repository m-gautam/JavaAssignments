package com.java.Assignment3;

import java.net.*;


public class PingHost {

    public double[] array;
    public int n;
    public String address;

    /** Implemented merge sort
     **/
//    public void merge(long[] arr, int start, int mid, int end){
//
//        int n1 = mid - start + 1;
//        int n2 = end - mid;
//
//        long[] L = new long[n1];
//        long[] R = new long[n2];
//
//        for(int i = 0; i < n1; i++){
//            L[i] = arr[start + i];
//        }
//        for(int i = 0; i < n2; i++){
//            R[i] = arr[mid + i + 1];
//        }
//
//
//
//        int i = 0;
//        int j = 0;
//        int k = start;
//        while (i < n1 && j < n2)
//        {
//            if (L[i] <= R[j])
//            {
//                arr[k] = L[i];
//                i++;
//            }
//            else
//            {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i < n1)
//        {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        while (j < n2)
//        {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//
//
//    }
//
//    private void mergeSort(long[] arr, int start, int end){
//
//        if(start < end){
//
//            int mid = (start + end) / 2;
//
//            mergeSort(arr, start, mid);
//            mergeSort(arr, mid + 1, end);
//            merge(arr, start, mid, end);
//        }
//
//    }
//
//
//    public void sortArray(long[] arr, int n){
//        int start = 0;
//        int end = n-1;
//
//        mergeSort(arr, start, end);
//    }

    public void printMedian(){

        if(n % 2 == 1){
            System.out.println("Median of time taken " + array[n/2]);
        }

        else{
            System.out.println("elements " + n/2 + " " +  (n/2-1));
            System.out.println("Median of time taken " + (array[n/2] + array[n/2 - 1])/2.0);
        }
    }

    public void ping() {
        int i = 0;
        while (i < n){
            try {

                InetAddress inet = InetAddress.getByName(address);
                System.out.println("Sending ping Request to " + address);
                long current = System.currentTimeMillis();

                if (inet.isReachable(1000)) {
                    long currentTime = System.currentTimeMillis();

                    array[i] = currentTime - current;
                    System.out.println(array[i]);
                } else {
                    System.out.println("not Reachable");
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());

            }
            i++;
        }

    }

}