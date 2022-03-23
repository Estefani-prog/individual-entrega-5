import React from 'react';
import ReactDOM from 'react-dom';
import Home from './Pages/Home/Home';
import Destino from './Pages/Destino/Destino';
import Promocoes from './Pages/Promocoes/Promocoes';
import Cadastro from './Pages/Cadastro/Cadastro';
import Contato from './Pages/Contato/Contato';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'

ReactDOM.render(
  <React.StrictMode>
    <Router>
      <Routes>
        <Route path="/" exact element={<Home />}></Route>
        <Route path="/Destino" element={<Destino />}></Route>
        <Route path="/Promocoes" element={<Promocoes />}></Route>
        <Route path="/Contato" element={<Contato />}></Route>
        <Route path="/Cadastro" element={<Cadastro />}></Route>
      </Routes>
    </Router>
  </React.StrictMode>,
  document.getElementById('root')
);