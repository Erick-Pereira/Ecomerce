<script setup>
import { ref, computed, onMounted } from 'vue'
import axios from 'axios'
import CompomenteProdutoCarrinho from './../components/ComponenteProdutoCarrinho.vue';
let produtos = ref([])
let carrinho = [];
let tamanho = 0;
let Subtotal = ref(0);
window.onload = function () {
    // carrinho = JSON.parse(localStorage.getItem("Carrinho"));
};

onMounted(() => {
    let carrinhoClone = [];
    let carro = JSON.parse(localStorage.getItem("Carrinho"));

    if (carro != null && carro != NaN && carro != 0) {
        for (let i = 0; i < carro.length; i++) {
            axios.get('http://localhost:8080/Product/' + carro[i].id)
                .then(response => {
                    let produto = response.data;
                    //produtos.value.push(response.data)+
                    let link = "/Produto/" + produto.id;
                    carrinho.push({ id: produto.id, nome: produto.nome, valor: produto.valor, imagem: produto.imagens[0].imagemUrl, qtd: carro[i].qtd, link: link })
                    tamanho = carrinho.length;
                    Subtotal.value = calcularSubtotal(carrinho);
                });
        }
    }

}
)
let Frete = ref(0);

function calcularSubtotal() {
    let sum = 0;
    for (let i = 0; i < carrinho.length; i++) {
        if (sum === 0) {
            sum = parseFloat(parseFloat(carrinho[i].valor) * parseFloat(carrinho[i].qtd));
        }
        else {
            sum = parseFloat(sum) + parseFloat(parseFloat(carrinho[i].valor) * parseFloat(carrinho[i].qtd));
        }
    }
    return parseFloat(sum).toFixed(2)
}
let Total = computed(() => {
    let sum = (Subtotal.value + Frete.value)
    return parseFloat(sum).toFixed(2);
});


function finalizarCompra() {
    if (carrinho != null && carrinho != NaN && carrinho != 0) {
        let carro = [];
        for (let i = 0; i < carrinho.length; i++) {
            carro.push({ id: carrinho[i].id, qtd: carrinho[i].qtd })
        }
        axios.post('http://localhost:8080/Compra', carro)
        carro = [];
        localStorage.setItem("Carrinho", JSON.stringify(carro));
        window.location.replace("/");
    }
}

