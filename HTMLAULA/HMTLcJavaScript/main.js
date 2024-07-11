const form = document.getElementById("form-deposito");
const nomeBeneficiario = document.getElementById("nome-beneficiario");

function validaNome(nomeCompleto) {
    constNomeComoArray = nomeCompleto.split(" ");
    return constNomeComoArray.length > 2;
}

form.addEventListener('submit', function(e){
    let formValido = false;
    e.preventDefault();

    const numeroContaBeneficiario = document.getElementById("numero-conta");
    const valorDeposito = document.getElementById("valor-deposito");
    const mensagemSucesso = `Montante de: <b>${valorDeposito.value}</b> depositado para o cliente <b>${nomeBeneficiario.value}</b> - conta <b>${numeroContaBeneficiario.value}</b>`;

    formValido = validaNome(nomeBeneficiario.value)
    if (formValido){
        const containerMensagemSucesso = document.getElementById("success-message");
        containerMensagemSucesso.innerHTML = mensagemSucesso;
        containerMensagemSucesso.style.display = "block";
        nomeBeneficiario.value = "";
        numeroContaBeneficiario.value = "";
        valorDeposito.value = "";

    } else{
        nomeBeneficiario.style.border = "1px solid red";
        document.getElementById("error-message").style.display = "block";
    }
})

nomeBeneficiario.addEventListener("keyup", function(e) {
    console.log(e.target.value);
    formValido = validaNome(e.target.value);

    if (!formValido){
        nomeBeneficiario.classList.add("error")
        document.getElementById("error-message").style.display = "block";
    } else{
        nomeBeneficiario.classList.remove("error")
        document.getElementById("error-message").style.display = "none";
    }
})