<script setup>
import { computed, ref } from 'vue'
let props = defineProps(['Nome', 'Imagem', 'Index'])
const tabIndex = computed(() => {
    if (props.index > 0) {
        return -1;
    }
    else {
        return 0;
    }
})

const hidden = computed(() => {
    if (props.index === 0) {
        return "carousel__slide--visible";
    }
    else {
        return "carousel__slide--hidden";
    }
})
</script>
<template>
    <li :tabindex="tabIndex" :aria-selected="props.index === 0" role="option"
        class="slide___3-Nqo slideHorizontal___1NzNV carousel__slide " :class="hidden"
        style="width: 10%; padding-bottom: 10%;">
        <div class="slideInner___2mfX9 carousel__inner-slide">
            <figure class="iiz  ">
                <div>
                    <img :src="Imagem" :alt="Nome" style="transition: opacity 0ms linear 0ms, visibility 0ms linear 0ms; width: 100%;
  height: auto;">
                </div>
            </figure>
        </div>
    </li>
</template>
<style scoped>
element.style {
    width: 12.5%;
    padding-bottom: 12.5%;
}

.slideHorizontal___1NzNV {
    float: left;
}

.slide___3-Nqo {
    position: relative;
    display: block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    height: 0;
    margin: 0;
    list-style-type: none;
}

.slideHorizontal___1NzNV {
    float: left;
}

.slide___3-Nqo {
    position: relative;
    display: block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    height: 0;
    margin: 0;
    list-style-type: none;
}

*,
*::before,
*::after {
    box-sizing: inherit;
}

*,
html {
    font-family: Roboto;
}

user agent stylesheet li {
    display: list-item;
    text-align: -webkit-match-parent;
}

.sliderTray___-vHFQ {
    display: block;
    list-style: none;
    padding: 0;
    margin: 0;
}

.sliderTray___-vHFQ {
    display: block;
    list-style: none;
    padding: 0;
    margin: 0;
}

user agent stylesheet ul {
    list-style-type: disc;
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

body {
    overflow-x: hidden;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}

:root {
    --filete-desktop: url(https://hotsite.pichau.com.br/descricao/filete/pichau/escolha-monitor-desktop.png);
    --filete-mobile: url(https://hotsite.pichau.com.br/descricao/filete/pichau/escolha-monitor-mobile.png);
    --thumb-video1: url(https://hotsite.pichau.com.br/descricao/);
    --thumb-video2: url(https://hotsite.pichau.com.br/descricao/);
    --banner-principal: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL01.jpg);
    --icone-1: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/design.svg);
    --icone-2: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/tecnologia.svg);
    --icone-3: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/g-sync.svg);
    --icone-4: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/painel.svg);
    --icone-5: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/taxa-atualizacao.svg);
    --icone-6: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/tempo-resposta.svg);
    --icone-7: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/angulo.svg);
    --icone-8: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/suporte.svg);
    --icone-9: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/conexoes.svg);
    --storie-1: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL011.jpg);
    --storie-2: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL012.jpg);
    --storie-3: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL013.jpg);
    --storie-4: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL014.jpg);
}

html {
    box-sizing: border-box;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}



.slideInner___2mfX9 {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
}

.slideInner___2mfX9 {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
}

*,
*::before,
*::after {
    box-sizing: inherit;
}

*,
html {
    font-family: Roboto;
}

user agent stylesheet div {
    display: block;
}

.slide___3-Nqo {
    position: relative;
    display: block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    height: 0;
    margin: 0;
    list-style-type: none;
}

.slide___3-Nqo {
    position: relative;
    display: block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    height: 0;
    margin: 0;
    list-style-type: none;
}

user agent stylesheet li {
    text-align: -webkit-match-parent;
}

.sliderTray___-vHFQ {
    display: block;
    list-style: none;
    padding: 0;
    margin: 0;
}

.sliderTray___-vHFQ {
    display: block;
    list-style: none;
    padding: 0;
    margin: 0;
}

