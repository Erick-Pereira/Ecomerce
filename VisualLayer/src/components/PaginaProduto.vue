<script setup>
import ProdutoImagemCarrocel from './ProdutoImagemCarrocel.vue';
import ProdutoImagem from './ProdutoImagem.vue';
import { ref, computed } from 'vue';
const props = defineProps(['id', 'imagens', 'valor', 'nome', 'marca', 'descricao', 'dispo'])
const id = props.id;
let dispo = props.dispo ? "product available" : "product unavailable";
let carrinho = ref([]);
window.onload = function () {
    carrinho = JSON.parse(localStorage.getItem("Carrinho"));
};
const emit = defineEmits('adicionarCarrinho')
let seila = 0;
let styleObject = "transform: translateX(" + seila + "%) translateX(0px)";

function adicionarCarrinho() {
    carrinho = JSON.parse(localStorage.getItem("Carrinho"));
    if (carrinho != null && carrinho != NaN && carrinho != 0) {
        if (carrinho.length != 0) {
            let found = false;
            for (let i = 0; i < carrinho.length; i++) {
                    if (carrinho[i].id === id) {
                        found = true;
                    }
                    if (found) {
                        carrinho[i].qtd++;
                    }

            }
            if (!found) {
                carrinho.push({ id: id, qtd: 1 })
            }
        }
        else {
            let newProduto = [{ id: id, qtd: 1 }];

            carrinho._value.push(newProduto);

        }
    }
    else
    {
        carrinho = [{ id: id, qtd: 1 }]
    }
    localStorage.setItem("Carrinho", JSON.stringify(carrinho));
    window.location.href = "/Carrinho";
}
function passarFrenteImagem() {
    seila = seila - 10;
    styleObject = "transform: translateX(" + seila + "%) translateX(0px)";

}
function passarTrasImagem() {
    seila = seila + 10;
    styleObject = "transform: translateX(" + seila + "%) translateX(0px)";

}


</script>
<template>
    <title> {{ $route.params.id }}</title>
    <main style="padding-bottom:3rem" class="jss2">
        <div class="MuiContainer-root jss108 jss214 MuiContainer-maxWidthXl">
            <div class="MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3">
                <div class="MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-7">
                    <div class="jss226">
                        <div class="jss228">
                            <div>
                                <div class="carousel jss729">
                                    <div class="verticalSlider___34ZFD carousel__slider carousel__slider--vertical"
                                        aria-live="polite" tabindex="0" role="listbox">
                                        <div class="carousel__slider-tray-wrapper verticalSlideTrayWrap___2nO7o carousel__slider-tray-wrap--vertical"
                                            style="height: 0px; padding-bottom: 660%; width: 100%;">
                                            <ul class="sliderTray___-vHFQ sliderAnimation___300FY carousel__slider-tray verticalTray___12Key carousel__slider-tray--vertical"
                                                style="transform: translateY(0%) translateY(0px); width: 100%; flex-direction: column;">
                                                <ProdutoImagem v-for="(n) in imagens" :-imagem="n.imagemUrl" :-nome="n.nome"
                                                    :Index="n.Index">
                                                </ProdutoImagem>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="jss232">
                                <div class="carousel jss233">
                                    <div class="horizontalSlider___281Ls carousel__slider carousel__slider--horizontal"
                                        aria-live="polite" tabindex="0" role="listbox">
                                        <div class="carousel__slider-tray-wrapper carousel__slider-tray-wrap--horizontal">
                                            <ul class="sliderTray___-vHFQ sliderAnimation___300FY carousel__slider-tray carousel__slider-tray--horizontal"
                                                style="width: 1000%; flex-direction: row;" v-bind:style=styleObject>
                                                <ProdutoImagemCarrocel v-for="(n) in imagens" :-imagem="n.imagemUrl"
                                                    :-nome="n.nome" :Index="n.Index">
                                                </ProdutoImagemCarrocel>
                                            </ul>
                                        </div>
                                    </div>
                                    <button type="button" aria-label="previous"
                                        class="buttonBack___1mlaL carousel__back-button jss300 jss301">
                                        <svg class="MuiSvgIcon-root" @click="passarTrasImagem" focusable="false"
                                            viewBox="0 0 24 24" aria-hidden="true">
                                            <path d="M15.41 7.41L14 6l-6 6 6 6 1.41-1.41L10.83 12z"></path>
                                        </svg>
                                    </button>
                                    <button type="button" aria-label="next"
                                        class="buttonNext___2mOCa carousel__next-button jss300">
                                        <svg class="MuiSvgIcon-root" @click="passarFrenteImagem" focusable="false"
                                            viewBox="0 0 24 24" aria-hidden="true">
                                            <path d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z">
                                            </path>
                                        </svg>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-5">
                    <div class="jss250 jss257"></div>
                    <h1 class="MuiTypography-root jss217 MuiTypography-h6">{{ nome }}</h1>
                    <div class="jss259">
                        <div class="jss260">
                            Brand:
                            <span>{{ marca }}</span>
                        </div>
                        <div class="jss261">
                            <span class="MuiRating-root MuiRating-sizeSmall MuiRating-readOnly" role="img"
                                aria-label="0 Stars">
                                <span>
                                    <span class="MuiRating-icon MuiRating-iconEmpty">
                                        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeInherit" focusable="false"
                                            viewBox="0 0 24 24" aria-hidden="true">
                                            <path
                                                d="M12 17.27L18.18 21l-1.64-7.03L22 9.24l-7.19-.61L12 2 9.19 8.63 2 9.24l5.46 4.73L5.82 21z">
                                            </path>
                                        </svg>
                                    </span>
                                </span>
                                <span>
                                    <span class="MuiRating-icon MuiRating-iconEmpty">
                                        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeInherit" focusable="false"
                                            viewBox="0 0 24 24" aria-hidden="true">
                                            <path
                                                d="M12 17.27L18.18 21l-1.64-7.03L22 9.24l-7.19-.61L12 2 9.19 8.63 2 9.24l5.46 4.73L5.82 21z">
                                            </path>
                                        </svg>
                                    </span>
                                </span>
                                <span>
                                    <span class="MuiRating-icon MuiRating-iconEmpty">
                                        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeInherit" focusable="false"
                                            viewBox="0 0 24 24" aria-hidden="true">
                                            <path
                                                d="M12 17.27L18.18 21l-1.64-7.03L22 9.24l-7.19-.61L12 2 9.19 8.63 2 9.24l5.46 4.73L5.82 21z">
                                            </path>
                                        </svg>
                                    </span>
                                </span>
                                <span>
                                    <span class="MuiRating-icon MuiRating-iconEmpty">
                                        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeInherit" focusable="false"
                                            viewBox="0 0 24 24" aria-hidden="true">
                                            <path
                                                d="M12 17.27L18.18 21l-1.64-7.03L22 9.24l-7.19-.61L12 2 9.19 8.63 2 9.24l5.46 4.73L5.82 21z">
                                            </path>
                                        </svg>
                                    </span>
                                </span>
                                <span>
                                    <span class="MuiRating-icon MuiRating-iconEmpty">
                                        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeInherit" focusable="false"
                                            viewBox="0 0 24 24" aria-hidden="true">
                                            <path
                                                d="M12 17.27L18.18 21l-1.64-7.03L22 9.24l-7.19-.61L12 2 9.19 8.63 2 9.24l5.46 4.73L5.82 21z">
                                            </path>
                                        </svg>
                                    </span>
                                </span>
                            </span>
                            <span></span>
                        </div>
                    </div>
                    <div class="jss268">
                        <span class="jss269">{{ dispo }}</span>
                    </div>
                    <div class="jss263">
                        <div class="jss264">
                            <div class>
                                <div class="jss289">
                                    <div class="jss284">
                                        <div class="jss281">
                                            <s></s>
                                        </div>
                                        <span class="jss271 jss297"></span>
                                        <div class="jss272">{{ valor }}</div>
                                        <span class="jss273 jss297"></span>

                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="jss265">
                            <div class="jss394">
                                <button @click="adicionarCarrinho"
                                    class="MuiButtonBase-root MuiButton-root MuiButton-contained jss396 null MuiButton-containedSecondary MuiButton-containedSizeLarge MuiButton-sizeLarge MuiButton-fullWidth">
                                    <span class="MuiButton-label">
                                        <svg class="MuiSvgIcon-root" focusable="false" viewBox="0 0 24 24"
                                            aria-hidden="true">
                                            <path
                                                d="M11 9h2V6h3V4h-3V1h-2v3H8v2h3v3zm-4 9c-1.1 0-1.99.9-1.99 2S5.9 22 7 22s2-.9 2-2-.9-2-2-2zm10 0c-1.1 0-1.99.9-1.99 2s.89 2 1.99 2 2-.9 2-2-.9-2-2-2zm-9.83-3.25l.03-.12.9-1.63h7.45c.75 0 1.41-.41 1.75-1.03l3.86-7.01L19.42 4h-.01l-1.1 2-2.76 5H8.53l-.13-.27L6.16 6l-.95-2-.94-2H1v2h2l3.6 7.59-1.35 2.45c-.16.28-.25.61-.25.96 0 1.1.9 2 2 2h12v-2H7.42c-.13 0-.25-.11-.25-.25z">
                                            </path>
                                        </svg>
                                        <span class="jss400">
                                            Buy
                                            <br>
                                            <small>add to cart</small>
                                        </span>
                                    </span>
                                    <span class="MuiTouchRipple-root"></span>
                                </button>

                                <div class="jss195 jss197" style="width: 20px;"></div>

                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-12">
                    <div id="product-tab">
                        <!-- product tab nav -->
                        <ul class="tab-nav">
                            <h1>Description</h1>
                        </ul>
                        <!-- /product tab nav -->

                        <!-- product tab content -->
                        <div class="tab-content">
                            <!-- tab1  -->
                            <div id="tab1" class="tab-pane fade in active">
                                <div class="row">
                                    <div class="col-md-12">
                                        <p>{{ descricao }}</p>
                                    </div>
                                </div>
                            </div>
                            <!-- /tab1  -->
                        </div>
                        <!-- /product tab content  -->
                    </div>
                </div>
            </div>
        </div>
    </main>
</template>

<style type="text/css" scoped>
#sharethis-1699103846208 {
    font-family: "Helvetica Neue", Verdana, Helvetica, Arial, sans-serif;
    ;
    direction: ltr;
    display: block;
    opacity: 1;
    text-align: left;
    z-index: 94034;
}

#sharethis-1699103846208.st-animated {
    -moz-transition: o 0.2s ease-in, p 0.2s ease-in, a 0.2s ease-in, c 0.2s ease-in, i 0.2s ease-in, t 0.2s ease-in, y 0.2s ease-in;
    -ms-transition: o 0.2s ease-in, p 0.2s ease-in, a 0.2s ease-in, c 0.2s ease-in, i 0.2s ease-in, t 0.2s ease-in, y 0.2s ease-in;
    -o-transition: o 0.2s ease-in, p 0.2s ease-in, a 0.2s ease-in, c 0.2s ease-in, i 0.2s ease-in, t 0.2s ease-in, y 0.2s ease-in;
    -webkit-transition: o 0.2s ease-in, p 0.2s ease-in, a 0.2s ease-in, c 0.2s ease-in, i 0.2s ease-in, t 0.2s ease-in, y 0.2s ease-in;
    transition: o 0.2s ease-in, p 0.2s ease-in, a 0.2s ease-in, c 0.2s ease-in, i 0.2s ease-in, t 0.2s ease-in, y 0.2s ease-in;
}

#sharethis-1699103846208.st-hidden {
    opacity: 0;
}

