// Given an array of size N and an integer X, Raju wants to know how many elements in the array are divisible by X. Help him find the answer.

//Input - 5 2
// 2 4 3 2 1
#include<stdio.h>
int main()
{
    int i,n,x,count=0;
    scanf("%d%d",&n,&x);
    int a[n];
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++){
        if(!a[i]%x){
            count++;
        }
    }printf("%d",count);
	return 0;
}
