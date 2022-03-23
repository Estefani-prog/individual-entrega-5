import { useState } from 'react'
import './SectionContato.css'

const FormularioContato = () => {
    const [Nome, setNome] = useState("")
    const [Email, setEmail] = useState("")
    const [Mensagem, setMensagem] = useState("")
    return (
        <section className="d-flex justify-content-center">
            <div className="card col-sm-6 p-3">
                <div className="mb-3">
                    <h4>Contato</h4>
                </div>
                <div className="mb-2">
                    <form action="">
                        <div className="mb-2">
                            <label for="nome">Nome:</label>
                            <input type="text" required className="form-control" nome="nome" id="nome" placeholder="Nome Completo" value={Nome} onChange={e => setNome(e.target.value)} />
                        </div>
                        <div className="mb-2">
                            <label for="email">E-mail:</label>
                            <input type="text" required className="form-control" nome="email" id="email" placeholder="Ex: contato@gmail.com" value={Email} onChange={e => setEmail(e.target.value)} />
                        </div>
                        <div className="mb-2">
                            <label for="Mensagem">Mensagem:</label>
                            <textarea type="text" required className="form-control" nome="mensagem" id="mensagem" placeholder="Digite sua mensagem..." value={Mensagem} onChange={e => setMensagem(e.target.value)}></textarea>
                        </div>
                        <div className="mb-2">
                            <br></br>
                            <button className="btn btn-secondary btn-lg btn-block" onChange={e => alert(e.target.value)}>Enviar</button>
                        </div>
                    </form>
                </div>
            </div>
        </section>
    );
}
export default FormularioContato