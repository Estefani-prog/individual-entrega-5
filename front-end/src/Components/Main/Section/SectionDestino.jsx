import { useState } from 'react'

const FormularioDestino = () => {
    const [Nome, setNome] = useState("")
    const [Telefone, setTelefone] = useState("")
    const [Email, setEmail] = useState("")
    const [Destino, setDestino] = useState("")
    const [Valor, setValor] = useState("")
    return (
        <section className="d-flex justify-content-center">
            <div className="card col-sm-6 p-3">
                <div className="mb-3">
                    <h4>Cadastrar Destino</h4>
                </div>
                <div className="mb-2">
                    <form action="">
                        <div className="mb-2">
                            <label for="nome">Nome:</label>
                            <input type="text" required className="form-control" nome="nome" id="nome" placeholder="Escreva seu nome..." value={Nome} onChange={e => setNome(e.target.value)} />
                        </div>
                        <div className="mb-2">
                            <label for="telefone">telefone:</label>
                            <input type="text" required className="form-control" nome="telefone" id="telefone" placeholder="Ex: 21 99999-9999" />
                        </div>
                        <div className="mb-2">
                            <label for="email">E-mail:</label>
                            <input type="text" required className="form-control" nome="email" id="email" placeholder="Ex: contato@viajamar.com.br" value={Email} onChange={e => setEmail(e.target.value)} />
                        </div>
                        <div className="mb-2">
                            <label for="destino">Destino:</label>
                            <input type="text" required className="form-control" nome="destino" id="destino" placeholder="Ex: Rio de janeiro" value={Destino} onChange={e => setDestino(e.target.value)} />
                        </div>
                        <div className="mb-2">
                            <label for="valor">Valor:</label>
                            <input type="text" required className="form-control" nome="valor" id="valor" placeholder="Ex: R$ 699,99" value={Valor} onChange={e => setValor(e.target.value)} />
                            <div className="mb-2">
                                <br></br>
                                <button className="btn btn-secondary btn-lg btn-block" onChange={e => alert(e.target.value)}>Cadastrar</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>
    );
}

export default FormularioDestino