function recalc() {
    let carro = [];
    for (let i = 0; i < carrinho.length; i++) {
        carro.push({ id: carrinho[i].id, qtd: carrinho[i].qtd })
    }
    localStorage.setItem("Carrinho", JSON.stringify(carro));
    let sum = 0;
    for (let i = 0; i < carrinho.length; i++) {
        if (sum === 0) {
            sum = parseFloat(parseFloat(carrinho[i].valor) * parseFloat(carrinho[i].qtd));
        }
        else {
            sum = parseFloat(sum) + parseFloat(parseFloat(carrinho[i].valor) * parseFloat(carrinho[i].qtd));
        }
    }
    Subtotal.value = parseFloat(sum).toFixed(2);
    Total = parseFloat(Subtotal.value + Frete.value).toFixed(2);
}
function Delete() {
    let achou = false;
    for (let i = 0; i < carrinho.length; i++) {
        if (carrinho[i].qtd === 0) {
            carrinho.splice(i, 1)
            achou = true;
        }
    }

    if (achou) {
        let carro = [];
        for (let i = 0; i < carrinho.length; i++) {
            carro.push({ id: carrinho[i].id, qtd: carrinho[i].qtd })
        }
        localStorage.setItem("Carrinho", JSON.stringify(carro));
        location.reload()
    }

}
</script>
<template>
    <div class="MuiGrid-root jss422 MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-3">
        <div class="MuiGrid-root jss425 MuiGrid-container" data-cy="cart-summary">
            <div class="MuiPaper-root MuiTableContainer-root jss428 MuiPaper-elevation1 MuiPaper-rounded">
                <table class="MuiTable-root" aria-label="custom pagination table">
                    <thead class="MuiTableHead-root">
                        <tr class="MuiTableRow-root MuiTableRow-head">
                            <th class="MuiTableCell-root MuiTableCell-head MuiTableCell-alignCenter" scope="col"
                                colspan="2">
                                <p class="MuiTypography-root MuiTypography-h5">Resumo</p>
                            </th>
                        </tr>
                    </thead>
                    <tbody class="MuiTableBody-root">
                        <tr class="MuiTableRow-root">
                            <th class="MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter">
                                <p class="MuiTypography-root MuiTypography-subtitle2">Subtotal</p>
                            </th>
                            <td class="MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter" width="150">
                                <p class="MuiTypography-root MuiTypography-subtitle2">R${{ Subtotal }}</p>
                            </td>
                        </tr>
                        <tr class="MuiTableRow-root jss427">
                            <th class="MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter" role="cell"
                                scope="row">
                                <p class="MuiTypography-root MuiTypography-h5">Total</p>
                            </th>
                            <td class="MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter" width="150">
                                <p class="MuiTypography-root MuiTypography-h5">R${{ Total }}</p>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <a class="MuiButtonBase-root MuiButton-root MuiButton-contained jss429 jss426 MuiButton-containedSecondary MuiButton-containedSizeLarge MuiButton-sizeLarge MuiButton-fullWidth"
                tabindex="0" aria-disabled="false" data-cy="go-to-checkout" @click="finalizarCompra()">
                <span class="MuiButton-label">
                    <svg class="MuiSvgIcon-root" focusable="false" viewBox="0 0 24 24" aria-hidden="true">
                        <path
                            d="M7 18c-1.1 0-1.99.9-1.99 2S5.9 22 7 22s2-.9 2-2-.9-2-2-2zM1 2v2h2l3.6 7.59-1.35 2.45c-.16.28-.25.61-.25.96 0 1.1.9 2 2 2h12v-2H7.42c-.14 0-.25-.11-.25-.25l.03-.12.9-1.63h7.45c.75 0 1.41-.41 1.75-1.03l3.58-6.49c.08-.14.12-.31.12-.48 0-.55-.45-1-1-1H5.21l-.94-2H1zm16 16c-1.1 0-1.99.9-1.99 2s.89 2 1.99 2 2-.9 2-2-.9-2-2-2z">
                        </path>
                    </svg>
                    Finalizar Pedido
                </span>
                <span class="MuiTouchRipple-root"></span>
            </a>
        </div>
    </div>
    <div class="MuiPaper-root MuiTableContainer-root MuiPaper-elevation1 MuiPaper-rounded">
        <table class="MuiTable-root" aria-label="cart list">
            <thead class="MuiTableHead-root">
                <tr class="MuiTableRow-root MuiTableRow-head">
                    <th class="MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft" scope="col" colspan="2">Produto
                    </th>
                    <th class="MuiTableCell-root MuiTableCell-head MuiTableCell-alignCenter" scope="col">Qtdd</th>
                    <th class="MuiTableCell-root MuiTableCell-head MuiTableCell-alignCenter" scope="col">Preço</th>
                    <th class="MuiTableCell-root MuiTableCell-head MuiTableCell-alignCenter" scope="col" width="40"></th>
                </tr>
            </thead>
            <tbody class="MuiTableBody-root">
                <CompomenteProdutoCarrinho v-if="tamanho > 0" v-for=" n in carrinho" :key="n.nome" :-nome="n.nome"
                    :-link="n.link" :-imagem="n.imagem" :-quantidade="n.qtd" :-valor="n.valor" @QtdMais="n.qtd++; recalc()"
                    @QtdMenos="n.qtd--; recalc()" @Delete="n.qtd = 0, Delete()">
                </CompomenteProdutoCarrinho>
            </tbody>
        </table>
    </div>
</template>
<style scoped>
.MuiTableCell-root {
    display: table-cell;
    padding: 16px;
    font-size: 0.875rem;
    text-align: left;
    font-family: Roboto, Verdana;
    font-weight: 400;
    line-height: 1.43;
    border-bottom: 1px solid rgba(81, 81, 81, 1);
    vertical-align: inherit;
}

.MuiTableCell-head {
    color: #fff;
    font-weight: 500;
    line-height: 1.5rem;
}

.MuiTableCell-body {
    color: #fff;
}

.MuiTableCell-footer {
    color: rgba(255, 255, 255, 0.7);
    font-size: 0.75rem;
    line-height: 1.3125rem;
}

.MuiTableCell-sizeSmall {
    padding: 6px 24px 6px 16px;
}

.MuiTableCell-sizeSmall:last-child {
    padding-right: 16px;
}

.MuiTableCell-sizeSmall.MuiTableCell-paddingCheckbox {
    width: 24px;
    padding: 0 12px 0 16px;
}

.MuiTableCell-sizeSmall.MuiTableCell-paddingCheckbox:last-child {
    padding-left: 12px;
    padding-right: 16px;
}

