#include<stdio.h>
void fibbo(int n){
    int arr[n];
    arr[0]=0;
    arr[1]=1;
    int sum=0;
    if(n>2){
    int i=1;
    while(i<n-1){
        sum=arr[i-1]+arr[i];
        arr[i+1]=sum;
        i++;
    }
    }
    int sums=0;
    for(int j=0; j<n; j++){
        sums+=arr[j];
        printf("%d\n",arr[j]);
    }
    printf("the sum is %d",sums);
}
int main(){
 
   fibbo(7);
    
}
