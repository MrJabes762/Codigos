#include <iostream>
using namespace std;

float conversao (float * R){
  float A;
  A = ((*R) * 180)/ 3.14;
  return A;
}
int main() {
  float Rad, Graus;
  cout << "\n-> Informe o valor em radiano para conversão: ";
  cin >> Rad;
  cout << "\n-> " << Rad << " em graus é "<< conversao (&Rad);
} 