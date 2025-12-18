import "./perfil.css"
const Perfil = () => {
    
    const usuario = {
        nome: 'Mateus Gonçalves',
        avatar: 'https://github.com/Tamm619.png'
    }

    return (
        <div>
            <img className="perfil-avatar" src={usuario.avatar}/>
            <h3 className="perfil-titulo">{usuario.nome}</h3>
        </div>
    )
}

export default Perfil;