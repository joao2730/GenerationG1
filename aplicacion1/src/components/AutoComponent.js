import React, { useEffect, useState } from "react";
import { FormularioAuto } from "./FormularioComponent";
import { TarjetaAuto } from "./TarjetaComponent";
import { getAll, eliminarAuto, saveAuto } from "../services/AutoServices";

const initialAuto = [
    {
        id: 1,
        marca: '',
        modelo: '',
        color: '',
        patente: ''
    }
]

const AutoComponent = () => {
    //Set -> setear- asignar un atruto a la variable
    const [autos, setAutos] = useState(initialAuto);
    /*{ const state = useState(initialAuto);
    state[o]=initialAuto
    state[1]= funcion que nos permite hacer cambios}*/

    const [autoEditado, setAutoEditado] = useState(null);

    const obtenerAutos = async () => {
        setAutos(await getAll())
    }

    useEffect(
        () => { obtenerAutos() }
        , [])

    //Aqui se crea la funcion para el button eliminar y se le asigan la key(id) para saber cual eliminar
    const tarjetaDelete = async (autoId) => {
        await eliminarAuto(autoId)
        setAutos(await getAll())
    }

    //Aqui se crea esta funcion en la cual se almacenara la informacion 
    const autoAdd = async (auto) => {
        await saveAuto(auto)
        setAutos(await getAll())
    }

const autoEdit = (autoEditado) => {
    const changeAutos = autos.map(auto => (auto.id === autoEditado.id ? autoEditado : auto))
    setAutos(changeAutos)
}

return (
    <div className='container mt-4'>
        <div className='row'>
            <div className='col-8'>
                <h1>Lista</h1>
                {//el autos.map permite mostrar mas de una tarjeta de auto de una manera dinamica
                    autos.map(auto =>
                        <TarjetaAuto
                            id={auto.id}
                            auto={auto}
                            tarjetaDelete={tarjetaDelete}
                            setAutoEditado={setAutoEditado} />)
                }
            </div>
            <div className='col'>
                <h1>Formulario</h1>
                {/* Aqui se le agrega a FormularioAuto el autoAdd que es el que tiene la informacion de los nuevos ingresos de autos */}
                <FormularioAuto
                    autoAdd={autoAdd}
                    autoEditado={autoEditado}
                    autoEdit={autoEdit}
                    setAutoEditado={setAutoEditado} />
            </div>
        </div>
    </div>);
}

export default AutoComponent;