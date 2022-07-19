import React from "react";
// import UsuarioComponent from "./UsuarioComponent";

const TarjetaComponent = ({ usuario, tarjetaDelete, setUsuarioEditado }) => {
    return (
        <div className='card'>
            <div className='card-body'>
                <h3 className='card-tittle'>{usuario.nombre} {usuario.apellido}</h3>
                <p>Edad: {usuario.edad}</p>
                <hr />
                <div className='d-flex justify-content-end'>
                    <button className='btn btn-sm btn-outline-primary me-2' onClick={() => setUsuarioEditado(usuario)}>Editar</button>
                    <button className='btn btn-sm btn-outline-danger'
                    //Con este onClick le damos funcionalidad al boton eliminar
                    onClick={() => tarjetaDelete(usuario.key)}>Eliminar</button>
                </div>
            </div>
        </div>)
}

const TarjetaAuto = ({ auto, tarjetaDelete, setAutoEditado }) => {
    return (
        <div className='card'>
            <div className='card-body'>
                <h3 className='card-tittle'>{auto.marca} {auto.modelo}</h3>
                <p>Color: {auto.color}</p>
                <p>Patente: {auto.patente}</p>
                <hr />
                <div className='d-flex justify-content-end'>
                    <button className='btn btn-sm btn-outline-primary me-2' onClick={() => setAutoEditado(auto)}>Editar</button>
                    <button className='btn btn-sm btn-outline-danger'
                    //Con este onClick le damos funcionalidad al boton eliminar
                    onClick={() => tarjetaDelete(auto.id)}>Eliminar</button>
                </div>
            </div>
        </div>)
}

export {TarjetaComponent, TarjetaAuto};