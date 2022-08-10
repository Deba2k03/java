#include<stdio.h>
void TOH(int n,char x,char y,char z)
{
    if(n==1)
    {
        printf("\n move 1 from %c to %c",x,y);
        return;
    }
    TOH(n-1,x,z,y);
    printf("\n move %d from %c to %c",n,x,y);
    TOH(n-1,z,y,x);
}
int main()
{
    int n=3;
    TOH(n,'A','B','c');
    return 0;
}
