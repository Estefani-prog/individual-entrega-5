import Card from "./Cards/Card";
import Section from "./Section/Section";
import Paris from '../../assets/img/paris.jpeg';
import RioDeJaneiro from '../../assets/img/riodejaneiro.jpg';
import Dubai from '../../assets/img/dubai.jpg';
import SectionHome from "./Section/SectionHome";
import './Main.css'

export default () => {
    return (
        <main className="container-fluid">
            <div>
                <div className="_background"></div>
            </div>
            <br></br>
            <h1 className="text-center">Olá, bem vindo!</h1>
            <br></br>
            <p className="text-center">Divirta-se muito e aproveite como nunca, você merece. Boa viagem! </p>
            <div className="cards">
                <Card foto={Paris}
                    titulo="Paris"
                    text="Paris tem muitos marcos célebres. Com sua silhueta elevada visível de longe, a Torre Eiffel tornou-se um símbolo da cidade. O grande Arco do Triunfo homenageia as conquistas militares de Napoleão. A Catedral de Notre-Dame, que foi construída entre os séculos XII e XIV, se destaca por seus vitrais coloridos e por seus altos arcos de pedra."
                />
                <Card foto={RioDeJaneiro}
                    titulo="Rio de Janeiro"
                    text="A cidade do Rio de Janeiro, considerada uma das mais belas do mundo, é a capital do estado do Rio de Janeiro, na região Sudeste do Brasil. Todos os anos, suas belas praias atraem muitos turistas de outras partes do país e do exterior. No Carnaval, milhares de visitantes assistem aos desfiles das escolas de samba cariocas."
                />
                <Card foto={Dubai}
                    titulo="Dubai"
                    text="Mais moderna do que tradicional em relação aos outros territórios dos Emirados Árabes Unidos, Dubai passou por cima de seu clima desértico para chamar a atenção do mundo. A capital de mesmo nome combina um grande centro de negócios, lojas de luxo e muitas atrações para os visitantes."
                />
            </div>
            <Section></Section>
            <></>
            <SectionHome></SectionHome>
        </main>
    );
}