// The function accepts a positive integer array ‘array’ of size ’n’ as its argument. Implement the function to find the Jackal elements in the array and return their sum.

// An element is a Jackal in the array if it is STRICTLY greater than all the elements to its right side. the rightmost element is always a Jackal.

//Input - 5
// 5 4 3 2 1

//Output -15

//Time Complexity - O(n)

#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int LearderSum(int array_size, int* array) {
    // Complete this function
    int max = INT_MIN,sum=0;
    for (int i = array_size - 1; i >= 0; i--)
    {
        if (array[i] >= max)
        {
            max= array[i];
            sum+=array[i];
        }
    }return sum;
}

int main() {
    int n; 
    scanf("%i", &n);
    int *array = malloc(sizeof(int) * n);
    for (int array_i = 0; array_i < n; array_i++) {
    	scanf("%i",&array[array_i]);
    }
    int result = LearderSum(n, array);
    printf("%d\n", result);
    return 0;
}
