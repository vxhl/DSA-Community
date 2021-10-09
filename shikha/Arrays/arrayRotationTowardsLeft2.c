// Given an array, Mister Arr the owner of the array wants to move each element k places to its left. I.E. the array a[0],a[1],a[2],...a[n] becomes a[1],a[2]...a[n],a[0] after moving one place to the left. Note that the first element becomes the last element after each rotation. Mister Arr was up all night watching a football match and hence is sleeping now. He has given you the task to rotate the entire array K places to its left.
//Input 5 4
// 1 2 3 4 5

//Output
//5 1 2 3 4
//Time Complexity- O(n)

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n,k;
    scanf("%d%d",&n,&k);
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++){
        printf("%d",a[(i+k)%n]); 
    }

    return 0;
}
