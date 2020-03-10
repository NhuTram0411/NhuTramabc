#include <stdio.h>
#include <conio.h>
#include <string.h>
int UCLN(int a, int b);
int BCNN(int a, int b);
main()
{
	FILE *f1, *f2;
	int a,b,i,n;
	f1 = fopen("D:\\nhutram\\bt1.3.txt" , "r");
	f2 = fopen("D:\\nhutram\\ketquabt1.3.txt" , "w");
	
	fscanf(f1, "%d", &n);
	for ( i=0; i<n; i++)
	{
		fscanf(f1, "%d%d", &a, &b);
		fprintf(f2, "%d\n", BCNN(a, b));
	}
	fclose(f1);
	fclose(f2);
}	
int UCLN(int a, int b)
{
    while (a*b != 0)
	{ 
        if (a > b)
            a = a % b;
		else
            b = a % b;
    }
    return a+b;
}
int BCNN(int a, int b)
{
	int d;
	return d=(a*b)/UCLN(a,b);
}
