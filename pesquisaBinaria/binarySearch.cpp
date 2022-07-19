#include <iostream>
using namespace std;
#define MAX 10

int lista[MAX]; //Array com 10 valores
int chute; //Valor do chute, tentativa de acerto
int menor; //Menor valor da array, o menor indice
int maior; //Maior valor da array, o maior indice
int meio; //O valor do meio, maior + menor / 2
int valor; //Valor que queremos achar na lista

//prototipo
void pesquisaBinaria (int lista[], int valor);

int main() {
	
	cout << "=================== Binary Search ===================" << endl;
	cout << "OBS: OS ITENS DA LISTA DEVEM ESTAR EM ORDEM CRESCENTE!!" << endl;
	
	for (int i = 0; i < MAX; i++) {
		cout << "\nDigite o valor para inserir na lista: ";
		cin >> lista[i];
	}
	
	cout << "\nSua lista ficou assim: " << endl;
	cout << "[ ";
	for (int i = 0; i < MAX; i++) {
		cout << lista[i] << " ";
	}
	cout << " ]" << endl;	
	cout << "\nQual valor deseja buscar?: ";
	cin >> valor;
	
	pesquisaBinaria (lista, valor);
	
	return 0;
}

void pesquisaBinaria (int lista[], int valor) {
	menor = 0;
	maior = MAX-1;
	
	while (menor <= maior) {
		meio = (menor + maior) / 2;
		chute = lista[meio];
		if (chute == valor) {
			cout << "\nO valor pesquisado esta no indice: " << meio << "!";
			system("pause > NULL");
			break;
		} else if (chute > valor) {
			maior = meio - 1;
		} else {
			menor = meio + 1;
		}
	}
	if (valor != chute) {
		cout << "O valor digitado nao esta na lista!!";
	} else {
		cout << "\n=================== FIM DA PESQUISA!! ===================";
		system("pause > NULL");
	}
}
