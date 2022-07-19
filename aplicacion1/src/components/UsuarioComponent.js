import React, { useState, useCallback } from "react";
import { FormularioComponent } from "./FormularioComponent";
import { TarjetaComponent } from "./TarjetaComponent";
import {useNavigate} from "react-router-dom";

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
        edad: '18',
        password: '1234'
    },
    {
        key: 1,
        nombre: 'Josuske',
        apellido: 'Higashikata',
        edad: '16',
        password: '5678'
    },
    {
        key: 2,
        nombre: 'Jonathan',
        apellido: 'Higashikata',
        edad: '16',
        password: '9012'
    }
]

const UsuarioComponent = () => {
    //Set -> setear- asignar un atruto a la variable
    const [usuarios, setUsuarios] = useState(initialUsuarios);
    /*{ const state = useState(initialUsuarios);
    state[o]=initialUsuarios
    state[1]= funcion que nos permite hacer cambios}*/

    const [usuarioEditado, setUsuarioEditado] = useState(null);

    const navigate = useNavigate();

    const handleOnClick = useCallback( () => navigate('/autos', {replace:true}, [navigate]));

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
        //Aqui se envia la informacion de addUsuario(los envia a la panatalla y muestra todos los que estan)
        setUsuarios(adddUsuario)
    }

    const usuarioEdit = (usuarioEditado) => {
        const changeUsuarios = usuarios.map(usuario => (usuario.key === usuarioEditado.key ? usuarioEditado : usuario))
        setUsuarios(changeUsuarios)
    }

    return (
        <div className='container mt-4'>
            <div className='row'>
                <div className='col-8'>
                    <h1>Lista</h1>
                    {//el usuarios.map permite mostrar mas de una tarjeta de usuario de una manera dinamica
                        usuarios.map(usuario =>
                            <TarjetaComponent
                                key={usuario.key}
                                usuario={usuario}
                                tarjetaDelete={tarjetaDelete}
                                setUsuarioEditado={setUsuarioEditado} />)
                    }
                </div>
                <div className='col'>
                    <h1>Formulario</h1>
                    {/* Aqui se le agrega a FormularioComponent el usuarioAdd que es el que tiene la informacion de los nuevos ingresos de usuarios */}
                    <FormularioComponent
                        usuarioAdd={usuarioAdd}
                        usuarioEditado={usuarioEditado}
                        usuarioEdit={usuarioEdit}
                        setUsuarioEditado={setUsuarioEditado} />
                </div>
                <br />
                <div>
                    <button type="buttom" className="btn btn-outline-primary me-2" onClick={handleOnClick}>Ir a Autos</button>
                </div>
            </div>
        </div>);
}

export default UsuarioComponent;