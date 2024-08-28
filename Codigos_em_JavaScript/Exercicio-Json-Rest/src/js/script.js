fetch('https://jsonplaceholder.typicode.com/posts')
  .then(response => response.json())
  .then(data => construirHTML(data))
  .catch(error => console.error('Erro:', error));

function construirHTML(dados) {
    const container = document.getElementById('container');
    dados.forEach(item => {
      const li = document.createElement('ul');
      li.className = 'item';
      li.innerHTML = `
        <h2>${item.title}</h2>
        <p>${item.body}</p>
      `;
      container.appendChild(li);
    });
  }
