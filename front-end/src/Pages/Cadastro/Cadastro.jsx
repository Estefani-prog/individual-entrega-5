import React from "react";
import Footer from "../../Components/Footer/Footer";
import Header from "../../Components/Header/Header";
import MainCadastroCliente from "../../Components/Main/MainCadastroCliente";

export default () => {
    return(
        <>
        <Header></Header>
        <MainCadastroCliente></MainCadastroCliente>
        <Footer></Footer>
        </>
    );
}