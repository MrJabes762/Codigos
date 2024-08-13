const btn = document.querySelector("#button-todo");
btn.addEventListener("click", addTarefa);

function addTarefa() {
    const tx = document.querySelector("#Tarefa");
    const novoTarefa = document.createElement("li");
    novoTarefa.innerText = tx.value;

    const iconeRemove = document.createElement("span");
    iconeRemove.innerText = "(x)";
    iconeRemove.addEventListener("dblclick", removeTarefa);

    novoTarefa.appendChild(iconeRemove);
    document.querySelector("#listaTarefas").appendChild(novoTarefa);
    tx.value = "";
    tx.focus();
}

function removeTarefa(e) {
    const span = e.target;
    const li = span.parentElement;
    const ul = li.parentElement;
    ul.removeChild(li);
}