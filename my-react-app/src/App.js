import React from 'react';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom'; // Cambios aquí
import Login from './login';
import Register from './register';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="*" element={<Login/>} />
      </Routes>
    </Router>
  );
}

export default App;

