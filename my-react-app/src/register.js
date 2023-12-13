import React from 'react';
import { Link } from 'react-router-dom';
import './register.css';

function Register() {
  return (
    <div className="container">
      <div className="info">
        <div className="logo">
          <img src="logo.PNG" alt="logo" />
        </div>
        <h2>Bienvenidos</h2>
        <p className="text-1">Para unirte a nuestra comunidad por favor registra tus datos.</p>
        <div className="button">
        <Link to="/login" className="button-link">Iniciar Sesion.</Link>
        </div>
      </div>
      <div className="form">
        <h1>Crear Cuenta</h1>
        <div className="inputs">
          <input type="text" className="box" placeholder="Nombre de Usuario o Empresa" />
          <input type="text" className="box" placeholder="Correo electrónico" />
          <input type="password" className="box" placeholder="Ingrese contraseña" />
          <input type="password" className="box" placeholder="Confirmar contraseña" /><br />
        </div>
        <div className="button-2">
          <button className="submit" type="submit">Crear cuenta</button><br /><br />
          <a href="login.html" className="submit-2">Cancelar</a>
        </div>
      </div>
    </div>
  );
}

export default Register;