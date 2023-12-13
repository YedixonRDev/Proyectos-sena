import React from 'react';
import { Link } from 'react-router-dom';
import './login.css';

const Login = () => {
  return (
    <div className="container">
      <div className="info">
        <div className="logo">
          <img src="logo.PNG" alt="Logo" />
        </div>

        <p className="tex-1">Gracias por confiar en nosotros.</p><br />
     
        <h1>BIENVENIDOS A NUESTRO SISTEMA</h1><br />

        <p className="text-2">InvenPRO es un sistema de gestión de inventario diseñado para optimizar y agilizar el proceso de administración de productos y transacciones comerciales. Este sistema brinda a las empresas la capacidad de llevar un registro detallado de su inventario, realizar ventas de manera eficiente y mantener un control efectivo sobre su flujo de productos.</p>
      </div>

      <form className="form">
        <h2>Bienvenidos a InvenPRO</h2>
        
        <div className="inputs-registro">
          <input type="email" className="box" placeholder="Ingrese Correo" />
          <input type="password" className="box" placeholder="Contraseña" />
          <Link to="/forgot-password"> ¿Olvidaste tu contraseña?</Link><br></br>
          <Link to="/register" className="button-link">Crear nueva cuenta.</Link>
        </div>
      </form>
    </div>
  );
};

export default Login;