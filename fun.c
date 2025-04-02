#include<stdio.h>
void sum(int a, int b){
    printf("%d\n",a+b);
}
void sub(int a, int b){
    printf("%d\n",a-b);
}
void mul(int a, int b){
    printf("%d\n",a*b);
}
void div(int a, int b){
    printf("%d\n",a/b);
}
int main(){
    sum(2,1);
    mul(3,4);
    mul(4,2);
    div(8,2);

}