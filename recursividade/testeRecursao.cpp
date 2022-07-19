#include <iostream> 
using namespace std;

void regressiva(int i);

int main(void) {
	int i = 10;
	
	regressiva(i);
	
	
	return 0;
}

void regressiva(int i) {
	cout << i << " ";
	if (i <= 0) { //CASO-BASE
		return;
	} else { //CASP-RECURSIVO
		regressiva(i-1);
	}
}


