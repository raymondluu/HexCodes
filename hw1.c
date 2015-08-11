#include <stdio.h>

int main(void){
	unsigned short result = 0;
	unsigned short a = 0xFFF7;
	unsigned short b = 0x0001;
	unsigned short c = 0x7FFF;
	
	result = a & b;
	printf("a.0x%04X\n", result);
	
	result = a | b;
	printf("b.0x%04X\n", result);
	
	result = a & c;
	printf("c.0x%04X\n", result);
	
	result = a | c;
	printf("d.0x%04X\n", result);
	
	result = b & c;
	printf("e.0x%04X\n", result);
}