import Forrester from "../../assets/img/forrester.png";
import SectionCadastro from "./Section/SectionCadastro";

export default () => {
    return (
        <main className="container-fluid">
            <div className="">
                <center><img src={Forrester} className="" /></center>
            </div>
            <SectionCadastro></SectionCadastro>
        </main>
    );
}