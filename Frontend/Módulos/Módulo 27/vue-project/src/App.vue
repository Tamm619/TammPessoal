<script setup>

import { reactive } from 'vue'

const nome = "mateus gonc"

const botaoEstaDesabilitado = false
// const urlImagem = "url da imagem"
const querImagem = true

const estado = reactive({
  contador: 0,
  saldo: 5000,
  transferindo: 0
})
function decrementar(){
  estado.contador--;
}
function incrementar(){
  estado.contador++;
}

function mostraSaldoFuturo() {
  const {saldo, transferindo} = estado;
  return saldo - transferindo;
}

function validaValorTransferencia() {
  const {saldo, transferindo} = estado;
  return saldo >= transferindo;
}

</script>

<template>
  <h1>{{ nome }}</h1>
  <!-- <img v-if="querImagem" :src="url da imagem" alt=""> -->
  <!-- <img v-else-if="imagem2" :src="url da imagem" alt=""> -->
  <!-- <h2 v-else>Não gosta de nenhuma imagem</h2> -->
  <button :disabled="botaoEstaDesabilitado">Enviar</button>

  <br>
  <hr>


  <button @click="decrementar">-</button>
  {{ estado.contador }}
  <button @click="incrementar">+</button>

<br>
<hr>

Saldo: {{ estado.saldo }}
Transferindo: {{ estado.transferindo }}
Saldo depois da transferência: {{ mostraSaldoFuturo() }}
<input :class="{invalido: !validaValorTransferencia()}" @keyup="evento => estado.transferindo = evento.target.value" type="number" placeholder="Quantia para transferir">

</template>

<style scoped>

.invalido {
  outline-color: red;
  border-color: red;
}

</style>
