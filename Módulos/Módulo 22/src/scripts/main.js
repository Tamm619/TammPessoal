AOS.init();

const dataDoEvento = new Date("Dec 24, 2025 22:00:00");
const timeStampDoEvento = dataDoEvento.getTime();

const contaAsHoras = setInterval(function(){
    const agora = new Date();
    const timeStampAtual = agora.getTime();

    const distanciaAteOEvento = timeStampDoEvento - timeStampAtual;

    //digitalizando os ms
    const diaMs = 1000 * 60 * 60 * 24;
    const horaMs = 1000 * 60 * 60;
    const minutoMs = 1000 * 60;

    const diasAteOEvento = Math.floor(distanciaAteOEvento / (diaMs));
    const horasAteOEvento = Math.floor((distanciaAteOEvento % (diaMs)) / (horaMs));
    const minutosAteOEvento = Math.floor((distanciaAteOEvento % (horaMs)) / (minutoMs));
    const segundosAteOEvento = Math.floor((distanciaAteOEvento % (minutoMs)) / (1000));
    console.log(diasAteOEvento);
    console.log(horasAteOEvento);
    console.log(minutosAteOEvento);
    console.log(segundosAteOEvento);


    document.getElementById('contador').innerHTML = `começa em ${diasAteOEvento}d ${horasAteOEvento}h ${minutosAteOEvento}m ${segundosAteOEvento}s`

    if (distanciaAteOEvento < 0){
        clearInterval(contaAsHoras);
        document.getElementById('contador').innerHTML = 'foi encerrado.'
    }
}, 1000)