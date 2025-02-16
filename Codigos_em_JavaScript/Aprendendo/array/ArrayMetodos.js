const pilotos = ['vetel', 'alonso', 'Raikkonen', 'Massa'];

console.log(pilotos);

// O método pop remove o último elemento do array
pilotos.pop();

console.log(pilotos);

// O método push adiciona na última posição
pilotos.push('Senna');

console.log(pilotos);

// O método shift remove o primeiro elemento
pilotos.shift();

console.log(pilotos);

// O método unshift adiciona na primeira posição
pilotos.unshift('Hamilton');

console.log(pilotos);

// O splice pode adicionar/remover elementos em determinadas posições
// Adicionar
pilotos.splice(2, 0, 'Botas', 'Ibraimovick'); // O zero indica que não haverá eliminação

console.log(pilotos);

// Remover
pilotos.splice(4, 1); // Remove o elemento de índice 4 e apenas 1

console.log(pilotos);

// O método slice retorna um novo array a partir do índice informado
const algunsPilotos = pilotos.slice(2);

console.log(pilotos);
console.log(algunsPilotos);

const algunsPilotos2 = pilotos.slice(1, 4); // Retorna o array entre o primeiro índice informado até o último (segundo índice)

console.log(algunsPilotos2);