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
    //Aqui se crea la funcion para el button eliminar y se le asigan la key(id) para saber cual eliminar
    const tarjetaDelete = (usuarioKey) => {
        //Aqui se crea la funcion para filtrar la key del usuario ingresado para determinar cual se tiene que elimina
        const changeUsuarios = usuarios.filter(u => u.key !== usuarioKey)
        //Aqui se envia la modificacion de la lista de usuario a traves de changeUsuarios
        setUsuarios(changeUsuarios)
    }

    //Aqui se crea esta funcion en la cual se almacenara la informacion 
    const usuarioAdd = (usuario) => {
        //Aqui se declara la funcion en la que se almacenara la informacion ingresada
        const adddUsuario = [
            //Aqui se declara que datos quiero que me modifique y cuales no
            ...usuarios, usuario
        ]
        //Aqui se envia la informacion de addUsuario
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
                    <FormularioComponent usuarioAdd={usuarioAdd}/>
                </div>
            </div>
        </div>);
}

export default UsuarioComponent;