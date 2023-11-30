// LoginForm.js
import React, { useState } from 'react';

const LoginForm = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Puedes agregar lógica para manejar el envío del formulario aquí
  };

  return (
    <form className="form" onSubmit={handleSubmit}>
      <h2>Bienvenidos a InvenPRO</h2>

      <div className="inputs-registro">
        <input
          type="email"
          className="box"
          placeholder="Ingrese Correo"
          value={email}
          onChange={handleEmailChange}
        />

        <input
          type="password"
          className="box"
          placeholder="Contraseña"
          value={password}
          onChange={handlePasswordChange}
        />

        <a href="register.html">¿Olvidaste tu contraseña?</a>
        <br />
        <br />

        <a href="register.html" className="button-link">
          Crear nueva cuenta.
        </a>
      </div>
    </form>
  );
};

export default LoginForm;