.MuiTableCell-sizeSmall.MuiTableCell-paddingCheckbox>* {
    padding: 0;
}

.MuiTableCell-paddingCheckbox {
    width: 48px;
    padding: 0 0 0 4px;
}

.MuiTableCell-paddingCheckbox:last-child {
    padding-left: 0;
    padding-right: 4px;
}

.MuiTableCell-paddingNone {
    padding: 0;
}

.MuiTableCell-paddingNone:last-child {
    padding: 0;
}

.MuiTableCell-alignLeft {
    text-align: left;
}

.MuiTableCell-alignCenter {
    text-align: center;
}

.MuiTableCell-alignRight {
    text-align: right;
    flex-direction: row-reverse;
}

.MuiTableCell-alignJustify {
    text-align: justify;
}

.MuiTableCell-stickyHeader {
    top: 0;
    left: 0;
    z-index: 2;
    position: sticky;
    background-color: #303030;
}

.MuiTableRow-root {
    color: inherit;
    display: table-row;
    outline: 0;
    vertical-align: middle;
}

.MuiTableRow-root.MuiTableRow-hover:hover {
    background-color: rgba(255, 255, 255, 0.08);
}

.MuiTableRow-root.Mui-selected,
.MuiTableRow-root.Mui-selected:hover {
    background-color: rgba(0, 158, 42, 0.16);
}

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

.MuiTypography-root {
    margin: 0;
}

.MuiTypography-body2 {
    font-size: 0.875rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: 0.01071em;
}

.MuiTypography-body1 {
    font-size: 1rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: 0.00938em;
}

.MuiTypography-caption {
    font-size: 0.75rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 400;
    line-height: 1.66;
    letter-spacing: 0.03333em;
}

.MuiTypography-button {
    font-size: 0.875rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 500;
    line-height: 1.75;
    letter-spacing: 0.02857em;
    text-transform: uppercase;
}

.MuiTypography-h1 {
    font-size: 6rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 300;
    line-height: 1.167;
    letter-spacing: -0.01562em;
}

.MuiTypography-h2 {
    font-size: 3.75rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 300;
    line-height: 1.2;
    letter-spacing: -0.00833em;
}

.MuiTypography-h3 {
    font-size: 3rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 400;
    line-height: 1.167;
    letter-spacing: 0em;
}

.MuiTypography-h4 {
    font-size: 2.125rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 400;
    line-height: 1.235;
    letter-spacing: 0.00735em;
}

.MuiTypography-h5 {
    font-size: 1.5rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 400;
    line-height: 1.334;
    letter-spacing: 0em;
}

.MuiTypography-h6 {
    font-size: 1.25rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 500;
    line-height: 1.6;
    letter-spacing: 0.0075em;
}

.MuiTypography-subtitle1 {
    font-size: 1rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 400;
    line-height: 1.75;
    letter-spacing: 0.00938em;
}

.MuiTypography-subtitle2 {
    font-size: 0.875rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 500;
    line-height: 1.57;
    letter-spacing: 0.00714em;
}

.MuiTypography-overline {
    font-size: 0.75rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 400;
    line-height: 2.66;
    letter-spacing: 0.08333em;
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
    color: #3f51b5;
}

.MuiTypography-colorSecondary {
    color: #f50057;
}

.MuiTypography-colorTextPrimary {
    color: rgba(0, 0, 0, 0.87);
}

