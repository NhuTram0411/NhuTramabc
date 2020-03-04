#include <conio.h>
#include <stdio.h>
void main(void){
	FILE *f1, *f2;
	int i, n, so;
	f1 = fopen("e:\\btC\\Data19\\indata1.dat","r");
	f2 = fopen("e:\\btC\\Data19\\outdata1.dat","w");
	fscanf(f1, "%d",&n);
	for(i=1;i<=n;i++)
	{
		fscanf(f1,"%d",&so);
		fprintf(f2,"%d",tongchuso(so));
	}
	fclose(f1);
	fclose(f2);
	getch();
}
int tongchuso(int n)
{
	int t=0;
	while (n!=0)
	{
		t=t+n%10;
		n=n/10;
	}
	return t;	
}
