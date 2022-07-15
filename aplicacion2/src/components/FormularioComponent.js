import React, { useState } from "react";

const initialValues = [
    {
        key: '',
        nombre: '',
        apellido: '',
        edad: '',
        email: '',
        password: ''
    }
]

const FormularioComponent = ({ usuarioAdd }) => {

    const [values, setValues] = useState(initialValues);
    const {key, nombre, apellido, edad, email, password } = values;

    const handleInputChange = (e) => {

        const changedFormValue = {

            ...values, [e.target.name]: e.target.value
        }

        setValues(changedFormValue)
    }

    const handleSubmit = (e) => {
        e.preventDefault();

        usuarioAdd(values)
    }

    return (
        <form onSubmit={handleSubmit}>
            <div className='form-group'>
                <label>ID</label>
                <input type='text' className='form-control' id='key' placeholder='Key' value={key} name='key' onChange={handleInputChange} />
            <br/>
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
                <input type='text' className='form-control' id='edad' placeholder='Edad' value={edad} name='edad' onChange={handleInputChange} />
                <br />
            </div>
            <div className='form-group'>
                <div className=''>
                    <label for='staticEmail'>Email</label>
                    <input type='text' readonly className='form-control' id='staticEmail' placeholder="Email" value={email} name='email' onChange={handleInputChange} />
                </div>
            </div>
            <div className='form-group'>
                <div className=''>
                    <label for='inputPassword' className='col-sm-2 col-form-label'>Password</label>
                    <input type='password' className='form-control' id='inputPassword' placeholder='Password' value={password} name='password' onChange={handleInputChange}></input>
                </div>
                <br />
            </div>
            <button type='submit' className='btn btn-outline-primary'>Crear Usuario</button>
        </form>
    )
}

export default FormularioComponent;