.MuiTypography-colorTextSecondary {
    color: rgba(0, 0, 0, 0.54);
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

.jss446 {
    min-width: 500px;
}

.jss447 {
    font-size: 16px;
    margin-bottom: 1rem;
}

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

.jss110 {
    color: inherit;
    text-decoration: none;
}

.jss110:hover {
    text-decoration: none;
}

.jss448 {
    margin: 0;
    padding: 1rem 0 0 0;
    overflow: auto;
    list-style: none;
    max-height: 250px;
}

.jss449 {
    display: block;
    margin-bottom: 0.5rem;
}

.jss450 {
    display: block;
}

.jss451 {
    display: block;
    margin-left: 0.5rem;
    margin-bottom: 0.25rem;
}

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

.jss443 {
    min-width: 0;
}

.jss444 {
    min-width: 0;
}

.jss444 svg {
    font-size: 1rem;
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

.MuiTableBody-root {
    display: table-row-group;
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

.MuiIconButton-root {
    flex: 0 0 auto;
    color: #fff;
    padding: 12px;
    overflow: visible;
    font-size: 1.5rem;
    text-align: center;
    transition: background-color 150ms cubic-bezier(0.4, 0, 0.2, 1) 0ms;
    border-radius: 50%;
}

.MuiIconButton-root:hover {
    background-color: rgba(255, 255, 255, 0.08);
}

.MuiIconButton-root.Mui-disabled {
    color: rgba(255, 255, 255, 0.3);
    background-color: transparent;
}

@media (hover: none) {
    .MuiIconButton-root:hover {
        background-color: transparent;
    }
}

.MuiIconButton-edgeStart {
    margin-left: -12px;
}

.MuiIconButton-sizeSmall.MuiIconButton-edgeStart {
    margin-left: -3px;
}

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

.MuiIconButton-edgeEnd {
    margin-right: -12px;
}

.MuiIconButton-sizeSmall.MuiIconButton-edgeEnd {
    margin-right: -3px;
}

.MuiIconButton-colorInherit {
    color: inherit;
}

.MuiIconButton-colorPrimary {
    color: #e90313;
}

.MuiIconButton-colorPrimary:hover {
    background-color: rgba(233, 3, 19, 0.08);
}

@media (hover: none) {
    .MuiIconButton-colorPrimary:hover {
        background-color: transparent;
    }
}

.MuiIconButton-colorSecondary {
    color: #009e2a;
}

.MuiIconButton-colorSecondary:hover {
    background-color: rgba(0, 158, 42, 0.08);
}

@media (hover: none) {
    .MuiIconButton-colorSecondary:hover {
        background-color: transparent;
    }
}

.MuiIconButton-sizeSmall {
    padding: 3px;
    font-size: 1.125rem;
}

.MuiIconButton-label {
    width: 100%;
    display: flex;
    align-items: inherit;
    justify-content: inherit;
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

.MuiTableHead-root {
    display: table-header-group;
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

.jss419 {
    flex-shrink: 0;
    margin-left: 20px;
}

.jss420 {
    min-width: 500px;
}

.jss421 {
    margin-bottom: 1rem;
}

@media (min-width:960px) {
    .jss422 {
        order: 2;
    }
}

@media (min-width:960px) {
    .jss423 {
        order: 1;
    }
}

.jss424 {
    display: block;
    margin-top: 1rem;
}

.jss425 {
    top: 90px;
    position: sticky;
}

@media (min-width:960px) {
    .jss426 {
        padding: 1rem 0;
        font-size: 1.25rem;
        margin-top: 1rem;
    }

    .jss426 svg {
        margin-right: 1rem;
    }
}

.MuiTable-root {
    width: 100%;
    display: table;
    border-spacing: 0;
    border-collapse: collapse;
}

.MuiTable-root caption {
    color: rgba(255, 255, 255, 0.7);
    padding: 16px;
    font-size: 0.875rem;
    text-align: left;
    font-family: Roboto, Verdana;
    font-weight: 400;
    line-height: 1.43;
    caption-side: bottom;
}

.MuiTable-stickyHeader {
    border-collapse: separate;
}

.jss427 {
    background-color: rgba(255, 255, 255, 0.12);
}

.jss428 {
    order: 2;
}

@media (min-width:960px) {
    .jss428 {
        order: 1;
    }
}

.jss429 {
    order: 1;
    margin-bottom: 1rem;
}

@media (min-width:960px) {
    .jss429 {
        order: 2;
        margin-bottom: 0;
    }
}

.MuiPaper-root {
    color: #fff;
    transition: box-shadow 300ms cubic-bezier(0.4, 0, 0.2, 1) 0ms;
    background-color: #424242;
}

.MuiPaper-rounded {
    border-radius: 4px;
}

.MuiPaper-outlined {
    border: 1px solid rgba(255, 255, 255, 0.12);
}

.MuiPaper-elevation0 {
    box-shadow: none;
}

.MuiPaper-elevation1 {
    box-shadow: 0px 2px 1px -1px rgba(0, 0, 0, 0.2), 0px 1px 1px 0px rgba(0, 0, 0, 0.14), 0px 1px 3px 0px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation2 {
    box-shadow: 0px 3px 1px -2px rgba(0, 0, 0, 0.2), 0px 2px 2px 0px rgba(0, 0, 0, 0.14), 0px 1px 5px 0px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation3 {
    box-shadow: 0px 3px 3px -2px rgba(0, 0, 0, 0.2), 0px 3px 4px 0px rgba(0, 0, 0, 0.14), 0px 1px 8px 0px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation4 {
    box-shadow: 0px 2px 4px -1px rgba(0, 0, 0, 0.2), 0px 4px 5px 0px rgba(0, 0, 0, 0.14), 0px 1px 10px 0px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation5 {
    box-shadow: 0px 3px 5px -1px rgba(0, 0, 0, 0.2), 0px 5px 8px 0px rgba(0, 0, 0, 0.14), 0px 1px 14px 0px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation6 {
    box-shadow: 0px 3px 5px -1px rgba(0, 0, 0, 0.2), 0px 6px 10px 0px rgba(0, 0, 0, 0.14), 0px 1px 18px 0px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation7 {
    box-shadow: 0px 4px 5px -2px rgba(0, 0, 0, 0.2), 0px 7px 10px 1px rgba(0, 0, 0, 0.14), 0px 2px 16px 1px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation8 {
    box-shadow: 0px 5px 5px -3px rgba(0, 0, 0, 0.2), 0px 8px 10px 1px rgba(0, 0, 0, 0.14), 0px 3px 14px 2px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation9 {
    box-shadow: 0px 5px 6px -3px rgba(0, 0, 0, 0.2), 0px 9px 12px 1px rgba(0, 0, 0, 0.14), 0px 3px 16px 2px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation10 {
    box-shadow: 0px 6px 6px -3px rgba(0, 0, 0, 0.2), 0px 10px 14px 1px rgba(0, 0, 0, 0.14), 0px 4px 18px 3px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation11 {
    box-shadow: 0px 6px 7px -4px rgba(0, 0, 0, 0.2), 0px 11px 15px 1px rgba(0, 0, 0, 0.14), 0px 4px 20px 3px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation12 {
    box-shadow: 0px 7px 8px -4px rgba(0, 0, 0, 0.2), 0px 12px 17px 2px rgba(0, 0, 0, 0.14), 0px 5px 22px 4px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation13 {
    box-shadow: 0px 7px 8px -4px rgba(0, 0, 0, 0.2), 0px 13px 19px 2px rgba(0, 0, 0, 0.14), 0px 5px 24px 4px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation14 {
    box-shadow: 0px 7px 9px -4px rgba(0, 0, 0, 0.2), 0px 14px 21px 2px rgba(0, 0, 0, 0.14), 0px 5px 26px 4px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation15 {
    box-shadow: 0px 8px 9px -5px rgba(0, 0, 0, 0.2), 0px 15px 22px 2px rgba(0, 0, 0, 0.14), 0px 6px 28px 5px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation16 {
    box-shadow: 0px 8px 10px -5px rgba(0, 0, 0, 0.2), 0px 16px 24px 2px rgba(0, 0, 0, 0.14), 0px 6px 30px 5px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation17 {
    box-shadow: 0px 8px 11px -5px rgba(0, 0, 0, 0.2), 0px 17px 26px 2px rgba(0, 0, 0, 0.14), 0px 6px 32px 5px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation18 {
    box-shadow: 0px 9px 11px -5px rgba(0, 0, 0, 0.2), 0px 18px 28px 2px rgba(0, 0, 0, 0.14), 0px 7px 34px 6px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation19 {
    box-shadow: 0px 9px 12px -6px rgba(0, 0, 0, 0.2), 0px 19px 29px 2px rgba(0, 0, 0, 0.14), 0px 7px 36px 6px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation20 {
    box-shadow: 0px 10px 13px -6px rgba(0, 0, 0, 0.2), 0px 20px 31px 3px rgba(0, 0, 0, 0.14), 0px 8px 38px 7px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation21 {
    box-shadow: 0px 10px 13px -6px rgba(0, 0, 0, 0.2), 0px 21px 33px 3px rgba(0, 0, 0, 0.14), 0px 8px 40px 7px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation22 {
    box-shadow: 0px 10px 14px -6px rgba(0, 0, 0, 0.2), 0px 22px 35px 3px rgba(0, 0, 0, 0.14), 0px 8px 42px 7px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation23 {
    box-shadow: 0px 11px 14px -7px rgba(0, 0, 0, 0.2), 0px 23px 36px 3px rgba(0, 0, 0, 0.14), 0px 9px 44px 8px rgba(0, 0, 0, 0.12);
}

.MuiPaper-elevation24 {
    box-shadow: 0px 11px 15px -7px rgba(0, 0, 0, 0.2), 0px 24px 38px 3px rgba(0, 0, 0, 0.14), 0px 9px 46px 8px rgba(0, 0, 0, 0.12);
}

.MuiTableContainer-root {
    width: 100%;
    overflow-x: auto;
}
</style>