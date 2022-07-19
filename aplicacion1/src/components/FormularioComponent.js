import React, { useState, useEffect } from "react";

//Aqui se crea la lista inicial a la que añadir datos
const initialValues = [
    {
        key: '',
        nombre: '',
        apellido: '',
        edad: '',
        password: ''
    }
]

//Aqui se crea la lista inicial a la que añadir datos
const autoValues = [
    {
        id: '',
        marca: '',
        modelo: '',
        color: '',
        patente: ''
    }
]

//Aqui se crea la funcion para el formulario("se le añade el objeto creado al que enviara la informacion")
const FormularioComponent = ({ usuarioAdd, usuarioEditado, usuarioEdit, setUsuarioEditado }) => {
    //Trabajar con una copia de initialValues
    const [values, setValues] = useState(initialValues);
    //Aqui toma todos los datos a rellenar y se los asigna a values
    const { key, nombre, apellido, edad, password } = values;
    // useEffect(accion que debe hacer, [estado del cual debe estar pendiente])
    useEffect(
        () => {
            if (usuarioEditado !== null) {
                setValues(usuarioEditado)
            } else {
                setValues({
                    key: '',
                    nombre: '',
                    apellido: '',
                    edad: '',
                    password: ''
                })
            }
        }
        , [usuarioEditado]);

    // puede ser e o event
    //Aqui crea una funcion para modificar los datos values
    const handleInputChange = (e) => {
        //Aqui inicia otra funcion para realizar cambios en el formulario de usuarios
        const changedFormValue = {
            //...values-> es una condicional para que el contenido de values se mantenga
            ...values, [e.target.name]: e.target.value//Aqui el event.target.name toma el name de cada input para añadirle datos
            //key:key
        }
        //Aqui envia las modificaciones de changedFormValue a la funcion values
        setValues(changedFormValue)
    }

    //Aqui se crea la funcion para la accion al presionar el button
    const handleSubmit = (e) => {
        e.preventDefault();//Esto es para evitar que la pagina se actualize al presionar el button

        if (usuarioEditado !== null) {
            usuarioEdit(values)
        } else {
            usuarioAdd(values)
        }
        //Aqui se le pasan los datos ingresados de values a usuarioAdd que esta en UsuarioComponent
        // usuarioEditado(values)
    }
    return (
        //Aqui se añade la clase onSubmit para poder hacer modificaciones en los datos del formulario al presionar el button que es de tipo submit
        <form onSubmit={handleSubmit}>
            {/* {usuario editado es nulo? si no muestra 'Editar usuario', si es nulo muestra 'Ingresar Usuario'} */}
            <h1>{usuarioEditado ? 'Editar Usuario' : 'Ingresar Usuario'}</h1>
            <div className='form-group'>
                <label>ID</label>
                <input type='text' className='form-control' id='key' placeholder='Key' value={key} name='key' onChange={handleInputChange} />
            </div>
            <br/>
            <div className='form-group'>
                <label>Nombre</label>
                <input type='text' className='form-control' id='nombre' placeholder='Nombre' value={nombre} name='nombre' onChange={handleInputChange} />
                <br />
            </div>
            <div className='form-group'>
                <label>Apellido</label>
                <input type='text' className='form-control' id='apellido' placeholder='Apellido' value={apellido} name='apellido' onChange={handleInputChange} />
                <br />
            </div>
            <div className='form-group'>
                <label>Edad</label>
                <input type='number' className='form-control' id='edad' placeholder='Edad' value={edad} name='edad' onChange={handleInputChange} />
                <br />
            </div>
            <div className='form-group'>
                <label>Password</label>
                <input type='password' className='form-control' id='password' placeholder='Password' value={password} name='password' onChange={handleInputChange} />
                <br />
            </div>
            <button type='submit' className='btn btn-outline-primary me-2'>{usuarioEditado ? 'Editar usuario' : 'Crear usuario'}</button>
            {usuarioEditado ? (<button type="button" className='btn btn-outline-warning' onClick={() => { setUsuarioEditado(null) }}>Cancelar</button>) : ''}

        </form>

    );
}

const FormularioAuto = ({ autoAdd, autoEditado, autoEdit, setAutoEditado}) => {

    //Trabajar con una copia de initialValues
    const [values, setValues] = useState(autoValues);
    //Aqui toma todos los datos a rellenar y se los asigna a values
    const {marca, modelo, color, patente} = values;

    useEffect(
        () => {
            if (autoEditado !== null) {
                setValues(autoEditado)
            } else {
                setValues({
                    id: '',
                    marca: '',
                    modelo: '',
                    color: '',
                    patente: ''
                })
            }
        }
        , [autoEditado]);

        const handleInputChange = (e) => {
            //Aqui inicia otra funcion para realizar cambios en el formulario de usuarios
            const changedFormValue = {
                //...values-> es una condicional para que el contenido de values se mantenga
                ...values, [e.target.name]: e.target.value//Aqui el event.target.name toma el name de cada input para añadirle datos
                //key:key
            }
            //Aqui envia las modificaciones de changedFormValue a la funcion values
            setValues(changedFormValue)
        }

           //Aqui se crea la funcion para la accion al presionar el button
    const handleSubmit = (e) => {
        e.preventDefault();//Esto es para evitar que la pagina se actualize al presionar el button
        autoAdd(values);
}
return (
    //Aqui se añade la clase onSubmit para poder hacer modificaciones en los datos del formulario al presionar el button que es de tipo submit
    <form onSubmit={handleSubmit}>
        <h1>Auto</h1>
        <div className='form-group'>
            <label>Marca</label>
            <input type='text' className='form-control' id='marca' placeholder='Marca' value={marca} name='marca' onChange={handleInputChange} />
            <br />
        </div>
        <div className='form-group'>
            <label>Modelo</label>
            <input type='text' className='form-control' id='modelo' placeholder='Modelo' value={modelo} name='modelo' onChange={handleInputChange} />
            <br />
        </div>
        <div className='form-group'>
            <label>Color</label>
            <input type='text' className='form-control' id='color' placeholder='Color' value={color} name='color' onChange={handleInputChange} />
            <br />
        </div>
        <div className='form-group'>
            <label>Patente</label>
            <input type='text' className='form-control' id='patente' placeholder='Patente' value={patente} name='patente' onChange={handleInputChange} />
            <br />
        </div>
        <button type='submit' className='btn btn-outline-primary me-2'>{autoEditado ? 'Editar auto' : 'Crear auto'}</button>
        {autoEditado ? 
        (<button type="button" className='btn btn-outline-warning' onClick={() => { setAutoEditado(null) }}>Cancelar</button>) : ''}

    </form>

    );
}
export {FormularioComponent, FormularioAuto};