#sharethis-1699103846208.st-preview {
    display: none !important;
    opacity: 0 !important;
}

#sharethis-1699103846208.st-hide {
    display: none;
}

#sharethis-1699103846208 .st-btn {
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
    -moz-transition: opacity 0.2s ease-in, top 0.2s ease-in;
    -ms-transition: opacity 0.2s ease-in, top 0.2s ease-in;
    -o-transition: opacity 0.2s ease-in, top 0.2s ease-in;
    -webkit-transition: opacity 0.2s ease-in, top 0.2s ease-in;
    transition: opacity 0.2s ease-in, top 0.2s ease-in;
    -moz-border-radius: 4px;
    -webkit-border-radius: 4px;
    border-radius: 4px;
    border: none;
    cursor: pointer;
    display: inline-block;
    font-size: 12px;
    height: 30px;
    line-height: 30px;
    margin-right: 8px;
    padding: 0 12px;
    position: relative;
    text-align: center;
    top: 0;
    vertical-align: top;
    white-space: nowrap;
}

#sharethis-1699103846208 .st-btn:last-child {
    margin-right: 0;
}

#sharethis-1699103846208 .st-btn>svg {
    height: 15px;
    width: 15px;
    position: relative;
    top: 7px;
    vertical-align: top;
}

#sharethis-1699103846208 .st-btn>img {
    display: inline-block;
    height: 15px;
    width: 15px;
    position: relative;
    top: 7px;
    vertical-align: top;
}

#sharethis-1699103846208 .st-btn>span {
    -moz-transition: all 0.2s ease-in;
    -ms-transition: all 0.2s ease-in;
    -o-transition: all 0.2s ease-in;
    -webkit-transition: all 0.2s ease-in;
    transition: all 0.2s ease-in;
    color: #fff;
    display: inline-block;
    font-weight: 500;
    letter-spacing: 0.5px;
    min-width: 58px;
    opacity: 1;
    padding: 0 6px;
    position: relative;
    vertical-align: top;
}

#sharethis-1699103846208.st-has-labels .st-btn {
    min-width: 116px;
}

#sharethis-1699103846208.st-has-labels .st-btn.st-remove-label {
    min-width: 50px;
}

#sharethis-1699103846208.st-has-labels .st-btn.st-remove-label>span {
    display: none;
}

#sharethis-1699103846208.st-has-labels .st-btn.st-hide-label>span {
    display: none;
}

#sharethis-1699103846208 .st-total {
    color: #555;
    display: inline-block;
    font-weight: 500;
    line-height: 11px;
    margin-right: 0;
    max-width: 80px;
    padding: 4px 8px;
    text-align: center;
}

#sharethis-1699103846208 .st-total.st-hidden {
    display: none;
}

#sharethis-1699103846208 .st-total>span {
    font-size: 15px;
    line-height: 16px;
    display: block;
    padding: 0;
}

#sharethis-1699103846208 .st-total>span.st-shares {
    font-size: 9px;
    line-height: 9px;
}

#sharethis-1699103846208.st-justified {
    display: flex;
    text-align: center;
}

#sharethis-1699103846208.st-justified .st-btn {
    -moz-flex: 1;
    -ms-flex: 1;
    -webkit-flex: 1;
    flex: 1;
}

#sharethis-1699103846208 .st-btn:hover {
    opacity: .8;
    top: -4px;
}
</style>
<style data-jss data-meta="makeStyles">
.jss422 {
    width: 40rem;
    padding: 0 16px;
}

@media (max-width:599.95px) {
    .jss422 {
        width: 30rem;
    }
}

.jss423 {
    font-weight: bold;
}

@media (max-width:599.95px) {
    .jss423 {
        margin: 0;
        display: flex;
        flex-direction: column;
    }
}

.jss424 {
    margin-top: 2rem;
    margin-bottom: 3rem;
}

.jss425 {
    margin-left: 2rem;
}

@media (max-width:599.95px) {
    .jss425 {
        margin-left: 0;
    }
}

.jss426 {
    padding: 2rem;
}

.jss427 {
    color: #fff;
    padding: 2.3rem;
    font-size: 1rem;
    background: rgba(255, 255, 255, 0.16);
    font-weight: bold;
}

.jss428 {
    margin: 0;
    font-size: 0.75rem;
}

.jss429 {
    padding: 4rem 0;
}

.jss430 {
    flex-direction: column;
}

.jss431 {
    padding: 0 16px;
    margin-top: 1rem;
}

.jss432 {
    margin-top: 2rem;
}
</style>
<style data-jss data-meta="makeStyles">
.jss417 {
    padding-bottom: 2rem;
}

.jss418 {
    position: relative;
}

.jss419 {
    margin: 1rem;
    opacity: 0.7 !important;
    overflow: hidden;
    border-radius: 50%;
}

.jss419:hover {
    opacity: 1 !important;
}

.jss420 {
    top: 50%;
    right: -20px;
    border: 0;
    position: absolute;
    background: none;
    margin-top: -25px;
}

.jss420 svg {
    font-size: 40px;
}

@media (max-width:599.95px) {
    .jss420 {
        margin-top: -20px;
    }

    .jss420 svg {
        font-size: 40px;
    }
}

.jss421 {
    left: -20px;
    right: auto;
}
</style>

<style data-jss data-meta="makeStyles">
.jss340 {
    display: flex;
    align-items: center;
    flex-direction: column;
}

.jss341 {
    margin: 1rem 0;
    display: block;
    font-size: 13px;
}
</style>

<style data-jss data-meta="makeStyles" >
.jss342 {
    height: 60px;
    display: flex;
    font-size: 1.5rem;
    text-align: right;
    font-weight: bold;
    line-height: 0.6;
}

.jss342 svg {
    font-size: 35px;
}

.jss342 span {
    margin-left: 1rem;
}

.jss342 small {
    font-size: 0.7rem;
    font-weight: normal;
}

.jss343 {
    font-size: 0.7rem;
    margin-left: 0.3rem;
}

@media (max-width:1279.95px) {
    .jss344 {
        font-size: 1rem;
        line-height: 0.8;
    }

    .jss344 svg {
        font-size: 25px;
    }

    .jss344 small {
        font-size: 0.55rem;
        font-weight: normal;
    }
}

@media (max-width:959.95px) {
    .jss344 {
        font-size: 1.5rem;
        line-height: 0.8;
    }

    .jss344 svg {
        font-size: 35px;
    }

    .jss344 small {
        font-size: 0.7rem;
        font-weight: normal;
    }
}

@media (max-width:1279.95px) {
    .jss345 {
        font-size: 1rem;
        line-height: 0.8;
    }

    .jss345 svg {
        font-size: 25px;
    }

    .jss345 small {
        font-size: 0.55rem;
        font-weight: normal;
    }
}

@media (max-width:599.95px) {
    .jss345 {
        height: 30px;
        font-size: 1rem;
        line-height: 0.8;
    }

    .jss345 svg {
        font-size: 10px;
    }

    .jss345 small {
        font-size: 0.7rem;
        font-weight: normal;
    }

    .jss345 span {
        margin-left: 5px;
        text-transform: capitalize;
    }
}

.jss346 {
    display: block;
    text-align: left;
}
</style>
<style data-jss data-meta="MuiTooltip">
.MuiTooltip-popper {
    z-index: 1500;
    pointer-events: none;
}

.MuiTooltip-popperInteractive {
    pointer-events: auto;
}

.MuiTooltip-popperArrow[x-placement*="bottom"] .MuiTooltip-arrow {
    top: 0;
    left: 0;
    margin-top: -0.71em;
    margin-left: 4px;
    margin-right: 4px;
}

.MuiTooltip-popperArrow[x-placement*="top"] .MuiTooltip-arrow {
    left: 0;
    bottom: 0;
    margin-left: 4px;
    margin-right: 4px;
    margin-bottom: -0.71em;
}

.MuiTooltip-popperArrow[x-placement*="right"] .MuiTooltip-arrow {
    left: 0;
    width: 0.71em;
    height: 1em;
    margin-top: 4px;
    margin-left: -0.71em;
    margin-bottom: 4px;
}

.MuiTooltip-popperArrow[x-placement*="left"] .MuiTooltip-arrow {
    right: 0;
    width: 0.71em;
    height: 1em;
    margin-top: 4px;
    margin-right: -0.71em;
    margin-bottom: 4px;
}

.MuiTooltip-popperArrow[x-placement*="left"] .MuiTooltip-arrow::before {
    transform-origin: 0 0;
}

.MuiTooltip-popperArrow[x-placement*="right"] .MuiTooltip-arrow::before {
    transform-origin: 100% 100%;
}

.MuiTooltip-popperArrow[x-placement*="top"] .MuiTooltip-arrow::before {
    transform-origin: 100% 0;
}

.MuiTooltip-popperArrow[x-placement*="bottom"] .MuiTooltip-arrow::before {
    transform-origin: 0 100%;
}

.MuiTooltip-tooltip {
    color: #fff;
    padding: 4px 8px;
    font-size: 0.625rem;
    max-width: 300px;
    word-wrap: break-word;
    font-family: Roboto, Verdana;
    font-weight: 500;
    line-height: 1.4em;
    border-radius: 4px;
    background-color: rgba(97, 97, 97, 0.9);
}

.MuiTooltip-tooltipArrow {
    margin: 0;
    position: relative;
}

.MuiTooltip-arrow {
    color: rgba(97, 97, 97, 0.9);
    width: 1em;
    height: 0.71em;
    overflow: hidden;
    position: absolute;
    box-sizing: border-box;
}

.MuiTooltip-arrow::before {
    width: 100%;
    height: 100%;
    margin: auto;
    content: "";
    display: block;
    transform: rotate(45deg);
    background-color: currentColor;
}

.MuiTooltip-touch {
    padding: 8px 16px;
    font-size: 0.875rem;
    font-weight: 400;
    line-height: 1.14286em;
}

.MuiTooltip-tooltipPlacementLeft {
    margin: 0 24px;
    transform-origin: right center;
}

@media (min-width:600px) {
    .MuiTooltip-tooltipPlacementLeft {
        margin: 0 14px;
    }
}

.MuiTooltip-tooltipPlacementRight {
    margin: 0 24px;
    transform-origin: left center;
}

@media (min-width:600px) {
    .MuiTooltip-tooltipPlacementRight {
        margin: 0 14px;
    }
}

.MuiTooltip-tooltipPlacementTop {
    margin: 24px 0;
    transform-origin: center bottom;
}

@media (min-width:600px) {
    .MuiTooltip-tooltipPlacementTop {
        margin: 14px 0;
    }
}

.MuiTooltip-tooltipPlacementBottom {
    margin: 24px 0;
    transform-origin: center top;
}

@media (min-width:600px) {
    .MuiTooltip-tooltipPlacementBottom {
        margin: 14px 0;
    }
}
</style>

<style data-jss data-meta="makeStyles">
.jss347 {
    width: 480px;
    padding: 2rem;
}

@media (max-width:959.95px) {
    .jss347 {
        width: 100%;
        padding: 2rem 1rem;
    }
}

.jss348 {
    top: 0.5rem;
    right: 0.5rem;
    position: absolute;
}

.jss349 {
    display: flex;
    font-size: 0.5rem;
    margin-top: 2rem;
    align-items: center;
}

.jss350 {
    font-weight: 700;
    margin-left: 1rem;
}

@media (max-width:959.95px) {
    .jss350 {
        font-size: 1.2rem;
    }
}

.jss351 {
    display: flex;
    margin-top: 1rem;
}

.jss351 img {
    border: 1px solid #eee;
    border-radius: 5px;
}

