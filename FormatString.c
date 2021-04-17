#include <stdint.h>
#include <stdio.h>

int main(int argc, char *argv[])
{
	char test[1024];

	strcpy(test, argv[1]);

	printf("You wrote : ");

	printf(test);

	printf("\n");
	
	return 0;
}