import React, { Component } from "react";
import { Link } from "react-router-dom";


export default () => {
    return (
        
        <nav class="Nav navbar navbar-black navbar-expand-lg fixed-top navbar navbar-dark bg-primary" id="mainNav">
            <div class="container"><a class="navbar-brand" >Forrester Viagem</a><button data-bs-toggle="collapse" data-bs-target="#navbarResponsive" class="navbar-toggler navbar-toggler-right" type="button" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"> ☰ </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ms-auto text-uppercase">
                        <li className="nav-item">
                            <Link className="nav-link active" to="/">Home</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link active" to="/destino">Destino</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link active" to="/promocoes">Promoções</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link active" to="/cadastro">Cadastro</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link active" to="/contato">Contato</Link>
                        </li>
                    </ul>
                </div>
            </div>
          
        </nav>
        
    );
}