user agent stylesheet ul {
    list-style-type: disc;
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

body {
    overflow-x: hidden;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}

:root {
    --filete-desktop: url(https://hotsite.pichau.com.br/descricao/filete/pichau/escolha-monitor-desktop.png);
    --filete-mobile: url(https://hotsite.pichau.com.br/descricao/filete/pichau/escolha-monitor-mobile.png);
    --thumb-video1: url(https://hotsite.pichau.com.br/descricao/);
    --thumb-video2: url(https://hotsite.pichau.com.br/descricao/);
    --banner-principal: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL01.jpg);
    --icone-1: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/design.svg);
    --icone-2: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/tecnologia.svg);
    --icone-3: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/g-sync.svg);
    --icone-4: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/painel.svg);
    --icone-5: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/taxa-atualizacao.svg);
    --icone-6: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/tempo-resposta.svg);
    --icone-7: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/angulo.svg);
    --icone-8: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/suporte.svg);
    --icone-9: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/conexoes.svg);
    --storie-1: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL011.jpg);
    --storie-2: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL012.jpg);
    --storie-3: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL013.jpg);
    --storie-4: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL014.jpg);
}

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

*,
*::before,
*::after {
    box-sizing: inherit;
}


.iiz {
    max-width: 100%;
    margin: 0;
    position: relative;
    overflow: hidden;
    display: inline-block;
    cursor: -webkit-zoom-in;
    cursor: -moz-zoom-in;
    cursor: zoom-in;
}


*,
*::before,
*::after {
    box-sizing: inherit;
}

*,
html {
    font-family: Roboto;
}

user agent stylesheet figure {
    display: block;
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 40px;
    margin-inline-end: 40px;
}

.slide___3-Nqo {
    position: relative;
    display: block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    height: 0;
    margin: 0;
    list-style-type: none;
}

.slide___3-Nqo {
    position: relative;
    display: block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    height: 0;
    margin: 0;
    list-style-type: none;
}

user agent stylesheet li {
    text-align: -webkit-match-parent;
}

.sliderTray___-vHFQ {
    display: block;
    list-style: none;
    padding: 0;
    margin: 0;
}

.sliderTray___-vHFQ {
    display: block;
    list-style: none;
    padding: 0;
    margin: 0;
}

user agent stylesheet ul {
    list-style-type: disc;
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

body {
    overflow-x: hidden;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}

:root {
    --filete-desktop: url(https://hotsite.pichau.com.br/descricao/filete/pichau/escolha-monitor-desktop.png);
    --filete-mobile: url(https://hotsite.pichau.com.br/descricao/filete/pichau/escolha-monitor-mobile.png);
    --thumb-video1: url(https://hotsite.pichau.com.br/descricao/);
    --thumb-video2: url(https://hotsite.pichau.com.br/descricao/);
    --banner-principal: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL01.jpg);
    --icone-1: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/design.svg);
    --icone-2: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/tecnologia.svg);
    --icone-3: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/g-sync.svg);
    --icone-4: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/painel.svg);
    --icone-5: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/taxa-atualizacao.svg);
    --icone-6: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/tempo-resposta.svg);
    --icone-7: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/angulo.svg);
    --icone-8: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/suporte.svg);
    --icone-9: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/conexoes.svg);
    --storie-1: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL011.jpg);
    --storie-2: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL012.jpg);
    --storie-3: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL013.jpg);
    --storie-4: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL014.jpg);
}

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

*,
*::before,
*::after {
    box-sizing: inherit;
}


*,
*::before,
*::after {
    box-sizing: inherit;
}

*,
html {
    font-family: Roboto;
}

user agent stylesheet div {
    display: block;
}

.iiz {
    max-width: 100%;
    margin: 0;
    position: relative;
    overflow: hidden;
    display: inline-block;
    cursor: -webkit-zoom-in;
    cursor: -moz-zoom-in;
    cursor: zoom-in;
}

.slide___3-Nqo {
    position: relative;
    display: block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    height: 0;
    margin: 0;
    list-style-type: none;
}

.slide___3-Nqo {
    position: relative;
    display: block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    height: 0;
    margin: 0;
    list-style-type: none;
}

user agent stylesheet li {
    text-align: -webkit-match-parent;
}

.sliderTray___-vHFQ {
    display: block;
    list-style: none;
    padding: 0;
    margin: 0;
}

