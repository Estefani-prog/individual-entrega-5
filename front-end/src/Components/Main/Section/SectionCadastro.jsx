import { useState } from 'react'
import './SectionCadastro.css'

const Formulario = () => {
    const [Nome, setNome] = useState("")
    const [CPF, setCpf] = useState("")
    const [Email, setEmail] = useState("")
    const [Endereco, setEndereco] = useState("")
    return (
        <section className="d-flex justify-content-center">
            <div className="card col-sm-6 p-3">
                <div className="mb-3">
                    <h4>Cadastro</h4>
                </div>
                <div className="mb-2"></div>
                <form action="">
                    <div className="mb-2">
                        <label for="nome">Nome:</label>
                        <input type="text" required className="form-control bg-light btn-outline-secondary" placeholder="Nome" value={Nome} onChange={e => setNome(e.target.value)} />
                    </div>
                    <div className="mb-2">
                        <div className="mb-2">
                            <label for="nome">CPF:</label>
                            <input type="text" required className="form-control bg-light btn-outline-secondary" placeholder="CPF" value={CPF} onChange={e => setCpf(e.target.value)} />
                        </div>
                        <label for="nome">Email:</label>
                        <input type="text" required className="form-control bg-light btn-outline-secondary" placeholder="Email" value={Email} onChange={e => setEmail(e.target.value)} />
                    </div>

                    <div className="mb-2">
                        <label for="nome">Endereço:</label>
                        <input type="text" required className="form-control bg-light btn-outline-secondary" placeholder="Estrada Matue, 56" Copacabana-RJ value={Endereco} onChange={e => setEndereco(e.target.value)} />
                    </div>
                    <div className="mb-2">
                        <br></br>
                        <button type="button" required className="btn btn-secondary btn-lg btn-block" onChange={e => alert(e.target.value)}>Cadastrar</button>
                    </div>
                </form>
            </div>
        </section >
    )
}
export default Formulario