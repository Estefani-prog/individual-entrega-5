export default (props) => {
    return (
        <div class="carousel slide" data-bs-ride="carousel" id="carousel-1">
            <div class="carousel-inner"></div>
            <div><a class="carousel-control-prev" href="#carousel-1" role="button" data-bs-slide="prev"><span class="carousel-control-prev-icon"></span><span class="visually-hidden">Previous</span></a><a class="carousel-control-next" href="#carousel-1" role="button"
                data-bs-slide="next"><span class="carousel-control-next-icon"></span><span class="visually-hidden">Next</span></a></div>
            <ol class="carousel-indicators"></ol>
        </div>
    );
}