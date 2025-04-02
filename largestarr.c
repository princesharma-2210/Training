#include<stdio.h>
int main(){
    int arr[]={6,5,2,8,4,4,4,4};
    int maxi;
    int mini;
    int size = sizeof(arr)/sizeof(arr[0]);
    for(int i=0; i<size-1; i++){
        int j=i+1;
    if(arr[i]>=arr[j]){
        maxi=arr[i];
        mini=arr[j];
    }
    else{
        maxi=arr[j];
        mini=arr[i];
    }
    

    }
    printf("maximum element %d\n",maxi);
    printf("minimum element %d",mini);
    // arr[0]=maxi;
    // for(int i=0; i<4; i++){
    //     printf("")
    // }
}