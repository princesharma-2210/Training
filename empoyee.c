#include<stdio.h>
int main(){
    int id;
    int hour;
    int salary;
    float totalsalary;
    printf("enter the empolyees Id\n");
    scanf("%d",&id);
    printf("enter the working hour\n");
    scanf("%d",&hour);
    printf("enter the salary amount\n");
    scanf("%d",&salary);
    totalsalary= hour*salary;
    printf("Employees I = %d\n Salary = %f",id,totalsalary);
}