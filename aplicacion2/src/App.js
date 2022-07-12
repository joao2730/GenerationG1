import React from 'react';

const App = () => {
    return (
        <div className='container mt-4'>
            <div className='row'>
                <div className='col-6'>
                    <ol class='list-group list-group-numbered'>
                        <h1>Lista Ordenada</h1>
                        <li class='list-group-item'>Luis Garcia</li>
                        <li class='list-group-item'>Cristian Yañez</li>
                        <li class='list-group-item'>Alejandro Heredia</li>
                        <li class='list-group-item'>Cristobal Hapso</li>
                        <li class='list-group-item'>Joao Aranda</li>
                    </ol>
                </div>
                <div className='col'>
                    <h1>Formulario</h1>
                    <div className='mb-3 row'>
                        <div className='col-sm-10'>
                            <label for='staticEmail' className='col-sm-2 col-form-label'>Email</label>
                            <input type='text' readonly className='form-control' id='staticEmail' value='email@example.com'></input>
                        </div>

                    </div>
                    <div className='mb-3 row'>
                        <div className='col-sm-10'>
                            <label for='inputPassword' className='col-sm-2 col-form-label'>Password</label>
                            <input type='password' className='form-control' id='inputPassword'></input>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
};
export default App;