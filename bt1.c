#include <stdio.h>
#include <conio.h>
#include <string.h>
int Tong(long n);
main()
{
	FILE *f1, *f2;
	int n,i;
	long d;
	f1= fopen ("D:\\nhutram\\bt1.txt",  "r" );
	f2= fopen ("D:\\nhutram\\kqbt1.txt",  "w" );
	fscanf(f1, "%d", &n);
	for ( i=0; i<n; i++)
	{
		fscanf(f1, "%ld", &d);
		fprintf(f2, "%d\n", Tong(d));
	}
	fclose(f1);
	fclose(f2);
	
}
int Tong(long n){
	int r, S=0;
	while(n != 0)
	{
		r = n%10;
		n = n/10;
		S = S + r;
	}
	return S;
}
