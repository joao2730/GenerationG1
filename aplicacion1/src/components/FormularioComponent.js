import React, { useState } from "react";

const initialValues = [
    {
        key: '',
        nombre: '',
        apellido: '',
        edad: '',
        password: ''
    }
]

const FormularioComponent = () => {
    const [values, setValues] = useState(initialValues);
    const { key, nombre, apellido, edad, password } = values;
    // puede ser e o event
    const handleInputChange = (e) => {
        console.log(e.target)
        const changedFormValue = {
            //...values-> es una condicional para que el contenido de values se mantenga
            ...values, [e.target.name]: e.target.value
            //key:key
        }
        setValues(changedFormValue)
    }

    const handleSubmit = (e) => {
        e.preventDefault();
    }
    return (
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