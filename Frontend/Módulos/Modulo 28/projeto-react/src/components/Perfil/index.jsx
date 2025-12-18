import "./perfil.css"
const Perfil = (props) => {

    const {endereco, nome} = props;

    return (
        <div>
            {JSON.stringify(props)}
            <img className="perfil-avatar" src={endereco}/>
            <h3 className="perfil-titulo">{nome}</h3>
        </div>
    )
}

export default Perfil;