import React from "react";
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

const usuarios =[
    {
        key:0,
        nombre: 'Joseph',
        apellido:'Joestar',
        edad:'18'
    },
    {
        key:2,
        nombre: 'Josuske',
        apellido:'Higashikata',
        edad:'16'
    },   
]

const UsuarioComponent = () => {
    return (
        <div className='container mt-4'>
            <div className='row'>
                <div className='col-8'>
                    <h1>Lista</h1>
                    {
                        usuarios.map(usuario => <TarjetaComponent key={usuario.key} usuario={usuario}/>)
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