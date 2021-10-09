//n is the number of candies in a bowl and time t is given whenever candies are less than 5 fill the bowl until it becames n candies
//don't fill the bowl at the last hour of the party
//At the end of the party calculate the total number of candies that were added extra

//Input - 8 4
// 3 1 7 5

//Output - 11


#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {  
    int n,t;
    scanf("%d%d",&n,&t);
    int k=n,count =0;
    int a[t];
    for(int i=0;i<t;i++){
        scanf("%d",&a[i]);
    }
    for(int i=0;i<t-1;i++){
        n = n-a[i];
        if(n<5){
            count +=(k-n);
            n=k;
        }
        
    }printf("%d",count);
    
    return 0;
}