.sliderTray___-vHFQ {
    display: block;
    list-style: none;
    padding: 0;
    margin: 0;
}

user agent stylesheet ul {
    list-style-type: disc;
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

body {
    overflow-x: hidden;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}

:root {
    --filete-desktop: url(https://hotsite.pichau.com.br/descricao/filete/pichau/escolha-monitor-desktop.png);
    --filete-mobile: url(https://hotsite.pichau.com.br/descricao/filete/pichau/escolha-monitor-mobile.png);
    --thumb-video1: url(https://hotsite.pichau.com.br/descricao/);
    --thumb-video2: url(https://hotsite.pichau.com.br/descricao/);
    --banner-principal: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL01.jpg);
    --icone-1: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/design.svg);
    --icone-2: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/tecnologia.svg);
    --icone-3: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/g-sync.svg);
    --icone-4: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/painel.svg);
    --icone-5: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/taxa-atualizacao.svg);
    --icone-6: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/tempo-resposta.svg);
    --icone-7: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/angulo.svg);
    --icone-8: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/suporte.svg);
    --icone-9: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/conexoes.svg);
    --storie-1: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL011.jpg);
    --storie-2: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL012.jpg);
    --storie-3: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL013.jpg);
    --storie-4: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL014.jpg);
}

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

*,
*::before,
*::after {
    box-sizing: inherit;
}

element.style {
    transition: opacity 0ms linear 0ms, visibility 0ms linear 0ms;
}

.iiz__img {
    max-width: 100%;
    height: auto;
    display: block;
    pointer-events: none;
    visibility: visible;
    opacity: 1;
}

*,
*::before,
*::after {
    box-sizing: inherit;
}

*,
html {
    font-family: Roboto;
}

user agent stylesheet img {
    overflow-clip-margin: content-box;
    overflow: clip;
}

.iiz {
    max-width: 100%;
    margin: 0;
    position: relative;
    overflow: hidden;
    display: inline-block;
    cursor: -webkit-zoom-in;
    cursor: -moz-zoom-in;
    cursor: zoom-in;
}

.slide___3-Nqo {
    position: relative;
    display: block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    height: 0;
    margin: 0;
    list-style-type: none;
}

.slide___3-Nqo {
    position: relative;
    display: block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    height: 0;
    margin: 0;
    list-style-type: none;
}

user agent stylesheet li {
    text-align: -webkit-match-parent;
}

.sliderTray___-vHFQ {
    display: block;
    list-style: none;
    padding: 0;
    margin: 0;
}

.sliderTray___-vHFQ {
    display: block;
    list-style: none;
    padding: 0;
    margin: 0;
}

user agent stylesheet ul {
    list-style-type: disc;
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

body {
    overflow-x: hidden;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}

:root {
    --filete-desktop: url(https://hotsite.pichau.com.br/descricao/filete/pichau/escolha-monitor-desktop.png);
    --filete-mobile: url(https://hotsite.pichau.com.br/descricao/filete/pichau/escolha-monitor-mobile.png);
    --thumb-video1: url(https://hotsite.pichau.com.br/descricao/);
    --thumb-video2: url(https://hotsite.pichau.com.br/descricao/);
    --banner-principal: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL01.jpg);
    --icone-1: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/design.svg);
    --icone-2: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/tecnologia.svg);
    --icone-3: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/g-sync.svg);
    --icone-4: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/painel.svg);
    --icone-5: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/taxa-atualizacao.svg);
    --icone-6: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/tempo-resposta.svg);
    --icone-7: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/angulo.svg);
    --icone-8: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/suporte.svg);
    --icone-9: url(https://hotsite.pichau.com.br/descricao/produtos/monitor/conexoes.svg);
    --storie-1: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL011.jpg);
    --storie-2: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL012.jpg);
    --storie-3: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL013.jpg);
    --storie-4: url(https://hotsite.pichau.com.br/descricao/mancer/MCR-VKUZ32-PL01/MCR-VKUZ32-PL014.jpg);
}

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

*,
*::before,
*::after {
    box-sizing: inherit;
}

*,
*::before,
*::after {
    box-sizing: inherit;
}

*,
*::before,
*::after {
    box-sizing: inherit;
}
</style>