#include <iostream>
using namespace std;

float somar();
float subtrair();
float dividir();
float multiplicar();
float valor1, valor2;

int main(){
	float total;
	int opcao;
	
	cout << "\n--CALCULADORA DE DOIS VALORES--\n";
	cout << "\nDigite o primeiro valor: ";
	cin >> valor1;
	cout << "Digite o segundo valor: ";
	cin >> valor2;
	
	do {
		cout << "\nSELECIONE SUA OPCAO." << endl;
		cout << "1 = SOMAR" << endl;
		cout << "2 = SUBTRAIR" << endl;
		cout << "3 = DIVIDIR" << endl;
		cout << "4 = MULTIPLICAR" << endl;
		cout << "Digite a opcao desejada: ";
		cin >> opcao;
		
		if (opcao <= 0 || opcao > 4) {
			cout << "\nOpcao invalida!!" << endl;
			cout << "Digite um numero valido!!" << endl;
			cout << "\n=================================================================================================================\n";
		} else {
			cout << "\nOpcao valida!!" << endl;
		}
	} while (opcao <= 0 || opcao > 4); 
	
	cout << "\n=================================================================================================================\n";
	
	switch (opcao) {
		case 1:
			cout << "\nVoce escolheu a funcao SOMAR!\n";
			total = somar();
			cout << "O resultado da soma entre " << valor1 << " + " << valor2 << " e igual: " << total << endl;
			system("pause > NULL");
			break;
			case 2:
				cout << "\nVoce esculheu a funcao SUBTRAIR!\n";
				total = subtrair();
				cout << "O resultado da subtracao entre " << valor1 << " - " << valor2 << " e igual: " << total << endl;
				system("pause > NULL");
				break;
				case 3:
					cout << "\nVoce escolheu a funcao DIVIDIR!\n";
					total = dividir();
					cout << "O resultado da divisao entre " << valor1 << " / " << valor2 << " e igual: " << total << endl;
					system("pause > NULL");
					break;
					default:
						cout << "\nVoce escolheu a funcao MULTIPLICAR!\n";
						total = multiplicar();
						cout << "O resultado da multiplicacao entre " << valor1 << " * " << valor2 << " e igual: " << total << endl;
						system("pause > NULL");
						break;
	}
	return 0;		
}

float somar() {
	float valorTotal;
	valorTotal = valor1 + valor2;
	return valorTotal;
}

float subtrair() { 
	float valorTotal;
	valorTotal = valor1 - valor2;
	return valorTotal;
}

float dividir() { 
	float valorTotal;
	valorTotal = valor1 / valor2;
	return valorTotal;
}

float multiplicar() {
	float valorTotal;
	valorTotal = valor1 * valor2;
	return valorTotal;
}
















