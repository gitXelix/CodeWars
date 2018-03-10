package thesupermarketqueue;

/*
There is a queue for the self-checkout tills at the supermarket. Your task is write a function to calculate the total time required for all the customers to check out!

The function has two input variables:

customers: an array (list in python) of positive integers representing the queue. Each integer represents a customer, and its value is the amount of time they require to check out.
n: a positive integer, the number of checkout tills.
The function should return an integer, the total time required.

EDIT: A lot of people have been confused in the comments. To try to prevent any more confusion:

There is only ONE queue, and
The order of the queue NEVER changes, and
Assume that the front person in the queue (i.e. the first element in the array/list) proceeds to a till as soon as it becomes free.
The diagram on the wiki page I linked to at the bottom of the description may be useful.
So, for example:

queueTime([5,3,4], 1)
// should return 12
// because when n=1, the total time is just the sum of the times

queueTime([10,2,3,3], 2)
// should return 10
// because here n=2 and the 2nd, 3rd, and 4th people in the
// queue finish before the 1st person has finished.

queueTime([2,3,10], 2)
// should return 12
N.B. You should assume that all the test input will be valid, as specified above.

P.S. The situation in this kata can be likened to the more-computer-science-related idea of a thread pool, with relation to running multiple processes at the same time: https://en.wikipedia.org/wiki/Thread_pool
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {


    public static int solveSuperMarketQueue(int[] customers, int n) {

        if(n == 1){
            return IntStream.of(customers).sum();
        }

        int[] theQueue = new int[n];

        for (int customer : customers) {
            theQueue[findMinIdx(theQueue)] += customer;
        }

        return Arrays.stream(theQueue).max().getAsInt();
    }

    private static int findMinIdx(int[] numbers) {
        if (numbers == null || numbers.length == 0) return -1; // Saves time for empty array
        // As pointed out by ZouZou, you can save an iteration by assuming the first index is the smallest
        int minVal = numbers[0]; // Keeps a running count of the smallest value so far
        int minIdx = 0; // Will store the index of minVal
        for(int idx=1; idx<numbers.length; idx++) {
            if(numbers[idx] < minVal) {
                minVal = numbers[idx];
                minIdx = idx;
            }
        }
        return minIdx;
    }

}