.jss352 {
    font-weight: 400;
    margin-left: 0.5rem;
}

.jss352 p {
    font-size: 1rem;
    font-weight: 400;
    margin-bottom: 0.5rem;
}

.jss353 {
    margin-top: 1rem;
}

.jss353 button {
    width: 100%;
    margin: 0.5rem 0;
    padding: 1rem;
    font-weight: 800;
}

.jss354 {
    top: 10rem;
}
</style>

<style data-jss data-meta="makeStyles">
.jss278 {
    margin-bottom: 2rem;
}

.jss279 {
    padding-bottom: 2rem;
}

.jss280 {
    margin-bottom: 0;
}

.jss281 {
    padding-top: 0;
}

.jss282 {
    font-size: 25px;
    line-height: 1.2;
    text-transform: uppercase;
}

.jss283 {
    border-bottom: 1px solid;
    margin-bottom: 1.5rem;
    padding-bottom: 1.5rem;
    border-bottom-color: rgba(255, 255, 255, 0.12);
}

.jss284 {
    color: #e90313;
    display: flex;
    font-size: 1.2rem;
    align-items: center;
    font-weight: bold;
    margin-bottom: 0.5rem;
    text-transform: uppercase;
}

.jss284 svg {
    margin-right: 5px;
}

.jss285 {
    border-bottom: 1px solid;
    padding-bottom: 1.5rem;
    border-bottom-color: rgba(255, 255, 255, 0.12);
}

.jss286 {
    background: #303030;
    box-shadow: 0px 3px 3px 1px rgba(0, 0, 0, 0.1);
}

.jss287 {
    display: flex;
    padding: 0.5rem 0.3rem;
    justify-content: space-between;
}

.jss288 {
    display: flex;
    font-weight: 600;
}

.jss288 span {
    font-weight: 400;
    margin-left: 0.2rem;
}

.jss289 {
    display: flex;
    align-items: center;
    justify-content: center;
}

.jss289 small {
    color: #00a202;
    font-size: 1.2rem;
    font-weight: 600;
    margin-right: 0.5rem;
}

.jss290 {
    cursor: pointer;
    display: flex;
    font-size: 0.9rem;
    align-items: center;
}

.jss291 {
    top: 95px;
    position: sticky;
}
</style>
<style data-jss data-meta="makeStyles">
.jss305 {
    display: flex;
    padding: 0.5rem 0;
    justify-content: space-between;
}

.jss306 {
    display: flex;
    font-weight: 600;
}

.jss306 span {
    font-weight: 400;
    margin-left: 0.2rem;
}

.jss307 {
    cursor: pointer;
    display: flex;
    font-size: 0.9rem;
    align-items: center;
}
</style>
<style data-jss data-meta="MuiRating">
.MuiRating-root {
    color: #ffb400;
    cursor: pointer;
    display: inline-flex;
    position: relative;
    font-size: 1.5rem;
    text-align: left;
    -webkit-tap-highlight-color: transparent;
}

.MuiRating-root.Mui-disabled {
    opacity: 0.5;
    pointer-events: none;
}

.MuiRating-root.Mui-focusVisible .MuiRating-iconActive {
    outline: 1px solid #999;
}

.MuiRating-sizeSmall {
    font-size: 1.125rem;
}

.MuiRating-sizeLarge {
    font-size: 1.875rem;
}

.MuiRating-readOnly {
    pointer-events: none;
}

.MuiRating-visuallyhidden {
    top: 20px;
    clip: rect(0 0 0 0);
    color: #000;
    width: 1px;
    border: 0;
    height: 1px;
    margin: -1px;
    padding: 0;
    overflow: hidden;
    position: absolute;
}

input:focus+.MuiRating-pristine {
    top: 0;
    width: 100%;
    bottom: 0;
    outline: 1px solid #999;
    position: absolute;
}

.MuiRating-label {
    cursor: inherit;
}

.MuiRating-icon {
    display: flex;
    transition: transform 150ms cubic-bezier(0.4, 0, 0.2, 1) 0ms;
    pointer-events: none;
}

.MuiRating-iconEmpty {
    color: rgba(255, 255, 255, 0.3);
}

.MuiRating-iconActive {
    transform: scale(1.2);
}

.MuiRating-decimal {
    position: relative;
}
</style>
<style data-jss data-meta="makeStyles">
.jss336 {
    padding: 0.25rem;
    background: #424242;
    border-radius: 5px;
    margin-bottom: 0.5rem;
}

.jss337 {
    text-align: center;
    border-bottom: 1px solid rgba(255, 255, 255, 0.12);
    padding-bottom: 0.25rem;
}

.jss338 {
    border-bottom: 1px solid;
    margin-bottom: 1.5rem;
    padding-bottom: 1.5rem;
    border-bottom-color: rgba(255, 255, 255, 0.12);
}

.jss339 {
    color: #e90313;
    display: flex;
    font-size: 1.2rem;
    align-items: center;
    font-weight: bold;
    margin-bottom: 0.5rem;
    text-transform: uppercase;
}

.jss339 svg {
    margin-right: 5px;
}
</style>
<style data-jss data-meta="makeStyles">
.jss328 .table {
    width: 100%;
}

.jss328 .table td,
.jss328 .table th {
    padding: 0.5rem 0;
    border-bottom: 1px solid;
    border-bottom-color: rgba(255, 255, 255, 0.12);
}
</style>
<style data-jss data-meta="makeStyles">
.jss308 {
    color: #e90313;
}

.jss309 {
    display: flex;
    flex-wrap: wrap;
    margin-top: 1.5rem;
    align-items: center;
    border-bottom: 1px solid #eee;
    margin-bottom: 1.5rem;
    justify-content: space-between;
    border-bottom-color: rgba(255, 255, 255, 0.12);
}

.jss310 {
    min-width: 50%;
    margin-right: 1.5rem;
    padding-bottom: 1.5rem;
}

.jss311 {
    flex: 1;
    min-width: 230px;
    padding-bottom: 1.5rem;
}

.jss312 {
    padding: 1rem 0 1rem;
}

.jss313 {
    color: #e90313;
    margin: 0;
    padding: 0;
    overflow: hidden;
    font-size: 20px;
    text-align: center;
    font-weight: bold;
    white-space: nowrap;
    text-overflow: ellipsis;
    text-transform: uppercase;
}
</style>
<style data-jss data-meta="makeStyles">
.jss314 {
    display: flex;
    border-top: 1px solid;
    margin-top: 0.5rem;
    padding-top: 1rem;
    border-bottom: 1px solid #eee;
    padding-bottom: 1rem;
    justify-content: space-between;
    border-top-color: rgba(255, 255, 255, 0.12);
    border-bottom-color: rgba(255, 255, 255, 0.12);
}

.jss315 {
    color: #009e2a;
    font-weight: bold;
    text-transform: uppercase;
}

.jss316 {
    color: #e90313;
}
</style>
<style data-jss data-meta="makeStyles">
.jss355 {
    margin-top: 0.5rem;
    border-bottom: 1px solid #eee;
    margin-bottom: 1.5rem;
    padding-bottom: 1.5rem;
    border-bottom-color: rgba(255, 255, 255, 0.12);
}

.jss356 {
    padding: 0.5rem;
    background: #424242;
    column-count: 2;
    border-radius: 5px;
    margin-bottom: 0.5rem;
}

.jss357 {
    overflow: hidden;
    font-size: 12px;
    line-height: 1.7;
    white-space: nowrap;
    padding-right: 0.25rem;
    text-overflow: ellipsis;
}

.jss358 {
    color: #fff;
    cursor: pointer;
    font-size: 12px;
    font-weight: normal;
    margin-left: 0.25rem;
    text-decoration: underline;
}

.jss359 {
    color: #e90313;
    display: flex;
    font-size: 1.2rem;
    align-items: center;
    font-weight: bold;
    margin-bottom: 0.5rem;
    text-transform: uppercase;
}

.jss359 svg {
    margin-right: 5px;
}
</style>
<style data-jss data-meta="makeStyles">
.jss360 {
    flex: 0;
}

.jss361 {
    display: flex;
    align-items: center;
}

.jss362 {
    border: 1px solid;
    display: flex;
    padding: 0.25rem;
    background: #303030;
    border-color: #222;
    margin-right: 0.5rem;
    border-radius: 5px;
}

.jss363 {
    margin-right: 0;
}

.jss364 {
    background-color: white;
}
</style>
<style data-jss data-meta="makeStyles">
.jss365 {
    display: flex;
    padding: 0.5rem;
    align-items: center;
    justify-content: center;
}

.jss367 {
    color: #e90313;
    font-size: 16;
    font-weight: bold;
    text-transform: uppercase;
}

.jss368 {
    display: flex;
    justify-content: center;
}

.jss369 {
    color: black;
    margin: 0.30rem;
    padding: 0.25rem;
    background: white;
    border-radius: 2px;
}

.jss370 {
    color: #FFF;
    background: #2d2d2d;
    text-align: center;
    border-radius: 5px;
}
</style>
<style data-jss data-meta="makeStyles">
.jss317 {
    border-bottom: 1px solid #eee;
    margin-bottom: 1.5rem;
    padding-bottom: 1.5rem;
    border-bottom-color: rgba(255, 255, 255, 0.12);
}

.jss318 {
    margin: 0;
    padding: 0.5rem 0.5rem 0.5rem 1rem;
    overflow: auto;
    background: #424242;
    max-height: 300px;
    border-radius: 5px;
    list-style-position: inside;
}

.jss319 {
    line-height: 1.5;
    margin-bottom: 0.5rem;
}

.jss319:last-child {
    margin-bottom: 0;
}

.jss320 {
    display: block;
    vertical-align: top;
}

.jss321 {
    display: block;
    padding-left: 0.5rem;
    margin-bottom: 0.25rem;
    vertical-align: top;
}

.jss322 {
    color: #e90313;
    display: flex;
    font-size: 1.2rem;
    align-items: center;
    font-weight: bold;
    margin-bottom: 0.5rem;
    text-transform: uppercase;
    justify-content: space-between;
}

.jss322 svg {
    margin-right: 5px;
}

.jss322 span {
    display: flex;
    align-items: center;
}

.jss323 {
    color: #009e2a;
    cursor: pointer;
    font-size: 13px;
    margin-left: 5px;
    text-transform: none;
    text-decoration: underline;
}

.jss323 svg {
    font-size: 11px;
    margin-right: 2px;
}
</style>
<style data-jss data-meta="makeStyles">
.jss293 {
    display: flex;
}

.jss294 {
    width: 100px;
    margin-right: 1rem;
}

.jss295 {
    cursor: pointer;
}

.jss295 img {
    max-width: 100%;
}

.jss296 {
    margin: 0;
    padding: 1rem;
    background: white;
    margin-bottom: 0.25rem;
}

.jss297 {
    flex: 1;
    border: 1px solid #eee;
    display: flex;
    position: relative;
    background: white;
    align-items: center;
}

.jss298 {
    flex: 1;
}

@media (max-width:599.95px) {
    .jss298 {
        margin: 0 auto;
        max-width: 350px;
    }
}

.jss299 {
    border: 1px solid #eee;
    overflow: hidden;
    border-radius: 5px;
}

.jss300 {
    top: 50%;
    right: 0;
    border: 0;
    position: absolute;
    background: none;
    margin-top: -30px;
}

.jss300 svg {
    font-size: 60px;
}

@media (max-width:599.95px) {
    .jss300 {
        margin-top: -20px;
    }

    .jss300 svg {
        font-size: 40px;
    }
}

