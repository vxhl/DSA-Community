//Input -3
// 1 2 3
// 4 5 6
// 7 8 9

//Output - 25

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n,sum;
    scanf("%d",&n);
    int a[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&a[i][j]);
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j|| i+j == n-1){
                sum+=a[i][j];
            }
        }
    }printf("%d",sum);
    return 0;
}
