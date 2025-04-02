#include<stdio.h>
int main(){
    int a=18;
    int *p=&a; //reference
    printf("%d\n",p);
    printf("%d\n",*p);//dereference
    *p=3; //modification
    printf("%d\n",a);
    printf("%d\n",p);
    int **px=&p;
    printf("%d\n",*p***px);
    a=a++;
    printf("%d",a);
}