.jss301 {
    left: 0;
    right: auto;
}

.jss302 {
    color: black;
    right: 10px;
    border: 1px solid lightgray;
    bottom: 10px;
    padding: 0.3rem;
    position: absolute;
    font-size: 2rem;
    background: #eee;
    border-radius: 50px;
}

@media (max-width:1479.95px) {
    .jss303 {
        background: white;
    }

    .jss303 div {
        display: flex;
        justify-content: center;
    }
}

@media (max-width:1479.95px) {
    .jss304 {
        width: 100%;
        display: flex;
        justify-content: center;
    }

    .jss304 div {
        display: flex;
        justify-content: center;
    }
}
</style>

<style data-jss data-meta="makeStyles">
.jss324 {
    display: block;
    position: relative;
}

.jss324::after {
    top: 50%;
    left: 0;
    width: 100px;
    height: 2px;
    content: " ";
    display: block;
    position: absolute;
    margin-top: -1px;
    background-color: #e90313;
}

.jss325::after {
    left: 50%;
    margin-left: -50px;
}

.jss326 {
    padding: 2rem 0;
}

.jss327 {
    padding: 1rem 0;
}
</style>
<style data-jss data-meta="makeStyles">
.jss292 {
    color: white;
    padding-bottom: 1rem;
}

.jss292 ol,
.jss292 ul {
    flex-wrap: nowrap;
}

.jss292 li:not(:first-child):not(.MuiBreadcrumbs-separator),
.jss292 p {
    color: white;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
}

.jss292 * {
    font-size: 12px;
}
</style>
<style data-jss data-meta="MuiBreadcrumbs">
.MuiBreadcrumbs-ol {
    margin: 0;
    display: flex;
    padding: 0;
    flex-wrap: wrap;
    list-style: none;
    align-items: center;
}

.MuiBreadcrumbs-separator {
    display: flex;
    margin-left: 8px;
    user-select: none;
    margin-right: 8px;
}
</style>
<style data-jss data-meta="makeStyles">
.jss274 {
    top: 10px;
    color: #C22820;
    right: 10px;
    border: 1px solid lightgray;
    cursor: pointer;
    z-index: 1;
    position: absolute;
    background: white;
    border-radius: 50px;
}

.jss275 {
    color: #e90313;
}

.jss276 {
    padding: 0.5rem;
    font-size: 2.5rem;
}

.jss277 {
    padding: 0.3rem;
    font-size: 2rem;
}
</style>

<style data-jss data-meta="makeStyles">
.jss229 {
    display: flex;
    flex-wrap: wrap;
    margin-top: 0.5rem;
    padding-left: 13px;
}

.jss230 {
    margin: 0.2rem 0.2rem;
    padding: 0.2rem 0.4rem;
    font-size: 0.7rem;
    font-weight: 800;
    border-radius: 0.3rem;
}

.jss231 {
    color: white;
    background: #33751e;
}

.jss232 {
    color: white;
    background: #345aad;
}

.jss233 {
    color: white;
    background: #ffb400;
}

.jss234 {
    color: white;
    background: #c2281f;
}

.jss235 {
    color: white;
    background: black;
}

.jss236 {
    margin-top: 0;
    padding-left: 0;
    margin-bottom: 0.5rem;
}

.jss237 {
    padding: 0.6rem 0.6rem;
    font-size: 1.5rem;
}
</style>

<style data-jss data-meta="makeStyles">
.jss500 {
    width: 100px;
    margin-right: 1rem;
}

.jss501 {
    width: 100%;
    margin-top: 1rem;
}

.jss502 {
    cursor: pointer;
}

.jss502 img {
    max-width: 100%;
}

.jss503 {
    cursor: pointer;
    border-left: 2px solid #303030;
    border-right: 2px solid #303030;
}

.jss503 img {
    max-width: 100%;
}

.jss504 {
    margin: 0;
    padding: 1rem;
    background: white;
    margin-bottom: 0.25rem;
}

.jss505 {
    border: 1px solid #eee;
    overflow: hidden;
    border-radius: 5px;
}
</style>
<style data-jss data-meta="MuiBackdrop">
.MuiBackdrop-root {
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    display: flex;
    z-index: -1;
    position: fixed;
    align-items: center;
    justify-content: center;
    background-color: rgba(0, 0, 0, 0.5);
    -webkit-tap-highlight-color: transparent;
}

.MuiBackdrop-invisible {
    background-color: transparent;
}
</style>
<style data-jss data-meta="MuiCssBaseline">
html {
    box-sizing: border-box;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}

*,
*::before,
*::after {
    box-sizing: inherit;
}

strong,
b {
    font-weight: 700;
}

body {
    color: #fff;
    margin: 0;
    font-size: 0.875rem;
    font-family: Roboto, Verdana;
    font-weight: 400;
    line-height: 1.43;
    background-color: #303030;
}

@media print {
    body {
        background-color: #fff;
    }
}

body::backdrop {
    background-color: #303030;
}
</style>
<style data-jss data-meta="MuiTypography">
.MuiTypography-root {
    margin: 0;
}

.MuiTypography-body2 {
    font-size: 0.875rem;
    font-family: Roboto, Verdana;
    font-weight: 400;
    line-height: 1.43;
}

.MuiTypography-body1 {
    font-size: 1rem;
    font-family: Roboto, Verdana;
    font-weight: 400;
    line-height: 1.5;
}

.MuiTypography-caption {
    font-size: 0.75rem;
    font-family: Roboto, Verdana;
    font-weight: 400;
    line-height: 1.66;
}

.MuiTypography-button {
    font-size: 0.875rem;
    font-family: Roboto, Verdana;
    font-weight: 500;
    line-height: 1.75;
    text-transform: uppercase;
}

.MuiTypography-h1 {
    font-size: 6rem;
    font-family: Roboto, Verdana;
    font-weight: 300;
    line-height: 1.167;
}

.MuiTypography-h2 {
    font-size: 3.75rem;
    font-family: Roboto, Verdana;
    font-weight: 300;
    line-height: 1.2;
}

.MuiTypography-h3 {
    font-size: 3rem;
    font-family: Roboto, Verdana;
    font-weight: 400;
    line-height: 1.167;
}

.MuiTypography-h4 {
    font-size: 2.125rem;
    font-family: Roboto, Verdana;
    font-weight: 400;
    line-height: 1.235;
}

.MuiTypography-h5 {
    font-size: 1.5rem;
    font-family: Roboto, Verdana;
    font-weight: 400;
    line-height: 1.334;
}

.MuiTypography-h6 {
    font-size: 1.25rem;
    font-family: Roboto, Verdana;
    font-weight: 500;
    line-height: 1.6;
}

.MuiTypography-subtitle1 {
    font-size: 1rem;
    font-family: Roboto, Verdana;
    font-weight: 400;
    line-height: 1.75;
}

.MuiTypography-subtitle2 {
    font-size: 0.875rem;
    font-family: Roboto, Verdana;
    font-weight: 500;
    line-height: 1.57;
}

.MuiTypography-overline {
    font-size: 0.75rem;
    font-family: Roboto, Verdana;
    font-weight: 400;
    line-height: 2.66;
    text-transform: uppercase;
}

.MuiTypography-srOnly {
    width: 1px;
    height: 1px;
    overflow: hidden;
    position: absolute;
}

.MuiTypography-alignLeft {
    text-align: left;
}

.MuiTypography-alignCenter {
    text-align: center;
}

.MuiTypography-alignRight {
    text-align: right;
}

.MuiTypography-alignJustify {
    text-align: justify;
}

.MuiTypography-noWrap {
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
}

.MuiTypography-gutterBottom {
    margin-bottom: 0.35em;
}

.MuiTypography-paragraph {
    margin-bottom: 16px;
}

.MuiTypography-colorInherit {
    color: inherit;
}

.MuiTypography-colorPrimary {
    color: #e90313;
}

.MuiTypography-colorSecondary {
    color: #009e2a;
}

.MuiTypography-colorTextPrimary {
    color: #fff;
}

.MuiTypography-colorTextSecondary {
    color: rgba(255, 255, 255, 0.7);
}

.MuiTypography-colorError {
    color: #f44336;
}

.MuiTypography-displayInline {
    display: inline;
}

.MuiTypography-displayBlock {
    display: block;
}
</style>
<style data-jss data-meta="MuiSvgIcon">
.MuiSvgIcon-root {
    fill: currentColor;
    width: 1em;
    height: 1em;
    display: inline-block;
    font-size: 1.5rem;
    transition: fill 200ms cubic-bezier(0.4, 0, 0.2, 1) 0ms;
    flex-shrink: 0;
    user-select: none;
}

.MuiSvgIcon-colorPrimary {
    color: #e90313;
}

.MuiSvgIcon-colorSecondary {
    color: #009e2a;
}

.MuiSvgIcon-colorAction {
    color: #fff;
}

.MuiSvgIcon-colorError {
    color: #f44336;
}

.MuiSvgIcon-colorDisabled {
    color: rgba(255, 255, 255, 0.3);
}

.MuiSvgIcon-fontSizeInherit {
    font-size: inherit;
}

.MuiSvgIcon-fontSizeSmall {
    font-size: 1.25rem;
}

.MuiSvgIcon-fontSizeLarge {
    font-size: 2.1875rem;
}
</style>
<style data-jss data-meta="MuiLink">
.MuiLink-underlineNone {
    text-decoration: none;
}

.MuiLink-underlineHover {
    text-decoration: none;
}

.MuiLink-underlineHover:hover {
    text-decoration: underline;
}

.MuiLink-underlineAlways {
    text-decoration: underline;
}

.MuiLink-button {
    border: 0;
    cursor: pointer;
    margin: 0;
    outline: 0;
    padding: 0;
    position: relative;
    user-select: none;
    border-radius: 0;
    vertical-align: middle;
    -moz-appearance: none;
    background-color: transparent;
    -webkit-appearance: none;
    -webkit-tap-highlight-color: transparent;
}

.MuiLink-button::-moz-focus-inner {
    border-style: none;
}

.MuiLink-button.Mui-focusVisible {
    outline: auto;
}
</style>
<style data-jss data-meta="makeStyles">
.jss110 {
    color: inherit;
    text-decoration: none;
}

.jss110:hover {
    text-decoration: none;
}
</style>
<style data-jss data-meta="MuiTouchRipple">
.MuiTouchRipple-root {
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    z-index: 0;
    overflow: hidden;
    position: absolute;
    border-radius: inherit;
    pointer-events: none;
}

.MuiTouchRipple-ripple {
    opacity: 0;
    position: absolute;
}

.MuiTouchRipple-rippleVisible {
    opacity: 0.3;
    animation: MuiTouchRipple-keyframes-enter 550ms cubic-bezier(0.4, 0, 0.2, 1);
    transform: scale(1);
}

.MuiTouchRipple-ripplePulsate {
    animation-duration: 200ms;
}

.MuiTouchRipple-child {
    width: 100%;
    height: 100%;
    display: block;
    opacity: 1;
    border-radius: 50%;
    background-color: currentColor;
}

.MuiTouchRipple-childLeaving {
    opacity: 0;
    animation: MuiTouchRipple-keyframes-exit 550ms cubic-bezier(0.4, 0, 0.2, 1);
}

.MuiTouchRipple-childPulsate {
    top: 0;
    left: 0;
    position: absolute;
    animation: MuiTouchRipple-keyframes-pulsate 2500ms cubic-bezier(0.4, 0, 0.2, 1) 200ms infinite;
}

@-webkit-keyframes MuiTouchRipple-keyframes-enter {
    0% {
        opacity: 0.1;
        transform: scale(0);
    }

    100% {
        opacity: 0.3;
        transform: scale(1);
    }
}

