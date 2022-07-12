import React, { useState } from "react";

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
//Aqui se crea la funcion para el formulario("se le añade el objeto creado al que enviara la informacion")
const FormularioComponent = ({usuarioAdd}) => {
    //Trabajar con una copia de initialValues
    const [values, setValues] = useState(initialValues);
    //Aqui toma todos los datos a rellenar y se los asigna a values
    const { key, nombre, apellido, edad, password } = values;
    // puede ser e o event
    //Aqui crea una funcion para modificar los datos values
    const handleInputChange = (e) => {
        //Aqui inicia otra funcion para realizar cambios en el formulario de usuarios
        const changedFormValue = {
            //...values-> es una condicional para que el contenido de values se mantenga
            ...values, [e.target.name]: e.target.value//Aqui toma el event.target.name de cada atributo para añadirle datos
            //key:key
        }
        //Aqui envia las modificaciones de changedFormValue a la funcion values
        setValues(changedFormValue)
    }

    //Aqui se crea la funcion para la accion al presionar el button
    const handleSubmit = (e) => {
        e.preventDefault();//Esto es para evitar que la pagina se actualize al presionar el button
        //Aqui se le pasan los datos ingresados de values a usuarioAdd que esta en UsuarioComponet
        usuarioAdd(values)
    }
    return (
        //Aqui se añade la clase onSubmit para poder hacer modificaciones en los datos del formulario al presionar el button que es de tipo submit
        <form onSubmit={handleSubmit}> 
            <div className='form-group'>
                <label>ID</label>
                <input type='text' className='form-control' id='key' placeholder='Key' value={key} name='key' onChange={handleInputChange} />
            </div>
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
            <button type='submit' className='btn btn-outline-primary'>Crear Usuario</button>
        </form>

    );
}

export default FormularioComponent;