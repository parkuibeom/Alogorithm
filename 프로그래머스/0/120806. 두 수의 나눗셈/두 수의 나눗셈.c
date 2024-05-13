#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
   	double n1 = num1;
	double n2 = num2;
	double answer =(n1/n2)*1000;
	return (int)answer;
}