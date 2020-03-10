#include <stdio.h>
#include <conio.h>
#include <string.h>
int SoSanh(long n);
main()
{
	FILE *f1, *f2;
	int n,i;
	long d;
	f1 = fopen("D:\\nhutram\\bt1.2.txt" , "r");
	f2 = fopen("D:\\nhutram\\kqbt1.2.txt" , "w");
	fscanf(f1, "%d", &n);
	for (i=0; i<n; i++)
	{
		fscanf(f1, "%ld", &d);
		if (SoSanh(d)==1)
			fprintf(f2, "%s\n", "YES");
		else
			fprintf(f2, "%s\n", "NO");
	}	
}
int SoSanh(long n)
{
	int a, z ;
	z = n % 10;
	while(n != 0)
	{
		a = n%10;
		n = n/10;
	}
	if(a == z)
		return 1;
	return 0;
}
