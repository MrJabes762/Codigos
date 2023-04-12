#include <stdio.h>
#include <string.h>

typedef struct {
    char nome[200];
    int idade;
    float salario;
} Funcionario;
Funcionario func[10];

int main(void) {
int i;  
for(i=0; i<10; i++) {
    strcpy(func[i].nome, "NULL");
    func[i].idade = 0;
    func[i].salario = 0.0;
}

for(i=0; i<10; i++) {
    printf(" Digite nome do funcionário: ");
    scanf("%s%*c", func[i].nome);
    printf(" Digite a idade do funcionário: ");
    scanf("%d%*c", &func[i].idade);
    printf(" Digite o salário do funcionário: ");
    scanf("%f%*c", &func[i].salario);
}
  return 0;
}