@-webkit-keyframes MuiTouchRipple-keyframes-exit {
    0% {
        opacity: 1;
    }

    100% {
        opacity: 0;
    }
}

@-webkit-keyframes MuiTouchRipple-keyframes-pulsate {
    0% {
        transform: scale(1);
    }

    50% {
        transform: scale(0.92);
    }

    100% {
        transform: scale(1);
    }
}
</style>

<style data-jss data-meta="MuiGrid">
.MuiGrid-container {
    width: 100%;
    display: flex;
    flex-wrap: wrap;
    box-sizing: border-box;
}

.MuiGrid-item {
    margin: 0;
    box-sizing: border-box;
}

.MuiGrid-zeroMinWidth {
    min-width: 0;
}

.MuiGrid-direction-xs-column {
    flex-direction: column;
}

.MuiGrid-direction-xs-column-reverse {
    flex-direction: column-reverse;
}

.MuiGrid-direction-xs-row-reverse {
    flex-direction: row-reverse;
}

.MuiGrid-wrap-xs-nowrap {
    flex-wrap: nowrap;
}

.MuiGrid-wrap-xs-wrap-reverse {
    flex-wrap: wrap-reverse;
}

.MuiGrid-align-items-xs-center {
    align-items: center;
}

.MuiGrid-align-items-xs-flex-start {
    align-items: flex-start;
}

.MuiGrid-align-items-xs-flex-end {
    align-items: flex-end;
}

.MuiGrid-align-items-xs-baseline {
    align-items: baseline;
}

.MuiGrid-align-content-xs-center {
    align-content: center;
}

.MuiGrid-align-content-xs-flex-start {
    align-content: flex-start;
}

.MuiGrid-align-content-xs-flex-end {
    align-content: flex-end;
}

.MuiGrid-align-content-xs-space-between {
    align-content: space-between;
}

.MuiGrid-align-content-xs-space-around {
    align-content: space-around;
}

.MuiGrid-justify-content-xs-center {
    justify-content: center;
}

.MuiGrid-justify-content-xs-flex-end {
    justify-content: flex-end;
}

.MuiGrid-justify-content-xs-space-between {
    justify-content: space-between;
}

.MuiGrid-justify-content-xs-space-around {
    justify-content: space-around;
}

.MuiGrid-justify-content-xs-space-evenly {
    justify-content: space-evenly;
}

.MuiGrid-spacing-xs-1 {
    width: calc(100% + 8px);
    margin: -4px;
}

.MuiGrid-spacing-xs-1>.MuiGrid-item {
    padding: 4px;
}

.MuiGrid-spacing-xs-2 {
    width: calc(100% + 16px);
    margin: -8px;
}

.MuiGrid-spacing-xs-2>.MuiGrid-item {
    padding: 8px;
}

.MuiGrid-spacing-xs-3 {
    width: calc(100% + 24px);
    margin: -12px;
}

.MuiGrid-spacing-xs-3>.MuiGrid-item {
    padding: 12px;
}

.MuiGrid-spacing-xs-4 {
    width: calc(100% + 32px);
    margin: -16px;
}

.MuiGrid-spacing-xs-4>.MuiGrid-item {
    padding: 16px;
}

.MuiGrid-spacing-xs-5 {
    width: calc(100% + 40px);
    margin: -20px;
}

.MuiGrid-spacing-xs-5>.MuiGrid-item {
    padding: 20px;
}

.MuiGrid-spacing-xs-6 {
    width: calc(100% + 48px);
    margin: -24px;
}

.MuiGrid-spacing-xs-6>.MuiGrid-item {
    padding: 24px;
}

.MuiGrid-spacing-xs-7 {
    width: calc(100% + 56px);
    margin: -28px;
}

.MuiGrid-spacing-xs-7>.MuiGrid-item {
    padding: 28px;
}

.MuiGrid-spacing-xs-8 {
    width: calc(100% + 64px);
    margin: -32px;
}

.MuiGrid-spacing-xs-8>.MuiGrid-item {
    padding: 32px;
}

.MuiGrid-spacing-xs-9 {
    width: calc(100% + 72px);
    margin: -36px;
}

.MuiGrid-spacing-xs-9>.MuiGrid-item {
    padding: 36px;
}

.MuiGrid-spacing-xs-10 {
    width: calc(100% + 80px);
    margin: -40px;
}

.MuiGrid-spacing-xs-10>.MuiGrid-item {
    padding: 40px;
}

.MuiGrid-grid-xs-auto {
    flex-grow: 0;
    max-width: none;
    flex-basis: auto;
}

.MuiGrid-grid-xs-true {
    flex-grow: 1;
    max-width: 100%;
    flex-basis: 0;
}

.MuiGrid-grid-xs-1 {
    flex-grow: 0;
    max-width: 8.333333%;
    flex-basis: 8.333333%;
}

.MuiGrid-grid-xs-2 {
    flex-grow: 0;
    max-width: 16.666667%;
    flex-basis: 16.666667%;
}

.MuiGrid-grid-xs-3 {
    flex-grow: 0;
    max-width: 25%;
    flex-basis: 25%;
}

.MuiGrid-grid-xs-4 {
    flex-grow: 0;
    max-width: 33.333333%;
    flex-basis: 33.333333%;
}

.MuiGrid-grid-xs-5 {
    flex-grow: 0;
    max-width: 41.666667%;
    flex-basis: 41.666667%;
}

.MuiGrid-grid-xs-6 {
    flex-grow: 0;
    max-width: 50%;
    flex-basis: 50%;
}

.MuiGrid-grid-xs-7 {
    flex-grow: 0;
    max-width: 58.333333%;
    flex-basis: 58.333333%;
}

.MuiGrid-grid-xs-8 {
    flex-grow: 0;
    max-width: 66.666667%;
    flex-basis: 66.666667%;
}

.MuiGrid-grid-xs-9 {
    flex-grow: 0;
    max-width: 75%;
    flex-basis: 75%;
}

.MuiGrid-grid-xs-10 {
    flex-grow: 0;
    max-width: 83.333333%;
    flex-basis: 83.333333%;
}

.MuiGrid-grid-xs-11 {
    flex-grow: 0;
    max-width: 91.666667%;
    flex-basis: 91.666667%;
}

.MuiGrid-grid-xs-12 {
    flex-grow: 0;
    max-width: 100%;
    flex-basis: 100%;
}

@media (min-width:600px) {
    .MuiGrid-grid-sm-auto {
        flex-grow: 0;
        max-width: none;
        flex-basis: auto;
    }

    .MuiGrid-grid-sm-true {
        flex-grow: 1;
        max-width: 100%;
        flex-basis: 0;
    }

    .MuiGrid-grid-sm-1 {
        flex-grow: 0;
        max-width: 8.333333%;
        flex-basis: 8.333333%;
    }

    .MuiGrid-grid-sm-2 {
        flex-grow: 0;
        max-width: 16.666667%;
        flex-basis: 16.666667%;
    }

    .MuiGrid-grid-sm-3 {
        flex-grow: 0;
        max-width: 25%;
        flex-basis: 25%;
    }

    .MuiGrid-grid-sm-4 {
        flex-grow: 0;
        max-width: 33.333333%;
        flex-basis: 33.333333%;
    }

    .MuiGrid-grid-sm-5 {
        flex-grow: 0;
        max-width: 41.666667%;
        flex-basis: 41.666667%;
    }

    .MuiGrid-grid-sm-6 {
        flex-grow: 0;
        max-width: 50%;
        flex-basis: 50%;
    }

    .MuiGrid-grid-sm-7 {
        flex-grow: 0;
        max-width: 58.333333%;
        flex-basis: 58.333333%;
    }

    .MuiGrid-grid-sm-8 {
        flex-grow: 0;
        max-width: 66.666667%;
        flex-basis: 66.666667%;
    }

    .MuiGrid-grid-sm-9 {
        flex-grow: 0;
        max-width: 75%;
        flex-basis: 75%;
    }

    .MuiGrid-grid-sm-10 {
        flex-grow: 0;
        max-width: 83.333333%;
        flex-basis: 83.333333%;
    }

    .MuiGrid-grid-sm-11 {
        flex-grow: 0;
        max-width: 91.666667%;
        flex-basis: 91.666667%;
    }

    .MuiGrid-grid-sm-12 {
        flex-grow: 0;
        max-width: 100%;
        flex-basis: 100%;
    }
}

@media (min-width:960px) {
    .MuiGrid-grid-md-auto {
        flex-grow: 0;
        max-width: none;
        flex-basis: auto;
    }

    .MuiGrid-grid-md-true {
        flex-grow: 1;
        max-width: 100%;
        flex-basis: 0;
    }

    .MuiGrid-grid-md-1 {
        flex-grow: 0;
        max-width: 8.333333%;
        flex-basis: 8.333333%;
    }

    .MuiGrid-grid-md-2 {
        flex-grow: 0;
        max-width: 16.666667%;
        flex-basis: 16.666667%;
    }

    .MuiGrid-grid-md-3 {
        flex-grow: 0;
        max-width: 25%;
        flex-basis: 25%;
    }

    .MuiGrid-grid-md-4 {
        flex-grow: 0;
        max-width: 33.333333%;
        flex-basis: 33.333333%;
    }

    .MuiGrid-grid-md-5 {
        flex-grow: 0;
        max-width: 41.666667%;
        flex-basis: 41.666667%;
    }

    .MuiGrid-grid-md-6 {
        flex-grow: 0;
        max-width: 50%;
        flex-basis: 50%;
    }

    .MuiGrid-grid-md-7 {
        flex-grow: 0;
        max-width: 58.333333%;
        flex-basis: 58.333333%;
    }

    .MuiGrid-grid-md-8 {
        flex-grow: 0;
        max-width: 66.666667%;
        flex-basis: 66.666667%;
    }

    .MuiGrid-grid-md-9 {
        flex-grow: 0;
        max-width: 75%;
        flex-basis: 75%;
    }

    .MuiGrid-grid-md-10 {
        flex-grow: 0;
        max-width: 83.333333%;
        flex-basis: 83.333333%;
    }

    .MuiGrid-grid-md-11 {
        flex-grow: 0;
        max-width: 91.666667%;
        flex-basis: 91.666667%;
    }

    .MuiGrid-grid-md-12 {
        flex-grow: 0;
        max-width: 100%;
        flex-basis: 100%;
    }
}

@media (min-width:1280px) {
    .MuiGrid-grid-lg-auto {
        flex-grow: 0;
        max-width: none;
        flex-basis: auto;
    }

    .MuiGrid-grid-lg-true {
        flex-grow: 1;
        max-width: 100%;
        flex-basis: 0;
    }

    .MuiGrid-grid-lg-1 {
        flex-grow: 0;
        max-width: 8.333333%;
        flex-basis: 8.333333%;
    }

    .MuiGrid-grid-lg-2 {
        flex-grow: 0;
        max-width: 16.666667%;
        flex-basis: 16.666667%;
    }

    .MuiGrid-grid-lg-3 {
        flex-grow: 0;
        max-width: 25%;
        flex-basis: 25%;
    }

    .MuiGrid-grid-lg-4 {
        flex-grow: 0;
        max-width: 33.333333%;
        flex-basis: 33.333333%;
    }

    .MuiGrid-grid-lg-5 {
        flex-grow: 0;
        max-width: 41.666667%;
        flex-basis: 41.666667%;
    }

    .MuiGrid-grid-lg-6 {
        flex-grow: 0;
        max-width: 50%;
        flex-basis: 50%;
    }

    .MuiGrid-grid-lg-7 {
        flex-grow: 0;
        max-width: 58.333333%;
        flex-basis: 58.333333%;
    }

    .MuiGrid-grid-lg-8 {
        flex-grow: 0;
        max-width: 66.666667%;
        flex-basis: 66.666667%;
    }

    .MuiGrid-grid-lg-9 {
        flex-grow: 0;
        max-width: 75%;
        flex-basis: 75%;
    }

    .MuiGrid-grid-lg-10 {
        flex-grow: 0;
        max-width: 83.333333%;
        flex-basis: 83.333333%;
    }

    .MuiGrid-grid-lg-11 {
        flex-grow: 0;
        max-width: 91.666667%;
        flex-basis: 91.666667%;
    }

    .MuiGrid-grid-lg-12 {
        flex-grow: 0;
        max-width: 100%;
        flex-basis: 100%;
    }
}

