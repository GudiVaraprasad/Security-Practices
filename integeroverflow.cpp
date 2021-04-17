#include <stdint.h>
#include <stdio.h>

void show_info(double d, int16_t n);

int main()
{
	double d1 = 32767.0; // unsigned 8 bytes
	double d2 = 32766.0; // unsigned 8 bytes

	// double d2 = 32768.0; // unsigned 8 bytes - Integer Overflow here

	int16_t n = 0; // signed integer of 16 bit

	show_info(d1, n);
	show_info(d2, n);

	return(0);
}

void show_info(double d, int16_t n)
{
	n = (int16_t)d; // typecasting

	printf("d = %f, n = %d \n", d, n);
}