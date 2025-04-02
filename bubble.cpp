#include<iostream>
using namespace std;

int main(){
    int arr[]={2,6,3,1};
    int size= sizeof(arr)/sizeof(arr[0]);
    // for(int i=0; i<size-1; i++){
    //     int j=i+1;
    //     if(arr[i]>arr[j]){
    //         int temp= arr[j];
    //         arr[j]= arr[i];
    //         arr[i]= temp;
    //     }

    // }
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size-i;j++)
        {
            int z=j+1;
            if(arr[j]>arr[z])
            {
                int temp=arr[j];
                arr[j]=arr[z];
                arr[z]=temp;
            }
        }
        
    }
    for(int i=0; i<size; i++){
        cout<<arr[i]<<" ";
    }
}    