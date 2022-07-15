import React, {useState} from "react";
import FormularioComponent from "./FormularioComponent";
import TarjetaComponent from "./TarjetaComponent";

const initialUsuarios = []

const UsuarioComponent = () => {

    const [usuarios, setUsuarios] = useState(initialUsuarios);

    const tarjetaDelete = (usuarioKey) => {

        const changeUsuarios = usuarios.filter(u => u.key !== usuarioKey)

        setUsuarios(changeUsuarios)
    }

    const usuarioAdd = (usuario) => {

        const addUsuario = [

            ...usuarios, usuario
        ]

        setUsuarios(addUsuario)
    }

    return(
        <div className='container mt-4'>
        <div className='row'>
            <div className='col-6'>
                <h1>Lista</h1>
                {
                    usuarios.map(u => <TarjetaComponent key={u.key} usuario={u} tarjetaDelete={tarjetaDelete} />)
                }
            </div>
            <div className='col'>
                <h1>Formulario</h1>
                {
                    <FormularioComponent usuarioAdd={usuarioAdd} />
                }
            </div>
        </div>
    </div>
    )
}

export default UsuarioComponent;