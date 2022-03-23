import Forrester from "../../assets/img/forrester.png";
import SectionContato from "./Section/SectionContato"
import './MainContato.css'

export default () => {
    return (
        <main className="container-fluid">
            <div class="">
                <center><img src={Forrester} class="" /></center>
            </div>
            <SectionContato></SectionContato>
        </main>
    );
}