@media (min-width:1480px) {
    .MuiGrid-grid-xl-auto {
        flex-grow: 0;
        max-width: none;
        flex-basis: auto;
    }

    .MuiGrid-grid-xl-true {
        flex-grow: 1;
        max-width: 100%;
        flex-basis: 0;
    }

    .MuiGrid-grid-xl-1 {
        flex-grow: 0;
        max-width: 8.333333%;
        flex-basis: 8.333333%;
    }

    .MuiGrid-grid-xl-2 {
        flex-grow: 0;
        max-width: 16.666667%;
        flex-basis: 16.666667%;
    }

    .MuiGrid-grid-xl-3 {
        flex-grow: 0;
        max-width: 25%;
        flex-basis: 25%;
    }

    .MuiGrid-grid-xl-4 {
        flex-grow: 0;
        max-width: 33.333333%;
        flex-basis: 33.333333%;
    }

    .MuiGrid-grid-xl-5 {
        flex-grow: 0;
        max-width: 41.666667%;
        flex-basis: 41.666667%;
    }

    .MuiGrid-grid-xl-6 {
        flex-grow: 0;
        max-width: 50%;
        flex-basis: 50%;
    }

    .MuiGrid-grid-xl-7 {
        flex-grow: 0;
        max-width: 58.333333%;
        flex-basis: 58.333333%;
    }

    .MuiGrid-grid-xl-8 {
        flex-grow: 0;
        max-width: 66.666667%;
        flex-basis: 66.666667%;
    }

    .MuiGrid-grid-xl-9 {
        flex-grow: 0;
        max-width: 75%;
        flex-basis: 75%;
    }

    .MuiGrid-grid-xl-10 {
        flex-grow: 0;
        max-width: 83.333333%;
        flex-basis: 83.333333%;
    }

    .MuiGrid-grid-xl-11 {
        flex-grow: 0;
        max-width: 91.666667%;
        flex-basis: 91.666667%;
    }

    .MuiGrid-grid-xl-12 {
        flex-grow: 0;
        max-width: 100%;
        flex-basis: 100%;
    }
}
</style>


<style data-jss data-meta="MuiContainer">
.MuiContainer-root {
    width: 100%;
    display: block;
    box-sizing: border-box;
    margin-left: auto;
    margin-right: auto;
    padding-left: 16px;
    padding-right: 16px;
}

@media (min-width:600px) {
    .MuiContainer-root {
        padding-left: 24px;
        padding-right: 24px;
    }
}

.MuiContainer-disableGutters {
    padding-left: 0;
    padding-right: 0;
}

@media (min-width:1280px) {
    .MuiContainer-fixed {
        max-width: 1280px;
    }
}

@media (min-width:600px) {
    .MuiContainer-fixed {
        max-width: 600px;
    }
}

@media (min-width:960px) {
    .MuiContainer-fixed {
        max-width: 960px;
    }
}

@media (min-width:1480px) {
    .MuiContainer-fixed {
        max-width: 1480px;
    }
}

@media (min-width:0px) {
    .MuiContainer-maxWidthXs {
        max-width: 444px;
    }
}

@media (min-width:600px) {
    .MuiContainer-maxWidthSm {
        max-width: 600px;
    }
}

@media (min-width:960px) {
    .MuiContainer-maxWidthMd {
        max-width: 960px;
    }
}

@media (min-width:1280px) {
    .MuiContainer-maxWidthLg {
        max-width: 1280px;
    }
}

@media (min-width:1480px) {
    .MuiContainer-maxWidthXl {
        max-width: 1480px;
    }
}
</style>
<style data-n-href="../css/32d0d379b12a3d24.css">
.buttonBack___1mlaL,
.buttonFirst___2rhFr,
.buttonLast___2yuh0,
.buttonNext___2mOCa,
.buttonNext___3Lm3s,
.dot___3c3SI {
    cursor: pointer
}

.image___xtQGH {
    display: block;
    width: 100%;
    height: 100%
}

.spinner___27VUp {
    position: absolute;
    top: -webkit-calc(50% - 15px);
    top: calc(50% - 15px);
    left: -webkit-calc(50% - 15px);
    left: calc(50% - 15px);
    width: 30px;
    height: 30px;
    -webkit-animation-name: spin___S3UuE;
    animation-name: spin___S3UuE;
    -webkit-animation-duration: 1s;
    animation-duration: 1s;
    -webkit-animation-timing-function: linear;
    animation-timing-function: linear;
    -webkit-animation-iteration-count: infinite;
    animation-iteration-count: infinite;
    border: 4px solid #a9a9a9;
    border-top-color: #000;
    border-radius: 30px
}

@-webkit-keyframes spin___S3UuE {
    0% {
        -webkit-transform: rotate(0deg);
        transform: rotate(0deg)
    }

    to {
        -webkit-transform: rotate(1turn);
        transform: rotate(1turn)
    }
}

@keyframes spin___S3UuE {
    0% {
        -webkit-transform: rotate(0deg);
        transform: rotate(0deg)
    }

    to {
        -webkit-transform: rotate(1turn);
        transform: rotate(1turn)
    }
}

.container___2O72F {
    position: relative;
    overflow: hidden;
    height: 100%;
    width: 100%
}

.overlay___IV4qY {
    position: absolute;
    top: 0;
    left: 0;
    bottom: 0;
    right: 0;
    opacity: 0;
    cursor: -webkit-zoom-in;
    cursor: -moz-zoom-in;
    cursor: zoom-in;
    -webkit-transition: opacity .3s, -webkit-transform .3s;
    transition: opacity .3s, -webkit-transform .3s;
    transition: opacity .3s, transform .3s;
    transition: opacity .3s, transform .3s, -webkit-transform .3s
}

.hover___MYy31,
.loading___1pvNI,
.zoom___3kqYk {
    opacity: 1
}

.imageLoadingSpinnerContainer___3UIPD {
    position: absolute;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    background-color: #f4f4f4
}

.slide___3-Nqo {
    position: relative;
    display: block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    height: 0;
    margin: 0;
    list-style-type: none
}

.slide___3-Nqo:focus {
    outline: none !important
}

.slideHorizontal___1NzNV {
    float: left
}

[dir=rtl] .slideHorizontal___1NzNV {
    direction: rtl;
    -webkit-transform: scaleX(-1);
    transform: scaleX(-1)
}

.slideInner___2mfX9 {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%
}

.focusRing___1airF {
    position: absolute;
    top: 5px;
    right: 5px;
    bottom: 5px;
    left: 5px;
    pointer-events: none;
    outline-width: 5px;
    outline-style: solid;
    outline-color: Highlight
}

@media(-webkit-min-device-pixel-ratio:0) {
    .focusRing___1airF {
        outline-style: auto;
        outline-color: -webkit-focus-ring-color
    }
}

.horizontalSlider___281Ls {
    position: relative;
    overflow: hidden
}

[dir=rtl] .horizontalSlider___281Ls {
    direction: ltr;
    -webkit-transform: scaleX(-1);
    transform: scaleX(-1)
}

.horizontalSliderTray___1L-0W {
    overflow: hidden;
    width: 100%
}

.verticalSlider___34ZFD {
    position: relative;
    overflow: hidden
}

.verticalSliderTray___267D8 {
    overflow: hidden
}

.verticalTray___12Key {
    float: left
}

.verticalSlideTrayWrap___2nO7o {
    overflow: hidden
}

.sliderTray___-vHFQ {
    display: block;
    list-style: none;
    padding: 0;
    margin: 0
}

.sliderAnimation___300FY {
    -webkit-transition: -webkit-transform .5s;
    transition: -webkit-transform .5s;
    transition: transform .5s;
    transition: transform .5s, -webkit-transform .5s;
    -webkit-transition-timing-function: cubic-bezier(.645, .045, .355, 1);
    transition-timing-function: cubic-bezier(.645, .045, .355, 1);
    will-change: transform
}

.masterSpinnerContainer___1Z6hB {
    position: absolute;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    background-color: #f4f4f4
}

.iiz {
    max-width: 100%;
    margin: 0;
    position: relative;
    overflow: hidden;
    display: inline-block;
    cursor: -webkit-zoom-in;
    cursor: -moz-zoom-in;
    cursor: zoom-in
}

.iiz--drag .iiz__zoom-img--visible {
    cursor: -webkit-grab;
    cursor: -moz-grab;
    cursor: grab
}

.iiz__img {
    max-width: 100%;
    height: auto;
    display: block;
    pointer-events: none;
    visibility: visible;
    opacity: 1
}

.iiz__img--hidden {
    visibility: hidden;
    opacity: 0
}

.iiz__img--abs {
    width: 100%;
    height: 100%;
    top: 0;
    left: 0
}

.iiz__img--abs,
.iiz__zoom-img {
    position: absolute;
    display: block
}

.iiz__zoom-img {
    width: auto !important;
    max-width: none !important;
    visibility: hidden;
    opacity: 0;
    pointer-events: none
}

.iiz__zoom-img--visible {
    visibility: visible;
    opacity: 1;
    pointer-events: auto;
    cursor: -webkit-zoom-out;
    cursor: -moz-zoom-out;
    cursor: zoom-out;
    touch-action: none
}

.iiz__zoom-portal {
    position: fixed;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    z-index: 10000
}

.iiz__btn {
    background: rgba(255, 255, 255, .8);
    width: 40px;
    height: 40px;
    border: none;
    outline: 0;
    padding: 0;
    position: absolute;
    text-decoration: none;
    display: -webkit-flex;
    display: -moz-box;
    display: flex;
    -webkit-align-items: center;
    -moz-box-align: center;
    align-items: center;
    -webkit-justify-content: center;
    -moz-box-pack: center;
    justify-content: center;
    -moz-appearance: none;
    -webkit-appearance: none;
    appearance: none
}

.iiz__btn:before {
    content: " ";
    background-position: 50%;
    background-repeat: no-repeat;
    display: block
}

.iiz__hint {
    bottom: 10px;
    right: 10px;
    pointer-events: none
}

.iiz__hint:before {
    content: " ";
    background-image: url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0naHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmcnIHZpZXdCb3g9JzAgMCAxOS45IDE5LjknPjxwYXRoIGQ9J00xMy45IDcuNEMxMy45IDMuOCAxMSAuOSA3LjQuOVMuOSAzLjguOSA3LjRzMi45IDYuNSA2LjUgNi41IDYuNS0yLjkgNi41LTYuNXptNS4zIDEyLjVsLTYuNy03LjJjLTEuNCAxLjMtMy4yIDIuMS01LjEgMi4xLTQuMSAwLTcuNC0zLjMtNy40LTcuNFMzLjMgMCA3LjQgMHM3LjQgMy4zIDcuNCA3LjRjMCAxLjctLjYgMy40LTEuNyA0LjdsNi44IDcuMi0uNy42eicgZmlsbD0nIzAwMDIyMicvPjwvc3ZnPg==);
    width: 20px;
    height: 20px
}

