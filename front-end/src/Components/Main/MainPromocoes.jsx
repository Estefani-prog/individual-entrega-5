import CardPromocao from './Cards/CardPromocao'
import Paris from '../../assets/img/paris.jpeg'
import Polinesia from '../../assets/img/polinesia.jpg'
import Dubai from '../../assets/img/dubai.jpg'
import Roma from '../../assets/img/roma.jpg'
import Disney from '../../assets/img/disney.png'
import Cancun from '../../assets/img/cancun.jpg'
import Forrester from "../../assets/img/forrester.png"
import './Main.css'

export default () => {
    return (
        <main className="container-fluid">
            <div class="logo">
            <center><img src={Forrester} class="logo" /></center>
            </div>
            <br></br>
            <h2 className="text-center">Promoções</h2>
            <></>
            <p className="text-center">As melhores preços para sua viagem. Venha conferir nossos pacotes e promoções. </p>
            <></>
            <div className="cards">
                <CardPromocao foto={Paris}
                    titulo="PARIS"
                    text="Paris tem muitos marcos célebres. Com sua silhueta elevada visível de longe, a Torre Eiffel tornou-se um símbolo da cidade. O grande Arco do Triunfo homenageia as conquistas militares de Napoleão. A Catedral de Notre-Dame, que foi construída entre os séculos XII e XIV, se destaca por seus vitrais coloridos e por seus altos arcos de pedra."
                    valor="R$ 1899.99"
                />
                <CardPromocao foto={Polinesia}
                    titulo="POLONÉSIA"
                    text="A Polinésia é uma região espetacular da Oceania que emerge, com suas costas extraordinariamente bonitas, entre a Nova Zelândia, a Ilha de Páscoa e o Havaí. A área é composta por mais de mil ilhas e ilhotas que emergem do Oceano Pacífico. Seus habitantes, os polinésios, partilham uma cultura extraordinária a ser descoberta"
                    valor="R$ 1899.99"
                />
                <CardPromocao foto={Dubai}
                    titulo="DUBAI"
                    text="Mais moderna do que tradicional em relação aos outros territórios dos Emirados Árabes Unidos, Dubai passou por cima de seu clima desértico para chamar a atenção do mundo. A capital de mesmo nome combina um grande centro de negócios, lojas de luxo e muitas atrações para os visitantes."
                    valor="R$ 1899.99"
                />
                <CardPromocao foto={Roma}
                    titulo="ROMA"
                    text="Roma, atual capital da Itália, é o centro de onde emergiu um dos mais extensos impérios constituídos durante a Antiguidade. Fixada na porção central da Península Itálica, esta cidade foi criada no século VIII a.C. e contou com diferentes influências culturais e étnicas."
                    valor="R$ 1899.99"
                />
                <CardPromocao foto={Disney}
                    titulo="DISNEY"
                    text="Atualmente o complexo tem mais de 121 Km² de área (para se ter uma ideia é maior que a cidade de São Francisco), 4 parques temáticos e 2 aquáticos, com um centro de lazer e compras chamado Disney Springs e com mais de 25 resorts, com campo de golfe, complexo de esportes e mais uma infinidade de atividades e atrações."
                    valor="R$ 1899.99"
                />
                <CardPromocao foto={Cancun}
                    titulo="CANCÚN"
                    text="Cancún é um dos destinos mais famosos do México e um dos mais completos do Caribe, com opções de lazer e descanso para todas as idades. E motivos não faltam para isso: são inúmeras opções de diversão, cultura e badalação – isso sem falar no maravilhoso mar caribenho."
                    valor="R$ 1899.99"
                />
            </div>
        </main>
    );
}