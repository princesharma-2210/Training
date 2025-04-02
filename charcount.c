#include<stdio.h>

int main(){
    char c[]="prighdhxxx";
    int count=0;
    for(int i=0; c[i]!='\0'; i++){
        count++;
    }
    printf("%d",count);
}