.iiz__close {
    top: 10px;
    right: 10px;
    visibility: hidden;
    opacity: 0
}

.iiz__close--visible {
    visibility: visible;
    opacity: 1;
    cursor: pointer
}

.iiz__close:before {
    content: " ";
    width: 29px;
    height: 29px;
    background-image: -webkit-gradient(linear, left top, left bottom, from(#222), to(#222)), -webkit-gradient(linear, left top, left bottom, from(#222), to(#222));
    background-image: -webkit-linear-gradient(#222, #222), -webkit-linear-gradient(#222, #222);
    background-image: linear-gradient(#222, #222), linear-gradient(#222, #222);
    background-size: 100% 1px, 1px 100%;
    -webkit-transform: rotate(45deg);
    transform: rotate(45deg)
}
</style>
<style data-jss data-meta="makeStyles">
.jss228 {
    display: flex;
}

.jss229 {
    width: 100px;
    margin-right: 1rem;
}

.jss230 {
    cursor: pointer;
}

.jss230 img {
    max-width: 100%;
}

.jss231 {
    margin: 0;
    padding: 1rem;
    background: white;
    margin-bottom: 0.25rem;
}

.jss232 {
    flex: 1;
    border: 1px solid #eee;
    display: flex;
    position: relative;
    background: white;
    align-items: center;
}

.jss233 {
    flex: 1;
}

@media (max-width:599.95px) {
    .jss233 {
        margin: 0 auto;
        max-width: 350px;
    }
}

.jss234 {
    border: 1px solid #eee;
    overflow: hidden;
    border-radius: 5px;
}

.jss235 {
    top: 50%;
    right: 0;
    border: 0;
    position: absolute;
    background: none;
    margin-top: -30px;
}

.jss235 svg {
    font-size: 60px;
}

@media (max-width:599.95px) {
    .jss235 {
        margin-top: -20px;
    }

    .jss235 svg {
        font-size: 40px;
    }
}

.jss236 {
    left: 0;
    right: auto;
}

.jss237 {
    color: black;
    right: 10px;
    border: 1px solid lightgray;
    bottom: 10px;
    padding: 0.3rem;
    position: absolute;
    font-size: 2rem;
    background: #eee;
    border-radius: 50px;
}

@media (max-width:1479.95px) {
    .jss238 {
        background: white;
    }

    .jss238 div {
        display: flex;
        justify-content: center;
    }
}

@media (max-width:1479.95px) {
    .jss239 {
        width: 100%;
        display: flex;
        justify-content: center;
    }

    .jss239 div {
        display: flex;
        justify-content: center;
    }
}
</style>
<style data-jss data-meta="makeStyles">
.jss213 {
    margin-bottom: 2rem;
}

.jss214 {
    padding-bottom: 2rem;
}

.jss215 {
    margin-bottom: 0;
}

.jss216 {
    padding-top: 0;
}

.jss217 {
    font-size: 25px;
    line-height: 1.2;
    text-transform: uppercase;
}

.jss218 {
    border-bottom: 1px solid;
    margin-bottom: 1.5rem;
    padding-bottom: 1.5rem;
    border-bottom-color: rgba(255, 255, 255, 0.12);
}

.jss219 {
    color: #e90313;
    display: flex;
    font-size: 1.2rem;
    align-items: center;
    font-weight: bold;
    margin-bottom: 0.5rem;
    text-transform: uppercase;
}

.jss219 svg {
    margin-right: 5px;
}

.jss220 {
    border-bottom: 1px solid;
    padding-bottom: 1.5rem;
    border-bottom-color: rgba(255, 255, 255, 0.12);
}

.jss221 {
    background: #303030;
    box-shadow: 0px 3px 3px 1px rgba(0, 0, 0, 0.1);
}

.jss222 {
    display: flex;
    padding: 0.5rem 0.3rem;
    justify-content: space-between;
}

.jss223 {
    display: flex;
    font-weight: 600;
}

.jss223 span {
    font-weight: 400;
    margin-left: 0.2rem;
}

.jss224 {
    display: flex;
    align-items: center;
    justify-content: center;
}

.jss224 small {
    color: #00a202;
    font-size: 1.2rem;
    font-weight: 600;
    margin-right: 0.5rem;
}

.jss225 {
    cursor: pointer;
    display: flex;
    font-size: 0.9rem;
    align-items: center;
}

.jss226 {
    top: 95px;
    position: sticky;
}
</style>
<style data-jss data-meta="makeStyles">
.jss449 {
    width: 100px;
    margin-right: 1rem;
}

.jss450 {
    width: 100%;
    margin-top: 1rem;
}

.jss451 {
    cursor: pointer;
}

.jss451 img {
    max-width: 100%;
}

.jss452 {
    cursor: pointer;
    border-left: 2px solid #303030;
    border-right: 2px solid #303030;
}

.jss452 img {
    max-width: 100%;
}

.jss453 {
    margin: 0;
    padding: 1rem;
    background: white;
    margin-bottom: 0.25rem;
}

.jss454 {
    border: 1px solid #eee;
    overflow: hidden;
    border-radius: 5px;
}
</style>
<style data-jss data-meta="MuiButtonBase">
.MuiButtonBase-root {
    color: inherit;
    border: 0;
    cursor: pointer;
    margin: 0;
    display: inline-flex;
    outline: 0;
    padding: 0;
    position: relative;
    align-items: center;
    user-select: none;
    border-radius: 0;
    vertical-align: middle;
    -moz-appearance: none;
    justify-content: center;
    text-decoration: none;
    background-color: transparent;
    -webkit-appearance: none;
    -webkit-tap-highlight-color: transparent;
}

.MuiButtonBase-root::-moz-focus-inner {
    border-style: none;
}

.MuiButtonBase-root.Mui-disabled {
    cursor: default;
    pointer-events: none;
}

@media print {
    .MuiButtonBase-root {
        -webkit-print-color-adjust: exact;
    }
}
</style>

<style data-jss data-meta="MuiButton">
.MuiButton-root {
    color: #fff;
    padding: 6px 16px;
    font-size: 0.875rem;
    min-width: 64px;
    box-sizing: border-box;
    transition: background-color 250ms cubic-bezier(0.4, 0, 0.2, 1) 0ms, box-shadow 250ms cubic-bezier(0.4, 0, 0.2, 1) 0ms, border 250ms cubic-bezier(0.4, 0, 0.2, 1) 0ms;
    font-family: Roboto, Verdana;
    font-weight: 500;
    line-height: 1.75;
    border-radius: 4px;
    text-transform: uppercase;
}

.MuiButton-root:hover {
    text-decoration: none;
    background-color: rgba(255, 255, 255, 0.08);
}

.MuiButton-root.Mui-disabled {
    color: rgba(255, 255, 255, 0.3);
}

@media (hover: none) {
    .MuiButton-root:hover {
        background-color: transparent;
    }
}

.MuiButton-root:hover.Mui-disabled {
    background-color: transparent;
}

.MuiButton-label {
    width: 100%;
    display: inherit;
    align-items: inherit;
    justify-content: inherit;
}

.MuiButton-text {
    padding: 6px 8px;
}

.MuiButton-textPrimary {
    color: #e90313;
}

.MuiButton-textPrimary:hover {
    background-color: rgba(233, 3, 19, 0.08);
}

@media (hover: none) {
    .MuiButton-textPrimary:hover {
        background-color: transparent;
    }
}

.MuiButton-textSecondary {
    color: #009e2a;
}

.MuiButton-textSecondary:hover {
    background-color: rgba(0, 158, 42, 0.08);
}

@media (hover: none) {
    .MuiButton-textSecondary:hover {
        background-color: transparent;
    }
}

.MuiButton-outlined {
    border: 1px solid rgba(255, 255, 255, 0.23);
    padding: 5px 15px;
}

.MuiButton-outlined.Mui-disabled {
    border: 1px solid rgba(255, 255, 255, 0.12);
}

.MuiButton-outlinedPrimary {
    color: #e90313;
    border: 1px solid rgba(233, 3, 19, 0.5);
}

.MuiButton-outlinedPrimary:hover {
    border: 1px solid #e90313;
    background-color: rgba(233, 3, 19, 0.08);
}

@media (hover: none) {
    .MuiButton-outlinedPrimary:hover {
        background-color: transparent;
    }
}

.MuiButton-outlinedSecondary {
    color: #009e2a;
    border: 1px solid rgba(0, 158, 42, 0.5);
}

.MuiButton-outlinedSecondary:hover {
    border: 1px solid #009e2a;
    background-color: rgba(0, 158, 42, 0.08);
}

.MuiButton-outlinedSecondary.Mui-disabled {
    border: 1px solid rgba(255, 255, 255, 0.3);
}

@media (hover: none) {
    .MuiButton-outlinedSecondary:hover {
        background-color: transparent;
    }
}

.MuiButton-contained {
    color: rgba(0, 0, 0, 0.87);
    box-shadow: 0px 3px 1px -2px rgba(0, 0, 0, 0.2), 0px 2px 2px 0px rgba(0, 0, 0, 0.14), 0px 1px 5px 0px rgba(0, 0, 0, 0.12);
    background-color: #e0e0e0;
}

.MuiButton-contained:hover {
    box-shadow: 0px 2px 4px -1px rgba(0, 0, 0, 0.2), 0px 4px 5px 0px rgba(0, 0, 0, 0.14), 0px 1px 10px 0px rgba(0, 0, 0, 0.12);
    background-color: #d5d5d5;
}

.MuiButton-contained.Mui-focusVisible {
    box-shadow: 0px 3px 5px -1px rgba(0, 0, 0, 0.2), 0px 6px 10px 0px rgba(0, 0, 0, 0.14), 0px 1px 18px 0px rgba(0, 0, 0, 0.12);
}

.MuiButton-contained:active {
    box-shadow: 0px 5px 5px -3px rgba(0, 0, 0, 0.2), 0px 8px 10px 1px rgba(0, 0, 0, 0.14), 0px 3px 14px 2px rgba(0, 0, 0, 0.12);
}

.MuiButton-contained.Mui-disabled {
    color: rgba(255, 255, 255, 0.3);
    box-shadow: none;
    background-color: rgba(255, 255, 255, 0.12);
}

@media (hover: none) {
    .MuiButton-contained:hover {
        box-shadow: 0px 3px 1px -2px rgba(0, 0, 0, 0.2), 0px 2px 2px 0px rgba(0, 0, 0, 0.14), 0px 1px 5px 0px rgba(0, 0, 0, 0.12);
        background-color: #e0e0e0;
    }
}

.MuiButton-contained:hover.Mui-disabled {
    background-color: rgba(255, 255, 255, 0.12);
}

.MuiButton-containedPrimary {
    color: #fff;
    background-color: #e90313;
}

.MuiButton-containedPrimary:hover {
    background-color: #a3020d;
}

@media (hover: none) {
    .MuiButton-containedPrimary:hover {
        background-color: #e90313;
    }
}

.MuiButton-containedSecondary {
    color: #fff;
    background-color: #009e2a;
}

.MuiButton-containedSecondary:hover {
    background-color: #006e1d;
}

@media (hover: none) {
    .MuiButton-containedSecondary:hover {
        background-color: #009e2a;
    }
}

.MuiButton-disableElevation {
    box-shadow: none;
}

.MuiButton-disableElevation:hover {
    box-shadow: none;
}

.MuiButton-disableElevation.Mui-focusVisible {
    box-shadow: none;
}

.MuiButton-disableElevation:active {
    box-shadow: none;
}

.MuiButton-disableElevation.Mui-disabled {
    box-shadow: none;
}

.MuiButton-colorInherit {
    color: inherit;
    border-color: currentColor;
}

.MuiButton-textSizeSmall {
    padding: 4px 5px;
    font-size: 0.8125rem;
}

.MuiButton-textSizeLarge {
    padding: 8px 11px;
    font-size: 0.9375rem;
}

.MuiButton-outlinedSizeSmall {
    padding: 3px 9px;
    font-size: 0.8125rem;
}

.MuiButton-outlinedSizeLarge {
    padding: 7px 21px;
    font-size: 0.9375rem;
}

.MuiButton-containedSizeSmall {
    padding: 4px 10px;
    font-size: 0.8125rem;
}

.MuiButton-containedSizeLarge {
    padding: 8px 22px;
    font-size: 0.9375rem;
}

.MuiButton-fullWidth {
    width: 100%;
}

.MuiButton-startIcon {
    display: inherit;
    margin-left: -4px;
    margin-right: 8px;
}

.MuiButton-startIcon.MuiButton-iconSizeSmall {
    margin-left: -2px;
}

.MuiButton-endIcon {
    display: inherit;
    margin-left: 8px;
    margin-right: -4px;
}

.MuiButton-endIcon.MuiButton-iconSizeSmall {
    margin-right: -2px;
}

.MuiButton-iconSizeSmall>*:first-child {
    font-size: 18px;
}

.MuiButton-iconSizeMedium>*:first-child {
    font-size: 20px;
}

.MuiButton-iconSizeLarge>*:first-child {
    font-size: 22px;
}
</style>
<style data-jss data-meta="makeStyles">
.jss271 {
    color: #00a202;
    font-size: 15px;
}

.jss272 {
    color: #00a202;
    font-size: 24px;
    font-weight: bolder;
}

.jss273 {
    overflow: hidden;
    font-size: 12px;
    white-space: nowrap;
    text-overflow: ellipsis;
}

.jss274 {
    width: 30px;
    height: 2px;
    margin: 10px 0;
    background: #F00;
}

.jss275 {
    margin: 10px auto;
}

.jss276 {
    width: 2px;
    height: 25px;
    margin: auto 1rem;
}

.jss277 {
    font-size: 12px;
}

.jss278 {
    color: #F00;
    display: flex;
    font-size: 17px;
    align-items: center;
    font-weight: bold;
}

.jss279 {
    color: #F00;
    font-size: 12px;
    font-weight: bold;
}

.jss280 {
    color: #F00;
    display: flex;
    font-size: 17px;
    align-items: center;
    font-weight: bold;
}

.jss281 {
    color: #F00;
    font-size: 13px;
}

.jss282 {
    text-align: center;
    justify-content: center;
}

.jss283 {
    border-bottom: 1px solid #eee;
    margin-bottom: 1rem;
    padding-bottom: 1rem;
}

.jss284 {
    flex: 1;
}

.jss285 {
    line-height: 1.1;
}

.jss286 {
    width: 40px;
    margin-right: 0.5rem;
}

.jss286 svg {
    font-size: 2rem;
}

.jss287 {
    color: #009e2a;
}

.jss288 {
    color: #e90313;
}

.jss289 {
    display: flex;
    align-items: center;
}

.jss290 {
    display: flex;
    align-items: center;
    justify-content: center;
}

.jss291 {
    border: 2px solid;
    padding: 0.25rem 0.5rem;
    margin-top: 0.5rem;
    border-color: rgba(255, 255, 255, 0.5);
    border-radius: 5px;
}

.jss292 {
    margin-top: 0.5rem;
}

.jss293 {
    font-size: 14px;
    line-height: 1.7;
}

.jss294 {
    color: #fff;
    cursor: pointer;
    font-size: 12px;
    font-weight: normal;
    text-decoration: underline;
}

.jss295 {
    font-size: 1.3rem;
}

.jss296 {
    font-size: 1.3rem;
}

.jss297 {
    font-size: 10px;
}
</style>
<style data-jss data-meta="makeStyles">
.jss259 {
    display: flex;
    padding: 0.5rem 0;
    justify-content: space-between;
}

.jss260 {
    display: flex;
    font-weight: 600;
}

.jss260 span {
    font-weight: 400;
    margin-left: 0.2rem;
}

.jss261 {
    cursor: pointer;
    display: flex;
    font-size: 0.9rem;
    align-items: center;
}
</style>
<style data-jss data-meta="makeStyles">
.jss525 {
    width: 100px;
    margin-right: 1rem;
}

.jss526 {
    width: 100%;
    margin-top: 1rem;
}

.jss527 {
    cursor: pointer;
}

.jss527 img {
    max-width: 100%;
}

.jss528 {
    cursor: pointer;
    border-left: 2px solid #303030;
    border-right: 2px solid #303030;
}

.jss528 img {
    max-width: 100%;
}

.jss529 {
    margin: 0;
    padding: 1rem;
    background: white;
    margin-bottom: 0.25rem;
}

.jss530 {
    border: 1px solid #eee;
    overflow: hidden;
    border-radius: 5px;
}
</style>
<style data-jss data-meta="makeStyles">
.jss729 {
    width: 100px;
    margin-right: 1rem;
}

.jss730 {
    width: 100%;
    margin-top: 1rem;
}

.jss731 {
    cursor: pointer;
}

.jss731 img {
    max-width: 100%;
}

.jss732 {
    cursor: pointer;
    border-left: 2px solid #303030;
    border-right: 2px solid #303030;
}

.jss732 img {
    max-width: 100%;
}

.jss733 {
    margin: 0;
    padding: 1rem;
    background: white;
    margin-bottom: 0.25rem;
}

.jss734 {
    border: 1px solid #eee;
    overflow: hidden;
    border-radius: 5px;
}
</style>
<style data-jss data-meta="makeStyles">
.jss707 {
    width: 100%;
    margin: 0;
    display: flex;
    padding: 0;
    margin-top: 0.25rem;
    text-align: center;
    align-items: center;
}

.jss707 img {
    width: auto;
    height: 55px;
}

@media (min-width:600px) {
    .jss707 img {
        height: 50px;
    }
}

.jss708 {
    height: 100%;
    margin: 0;
    display: flex;
    align-items: center;
    padding-top: 0;
}

.jss709 {
    padding-top: 0;
    padding-bottom: 0.5em;
}

.jss710 {
    display: flex;
    justify-content: flex-end;
}

.jss711 {
    display: flex;
    align-items: center;
    padding-top: 0.5rem;
    justify-content: flex-end;
}

.jss712 {
    padding-top: 0;
    padding-bottom: 1rem;
}

.jss713 {
    top: 0;
    width: 100%;
    padding: 0.75rem 0;
    z-index: 2;
    position: fixed;
    background: #303030;
    box-shadow: 0 1px 4px 2px rgba(0, 0, 0, 0.1);
}

.jss714 {
    align-items: center;
}

.jss715 {
    height: 45px;
    display: flex;
    padding: 0;
    background: rgba(255, 255, 255, 0.12);
    box-shadow: 0 0 5px 2px rgba(0, 0, 0, 0.2);
    align-items: center;
    margin-right: 1rem;
    border-radius: 0 0 5px 5px;
}

.jss716 {
    padding: 0 0.5rem;
    font-size: 12px;
    font-weight: bold;
    text-transform: uppercase;
}

@media (min-width:1280px) {
    .jss716 {
        padding: 0 1rem;
    }
}

.jss716 a:hover {
    text-decoration: underline;
}

.jss717 a {
    color: white;
}

.jss717 svg {
    float: left;
    font-size: 15px;
    margin-right: 5px;
}
</style>

<style data-jss data-meta="makeStyles">
.jss371 {
    display: flex;
    padding: 0 1rem;
    font-size: 10px;
    align-items: center;
    text-transform: uppercase;
}

.jss371 strong {
    font-size: 13px;
}

.jss371 svg {
    color: #e90313;
    font-size: 30px;
}

@media (max-width:1279.95px) {
    .jss371 {
        padding: 0 0.25rem;
    }
}

.jss372 {
    position: relative;
    margin-right: 0.2rem;
}

.jss373 {
    left: 17px;
    color: black;
    border: 2px solid #303030;
    bottom: 3px;
    padding: 1px 4px;
    position: absolute;
    background: white;
    font-weight: bold;
    border-radius: 50%;
}

.jss374 {
    color: #e90313;
    background: transparent;
    margin-right: 0.5rem;
}

.jss375 {
    color: white !important;
    font-size: 25px !important;
    margin-top: 0.35rem;
}
</style>
<style data-jss data-meta="makeStyles">
.jss268 {
    display: flex;
    border-top: 1px solid;
    margin-top: 0.5rem;
    padding-top: 1rem;
    border-bottom: 1px solid #eee;
    padding-bottom: 1rem;
    justify-content: space-between;
    border-top-color: rgba(255, 255, 255, 0.12);
    border-bottom-color: rgba(255, 255, 255, 0.12);
}

.jss269 {
    color: #009e2a;
    font-weight: bold;
    text-transform: uppercase;
}

.jss270 {
    color: #e90313;
}
</style>
<style data-jss data-meta="makeStyles">
.jss396 {
    height: 60px;
    display: flex;
    font-size: 1.5rem;
    text-align: right;
    font-weight: bold;
    line-height: 0.6;
}

.jss396 svg {
    font-size: 35px;
}

.jss396 span {
    margin-left: 1rem;
}

.jss396 small {
    font-size: 0.7rem;
    font-weight: normal;
}

.jss397 {
    font-size: 0.7rem;
    margin-left: 0.3rem;
}

@media (max-width:1279.95px) {
    .jss398 {
        font-size: 1rem;
        line-height: 0.8;
    }

    .jss398 svg {
        font-size: 25px;
    }

    .jss398 small {
        font-size: 0.55rem;
        font-weight: normal;
    }
}

@media (max-width:959.95px) {
    .jss398 {
        font-size: 1.5rem;
        line-height: 0.8;
    }

    .jss398 svg {
        font-size: 35px;
    }

    .jss398 small {
        font-size: 0.7rem;
        font-weight: normal;
    }
}

@media (max-width:1279.95px) {
    .jss399 {
        font-size: 1rem;
        line-height: 0.8;
    }

    .jss399 svg {
        font-size: 25px;
    }

    .jss399 small {
        font-size: 0.55rem;
        font-weight: normal;
    }
}

@media (max-width:599.95px) {
    .jss399 {
        height: 30px;
        font-size: 1rem;
        line-height: 0.8;
    }

    .jss399 svg {
        font-size: 10px;
    }

    .jss399 small {
        font-size: 0.7rem;
        font-weight: normal;
    }

    .jss399 span {
        margin-left: 5px;
        text-transform: capitalize;
    }
}

.jss400 {
    display: block;
    text-align: left;
}
</style>
<style data-jss data-meta="PrivateSwipeArea">
.jss195 {
    top: 0;
    left: 0;
    bottom: 0;
    z-index: 1199;
    position: fixed;
}

.jss196 {
    right: auto;
}

.jss197 {
    left: auto;
    right: 0;
}

.jss198 {
    right: 0;
    bottom: auto;
}

.jss199 {
    top: auto;
    right: 0;
    bottom: 0;
}
</style>
<style data-jss data-meta="makeStyles">
.jss394 {
    display: flex;
    align-items: center;
    flex-direction: column;
}

.jss395 {
    margin: 1rem 0;
    display: block;
    font-size: 13px;
}
</style>