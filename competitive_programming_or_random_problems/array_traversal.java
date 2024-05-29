/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Cla
/**
 *
 * @author Admin
 */
import java.util.*;
public class array_traversal {
    

    // Recursive method to traverse the array
    private static void traverseArray(int[] arr, int currentIndex) {
        // Base case: If the current index goes beyond the array length, return.
        if (currentIndex >= arr.length) {
            return;
        }

        // Process the current element
        int currentElement = arr[currentIndex];
        System.out.println("Element at index " + currentIndex + ": " + currentElement);

        // Recursive call to traverse the rest of the array
        traverseArray(arr, currentIndex + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Traversing the array using recursion:");
        traverseArray(arr, 0);
    }
}
    

