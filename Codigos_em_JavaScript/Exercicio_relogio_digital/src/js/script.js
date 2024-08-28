function atualizarRelogio() {
    const dataAgora = new Date();
    const horas = String(dataAgora.getHours()).padStart(2, '0');
    const minutos = String(dataAgora.getMinutes()).padStart(2, '0');
    const segundos = String(dataAgora.getSeconds()).padStart(2, '0');

    document.getElementById("horas").textContent = horas;
    document.getElementById("minutos").textContent = minutos;
    document.getElementById("segundos").textContent = segundos;
}
setInterval(atualizarRelogio, 1000);
atualizarRelogio();
