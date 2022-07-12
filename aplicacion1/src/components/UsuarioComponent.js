import React, { useState } from "react";
import FormularioComponent from "./FormularioComponent";
import TarjetaComponent from "./TarjetaComponent";

/*const usuario1 ={
    nombre: 'Joseph',
    apellido:'Joestar',
    edad:'18'
}

const usuario2 ={
    nombre: 'Josuske',
    apellido:'Higashikata',
    edad:'16'
}*/

const initialUsuarios = [
    {
        key: 0,
        nombre: 'Joseph',
        apellido: 'Joestar',
        edad: '18'
    },
    {
        key: 1,
        nombre: 'Josuske',
        apellido: 'Higashikata',
        edad: '16'
    },
    {
        key: 2,
        nombre: 'Jonathan',
        apellido: 'Higashikata',
        edad: '16'
    }
]

const UsuarioComponent = () => {

    const [usuarios, setUsuarios] = useState(initialUsuarios);
    /*{ const state = useState(initialUsuarios);
    state[o]=initialUsuarios
    state[1]= funcion que nos permite hacer cambios}*/
    const tarjetaDelete = (usuarioKey) => {
        const changeUsuarios = usuarios.filter(u => u.key !== usuarioKey)
        setUsuarios(changeUsuarios)
    }

    const usuarioAdd = (usuario) => {
        const adddUsuario = [
...usuarios, usuario
        ]
        setUsuarios(adddUsuario)
    }

    return (
        <div className='container mt-4'>
            <div className='row'>
                <div className='col-8'>
                    <h1>Lista</h1>
                    {
                        usuarios.map(usuario => <TarjetaComponent key={usuario.key} usuario={usuario} tarjetaDelete={tarjetaDelete} />)
                    }
                </div>
                <div className='col'>
                    <h1>Formulario</h1>
                    <FormularioComponent />
                </div>
            </div>
        </div>);
}

export default UsuarioComponent;