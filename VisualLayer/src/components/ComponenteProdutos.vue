<script setup>
import { ref } from 'vue'
//import '../css/ComponenteProdutos.css'
let props = defineProps(['ID','Nome', 'Valor', 'Imagem'])
let redirectURL = "/Produto/"+props.ID
</script>

<template>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">
    </head>
    <div
        class="product MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-6 MuiGrid-grid-md-4 MuiGrid-grid-lg-3 MuiGrid-grid-xl-2">
        <a class="jss110" :href=redirectURL>
            <div style="background-color: rgb(255, 255, 255); padding-top: calc(100%); position: relative;">
                <div class="jss224" >
                    <img :src="Imagem" :alt="Nome"
                        style="width: 100%; height: 100%; position: absolute; object-fit: inherit; top: 0px; left: 0px; opacity: 1; transition: filterBrightness 2250ms cubic-bezier(0.4, 0, 0.2, 1) 0s, filterSaturate 3000ms cubic-bezier(0.4, 0, 0.2, 1) 0s, opacity 1500ms cubic-bezier(0.4, 0, 0.2, 1) 0s;">
                    <div
                        style="width: 100%; height: 100%; position: absolute; top: 0px; left: 0px; display: flex; align-items: center; justify-content: center; pointer-events: none;">
                    </div>
                </div>
            </div>
            <div class="product-body">
                <div class="product-name">
                    <h2 class="MuiTypography-root jss244 jss245 MuiTypography-h6">{{ Nome }}</h2>
                </div>
                <div class="product-price">
                    <span>Something something</span>
                    <div>R$ {{ Valor }}</div>
                </div>
                <div class="product-rating">
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                </div>
            </div>
        </a>
    </div>
</template>

<style scoped>

.MuiContainer-maxWidthXl {
    min-width: 1480px;
    max-width: 1480px;
}
.MuiContainer-root {
    padding-left: 24px;
    min-width: 600px;
    padding-right: 24px;
}
.MuiContainer-root {
    width: 100%;
    display: block;
    box-sizing: border-box;
    margin-left: auto;
    margin-right: auto;
    padding-left: 16px;
    padding-right: 16px;
}
*, *::before, *::after {
    box-sizing: inherit;
}
*, html {
    font-family: Roboto;
}
user agent stylesheet
div {
    display: block;
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
html {
    box-sizing: border-box;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}
*, *::before, *::after {
    box-sizing: inherit;
}
*, *::before, *::after {
    box-sizing: inherit;
}
element.style {
    width: 213px;
}
.products-slick .product.slick-slide {
    margin: 15px;
}

.slick-initialized .slick-slide {
    display: block;
}
.product {
    position: relative;
    -webkit-transition: 0.2s all;
    transition: 0.2s all;
}
.slick-slide {
    display: none;
    float: left;
    height: 100%;
    min-height: 1px;
}
* {
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
}
user agent stylesheet
div {
    display: block;
}
.slick-slider {
    position: relative;
    display: block;
    box-sizing: border-box;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    -webkit-touch-callout: none;
    -khtml-user-select: none;
    -ms-touch-action: pan-y;
    touch-action: pan-y;
    -webkit-tap-highlight-color: transparent;
}
.products-tabs>.tab-pane.active {
    opacity: 1;
    visibility: visible;
    height: auto;
}
.products-tabs>.tab-pane {
    display: block;
    height: 0;
    opacity: 0;
    visibility: hidden;
    overflow-y: hidden;
    padding-bottom: 60px;
    margin-bottom: -60px;
}
body {
    font-family: 'Montserrat', sans-serif;
    font-weight: 400;
    color: #333;
}
body {
    font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
    font-size: 14px;
    line-height: 1.42857143;
    color: #333;
    background-color: #fff;
}
html {
    font-size: 10px;
    -webkit-tap-highlight-color: rgba(0,0,0,0);
}
html {
    font-family: sans-serif;
    -webkit-text-size-adjust: 100%;
    -ms-text-size-adjust: 100%;
}
:after, :before {
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
}
:after, :before {
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
}
.MuiGrid-spacing-xs-3 {
    width: calc(100% + 24px);
    margin: -12px;
}

.MuiGrid-container {
    width: 100%;
    display: flex;
    flex-wrap: wrap;
    box-sizing: border-box;
}
*, *::before, *::after {
    box-sizing: inherit;
}
*, html {
    font-family: Roboto;
}
user agent stylesheet
div {
    display: block;
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
html {
    box-sizing: border-box;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}
*, *::before, *::after {
    box-sizing: inherit;
}
*, *::before, *::after {
    box-sizing: inherit;
}
.body{
    color:#333;
    background-color: #333;
}
.jss245 {
    margin-bottom: 0;
}

.jss244 {
    overflow: hidden;
    font-size: 16px;
    line-height: 1.4;
    margin-bottom: 1rem;
    text-overflow: ellipsis;
}

img {
    overflow-clip-margin: content-box;
    overflow: clip;
}

.MuiTypography-h6 {
    font-size: 1.25rem;
    font-family: "Roboto", "Helvetica", "Arial", sans-serif;
    font-weight: 500;
    line-height: 1.6;
    letter-spacing: 0.0075em;
}

.MuiTypography-root {
    margin: 0;
}

.MuiContainer-maxWidthXl {
    min-width: 1480px;
    max-width: 1480px;
}

.MuiContainer-root {
    min-width: 600px;
    padding-left: 24px;
    padding-right: 24px;
}
.MuiContainer-root {
    width: 100%;
    display: block;
    box-sizing: border-box;
    margin-left: auto;
    margin-right: auto;
    padding-left: 16px;
    padding-right: 16px;
}
*, *::before, *::after {
    box-sizing: inherit;
}
*, html {
    font-family: Roboto;
}
user agent stylesheet
div {
    display: block;
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
html {
    box-sizing: border-box;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}
*, *::before, *::after {
    box-sizing: inherit;
}
*, *::before, *::after {
    box-sizing: inherit;
}
.body {
    background-color: #333;
}

.MuiGrid-spacing-xs-3 {
    width: calc(100% + 24px);
    margin: -12px;
}

.MuiPaper-root {
    color: #fff;
    transition: box-shadow 300ms cubic-bezier(0.4, 0, 0.2, 1) 0ms;
    background-color: #424242;
}

.jss226 img {
    max-width: 100%;
}

*,
*::before,
*::after {
    box-sizing: inherit;
}

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
.buttonBack___1mlaL,.buttonFirst___2rhFr,.buttonLast___2yuh0,.buttonNext___2mOCa,.buttonNext___3Lm3s,.dot___3c3SI {
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
    -webkit-transition: opacity .3s,-webkit-transform .3s;
    transition: opacity .3s,-webkit-transform .3s;
    transition: opacity .3s,transform .3s;
    transition: opacity .3s,transform .3s,-webkit-transform .3s
}

.hover___MYy31,.loading___1pvNI,.zoom___3kqYk {
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
    outline: none!important
}

.slideHorizontal___1NzNV {
    float: left
}
/*
Template Name: Electro - HTML Ecommerce Template
Author: yaminncco

Colors:
	Body 		: #333
	Headers 	: #2B2D42
	Primary 	: #D10024
	Dark 		: #15161D ##1E1F29
	Grey 		: #E4E7ED #FBFBFC #8D99AE #B9BABC

Fonts: Montserrat

Table OF Contents
------------------------------------
1 > GENERAL
------ Typography
------ Buttons
------ Inputs
------ Sections
------ Breadcrumb
2 > HEADER
------ Top header
------ Logo
------ Search
------ Cart
3 > NAVIGATION
------ Main nav
------ Responsive Nav
4 > CATEGORY SHOP
5 > HOT DEAL
6 > PRODUCT
------ Product
------ Widget product
------ Product slick
7 > STORE PAGE
------ Aside
------ Store
8 > PRODUCT DETAILS PAGE
------ Product view
------ Product details
------ Product tab
9 > CHECKOUT PAGE
10 > NEWSLETTER
11 > FOOTER
11 > SLICK STYLE
12 > RESPONSIVE
------------------------------------*/

/*=========================================================
	01 -> GENERAL
===========================================================*/

/*----------------------------*\
	Typography
\*----------------------------*/

body {
  font-family: 'Montserrat', sans-serif;
  font-weight: 400;
  color: #333;
}

h1, h2, h3, h4, h5, h6 {
  color: #2B2D42;
  font-weight: 700;
  margin: 0 0 10px;
}

a {
  color: #2B2D42;
  font-weight: 500;
  -webkit-transition: 0.2s color;
  transition: 0.2s color;
}

a:hover, a:focus {
  color: #D10024;
  text-decoration: none;
  outline: none;
}

ul, ol {
  margin: 0;
  padding: 0;
  list-style: none
}

/*----------------------------*\
	Buttons
\*----------------------------*/

.primary-btn {
  display: inline-block;
  padding: 12px 30px;
  background-color: #D10024;
  border: none;
  border-radius: 40px;
  color: #FFF;
  text-transform: uppercase;
  font-weight: 700;
  text-align: center;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.primary-btn:hover, .primary-btn:focus {
  opacity: 0.9;
  color: #FFF;
}

/*----------------------------*\
	Inputs
\*----------------------------*/

/*-- Text input --*/

.input {
  height: 40px;
  padding: 0px 15px;
  border: 1px solid #E4E7ED;
  background-color: #FFF;
  width: 100%;
}

textarea.input {
  padding: 15px;
  min-height: 90px;
}

/*-- Number input --*/

.input-number {
  position: relative;
}

.input-number input[type="number"]::-webkit-inner-spin-button, .input-number input[type="number"]::-webkit-outer-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

.input-number input[type="number"] {  
  height: 40px;
  width: 100%;
  border: 1px solid #E4E7ED;
  background-color: #FFF;
  padding: 0px 35px 0px 15px;
}

.input-number .qty-up, .input-number .qty-down {
  position: absolute;
  display: block;
  width: 20px;
  height: 20px;
  border: 1px solid #E4E7ED;
  background-color: #FFF;
  text-align: center;
  font-weight: 700;
  cursor: pointer;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

.input-number .qty-up {
  right: 0;
  top: 0;
  border-bottom: 0px;
}

.input-number .qty-down {
  right: 0;
  bottom: 0;
}

.input-number .qty-up:hover, .input-number .qty-down:hover {
  background-color: #E4E7ED;
  color: #D10024;
}

/*-- Select input --*/

.input-select {
  padding: 0px 15px;
  background: #FFF;
  border: 1px solid #E4E7ED;
  height: 40px;
}

/*-- checkbox & radio input --*/

.input-radio, .input-checkbox {
  position: relative;
  display: block;
}

.input-radio input[type="radio"]:not(:checked), .input-radio input[type="radio"]:checked, .input-checkbox input[type="checkbox"]:not(:checked), .input-checkbox input[type="checkbox"]:checked {
  position: absolute;
  margin-left: -9999px;
  visibility: hidden;
}

.input-radio label, .input-checkbox label {
  font-weight: 500;
  min-height: 20px;
  padding-left: 20px;
  margin-bottom: 5px;
  cursor: pointer;
}

.input-radio input[type="radio"]+label span, .input-checkbox input[type="checkbox"]+label span {
  position: absolute;
  left: 0px;
  top: 4px;
  width: 14px;
  height: 14px;
  border: 2px solid #E4E7ED;
  background: #FFF;
}

.input-radio input[type="radio"]+label span {
  border-radius: 50%;
}

.input-radio input[type="radio"]+label span:after {
  content: "";
  position: absolute;
  left: 50%;
  top: 50%;
  -webkit-transform: translate(-50%, -50%) scale(0);
  -ms-transform: translate(-50%, -50%) scale(0);
  transform: translate(-50%, -50%) scale(0);
  background-color: #FFF;
  width: 4px;
  height: 4px;
  border-radius: 50%;
  opacity: 0;
  -webkit-transition: all 0.2s;
  transition: all 0.2s;
}

.input-checkbox input[type="checkbox"]+label span:after {
  content: '✔';
  position: absolute;
  top: -2px;
  left: 1px;
  font-size: 10px;
  color: #FFF;
  opacity: 0;
  -webkit-transform: scale(0);
  -ms-transform: scale(0);
  transform: scale(0);
  -webkit-transition: all 0.2s;
  transition: all 0.2s;
}

.input-radio input[type="radio"]:checked+label span, .input-checkbox input[type="checkbox"]:checked+label span {
  background-color: #D10024;
  border-color: #D10024;
}

.input-radio input[type="radio"]:checked+label span:after {
  opacity: 1;
  -webkit-transform: translate(-50%, -50%) scale(1);
  -ms-transform: translate(-50%, -50%) scale(1);
  transform: translate(-50%, -50%) scale(1);
}

.input-checkbox input[type="checkbox"]:checked+label span:after {
  opacity: 1;
  -webkit-transform: scale(1);
  -ms-transform: scale(1);
  transform: scale(1);
}

.input-radio .caption, .input-checkbox .caption {
  margin-top: 5px;
  max-height: 0;
  overflow: hidden;
  -webkit-transition: 0.3s max-height;
  transition: 0.3s max-height;
}

.input-radio input[type="radio"]:checked~.caption, .input-checkbox input[type="checkbox"]:checked~.caption {
  max-height: 800px;
}

/*----------------------------*\
	Section
\*----------------------------*/

.section {
  padding-top: 30px;
  padding-bottom: 30px;
}

.section-title {
  position: relative;
  margin-bottom: 30px;
  margin-top: 15px;
}

.section-title .title {
  display: inline-block;
  text-transform: uppercase;
  margin: 0px;
}

.section-title .section-nav {
  float: right;
}

.section-title .section-nav .section-tab-nav {
  display: inline-block;
}

.section-tab-nav li {
  display: inline-block;
  margin-right: 15px;
}

.section-tab-nav li:last-child {
  margin-right: 0px;
}

.section-tab-nav li a {
  font-weight: 700;
  color: #8D99AE;
}

.section-tab-nav li a:after {
  content: "";
  display: block;
  width: 0%;
  height: 2px;
  background-color: #D10024;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.section-tab-nav li.active a {
  color: #D10024;
}

.section-tab-nav li a:hover:after, .section-tab-nav li a:focus:after, .section-tab-nav li.active a:after {
  width: 100%;
}

.section-title .section-nav .products-slick-nav {
  top: 0px;
  right: 0px;
}

/*----------------------------*\
	Breadcrumb
\*----------------------------*/

#breadcrumb {
  padding: 30px 0px;
  background: #FBFBFC;
  border-bottom: 1px solid #E4E7ED;
  margin-bottom: 30px;
}

#breadcrumb .breadcrumb-header {
  display: inline-block;
  margin-top: 0px;
  margin-bottom: 0px;
  margin-right: 15px;
  text-transform: uppercase;
}

#breadcrumb .breadcrumb-tree {
  display: inline-block;
}

#breadcrumb .breadcrumb-tree li {
  display: inline-block;
  font-size: 12px;
  font-weight: 500;
  text-transform: uppercase;
}

#breadcrumb .breadcrumb-tree li+li {
  margin-left: 10px;
}

#breadcrumb .breadcrumb-tree li+li:before {
  content: '/';
  display: inline-block;
  color: #8D99AE;
  margin-right: 10px;
}

#breadcrumb .breadcrumb-tree li a {
  color: #8D99AE;
}

#breadcrumb .breadcrumb-tree li a:hover {
  color: #D10024;
}

/*=========================================================
	02 -> HEADER
===========================================================*/

/*----------------------------*\
	Top header
\*----------------------------*/

#top-header {
  padding-top: 10px;
  padding-bottom: 10px;
  background-color: #1E1F29;
}

.header-links li {
  display: inline-block;
  margin-right: 15px;
  font-size: 12px;
}

.header-links li:last-child {
  margin-right: 0px;
}

.header-links li a {
  color: #FFF;
}

.header-links li a:hover {
  color: #D10024;
}

.header-links li i {
  color: #D10024;
  margin-right: 5px;
}

/*----------------------------*\
	Logo
\*----------------------------*/

#header {
  padding-top: 15px;
  padding-bottom: 15px;
  background-color: #15161D;
}

.header-logo {
  float: left;
}

.header-logo .logo img {
  display: block;
}

/*----------------------------*\
	Search
\*----------------------------*/

.header-search {
  padding: 15px 0px;
}

.header-search form {
  position: relative;
}

.header-search form .input-select {
  margin-right: -4px;
  border-radius: 40px 0px 0px 40px;
}

.header-search form .input {
  width: calc(100% - 260px);
  margin-right: -4px;
}

.header-search form .search-btn {
  height: 40px;
  width: 100px;
  background: #D10024;
  color: #FFF;
  font-weight: 700;
  border: none;
  border-radius: 0px 40px 40px 0px;
}

/*----------------------------*\
	Cart
\*----------------------------*/

.header-ctn {
  float: right;
  padding: 15px 0px;
}

.header-ctn>div {
  display: inline-block;
}

.header-ctn>div+div {
  margin-left: 15px;
}

.header-ctn>div>a {
  display: block;
  position: relative;
  width: 90px;
  text-align: center;
  color: #FFF;
}

.header-ctn>div>a>i {
  display: block;
  font-size: 18px;
}

.header-ctn>div>a>span {
  font-size: 12px;
}

.header-ctn>div>a>.qty {
  position: absolute;
  right: 15px;
  top: -10px;
  width: 20px;
  height: 20px;
  line-height: 20px;
  text-align: center;
  border-radius: 50%;
  font-size: 10px;
  color: #FFF;
  background-color: #D10024;
}

.header-ctn .menu-toggle {
  display: none;
}

.cart-dropdown {
  position: absolute;
  width: 300px;
  background: #FFF;
  padding: 15px;
  -webkit-box-shadow: 0px 0px 0px 2px #E4E7ED;
  box-shadow: 0px 0px 0px 2px #E4E7ED;
  z-index: 99;
  right: 0;
  opacity: 0;
  visibility: hidden;
}

.dropdown.open>.cart-dropdown {
  opacity: 1;
  visibility: visible;
}

.cart-dropdown .cart-list {
  max-height: 180px;
  overflow-y: scroll;
  margin-bottom: 15px;
}

.cart-dropdown .cart-list .product-widget {
  padding: 0px;
  -webkit-box-shadow: none;
  box-shadow: none;
}

.cart-dropdown .cart-list .product-widget:last-child {
  margin-bottom: 0px;
}

.cart-dropdown .cart-list .product-widget .product-img {
  left: 0px;
  top: 0px;
}

.cart-dropdown .cart-list .product-widget .product-body .product-price {
  color: #2B2D42;
}

.cart-dropdown .cart-btns {
  margin: 0px -17px -17px;
}

.cart-dropdown .cart-btns>a {
  display: inline-block;
  width: calc(50% - 0px);
  padding: 12px;
  background-color: #D10024;
  color: #FFF;
  text-align: center;
  font-weight: 700;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.cart-dropdown .cart-btns>a:first-child {
  margin-right: -4px;
  background-color: #1e1f29;
}

.cart-dropdown .cart-btns>a:hover {
  opacity: 0.9;
}

.cart-dropdown .cart-summary {
  border-top: 1px solid #E4E7ED;
  padding-top: 15px;
  padding-bottom: 15px;
}

/*=========================================================
	03 -> Navigation
===========================================================*/

#navigation {
  background: #FFF;
  border-bottom: 2px solid #E4E7ED;
  border-top: 3px solid #D10024;
}

/*----------------------------*\
	Main nav
\*----------------------------*/

.main-nav>li+li {
  margin-left: 30px
}

.main-nav>li>a {
  padding: 20px 0px;
}

.main-nav>li>a:hover, .main-nav>li>a:focus, .main-nav>li.active>a {
  color: #D10024;
  background-color: transparent;
}

.main-nav>li>a:after {
  content: "";
  display: block;
  width: 0%;
  height: 2px;
  background-color: #D10024;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.main-nav>li>a:hover:after, .main-nav>li>a:focus:after, .main-nav>li.active>a:after {
  width: 100%;
}

.header-ctn li.nav-toggle {
  display: none;
}

/*----------------------------*\
	responsive nav
\*----------------------------*/

@media only screen and (max-width: 991px) {
  .header-ctn .menu-toggle {
    display: inline-block;
  }
  #responsive-nav {
    position: fixed;
    left: 0;
    top: 0;
    background: #15161D;
    height: 100vh;
    max-width: 250px;
    width: 0%;
    overflow: hidden;
    z-index: 22;
    padding-top: 60px;
    -webkit-transform: translateX(-100%);
    -ms-transform: translateX(-100%);
    transform: translateX(-100%);
    -webkit-transition: 0.2s all;
    transition: 0.2s all;
  }
  #responsive-nav.active {
    -webkit-transform: translateX(0%);
    -ms-transform: translateX(0%);
    transform: translateX(0%);
    width: 100%;
  }
  .main-nav {
    margin: 0px;
    float: none;
  }
  .main-nav>li {
    display: block;
    float: none;
  }
  .main-nav>li+li {
    margin-left: 0px;
  }
  .main-nav>li>a {
    padding: 15px;
    color: #FFF;
  }
}

/*=========================================================
	04 -> CATEGORY SHOP
===========================================================*/

.shop {
  position: relative;
  overflow: hidden;
  margin: 15px 0px;
}

.shop:before {
  content: "";
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0px;
  width: 60%;
  background: #D10024;
  opacity: 0.9;
  -webkit-transform: skewX(-45deg);
  -ms-transform: skewX(-45deg);
  transform: skewX(-45deg);
}

.shop:after {
  content: "";
  position: absolute;
  top: 0;
  bottom: 0;
  left: 1px;
  width: 100%;
  background: #D10024;
  opacity: 0.9;
  -webkit-transform: skewX(-45deg) translateX(-100%);
  -ms-transform: skewX(-45deg) translateX(-100%);
  transform: skewX(-45deg) translateX(-100%);
}

.shop .shop-img {
  position: relative;
  background-color: #E4E7ED;
  z-index: -1;
}

.shop .shop-img>img {
  width: 100%;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.shop:hover .shop-img>img {
  -webkit-transform: scale(1.1);
  -ms-transform: scale(1.1);
  transform: scale(1.1);
}

.shop .shop-body {
  position: absolute;
  top: 0;
  width: 75%;
  padding: 30px;
  z-index: 10;
}

.shop .shop-body h3 {
  color: #FFF;
}

.shop .shop-body .cta-btn {
  color: #FFF;
  text-transform: uppercase;
}

/*=========================================================
	05 -> HOT DEAL
===========================================================*/

#hot-deal.section {
  padding: 60px 0px;
  margin: 30px 0px;
  background-color: #E4E7ED;
  background-image: url('../img/hotdeal.png');
  background-position: center;
  background-repeat: no-repeat;
}

.hot-deal {
  text-align: center;
}

.hot-deal .hot-deal-countdown {
  margin-bottom: 30px;
}

.hot-deal .hot-deal-countdown>li {
  position: relative;
  display: inline-block;
  width: 100px;
  height: 100px;
  background: #D10024e6;
  text-align: center;
  border-radius: 50%;
  margin: 0px 5px;
}

.hot-deal .hot-deal-countdown>li>div {
  position: absolute;
  left: 0;
  right: 0;
  top: 50%;
  -webkit-transform: translateY(-50%);
  -ms-transform: translateY(-50%);
  transform: translateY(-50%);
}

.hot-deal .hot-deal-countdown>li>div h3 {
  color: #FFF;
  margin-bottom: 0px;
}

.hot-deal .hot-deal-countdown>li>div span {
  display: block;
  font-size: 10px;
  text-transform: uppercase;
  color: #FFF;
}

.hot-deal p {
  text-transform: uppercase;
  font-size: 24px;
}

.hot-deal .cta-btn {
  margin-top: 15px;
}

/*=========================================================
	06 -> PRODUCT
===========================================================*/

/*----------------------------*\
	product
\*----------------------------*/

.product {
  position: relative;
  margin: 15px 0px;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.product:hover {
  -webkit-box-shadow: 0px 0px 6px 0px #E4E7ED, 0px 0px 0px 2px #D10024;
  box-shadow: 0px 0px 6px 0px #E4E7ED, 0px 0px 0px 2px #D10024;
}

.product .product-img {
  position: relative;
}

.product .product-img>img {
  width: 100%;
}

.product .product-img .product-label {
  position: absolute;
  top: 15px;
  right: 15px;
}

.product .product-img .product-label>span {
  border: 2px solid;
  padding: 2px 10px;
  font-size: 12px;
}

.product .product-img .product-label>span.sale {
  background-color: #FFF;
  border-color: #D10024;
  color: #D10024;
}

.product .product-img .product-label>span.new {
  background-color: #D10024;
  border-color: #D10024;
  color: #FFF;
}

.product .product-body {
  position: relative;
  padding: 15px;
  background-color: #737373;
  text-align: center;
  z-index: 20;
}

.product .product-body .product-category {
  text-transform: uppercase;
  font-size: 12px;
  color: #8D99AE;
}

.product .product-body .product-name {
  text-transform: uppercase;
  font-size: 14px;
}

.product .product-body .product-name>a {
  font-weight: 700;
}

.product .product-body .product-name>a:hover, .product .product-body .product-name>a:focus {
  color: #D10024;
}

.product .product-body .product-price {
  color: #D10024;
  font-size: 18px;
}

.product .product-body .product-price .product-old-price {
  font-size: 70%;
  font-weight: 400;
  color: #8D99AE;
}

.product .product-body .product-rating {
  position: relative;
  margin: 15px 0px 10px;
  height: 20px;
}

.product .product-body .product-rating>i {
  position: relative;
  width: 14px;
  margin-right: -4px;
  background: #FFF;
  color: #E4E7ED;
  z-index: 10;
}

.product .product-body .product-rating>i.fa-star {
  color: #ef233c;
}

.product .product-body .product-rating:after {
  content: "";
  position: absolute;
  top: 50%;
  left: 0;
  right: 0;
  -webkit-transform: translateY(-50%);
  -ms-transform: translateY(-50%);
  transform: translateY(-50%);
  height: 1px;
  background-color: #E4E7ED;
}

.product .product-body .product-btns>button {
  position: relative;
  width: 40px;
  height: 40px;
  line-height: 40px;
  background: transparent;
  border: none;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.product .product-body .product-btns>button:hover {
  background-color: #E4E7ED;
  color: #D10024;
  border-radius: 50%;
}

.product .product-body .product-btns>button .tooltipp {
  position: absolute;
  bottom: 100%;
  left: 50%;
  -webkit-transform: translate(-50%, -15px);
  -ms-transform: translate(-50%, -15px);
  transform: translate(-50%, -15px);
  width: 150px;
  padding: 10px;
  font-size: 12px;
  line-height: 10px;
  background: #1e1f29;
  color: #FFF;
  text-transform: uppercase;
  z-index: 10;
  opacity: 0;
  visibility: hidden;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.product .product-body .product-btns>button:hover .tooltipp {
  opacity: 1;
  visibility: visible;
  -webkit-transform: translate(-50%, -5px);
  -ms-transform: translate(-50%, -5px);
  transform: translate(-50%, -5px);
}

.product .add-to-cart {
  position: absolute;
  left: 1px;
  right: 1px;
  bottom: 1px;
  padding: 15px;
  background: #1e1f29;
  text-align: center;
  -webkit-transform: translateY(0%);
  -ms-transform: translateY(0%);
  transform: translateY(0%);
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
  z-index: 2;
}

.product:hover .add-to-cart {
  -webkit-transform: translateY(100%);
  -ms-transform: translateY(100%);
  transform: translateY(100%);
}

.product .add-to-cart .add-to-cart-btn {
  position: relative;
  border: 2px solid transparent;
  height: 40px;
  padding: 0 30px;
  background-color: #ef233c;
  color: #FFF;
  text-transform: uppercase;
  font-weight: 700;
  border-radius: 40px;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.product .add-to-cart .add-to-cart-btn>i {
  position: absolute;
  left: 0;
  top: 0;
  width: 40px;
  height: 40px;
  line-height: 38px;
  color: #D10024;
  opacity: 0;
  visibility: hidden;
}

.product .add-to-cart .add-to-cart-btn:hover {
  background-color: #FFF;
  color: #D10024;
  border-color: #D10024;
  padding: 0px 30px 0px 50px;
}

.product .add-to-cart .add-to-cart-btn:hover>i {
  opacity: 1;
  visibility: visible;
}

/*----------------------------*\
	Widget product
\*----------------------------*/

.product-widget {
  position: relative;
}

.product-widget+.product-widget {
  margin: 30px 0px;
}

.product-widget .product-img {
  position: absolute;
  left: 0px;
  top: 0px;
  width: 60px;
}

.product-widget .product-img>img {
  width: 100%;
}

.product-widget .product-body {
  padding-left: 75px;
  min-height: 60px;
}

.product-widget .product-body .product-category {
  text-transform: uppercase;
  font-size: 10px;
  color: #8D99AE;
}

.product-widget .product-body .product-name {
  text-transform: uppercase;
  font-size: 12px;
}

.product-widget .product-body .product-name>a {
  font-weight: 700;
}

.product-widget .product-body .product-name>a:hover, .product-widget .product-body .product-name>a:focus {
  color: #D10024;
}

.product-widget .product-body .product-price {
  font-size: 14px;
  color: #D10024;
}

.product-widget .product-body .product-price .product-old-price {
  font-size: 70%;
  font-weight: 400;
  color: #8D99AE;
}

.product-widget .product-body .product-price .qty {
  font-weight: 400;
  margin-right: 10px;
}

.product-widget .delete {
  position: absolute;
  top: 0;
  left: 0;
  height: 14px;
  width: 14px;
  text-align: center;
  font-size: 10px;
  padding: 0;
  background: #1e1f29;
  border: none;
  color: #FFF;
}

/*----------------------------*\
	Products slick
\*----------------------------*/

.products-slick .slick-list {
  padding-bottom: 60px;
  margin-bottom: -60px;
  z-index: 2;
}

.products-slick .product.slick-slide {
  margin: 15px;
}

.products-tabs>.tab-pane {
  display: block;
  height: 0;
  opacity: 0;
  visibility: hidden;
  overflow-y: hidden;
  padding-bottom: 60px;
  margin-bottom: -60px;
}

.products-tabs>.tab-pane.active {
  opacity: 1;
  visibility: visible;
  height: auto;
}

.products-slick-nav {
  position: absolute;
  right: 15px;
  z-index: 10;
}

.products-slick-nav .slick-prev, .products-slick-nav .slick-next {
  position: static;
  -webkit-transform: none;
  -ms-transform: none;
  transform: none;
  width: 20px;
  height: 20px;
  display: inline-block !important;
  margin: 0px 2px;
}

.products-slick-nav .slick-prev:before, .products-slick-nav .slick-next:before {
  font-size: 14px;
}

/*=========================================================
	07 -> PRODUCTS PAGE
===========================================================*/

/*----------------------------*\
	Aside
\*----------------------------*/

.aside+.aside {
  margin-top: 30px;
}

.aside>.aside-title {
  text-transform: uppercase;
  font-size: 18px;
  margin: 15px 0px 30px;
}

/*-- checkbox Filter --*/

.checkbox-filter>div+div {
  margin-top: 10px;
}

.checkbox-filter .input-radio label, .checkbox-filter .input-checkbox label {
  font-size: 12px;
}

.checkbox-filter .input-radio label small, .checkbox-filter .input-checkbox label small {
  color: #8D99AE;
}

/*-- Price Filter --*/

#price-slider {
  margin-bottom: 15px;
}

.noUi-target {
  background-color: #FFF;
  -webkit-box-shadow: none;
  box-shadow: none;
  border: 1px solid #E4E7ED;
  border-radius: 0px;
}

.noUi-connect {
  background-color: #D10024;
}

.noUi-horizontal {
  height: 6px;
}

.noUi-horizontal .noUi-handle {
  width: 12px;
  height: 12px;
  left: -6px;
  top: -4px;
  border: none;
  background: #D10024;
  -webkit-box-shadow: none;
  box-shadow: none;
  border-radius: 50%;
}

.noUi-handle:before, .noUi-handle:after {
  display: none;
}

.price-filter .input-number {
  display: inline-block;
  width: calc(50% - 7px);
}

/*----------------------------*\
	Store
\*----------------------------*/

.store-filter {
  margin-bottom: 15px;
  margin-top: 15px;
}

/*-- Store Sort --*/

.store-sort {
  display: inline-block;
}

.store-sort label {
  font-weight: 500;
  font-size: 12px;
  text-transform: uppercase;
  margin-right: 15px;
}

/*-- Store Grid --*/

.store-grid {
  float: right;
}

.store-grid li {
  display: inline-block;
  width: 40px;
  height: 40px;
  line-height: 40px;
  background-color: #FFF;
  border: 1px solid #E4E7ED;
  text-align: center;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.store-grid li+li {
  margin-left: 5px;
}

.store-grid li:hover {
  background-color: #E4E7ED;
  color: #D10024;
}

.store-grid li.active {
  background-color: #D10024;
  border-color: #D10024;
  color: #FFF;
  cursor: default;
}

.store-grid li a {
  display: block;
}

/*-- Store Pagination --*/

.store-pagination {
  float: right;
}

.store-pagination li {
  display: inline-block;
  width: 40px;
  height: 40px;
  line-height: 40px;
  text-align: center;
  background-color: #FFF;
  border: 1px solid #E4E7ED;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.store-pagination li+li {
  margin-left: 5px;
}

.store-pagination li:hover {
  background-color: #E4E7ED;
  color: #D10024;
}

.store-pagination li.active {
  background-color: #D10024;
  border-color: #D10024;
  color: #FFF;
  font-weight: 500;
  cursor: default;
}

.store-pagination li a {
  display: block;
}

.store-qty {
  margin-right: 30px;
  font-weight: 500;
  text-transform: uppercase;
  font-size: 12px;
}

/*=========================================================
	08 -> PRODUCT DETAILS PAGE
===========================================================*/

/*----------------------------*\
	Product view
\*----------------------------*/

#product-main-img .slick-prev {
  -webkit-transform: translateX(-15px);
  -ms-transform: translateX(-15px);
  transform: translateX(-15px);
  left: 15px;
}

#product-main-img .slick-next {
  -webkit-transform: translateX(15px);
  -ms-transform: translateX(15px);
  transform: translateX(15px);
  right: 15px;
}

#product-main-img .slick-prev, #product-main-img .slick-next {
  opacity: 0;
  visibility: hidden;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

#product-main-img:hover .slick-prev, #product-main-img:hover .slick-next {
  -webkit-transform: translateX(0%);
  -ms-transform: translateX(0%);
  transform: translateX(0%);
  opacity: 1;
  visibility: visible;
}

#product-main-img .zoomImg {
  background-color: #FFF;
}

#product-imgs .product-preview {
  margin: 0px 5px;
  border: 1px solid #E4E7ED;
}

#product-imgs .product-preview.slick-current {
  border-color: #D10024;
}

#product-imgs .slick-prev {
  top: -20px;
  left: 50%;
  -webkit-transform: translateX(-50%);
  -ms-transform: translateX(-50%);
  transform: translateX(-50%);
}

#product-imgs .slick-next {
  top: calc(100% - 20px);
  left: 50%;
  -webkit-transform: translateX(-50%);
  -ms-transform: translateX(-50%);
  transform: translateX(-50%);
}

#product-imgs .slick-prev:before {
  content: "\f106";
}

#product-imgs .slick-next:before {
  content: "\f107";
}

.product-preview img {
  width: 100%;
}

/*----------------------------*\
	Product details
\*----------------------------*/

.product-details .product-name {
  text-transform: uppercase;
  font-size: 18px;
}

.product-details .product-rating {
  display: inline-block;
  margin-right: 15px;
}

.product-details .product-rating>i {
  color: #E4E7ED;
}

.product-details .product-rating>i.fa-star {
  color: #D10024;
}

.product-details .review-link {
  font-size: 12px;
}

.product-details .product-price {
  display: inline-block;
  font-size: 24px;
  margin-top: 10px;
  margin-bottom: 15px;
  color: #D10024;
}

.product-details .product-price .product-old-price {
  font-size: 70%;
  font-weight: 400;
  color: #8D99AE;
}

.product-details .product-available {
  font-size: 12px;
  text-transform: uppercase;
  font-weight: 700;
  margin-left: 30px;
  color: #D10024;
}

.product-details .product-options {
  margin-top: 30px;
  margin-bottom: 30px;
}

.product-details .product-options label {
  font-weight: 500;
  font-size: 12px;
  text-transform: uppercase;
  margin-right: 15px;
  margin-bottom: 0px;
}

.product-details .product-options .input-select {
  width: 90px;
}

.product-details .add-to-cart {
  margin-bottom: 30px;
}

.product-details .add-to-cart .add-to-cart-btn {
  position: relative;
  border: 2px solid transparent;
  height: 40px;
  padding: 0 30px;
  background-color: #ef233c;
  color: #FFF;
  text-transform: uppercase;
  font-weight: 700;
  border-radius: 40px;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.product-details .add-to-cart .add-to-cart-btn>i {
  position: absolute;
  left: 0;
  top: 0;
  width: 40px;
  height: 40px;
  line-height: 38px;
  color: #D10024;
  opacity: 0;
  visibility: hidden;
}

.product-details .add-to-cart .add-to-cart-btn:hover {
  background-color: #FFF;
  color: #D10024;
  border-color: #D10024;
  padding: 0px 30px 0px 50px;
}

.product-details .add-to-cart .add-to-cart-btn:hover>i {
  opacity: 1;
  visibility: visible;
}

.product-details .add-to-cart .qty-label {
  display: inline-block;
  font-weight: 500;
  font-size: 12px;
  text-transform: uppercase;
  margin-right: 15px;
  margin-bottom: 0px;
}

.product-details .add-to-cart .qty-label .input-number {
  width: 90px;
  display: inline-block;
}

.product-details .product-btns li {
  display: inline-block;
  text-transform: uppercase;
  font-size: 12px;
}

.product-details .product-btns li+li {
  margin-left: 15px;
}

.product-details .product-links {
  margin-top: 15px;
}

.product-details .product-links li {
  display: inline-block;
  text-transform: uppercase;
  font-size: 12px;
}

.product-details .product-links li+li {
  margin-left: 10px;
}

/*----------------------------*\
	 Product tab
\*----------------------------*/

#product-tab {
  margin-top: 60px;
}

#product-tab .tab-nav {
  position: relative;
  text-align: center;
  padding: 15px 0px;
  margin-bottom: 30px;
}

#product-tab .tab-nav:after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 50%;
  height: 1px;
  background-color: #E4E7ED;
  z-index: -1;
}

#product-tab .tab-nav li {
  display: inline-block;
  background: #FFF;
  padding: 0px 15px;
}

#product-tab .tab-nav li+li {
  margin-left: 15px;
}

#product-tab .tab-nav li a {
  display: block;
  font-weight: 700;
  color: #8D99AE;
}

#product-tab .tab-nav li.active a {
  color: #D10024;
}

#product-tab .tab-nav li a:after {
  content: "";
  display: block;
  width: 0%;
  height: 2px;
  background-color: #D10024;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

#product-tab .tab-nav li a:hover:after, #product-tab .tab-nav li a:focus:after, #product-tab .tab-nav li.active a:after {
  width: 100%;
}

/*-- Rating --*/

.rating-avg {
  font-size: 24px;
  font-weight: 700;
  margin-bottom: 15px;
}

.rating-avg .rating-stars {
  margin-left: 10px;
}

.rating-avg .rating-stars, .rating .rating-stars {
  display: inline-block;
}

.rating-avg .rating-stars>i, .rating .rating-stars>i {
  color: #E4E7ED;
}

.rating-avg .rating-stars>i.fa-star, .rating .rating-stars>i.fa-star {
  color: #D10024;
}

.rating li {
  margin: 5px 0px;
}

.rating .rating-progress {
  position: relative;
  display: inline-block;
  height: 9px;
  background-color: #E4E7ED;
  width: 120px;
  margin: 0px 10px;
  border-radius: 5px;
}

.rating .rating-progress>div {
  background-color: #D10024;
  position: absolute;
  left: 0;
  top: 0;
  bottom: 0;
  border-radius: 5px;
}

.rating .sum {
  display: inline-block;
  font-size: 12px;
  color: #8D99AE;
}

/*-- Reviews --*/

.reviews li {
  position: relative;
  padding-left: 145px;
  margin-bottom: 30px;
}

.reviews .review-heading {
  position: absolute;
  width: 130px;
  left: 0;
  top: 0;
  height: 70px;
}

.reviews .review-body {
  min-height: 70px;
}

.reviews .review-heading .name {
  margin-bottom: 5px;
  margin-top: 0px;
}

.reviews .review-heading .date {
  color: #8D99AE;
  font-size: 10px;
  margin: 0;
}

.reviews .review-heading .review-rating {
  margin-top: 5px;
}

.reviews .review-heading .review-rating>i {
  color: #E4E7ED;
}

.reviews .review-heading .review-rating>i.fa-star {
  color: #D10024;
}

.reviews-pagination {
  text-align: center;
}

.reviews-pagination li {
  display: inline-block;
  width: 35px;
  height: 35px;
  line-height: 35px;
  text-align: center;
  background-color: #FFF;
  border: 1px solid #E4E7ED;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.reviews-pagination li:hover {
  background-color: #E4E7ED;
  color: #D10024;
}

.reviews-pagination li.active {
  background-color: #D10024;
  border-color: #D10024;
  color: #FFF;
  cursor: default;
}

.reviews-pagination li a {
  display: block;
}

/*-- Review Form --*/

.review-form .input {
  margin-bottom: 15px;
}

.review-form .input-rating {
  margin-bottom: 15px;
}

.review-form .input-rating .stars {
  display: inline-block;
  vertical-align: top;
}

.review-form .input-rating .stars input[type="radio"] {
  display: none;
}

.review-form .input-rating .stars>label {
  float: right;
  cursor: pointer;
  padding: 0px 3px;
  margin: 0px;
}

.review-form .input-rating .stars>label:before {
  content: "\f006";
  font-family: FontAwesome;
  color: #E4E7ED;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.review-form .input-rating .stars>label:hover:before, .review-form .input-rating .stars>label:hover~label:before {
  color: #D10024;
}

.review-form .input-rating .stars>input:checked label:before, .review-form .input-rating .stars>input:checked~label:before {
  content: "\f005";
  color: #D10024;
}

/*=========================================================
	09 -> CHECKOUT PAGE
===========================================================*/

.billing-details {
  margin-bottom: 30px;
}

.shiping-details {
  margin-bottom: 30px;
}

.order-details {
  position: relative;
  padding: 0px 30px 30px;
  border-right: 1px solid #E4E7ED;
  border-left: 1px solid #E4E7ED;
  border-bottom: 1px solid #E4E7ED;
}

.order-details:before {
  content: "";
  position: absolute;
  left: -1px;
  right: -1px;
  top: -15px;
  height: 30px;
  border-top: 1px solid #E4E7ED;
  border-left: 1px solid #E4E7ED;
  border-right: 1px solid #E4E7ED;
}

.order-summary {
  margin: 15px 0px;
}

.order-summary .order-col {
  display: table;
  width: 100%;
}

.order-summary .order-col:after {
  content: "";
  display: block;
  clear: both;
}

.order-summary .order-col>div {
  display: table-cell;
  padding: 10px 0px;
}

.order-summary .order-col>div:first-child {
  width: calc(100% - 150px);
}

.order-summary .order-col>div:last-child {
  width: 150px;
  text-align: right;
}

.order-summary .order-col .order-total {
  font-size: 24px;
  color: #D10024;
}

.order-details .payment-method {
  margin: 30px 0px;
}

.order-details .order-submit {
  display: block;
  margin-top: 30px;
}

/*=========================================================
	10 -> NEWSLETTER
===========================================================*/

#newsletter.section {
  border-top: 2px solid #E4E7ED;
  border-bottom: 3px solid #D10024;
  margin-top: 30px;
}

.newsletter {
  text-align: center;
}

.newsletter p {
  font-size: 24px;
}

.newsletter form {
  position: relative;
  max-width: 520px;
  margin: 30px auto;
}

.newsletter form:after {
  content: "\f003";
  font-family: FontAwesome;
  position: absolute;
  font-size: 160px;
  color: #E4E7ED;
  top: 15px;
  -webkit-transform: translateY(-50%) rotate(15deg);
  -ms-transform: translateY(-50%) rotate(15deg);
  transform: translateY(-50%) rotate(15deg);
  z-index: -1;
  left: -90px;
}

.newsletter form .input {
  width: calc(100% - 160px);
  margin-right: -4px;
  border-radius: 40px 0px 0px 40px;
}

.newsletter form .newsletter-btn {
  width: 160px;
  height: 40px;
  font-weight: 700;
  background: #D10024;
  color: #FFF;
  border: none;
  border-radius: 0px 40px 40px 0px;
}

.newsletter .newsletter-follow {
  text-align: center;
}

.newsletter .newsletter-follow li {
  display: inline-block;
  margin-right: 5px;
}

.newsletter .newsletter-follow li:last-child {
  margin-right: 0px;
}

.newsletter .newsletter-follow li a {
  position: relative;
  display: block;
  width: 40px;
  height: 40px;
  text-align: center;
  line-height: 40px;
  border: 1px solid #E4E7ED;
  background-color: #FFF;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.newsletter .newsletter-follow li a:hover, .newsletter .newsletter-follow li a:focus {
  background-color: #E4E7ED;
  color: #D10024;
}

/*=========================================================
	11 -> FOOTER
===========================================================*/

#footer {
  background: #15161D;
  color: #B9BABC;
}

#bottom-footer {
  background: #1E1F29;
}

.footer {
  margin: 30px 0px;
}

.footer .footer-title {
  color: #FFF;
  text-transform: uppercase;
  font-size: 18px;
  margin: 0px 0px 30px;
}

.footer-links li+li {
  margin-top: 15px;
}

.footer-links li a {
  color: #B9BABC;
}

.footer-links li i {
  margin-right: 15px;
  color: #D10024;
  width: 14px;
  text-align: center;
}

.footer-links li a:hover {
  color: #D10024;
}

.copyright {
  margin-top: 30px;
  display: block;
  font-size: 12px;
}

.footer-payments li {
  display: inline-block;
  margin-right: 5px;
}

.footer-payments li a {
  color: #15161D;
  font-size: 36px;
  display: block;
}

/*=========================================================
	12 -> SLICK STYLE
===========================================================*/

/*----------------------------*\
	Arrows
\*----------------------------*/

.slick-prev, .slick-next {
  width: 40px;
  height: 40px;
  border: 1px solid #E4E7ED;
  background-color: #FFF;
  border-radius: 50%;
  z-index: 22;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}

.slick-prev:hover, .slick-prev:focus, .slick-next:hover, .slick-next:focus {
  background-color: #D10024;
  border-color: #D10024;
}

.slick-prev:before, .slick-next:before {
  font-family: FontAwesome;
  color: #2B2D42;
}

.slick-prev:before {
  content: "\f104";
}

.slick-next:before {
  content: "\f105";
}

.slick-prev:hover:before, .slick-prev:focus:before, .slick-next:hover:before, .slick-next:focus:before {
  color: #FFF;
}

.slick-prev {
  left: -20px;
}

.slick-next {
  right: -20px;
}

/*----------------------------*\
	Dots
\*----------------------------*/

.slick-dots li, .slick-dots li button, .slick-dots li button:before {
  width: 10px;
  height: 10px;
}

.slick-dots li button:before {
  content: "";
  opacity: 1;
  background: #E4E7ED;
  border-radius: 50%;
}

.slick-dots li.slick-active button:before {
  background-color: #D10024;
}

.custom-dots .slick-dots {
  position: static;
  margin: 15px 0px;
}

/*=========================================================
	13 -> RESPONSIVE
===========================================================*/

@media only screen and (max-width: 1201px) {}

@media only screen and (max-width: 991px) {
  #top-header .header-links.pull-left {
    float: none !important;
  }
  #top-header .header-links.pull-right {
    float: none !important;
    margin-top: 5px;
  }
  .header-logo {
    float: none;
    text-align: center;
  }
  .header-logo .logo {
    display: inline-block;
  }
  #product-imgs {
    margin-bottom: 60px;
    margin-top: 15px;
  }
  #rating {
    text-align: center;
  }
  #reviews {
    margin-top: 30px;
    margin-bottom: 30px;
  }
}

@media only screen and (max-width: 767px) {
  .section-title .section-nav {
    float: none;
    margin-top: 10px;
  }
  .section-tab-nav li {
    margin-top: 10px;
  }
}

@media only screen and (max-width: 480px) {
  [class*='col-xs'] {
    width: 100%;
  }
  .store-grid {
    float: none;
    margin-top: 10px;
  }
  .store-pagination {
    float: none;
    margin-top: 10px;
  }
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
.jss110{
    text-decoration: none;
}

@media(-webkit-min-device-pixel-ratio: 0) {
    .focusRing___1airF {
        outline-style:auto;
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
    transition: transform .5s,-webkit-transform .5s;
    -webkit-transition-timing-function: cubic-bezier(.645,.045,.355,1);
    transition-timing-function: cubic-bezier(.645,.045,.355,1);
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

.description-rich-text :root {
    --blue: #007bff;
    --indigo: #6610f2;
    --purple: #6f42c1;
    --pink: #e83e8c;
    --red: #dc3545;
    --orange: #fd7e14;
    --yellow: #ffc107;
    --green: #28a745;
    --teal: #20c997;
    --cyan: #17a2b8;
    --white: #fff;
    --gray: #6c757d;
    --gray-dark: #343a40;
    --primary: #007bff;
    --secondary: #6c757d;
    --success: #28a745;
    --info: #17a2b8;
    --warning: #ffc107;
    --danger: #dc3545;
    --light: #f8f9fa;
    --dark: #343a40;
    --breakpoint-xs: 0;
    --breakpoint-sm: 576px;
    --breakpoint-md: 768px;
    --breakpoint-lg: 992px;
    --breakpoint-xl: 1200px;
    --font-family-sans-serif: -apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,"Noto Sans",sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol","Noto Color Emoji";
    --font-family-monospace: SFMono-Regular,Menlo,Monaco,Consolas,"Liberation Mono","Courier New",monospace
}

.description-rich-text *,.description-rich-text :after,.description-rich-text :before {
    -moz-box-sizing: border-box;
    box-sizing: border-box
}

.description-rich-text html {
    font-family: sans-serif;
    line-height: 1.15;
    -webkit-text-size-adjust: 100%;
    -webkit-tap-highlight-color: transparent
}

.description-rich-text article,.description-rich-text aside,.description-rich-text figcaption,.description-rich-text figure,.description-rich-text footer,.description-rich-text header,.description-rich-text hgroup,.description-rich-text main,.description-rich-text nav,.description-rich-text section {
    display: block
}

.description-rich-text body {
    margin: 0;
    font-family: -apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Helvetica Neue,Arial,Noto Sans,sans-serif,Apple Color Emoji,Segoe UI Emoji,Segoe UI Symbol,Noto Color Emoji;
    font-size: 1rem;
    font-weight: 400;
    line-height: 1.5;
    color: #212529;
    text-align: left;
    background-color: #fff
}

.description-rich-text [tabindex="-1"]:focus:not(:focus-visible) {
    outline: 0!important
}

.description-rich-text hr {
    -moz-box-sizing: content-box;
    box-sizing: content-box;
    height: 0;
    overflow: visible
}

.description-rich-text h1,.description-rich-text h2,.description-rich-text h3,.description-rich-text h4,.description-rich-text h5,.description-rich-text h6 {
    margin-top: 0;
    margin-bottom: .5rem
}

.description-rich-text p {
    margin-top: 0;
    margin-bottom: 1rem
}

.description-rich-text abbr[data-original-title],.description-rich-text abbr[title] {
    text-decoration: underline;
    -moz-text-decoration: underline dotted;
    text-decoration: underline dotted;
    cursor: help;
    border-bottom: 0;
    text-decoration-skip-ink: none
}

.description-rich-text address {
    margin-bottom: 1rem;
    font-style: normal;
    line-height: inherit
}

.description-rich-text dl,.description-rich-text ol,.description-rich-text ul {
    margin-top: 0;
    margin-bottom: 1rem
}

.description-rich-text ol ol,.description-rich-text ol ul,.description-rich-text ul ol,.description-rich-text ul ul {
    margin-bottom: 0
}

.description-rich-text dt {
    font-weight: 700
}

.description-rich-text dd {
    margin-bottom: .5rem;
    margin-left: 0
}

.description-rich-text blockquote {
    margin: 0 0 1rem
}

.description-rich-text b,.description-rich-text strong {
    font-weight: bolder
}

.description-rich-text small {
    font-size: 80%
}

.description-rich-text sub,.description-rich-text sup {
    position: relative;
    font-size: 75%;
    line-height: 0;
    vertical-align: baseline
}

.description-rich-text sub {
    bottom: -.25em
}

.description-rich-text sup {
    top: -.5em
}

.description-rich-text a {
    color: #007bff;
    text-decoration: none;
    background-color: transparent
}

.description-rich-text a:hover {
    color: #0056b3;
    text-decoration: underline
}

.description-rich-text a:not([href]),.description-rich-text a:not([href]):hover {
    color: inherit;
    text-decoration: none
}

.description-rich-text code,.description-rich-text kbd,.description-rich-text pre,.description-rich-text samp {
    font-family: SFMono-Regular,Menlo,Monaco,Consolas,Liberation Mono,Courier New,monospace;
    font-size: 1em
}

.description-rich-text pre {
    margin-top: 0;
    margin-bottom: 1rem;
    overflow: auto;
    -ms-overflow-style: scrollbar
}

.description-rich-text figure {
    margin: 0 0 1rem
}

.description-rich-text img {
    vertical-align: middle;
    border-style: none
}

.description-rich-text svg {
    overflow: hidden;
    vertical-align: middle
}

.description-rich-text table {
    border-collapse: collapse
}

.description-rich-text caption {
    padding-top: .75rem;
    padding-bottom: .75rem;
    color: #6c757d;
    text-align: left;
    caption-side: bottom
}

.description-rich-text th {
    text-align: inherit
}

.description-rich-text label {
    display: inline-block;
    margin-bottom: .5rem
}

.description-rich-text button {
    border-radius: 0
}

.description-rich-text button:focus {
    outline: 1px dotted;
    outline: 5px auto -webkit-focus-ring-color
}

.description-rich-text button,.description-rich-text input,.description-rich-text optgroup,.description-rich-text select,.description-rich-text textarea {
    margin: 0;
    font-family: inherit;
    font-size: inherit;
    line-height: inherit
}

.description-rich-text button,.description-rich-text input {
    overflow: visible
}

.description-rich-text button,.description-rich-text select {
    text-transform: none
}

.description-rich-text [role=button] {
    cursor: pointer
}

.description-rich-text select {
    word-wrap: normal
}

.description-rich-text [type=button],.description-rich-text [type=reset],.description-rich-text [type=submit],.description-rich-text button {
    appearance: button
}

.description-rich-text [type=button]:not(:disabled),.description-rich-text [type=reset]:not(:disabled),.description-rich-text [type=submit]:not(:disabled),.description-rich-text button:not(:disabled) {
    cursor: pointer
}

.description-rich-text [type=button]::-moz-focus-inner,.description-rich-text [type=reset]::-moz-focus-inner,.description-rich-text [type=submit]::-moz-focus-inner,.description-rich-text button::-moz-focus-inner {
    padding: 0;
    border-style: none
}

.description-rich-text input[type=checkbox],.description-rich-text input[type=radio] {
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    padding: 0
}

.description-rich-text textarea {
    overflow: auto;
    resize: vertical
}

.description-rich-text fieldset {
    min-width: 0;
    padding: 0;
    margin: 0;
    border: 0
}

.description-rich-text legend {
    display: block;
    width: 100%;
    max-width: 100%;
    padding: 0;
    margin-bottom: .5rem;
    font-size: 1.5rem;
    line-height: inherit;
    color: inherit;
    white-space: normal
}

.description-rich-text progress {
    vertical-align: baseline
}

.description-rich-text [type=number]::-webkit-inner-spin-button,.description-rich-text [type=number]::-webkit-outer-spin-button {
    height: auto
}

.description-rich-text [type=search] {
    outline-offset: -2px;
    appearance: none
}

.description-rich-text [type=search]::-webkit-search-decoration {
    -webkit-appearance: none
}

.description-rich-text ::-webkit-file-upload-button {
    font: inherit;
    -webkit-appearance: button
}

.description-rich-text output {
    display: inline-block
}

.description-rich-text summary {
    display: list-item;
    cursor: pointer
}

.description-rich-text template {
    display: none
}

.description-rich-text [hidden] {
    display: none!important
}

.description-rich-text .container {
    width: 100%;
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto
}

@media(min-width: 576px) {
    .description-rich-text .container {
        max-width:540px
    }
}

@media(min-width: 768px) {
    .description-rich-text .container {
        max-width:720px
    }
}

@media(min-width: 992px) {
    .description-rich-text .container {
        max-width:960px
    }
}

@media(min-width: 1200px) {
    .description-rich-text .container {
        max-width:1140px
    }
}

.description-rich-text .container-fluid,.description-rich-text .container-lg,.description-rich-text .container-md,.description-rich-text .container-sm,.description-rich-text .container-xl {
    width: 100%;
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto
}

@media(min-width: 576px) {
    .description-rich-text .container,.description-rich-text .container-sm {
        max-width:540px
    }
}

@media(min-width: 768px) {
    .description-rich-text .container,.description-rich-text .container-md,.description-rich-text .container-sm {
        max-width:720px
    }
}

@media(min-width: 992px) {
    .description-rich-text .container,.description-rich-text .container-lg,.description-rich-text .container-md,.description-rich-text .container-sm {
        max-width:960px
    }
}

@media(min-width: 1200px) {
    .description-rich-text .container,.description-rich-text .container-lg,.description-rich-text .container-md,.description-rich-text .container-sm,.description-rich-text .container-xl {
        max-width:1140px
    }
}

.description-rich-text .row {
    display: -webkit-flex;
    display: -moz-box;
    display: flex;
    -webkit-flex-wrap: wrap;
    flex-wrap: wrap;
    margin-right: -15px;
    margin-left: -15px
}

.description-rich-text .no-gutters {
    margin-right: 0;
    margin-left: 0
}

.description-rich-text .no-gutters>.col,.description-rich-text .no-gutters>[class*=col-] {
    padding-right: 0;
    padding-left: 0
}

.description-rich-text .col,.description-rich-text .col-1,.description-rich-text .col-2,.description-rich-text .col-3,.description-rich-text .col-4,.description-rich-text .col-5,.description-rich-text .col-6,.description-rich-text .col-7,.description-rich-text .col-8,.description-rich-text .col-9,.description-rich-text .col-10,.description-rich-text .col-11,.description-rich-text .col-12,.description-rich-text .col-auto,.description-rich-text .col-lg,.description-rich-text .col-lg-1,.description-rich-text .col-lg-2,.description-rich-text .col-lg-3,.description-rich-text .col-lg-4,.description-rich-text .col-lg-5,.description-rich-text .col-lg-6,.description-rich-text .col-lg-7,.description-rich-text .col-lg-8,.description-rich-text .col-lg-9,.description-rich-text .col-lg-10,.description-rich-text .col-lg-11,.description-rich-text .col-lg-12,.description-rich-text .col-lg-auto,.description-rich-text .col-md,.description-rich-text .col-md-1,.description-rich-text .col-md-2,.description-rich-text .col-md-3,.description-rich-text .col-md-4,.description-rich-text .col-md-5,.description-rich-text .col-md-6,.description-rich-text .col-md-7,.description-rich-text .col-md-8,.description-rich-text .col-md-9,.description-rich-text .col-md-10,.description-rich-text .col-md-11,.description-rich-text .col-md-12,.description-rich-text .col-md-auto,.description-rich-text .col-sm,.description-rich-text .col-sm-1,.description-rich-text .col-sm-2,.description-rich-text .col-sm-3,.description-rich-text .col-sm-4,.description-rich-text .col-sm-5,.description-rich-text .col-sm-6,.description-rich-text .col-sm-7,.description-rich-text .col-sm-8,.description-rich-text .col-sm-9,.description-rich-text .col-sm-10,.description-rich-text .col-sm-11,.description-rich-text .col-sm-12,.description-rich-text .col-sm-auto,.description-rich-text .col-xl,.description-rich-text .col-xl-1,.description-rich-text .col-xl-2,.description-rich-text .col-xl-3,.description-rich-text .col-xl-4,.description-rich-text .col-xl-5,.description-rich-text .col-xl-6,.description-rich-text .col-xl-7,.description-rich-text .col-xl-8,.description-rich-text .col-xl-9,.description-rich-text .col-xl-10,.description-rich-text .col-xl-11,.description-rich-text .col-xl-12,.description-rich-text .col-xl-auto {
    position: relative;
    width: 100%;
    padding-right: 15px;
    padding-left: 15px
}

.description-rich-text .col {
    -webkit-flex-basis: 0;
    flex-basis: 0;
    -webkit-flex-grow: 1;
    -moz-box-flex: 1;
    flex-grow: 1;
    min-width: 0;
    max-width: 100%
}

.description-rich-text .row-cols-1>* {
    -webkit-flex: 0 0 100%;
    -moz-box-flex: 0;
    flex: 0 0 100%;
    max-width: 100%
}

.description-rich-text .row-cols-2>* {
    -webkit-flex: 0 0 50%;
    -moz-box-flex: 0;
    flex: 0 0 50%;
    max-width: 50%
}

.description-rich-text .row-cols-3>* {
    -webkit-flex: 0 0 33.3333333333%;
    -moz-box-flex: 0;
    flex: 0 0 33.3333333333%;
    max-width: 33.3333333333%
}

.description-rich-text .row-cols-4>* {
    -webkit-flex: 0 0 25%;
    -moz-box-flex: 0;
    flex: 0 0 25%;
    max-width: 25%
}

.description-rich-text .row-cols-5>* {
    -webkit-flex: 0 0 20%;
    -moz-box-flex: 0;
    flex: 0 0 20%;
    max-width: 20%
}

.description-rich-text .row-cols-6>* {
    -webkit-flex: 0 0 16.6666666667%;
    -moz-box-flex: 0;
    flex: 0 0 16.6666666667%;
    max-width: 16.6666666667%
}

.description-rich-text .col-auto {
    -webkit-flex: 0 0 auto;
    -moz-box-flex: 0;
    flex: 0 0 auto;
    width: auto;
    max-width: 100%
}

.description-rich-text .col-1 {
    -webkit-flex: 0 0 8.3333333333%;
    -moz-box-flex: 0;
    flex: 0 0 8.3333333333%;
    max-width: 8.3333333333%
}

.description-rich-text .col-2 {
    -webkit-flex: 0 0 16.6666666667%;
    -moz-box-flex: 0;
    flex: 0 0 16.6666666667%;
    max-width: 16.6666666667%
}

.description-rich-text .col-3 {
    -webkit-flex: 0 0 25%;
    -moz-box-flex: 0;
    flex: 0 0 25%;
    max-width: 25%
}

.description-rich-text .col-4 {
    -webkit-flex: 0 0 33.3333333333%;
    -moz-box-flex: 0;
    flex: 0 0 33.3333333333%;
    max-width: 33.3333333333%
}

.description-rich-text .col-5 {
    -webkit-flex: 0 0 41.6666666667%;
    -moz-box-flex: 0;
    flex: 0 0 41.6666666667%;
    max-width: 41.6666666667%
}

.description-rich-text .col-6 {
    -webkit-flex: 0 0 50%;
    -moz-box-flex: 0;
    flex: 0 0 50%;
    max-width: 50%
}

.description-rich-text .col-7 {
    -webkit-flex: 0 0 58.3333333333%;
    -moz-box-flex: 0;
    flex: 0 0 58.3333333333%;
    max-width: 58.3333333333%
}

.description-rich-text .col-8 {
    -webkit-flex: 0 0 66.6666666667%;
    -moz-box-flex: 0;
    flex: 0 0 66.6666666667%;
    max-width: 66.6666666667%
}

.description-rich-text .col-9 {
    -webkit-flex: 0 0 75%;
    -moz-box-flex: 0;
    flex: 0 0 75%;
    max-width: 75%
}

.description-rich-text .col-10 {
    -webkit-flex: 0 0 83.3333333333%;
    -moz-box-flex: 0;
    flex: 0 0 83.3333333333%;
    max-width: 83.3333333333%
}

.description-rich-text .col-11 {
    -webkit-flex: 0 0 91.6666666667%;
    -moz-box-flex: 0;
    flex: 0 0 91.6666666667%;
    max-width: 91.6666666667%
}

.description-rich-text .col-12 {
    -webkit-flex: 0 0 100%;
    -moz-box-flex: 0;
    flex: 0 0 100%;
    max-width: 100%
}

@media(min-width: 576px) {
    .description-rich-text .col-sm {
        -webkit-flex-basis:0;
        flex-basis: 0;
        -webkit-flex-grow: 1;
        -moz-box-flex: 1;
        flex-grow: 1;
        min-width: 0;
        max-width: 100%
    }

    .description-rich-text .row-cols-sm-1>* {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }

    .description-rich-text .row-cols-sm-2>* {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .row-cols-sm-3>* {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .row-cols-sm-4>* {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .row-cols-sm-5>* {
        -webkit-flex: 0 0 20%;
        -moz-box-flex: 0;
        flex: 0 0 20%;
        max-width: 20%
    }

    .description-rich-text .row-cols-sm-6>* {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-sm-auto {
        -webkit-flex: 0 0 auto;
        -moz-box-flex: 0;
        flex: 0 0 auto;
        width: auto;
        max-width: 100%
    }

    .description-rich-text .col-sm-1 {
        -webkit-flex: 0 0 8.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 8.3333333333%;
        max-width: 8.3333333333%
    }

    .description-rich-text .col-sm-2 {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-sm-3 {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .col-sm-4 {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .col-sm-5 {
        -webkit-flex: 0 0 41.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 41.6666666667%;
        max-width: 41.6666666667%
    }

    .description-rich-text .col-sm-6 {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .col-sm-7 {
        -webkit-flex: 0 0 58.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 58.3333333333%;
        max-width: 58.3333333333%
    }

    .description-rich-text .col-sm-8 {
        -webkit-flex: 0 0 66.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 66.6666666667%;
        max-width: 66.6666666667%
    }

    .description-rich-text .col-sm-9 {
        -webkit-flex: 0 0 75%;
        -moz-box-flex: 0;
        flex: 0 0 75%;
        max-width: 75%
    }

    .description-rich-text .col-sm-10 {
        -webkit-flex: 0 0 83.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 83.3333333333%;
        max-width: 83.3333333333%
    }

    .description-rich-text .col-sm-11 {
        -webkit-flex: 0 0 91.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 91.6666666667%;
        max-width: 91.6666666667%
    }

    .description-rich-text .col-sm-12 {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }
}

@media(min-width: 768px) {
    .description-rich-text .col-md {
        -webkit-flex-basis:0;
        flex-basis: 0;
        -webkit-flex-grow: 1;
        -moz-box-flex: 1;
        flex-grow: 1;
        min-width: 0;
        max-width: 100%
    }

    .description-rich-text .row-cols-md-1>* {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }

    .description-rich-text .row-cols-md-2>* {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .row-cols-md-3>* {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .row-cols-md-4>* {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .row-cols-md-5>* {
        -webkit-flex: 0 0 20%;
        -moz-box-flex: 0;
        flex: 0 0 20%;
        max-width: 20%
    }

    .description-rich-text .row-cols-md-6>* {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-md-auto {
        -webkit-flex: 0 0 auto;
        -moz-box-flex: 0;
        flex: 0 0 auto;
        width: auto;
        max-width: 100%
    }

    .description-rich-text .col-md-1 {
        -webkit-flex: 0 0 8.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 8.3333333333%;
        max-width: 8.3333333333%
    }

    .description-rich-text .col-md-2 {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-md-3 {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .col-md-4 {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .col-md-5 {
        -webkit-flex: 0 0 41.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 41.6666666667%;
        max-width: 41.6666666667%
    }

    .description-rich-text .col-md-6 {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .col-md-7 {
        -webkit-flex: 0 0 58.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 58.3333333333%;
        max-width: 58.3333333333%
    }

    .description-rich-text .col-md-8 {
        -webkit-flex: 0 0 66.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 66.6666666667%;
        max-width: 66.6666666667%
    }

    .description-rich-text .col-md-9 {
        -webkit-flex: 0 0 75%;
        -moz-box-flex: 0;
        flex: 0 0 75%;
        max-width: 75%
    }

    .description-rich-text .col-md-10 {
        -webkit-flex: 0 0 83.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 83.3333333333%;
        max-width: 83.3333333333%
    }

    .description-rich-text .col-md-11 {
        -webkit-flex: 0 0 91.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 91.6666666667%;
        max-width: 91.6666666667%
    }

    .description-rich-text .col-md-12 {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }
}

@media(min-width: 992px) {
    .description-rich-text .col-lg {
        -webkit-flex-basis:0;
        flex-basis: 0;
        -webkit-flex-grow: 1;
        -moz-box-flex: 1;
        flex-grow: 1;
        min-width: 0;
        max-width: 100%
    }

    .description-rich-text .row-cols-lg-1>* {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }

    .description-rich-text .row-cols-lg-2>* {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .row-cols-lg-3>* {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .row-cols-lg-4>* {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .row-cols-lg-5>* {
        -webkit-flex: 0 0 20%;
        -moz-box-flex: 0;
        flex: 0 0 20%;
        max-width: 20%
    }

    .description-rich-text .row-cols-lg-6>* {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-lg-auto {
        -webkit-flex: 0 0 auto;
        -moz-box-flex: 0;
        flex: 0 0 auto;
        width: auto;
        max-width: 100%
    }

    .description-rich-text .col-lg-1 {
        -webkit-flex: 0 0 8.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 8.3333333333%;
        max-width: 8.3333333333%
    }

    .description-rich-text .col-lg-2 {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-lg-3 {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .col-lg-4 {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .col-lg-5 {
        -webkit-flex: 0 0 41.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 41.6666666667%;
        max-width: 41.6666666667%
    }

    .description-rich-text .col-lg-6 {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .col-lg-7 {
        -webkit-flex: 0 0 58.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 58.3333333333%;
        max-width: 58.3333333333%
    }

    .description-rich-text .col-lg-8 {
        -webkit-flex: 0 0 66.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 66.6666666667%;
        max-width: 66.6666666667%
    }

    .description-rich-text .col-lg-9 {
        -webkit-flex: 0 0 75%;
        -moz-box-flex: 0;
        flex: 0 0 75%;
        max-width: 75%
    }

    .description-rich-text .col-lg-10 {
        -webkit-flex: 0 0 83.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 83.3333333333%;
        max-width: 83.3333333333%
    }

    .description-rich-text .col-lg-11 {
        -webkit-flex: 0 0 91.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 91.6666666667%;
        max-width: 91.6666666667%
    }

    .description-rich-text .col-lg-12 {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }
}

@media(min-width: 1200px) {
    .description-rich-text .col-xl {
        -webkit-flex-basis:0;
        flex-basis: 0;
        -webkit-flex-grow: 1;
        -moz-box-flex: 1;
        flex-grow: 1;
        min-width: 0;
        max-width: 100%
    }

    .description-rich-text .row-cols-xl-1>* {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }

    .description-rich-text .row-cols-xl-2>* {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .row-cols-xl-3>* {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .row-cols-xl-4>* {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .row-cols-xl-5>* {
        -webkit-flex: 0 0 20%;
        -moz-box-flex: 0;
        flex: 0 0 20%;
        max-width: 20%
    }

    .description-rich-text .row-cols-xl-6>* {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-xl-auto {
        -webkit-flex: 0 0 auto;
        -moz-box-flex: 0;
        flex: 0 0 auto;
        width: auto;
        max-width: 100%
    }

    .description-rich-text .col-xl-1 {
        -webkit-flex: 0 0 8.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 8.3333333333%;
        max-width: 8.3333333333%
    }

    .description-rich-text .col-xl-2 {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-xl-3 {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .col-xl-4 {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .col-xl-5 {
        -webkit-flex: 0 0 41.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 41.6666666667%;
        max-width: 41.6666666667%
    }

    .description-rich-text .col-xl-6 {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .col-xl-7 {
        -webkit-flex: 0 0 58.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 58.3333333333%;
        max-width: 58.3333333333%
    }

    .description-rich-text .col-xl-8 {
        -webkit-flex: 0 0 66.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 66.6666666667%;
        max-width: 66.6666666667%
    }

    .description-rich-text .col-xl-9 {
        -webkit-flex: 0 0 75%;
        -moz-box-flex: 0;
        flex: 0 0 75%;
        max-width: 75%
    }

    .description-rich-text .col-xl-10 {
        -webkit-flex: 0 0 83.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 83.3333333333%;
        max-width: 83.3333333333%
    }

    .description-rich-text .col-xl-11 {
        -webkit-flex: 0 0 91.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 91.6666666667%;
        max-width: 91.6666666667%
    }

    .description-rich-text .col-xl-12 {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }
}

.description-rich-text img {
    max-width: 100%
}

.description-rich-text .container-fluid {
    max-width: 1070px;
    margin: 0 auto;
    padding-top: 1rem
}

body {
    overflow-x: hidden;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale
}

*,html {
    font-family: Roboto
}

.page--loading {
    position: relative
}

.page--loading .MuiBackdrop-root {
    position: absolute;
    z-index: 1000;
    -webkit-align-items: start;
    -moz-box-align: start;
    align-items: start;
    padding-top: 50px
}

.cms-content img {
    max-width: 100%
}

.MuiAutocomplete-groupLabel {
    line-height: 24px!important
}

a {
    color: inherit
}

.input-range__slider {
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    background: #3f51b5;
    border: 1px solid #3f51b5;
    border-radius: 100%;
    cursor: pointer;
    display: block;
    height: 1rem;
    margin-left: -.5rem;
    margin-top: -.65rem;
    outline: none;
    position: absolute;
    top: 50%;
    -webkit-transition: box-shadow .3s ease-out,-webkit-transform .3s ease-out;
    transition: box-shadow .3s ease-out,-webkit-transform .3s ease-out;
    transition: transform .3s ease-out,box-shadow .3s ease-out;
    transition: transform .3s ease-out,box-shadow .3s ease-out,-webkit-transform .3s ease-out;
    width: 1rem
}

.input-range__slider:active {
    -webkit-transform: scale(1.3);
    transform: scale(1.3)
}

.input-range__slider:focus {
    box-shadow: 0 0 0 5px rgba(63,81,181,.2)
}

.input-range--disabled .input-range__slider {
    background: #ccc;
    border: 1px solid #ccc;
    box-shadow: none;
    -webkit-transform: none;
    transform: none
}

.input-range__slider-container {
    -webkit-transition: left .3s ease-out;
    transition: left .3s ease-out
}

.input-range__label {
    color: #aaa;
    font-family: Helvetica Neue,san-serif;
    font-size: .8rem;
    -webkit-transform: translateZ(0);
    transform: translateZ(0);
    white-space: nowrap
}

.input-range__label--max,.input-range__label--min {
    bottom: -1.4rem;
    position: absolute
}

.input-range__label--min {
    left: 0
}

.input-range__label--max {
    right: 0
}

.input-range__label--value {
    position: absolute;
    top: -1.8rem
}

.input-range__label-container {
    left: -50%;
    position: relative
}

.input-range__label--max .input-range__label-container {
    left: 50%
}

.input-range__track {
    background: #eee;
    border-radius: .3rem;
    cursor: pointer;
    display: block;
    height: .3rem;
    position: relative;
    -webkit-transition: left .3s ease-out,width .3s ease-out;
    transition: left .3s ease-out,width .3s ease-out
}

.input-range--disabled .input-range__track {
    background: #eee
}

.input-range__track--background {
    left: 0;
    margin-top: -.15rem;
    position: absolute;
    right: 0;
    top: 50%
}

.input-range__track--active {
    background: #3f51b5
}

.input-range {
    height: 1rem;
    position: relative;
    width: 100%
}

.alice-carousel .animated {
    -webkit-animation-fill-mode: both;
    animation-fill-mode: both
}

.alice-carousel .animated-out {
    z-index: 1
}

.alice-carousel .fadeOut {
    -webkit-animation-name: fadeOut;
    animation-name: fadeOut
}

@-webkit-keyframes fadeOut {
    0% {
        opacity: 1
    }

    to {
        opacity: 0;
        visibility: hidden
    }
}

@keyframes fadeOut {
    0% {
        opacity: 1
    }

    to {
        opacity: 0;
        visibility: hidden
    }
}

.alice-carousel {
    position: relative;
    width: 100%;
    margin: auto;
    direction: ltr
}

.alice-carousel__wrapper {
    overflow-x: hidden;
    overflow-y: hidden;
    height: auto
}

.alice-carousel__stage,.alice-carousel__wrapper {
    position: relative;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    width: 100%
}

.alice-carousel__stage {
    height: 100%;
    margin: 0;
    padding: 0;
    white-space: nowrap;
    transform-style: flat;
    -webkit-transform-style: flat;
    backface-visibility: hidden;
    -webkit-backface-visibility: hidden
}

.alice-carousel__stage-item {
    position: relative;
    display: inline-block;
    padding: 0;
    margin: 0;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    width: 100%;
    height: 100%;
    vertical-align: top;
    white-space: normal;
    line-height: 0
}

.alice-carousel__stage-item * {
    line-height: normal
}

.alice-carousel__stage-item.__hidden {
    opacity: 0;
    overflow: hidden
}

.alice-carousel__next-btn,.alice-carousel__prev-btn {
    display: inline-block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    width: 50%;
    padding: 10px 5px
}

.alice-carousel__next-btn [data-area]:after,.alice-carousel__prev-btn [data-area]:after {
    position: relative;
    content: attr(data-area);
    text-transform: capitalize
}

.alice-carousel__prev-btn {
    text-align: right
}

.alice-carousel__next-btn-item,.alice-carousel__prev-btn-item {
    display: inline-block;
    cursor: pointer;
    padding: 5px;
    margin: 0;
    color: #465798
}

.alice-carousel__next-btn-item:hover,.alice-carousel__prev-btn-item:hover {
    color: darkred
}

.alice-carousel__next-btn-item.__inactive,.alice-carousel__prev-btn-item.__inactive {
    opacity: .4;
    pointer-events: none
}

.alice-carousel__play-btn {
    position: absolute;
    top: 30px;
    left: 20px;
    display: inline-block
}

.alice-carousel__play-btn:hover {
    cursor: pointer
}

.alice-carousel__play-btn-wrapper {
    position: relative;
    width: 32px;
    height: 32px;
    padding: 10px;
    border-radius: 50%;
    background-color: #fff
}

.alice-carousel__play-btn-item {
    position: absolute;
    width: 32px;
    height: 32px;
    cursor: pointer;
    border: 0;
    outline: none;
    background: 0 0
}

.alice-carousel__play-btn-item:after,.alice-carousel__play-btn-item:before {
    position: absolute;
    pointer-events: none;
    display: block;
    width: 0;
    height: 0;
    content: "";
    -webkit-transition: all .4s linear;
    transition: all .4s linear;
    border-color: transparent transparent transparent #465798;
    border-style: solid;
    border-width: 8px 0 8px 15px
}

.alice-carousel__play-btn-item:before {
    left: 5px;
    height: 14px
}

.alice-carousel__play-btn-item:after {
    top: 7px;
    left: 18px
}

.alice-carousel__play-btn-item.__pause:after,.alice-carousel__play-btn-item.__pause:before {
    height: 30px;
    border-width: 0 0 0 10px
}

.alice-carousel__play-btn-item.__pause:after {
    top: 0;
    left: 18px
}

.alice-carousel__dots {
    margin: 30px 3px 5px;
    padding: 0;
    list-style: none;
    text-align: center
}

.alice-carousel__dots>li {
    display: inline-block
}

.alice-carousel__dots-item:not(.__custom) {
    width: 8px;
    height: 8px;
    cursor: pointer;
    border-radius: 50%;
    background-color: #e0e4fb
}

.alice-carousel__dots-item:not(.__custom):not(:last-child) {
    margin-right: 20px
}

.alice-carousel__dots-item:not(.__custom).__active,.alice-carousel__dots-item:not(.__custom):hover {
    background-color: #6e7ebc
}

.alice-carousel__slide-info {
    position: absolute;
    top: 20px;
    right: 20px;
    display: inline-block;
    padding: 5px 10px;
    color: #465798;
    border-radius: 5px;
    background-color: rgba(224,228,251,.6)
}

.alice-carousel__slide-info-item {
    vertical-align: middle;
    line-height: 0
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

@media(-webkit-min-device-pixel-ratio: 0) {
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

.description-rich-text :root {
    --blue: #007bff;
    --indigo: #6610f2;
    --purple: #6f42c1;
    --pink: #e83e8c;
    --red: #dc3545;
    --orange: #fd7e14;
    --yellow: #ffc107;
    --green: #28a745;
    --teal: #20c997;
    --cyan: #17a2b8;
    --white: #fff;
    --gray: #6c757d;
    --gray-dark: #343a40;
    --primary: #007bff;
    --secondary: #6c757d;
    --success: #28a745;
    --info: #17a2b8;
    --warning: #ffc107;
    --danger: #dc3545;
    --light: #f8f9fa;
    --dark: #343a40;
    --breakpoint-xs: 0;
    --breakpoint-sm: 576px;
    --breakpoint-md: 768px;
    --breakpoint-lg: 992px;
    --breakpoint-xl: 1200px;
    --font-family-sans-serif: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, "Noto Sans", sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
    --font-family-monospace: SFMono-Regular, Menlo, Monaco, Consolas, "Liberation Mono", "Courier New", monospace
}

.description-rich-text *,
.description-rich-text :after,
.description-rich-text :before {
    -moz-box-sizing: border-box;
    box-sizing: border-box
}

.description-rich-text html {
    font-family: sans-serif;
    line-height: 1.15;
    -webkit-text-size-adjust: 100%;
    -webkit-tap-highlight-color: transparent
}

.description-rich-text article,
.description-rich-text aside,
.description-rich-text figcaption,
.description-rich-text figure,
.description-rich-text footer,
.description-rich-text header,
.description-rich-text hgroup,
.description-rich-text main,
.description-rich-text nav,
.description-rich-text section {
    display: block
}

.description-rich-text body {
    margin: 0;
    font-family: -apple-system, BlinkMacSystemFont, Segoe UI, Roboto, Helvetica Neue, Arial, Noto Sans, sans-serif, Apple Color Emoji, Segoe UI Emoji, Segoe UI Symbol, Noto Color Emoji;
    font-size: 1rem;
    font-weight: 400;
    line-height: 1.5;
    color: #212529;
    text-align: left;
    background-color: #fff
}

.description-rich-text [tabindex="-1"]:focus:not(:focus-visible) {
    outline: 0 !important
}

.description-rich-text hr {
    -moz-box-sizing: content-box;
    box-sizing: content-box;
    height: 0;
    overflow: visible
}

.description-rich-text h1,
.description-rich-text h2,
.description-rich-text h3,
.description-rich-text h4,
.description-rich-text h5,
.description-rich-text h6 {
    margin-top: 0;
    margin-bottom: .5rem
}

.description-rich-text p {
    margin-top: 0;
    margin-bottom: 1rem
}

.description-rich-text abbr[data-original-title],
.description-rich-text abbr[title] {
    text-decoration: underline;
    -moz-text-decoration: underline dotted;
    text-decoration: underline dotted;
    cursor: help;
    border-bottom: 0;
    text-decoration-skip-ink: none
}

.description-rich-text address {
    margin-bottom: 1rem;
    font-style: normal;
    line-height: inherit
}

.description-rich-text dl,
.description-rich-text ol,
.description-rich-text ul {
    margin-top: 0;
    margin-bottom: 1rem
}

.description-rich-text ol ol,
.description-rich-text ol ul,
.description-rich-text ul ol,
.description-rich-text ul ul {
    margin-bottom: 0
}

.description-rich-text dt {
    font-weight: 700
}

.description-rich-text dd {
    margin-bottom: .5rem;
    margin-left: 0
}

.description-rich-text blockquote {
    margin: 0 0 1rem
}

.description-rich-text b,
.description-rich-text strong {
    font-weight: bolder
}

.description-rich-text small {
    font-size: 80%
}

.description-rich-text sub,
.description-rich-text sup {
    position: relative;
    font-size: 75%;
    line-height: 0;
    vertical-align: baseline
}

.description-rich-text sub {
    bottom: -.25em
}

.description-rich-text sup {
    top: -.5em
}

.description-rich-text a {
    color: #007bff;
    text-decoration: none;
    background-color: transparent
}

.description-rich-text a:hover {
    color: #0056b3;
    text-decoration: underline
}

.description-rich-text a:not([href]),
.description-rich-text a:not([href]):hover {
    color: inherit;
    text-decoration: none
}

.description-rich-text code,
.description-rich-text kbd,
.description-rich-text pre,
.description-rich-text samp {
    font-family: SFMono-Regular, Menlo, Monaco, Consolas, Liberation Mono, Courier New, monospace;
    font-size: 1em
}

.description-rich-text pre {
    margin-top: 0;
    margin-bottom: 1rem;
    overflow: auto;
    -ms-overflow-style: scrollbar
}

.description-rich-text figure {
    margin: 0 0 1rem
}

.description-rich-text img {
    vertical-align: middle;
    border-style: none
}

.description-rich-text svg {
    overflow: hidden;
    vertical-align: middle
}

.description-rich-text table {
    border-collapse: collapse
}

.description-rich-text caption {
    padding-top: .75rem;
    padding-bottom: .75rem;
    color: #6c757d;
    text-align: left;
    caption-side: bottom
}

.description-rich-text th {
    text-align: inherit
}

.description-rich-text label {
    display: inline-block;
    margin-bottom: .5rem
}

.description-rich-text button {
    border-radius: 0
}

.description-rich-text button:focus {
    outline: 1px dotted;
    outline: 5px auto -webkit-focus-ring-color
}

.description-rich-text button,
.description-rich-text input,
.description-rich-text optgroup,
.description-rich-text select,
.description-rich-text textarea {
    margin: 0;
    font-family: inherit;
    font-size: inherit;
    line-height: inherit
}

.description-rich-text button,
.description-rich-text input {
    overflow: visible
}

.description-rich-text button,
.description-rich-text select {
    text-transform: none
}

.description-rich-text [role=button] {
    cursor: pointer
}

.description-rich-text select {
    word-wrap: normal
}


.description-rich-text [type=button]:not(:disabled),
.description-rich-text [type=reset]:not(:disabled),
.description-rich-text [type=submit]:not(:disabled),
.description-rich-text button:not(:disabled) {
    cursor: pointer
}

.description-rich-text [type=button]::-moz-focus-inner,
.description-rich-text [type=reset]::-moz-focus-inner,
.description-rich-text [type=submit]::-moz-focus-inner,
.description-rich-text button::-moz-focus-inner {
    padding: 0;
    border-style: none
}

.description-rich-text input[type=checkbox],
.description-rich-text input[type=radio] {
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    padding: 0
}

.description-rich-text textarea {
    overflow: auto;
    resize: vertical
}

.description-rich-text fieldset {
    min-width: 0;
    padding: 0;
    margin: 0;
    border: 0
}

.description-rich-text legend {
    display: block;
    width: 100%;
    max-width: 100%;
    padding: 0;
    margin-bottom: .5rem;
    font-size: 1.5rem;
    line-height: inherit;
    color: inherit;
    white-space: normal
}

.description-rich-text progress {
    vertical-align: baseline
}

.description-rich-text [type=number]::-webkit-inner-spin-button,
.description-rich-text [type=number]::-webkit-outer-spin-button {
    height: auto
}

.description-rich-text [type=search] {
    outline-offset: -2px;
}

.description-rich-text [type=search]::-webkit-search-decoration {
    -webkit-appearance: none
}

.description-rich-text ::-webkit-file-upload-button {
    font: inherit;
    -webkit-appearance: button
}

.description-rich-text output {
    display: inline-block
}

.description-rich-text summary {
    display: list-item;
    cursor: pointer
}

.description-rich-text template {
    display: none
}

.description-rich-text [hidden] {
    display: none !important
}

.description-rich-text .container {
    width: 100%;
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto
}

@media(min-width: 576px) {
    .description-rich-text .container {
        max-width: 540px
    }
}

@media(min-width: 768px) {
    .description-rich-text .container {
        max-width: 720px
    }
}

@media(min-width: 992px) {
    .description-rich-text .container {
        max-width: 960px
    }
}

@media(min-width: 1200px) {
    .description-rich-text .container {
        max-width: 1140px
    }
}

.description-rich-text .container-fluid,
.description-rich-text .container-lg,
.description-rich-text .container-md,
.description-rich-text .container-sm,
.description-rich-text .container-xl {
    width: 100%;
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto
}

@media(min-width: 576px) {

    .description-rich-text .container,
    .description-rich-text .container-sm {
        max-width: 540px
    }
}

@media(min-width: 768px) {

    .description-rich-text .container,
    .description-rich-text .container-md,
    .description-rich-text .container-sm {
        max-width: 720px
    }
}

@media(min-width: 992px) {

    .description-rich-text .container,
    .description-rich-text .container-lg,
    .description-rich-text .container-md,
    .description-rich-text .container-sm {
        max-width: 960px
    }
}

@media(min-width: 1200px) {

    .description-rich-text .container,
    .description-rich-text .container-lg,
    .description-rich-text .container-md,
    .description-rich-text .container-sm,
    .description-rich-text .container-xl {
        max-width: 1140px
    }
}

.description-rich-text .row {
    display: -webkit-flex;
    display: -moz-box;
    display: flex;
    -webkit-flex-wrap: wrap;
    flex-wrap: wrap;
    margin-right: -15px;
    margin-left: -15px
}

.description-rich-text .no-gutters {
    margin-right: 0;
    margin-left: 0
}

.description-rich-text .no-gutters>.col,
.description-rich-text .no-gutters>[class*=col-] {
    padding-right: 0;
    padding-left: 0
}

.description-rich-text .col,
.description-rich-text .col-1,
.description-rich-text .col-2,
.description-rich-text .col-3,
.description-rich-text .col-4,
.description-rich-text .col-5,
.description-rich-text .col-6,
.description-rich-text .col-7,
.description-rich-text .col-8,
.description-rich-text .col-9,
.description-rich-text .col-10,
.description-rich-text .col-11,
.description-rich-text .col-12,
.description-rich-text .col-auto,
.description-rich-text .col-lg,
.description-rich-text .col-lg-1,
.description-rich-text .col-lg-2,
.description-rich-text .col-lg-3,
.description-rich-text .col-lg-4,
.description-rich-text .col-lg-5,
.description-rich-text .col-lg-6,
.description-rich-text .col-lg-7,
.description-rich-text .col-lg-8,
.description-rich-text .col-lg-9,
.description-rich-text .col-lg-10,
.description-rich-text .col-lg-11,
.description-rich-text .col-lg-12,
.description-rich-text .col-lg-auto,
.description-rich-text .col-md,
.description-rich-text .col-md-1,
.description-rich-text .col-md-2,
.description-rich-text .col-md-3,
.description-rich-text .col-md-4,
.description-rich-text .col-md-5,
.description-rich-text .col-md-6,
.description-rich-text .col-md-7,
.description-rich-text .col-md-8,
.description-rich-text .col-md-9,
.description-rich-text .col-md-10,
.description-rich-text .col-md-11,
.description-rich-text .col-md-12,
.description-rich-text .col-md-auto,
.description-rich-text .col-sm,
.description-rich-text .col-sm-1,
.description-rich-text .col-sm-2,
.description-rich-text .col-sm-3,
.description-rich-text .col-sm-4,
.description-rich-text .col-sm-5,
.description-rich-text .col-sm-6,
.description-rich-text .col-sm-7,
.description-rich-text .col-sm-8,
.description-rich-text .col-sm-9,
.description-rich-text .col-sm-10,
.description-rich-text .col-sm-11,
.description-rich-text .col-sm-12,
.description-rich-text .col-sm-auto,
.description-rich-text .col-xl,
.description-rich-text .col-xl-1,
.description-rich-text .col-xl-2,
.description-rich-text .col-xl-3,
.description-rich-text .col-xl-4,
.description-rich-text .col-xl-5,
.description-rich-text .col-xl-6,
.description-rich-text .col-xl-7,
.description-rich-text .col-xl-8,
.description-rich-text .col-xl-9,
.description-rich-text .col-xl-10,
.description-rich-text .col-xl-11,
.description-rich-text .col-xl-12,
.description-rich-text .col-xl-auto {
    position: relative;
    width: 100%;
    padding-right: 15px;
    padding-left: 15px
}

.description-rich-text .col {
    -webkit-flex-basis: 0;
    flex-basis: 0;
    -webkit-flex-grow: 1;
    -moz-box-flex: 1;
    flex-grow: 1;
    min-width: 0;
    max-width: 100%
}

.description-rich-text .row-cols-1>* {
    -webkit-flex: 0 0 100%;
    -moz-box-flex: 0;
    flex: 0 0 100%;
    max-width: 100%
}

.description-rich-text .row-cols-2>* {
    -webkit-flex: 0 0 50%;
    -moz-box-flex: 0;
    flex: 0 0 50%;
    max-width: 50%
}

.description-rich-text .row-cols-3>* {
    -webkit-flex: 0 0 33.3333333333%;
    -moz-box-flex: 0;
    flex: 0 0 33.3333333333%;
    max-width: 33.3333333333%
}

.description-rich-text .row-cols-4>* {
    -webkit-flex: 0 0 25%;
    -moz-box-flex: 0;
    flex: 0 0 25%;
    max-width: 25%
}

.description-rich-text .row-cols-5>* {
    -webkit-flex: 0 0 20%;
    -moz-box-flex: 0;
    flex: 0 0 20%;
    max-width: 20%
}

.description-rich-text .row-cols-6>* {
    -webkit-flex: 0 0 16.6666666667%;
    -moz-box-flex: 0;
    flex: 0 0 16.6666666667%;
    max-width: 16.6666666667%
}

.description-rich-text .col-auto {
    -webkit-flex: 0 0 auto;
    -moz-box-flex: 0;
    flex: 0 0 auto;
    width: auto;
    max-width: 100%
}

.description-rich-text .col-1 {
    -webkit-flex: 0 0 8.3333333333%;
    -moz-box-flex: 0;
    flex: 0 0 8.3333333333%;
    max-width: 8.3333333333%
}

.description-rich-text .col-2 {
    -webkit-flex: 0 0 16.6666666667%;
    -moz-box-flex: 0;
    flex: 0 0 16.6666666667%;
    max-width: 16.6666666667%
}

.description-rich-text .col-3 {
    -webkit-flex: 0 0 25%;
    -moz-box-flex: 0;
    flex: 0 0 25%;
    max-width: 25%
}

.description-rich-text .col-4 {
    -webkit-flex: 0 0 33.3333333333%;
    -moz-box-flex: 0;
    flex: 0 0 33.3333333333%;
    max-width: 33.3333333333%
}

.description-rich-text .col-5 {
    -webkit-flex: 0 0 41.6666666667%;
    -moz-box-flex: 0;
    flex: 0 0 41.6666666667%;
    max-width: 41.6666666667%
}

.description-rich-text .col-6 {
    -webkit-flex: 0 0 50%;
    -moz-box-flex: 0;
    flex: 0 0 50%;
    max-width: 50%
}

.description-rich-text .col-7 {
    -webkit-flex: 0 0 58.3333333333%;
    -moz-box-flex: 0;
    flex: 0 0 58.3333333333%;
    max-width: 58.3333333333%
}

.description-rich-text .col-8 {
    -webkit-flex: 0 0 66.6666666667%;
    -moz-box-flex: 0;
    flex: 0 0 66.6666666667%;
    max-width: 66.6666666667%
}

.description-rich-text .col-9 {
    -webkit-flex: 0 0 75%;
    -moz-box-flex: 0;
    flex: 0 0 75%;
    max-width: 75%
}

.description-rich-text .col-10 {
    -webkit-flex: 0 0 83.3333333333%;
    -moz-box-flex: 0;
    flex: 0 0 83.3333333333%;
    max-width: 83.3333333333%
}

.description-rich-text .col-11 {
    -webkit-flex: 0 0 91.6666666667%;
    -moz-box-flex: 0;
    flex: 0 0 91.6666666667%;
    max-width: 91.6666666667%
}

.description-rich-text .col-12 {
    -webkit-flex: 0 0 100%;
    -moz-box-flex: 0;
    flex: 0 0 100%;
    max-width: 100%
}

@media(min-width: 576px) {
    .description-rich-text .col-sm {
        -webkit-flex-basis: 0;
        flex-basis: 0;
        -webkit-flex-grow: 1;
        -moz-box-flex: 1;
        flex-grow: 1;
        min-width: 0;
        max-width: 100%
    }

    .description-rich-text .row-cols-sm-1>* {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }

    .description-rich-text .row-cols-sm-2>* {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .row-cols-sm-3>* {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .row-cols-sm-4>* {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .row-cols-sm-5>* {
        -webkit-flex: 0 0 20%;
        -moz-box-flex: 0;
        flex: 0 0 20%;
        max-width: 20%
    }

    .description-rich-text .row-cols-sm-6>* {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-sm-auto {
        -webkit-flex: 0 0 auto;
        -moz-box-flex: 0;
        flex: 0 0 auto;
        width: auto;
        max-width: 100%
    }

    .description-rich-text .col-sm-1 {
        -webkit-flex: 0 0 8.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 8.3333333333%;
        max-width: 8.3333333333%
    }

    .description-rich-text .col-sm-2 {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-sm-3 {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .col-sm-4 {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .col-sm-5 {
        -webkit-flex: 0 0 41.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 41.6666666667%;
        max-width: 41.6666666667%
    }

    .description-rich-text .col-sm-6 {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .col-sm-7 {
        -webkit-flex: 0 0 58.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 58.3333333333%;
        max-width: 58.3333333333%
    }

    .description-rich-text .col-sm-8 {
        -webkit-flex: 0 0 66.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 66.6666666667%;
        max-width: 66.6666666667%
    }

    .description-rich-text .col-sm-9 {
        -webkit-flex: 0 0 75%;
        -moz-box-flex: 0;
        flex: 0 0 75%;
        max-width: 75%
    }

    .description-rich-text .col-sm-10 {
        -webkit-flex: 0 0 83.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 83.3333333333%;
        max-width: 83.3333333333%
    }

    .description-rich-text .col-sm-11 {
        -webkit-flex: 0 0 91.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 91.6666666667%;
        max-width: 91.6666666667%
    }

    .description-rich-text .col-sm-12 {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }
}

@media(min-width: 768px) {
    .description-rich-text .col-md {
        -webkit-flex-basis: 0;
        flex-basis: 0;
        -webkit-flex-grow: 1;
        -moz-box-flex: 1;
        flex-grow: 1;
        min-width: 0;
        max-width: 100%
    }

    .description-rich-text .row-cols-md-1>* {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }

    .description-rich-text .row-cols-md-2>* {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .row-cols-md-3>* {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .row-cols-md-4>* {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .row-cols-md-5>* {
        -webkit-flex: 0 0 20%;
        -moz-box-flex: 0;
        flex: 0 0 20%;
        max-width: 20%
    }

    .description-rich-text .row-cols-md-6>* {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-md-auto {
        -webkit-flex: 0 0 auto;
        -moz-box-flex: 0;
        flex: 0 0 auto;
        width: auto;
        max-width: 100%
    }

    .description-rich-text .col-md-1 {
        -webkit-flex: 0 0 8.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 8.3333333333%;
        max-width: 8.3333333333%
    }

    .description-rich-text .col-md-2 {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-md-3 {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .col-md-4 {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .col-md-5 {
        -webkit-flex: 0 0 41.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 41.6666666667%;
        max-width: 41.6666666667%
    }

    .description-rich-text .col-md-6 {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .col-md-7 {
        -webkit-flex: 0 0 58.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 58.3333333333%;
        max-width: 58.3333333333%
    }

    .description-rich-text .col-md-8 {
        -webkit-flex: 0 0 66.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 66.6666666667%;
        max-width: 66.6666666667%
    }

    .description-rich-text .col-md-9 {
        -webkit-flex: 0 0 75%;
        -moz-box-flex: 0;
        flex: 0 0 75%;
        max-width: 75%
    }

    .description-rich-text .col-md-10 {
        -webkit-flex: 0 0 83.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 83.3333333333%;
        max-width: 83.3333333333%
    }

    .description-rich-text .col-md-11 {
        -webkit-flex: 0 0 91.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 91.6666666667%;
        max-width: 91.6666666667%
    }

    .description-rich-text .col-md-12 {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }
}

@media(min-width: 992px) {
    .description-rich-text .col-lg {
        -webkit-flex-basis: 0;
        flex-basis: 0;
        -webkit-flex-grow: 1;
        -moz-box-flex: 1;
        flex-grow: 1;
        min-width: 0;
        max-width: 100%
    }

    .description-rich-text .row-cols-lg-1>* {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }

    .description-rich-text .row-cols-lg-2>* {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .row-cols-lg-3>* {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .row-cols-lg-4>* {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .row-cols-lg-5>* {
        -webkit-flex: 0 0 20%;
        -moz-box-flex: 0;
        flex: 0 0 20%;
        max-width: 20%
    }

    .description-rich-text .row-cols-lg-6>* {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-lg-auto {
        -webkit-flex: 0 0 auto;
        -moz-box-flex: 0;
        flex: 0 0 auto;
        width: auto;
        max-width: 100%
    }

    .description-rich-text .col-lg-1 {
        -webkit-flex: 0 0 8.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 8.3333333333%;
        max-width: 8.3333333333%
    }

    .description-rich-text .col-lg-2 {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-lg-3 {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .col-lg-4 {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .col-lg-5 {
        -webkit-flex: 0 0 41.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 41.6666666667%;
        max-width: 41.6666666667%
    }

    .description-rich-text .col-lg-6 {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .col-lg-7 {
        -webkit-flex: 0 0 58.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 58.3333333333%;
        max-width: 58.3333333333%
    }

    .description-rich-text .col-lg-8 {
        -webkit-flex: 0 0 66.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 66.6666666667%;
        max-width: 66.6666666667%
    }

    .description-rich-text .col-lg-9 {
        -webkit-flex: 0 0 75%;
        -moz-box-flex: 0;
        flex: 0 0 75%;
        max-width: 75%
    }

    .description-rich-text .col-lg-10 {
        -webkit-flex: 0 0 83.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 83.3333333333%;
        max-width: 83.3333333333%
    }

    .description-rich-text .col-lg-11 {
        -webkit-flex: 0 0 91.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 91.6666666667%;
        max-width: 91.6666666667%
    }

    .description-rich-text .col-lg-12 {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }
}

@media(min-width: 1200px) {
    .description-rich-text .col-xl {
        -webkit-flex-basis: 0;
        flex-basis: 0;
        -webkit-flex-grow: 1;
        -moz-box-flex: 1;
        flex-grow: 1;
        min-width: 0;
        max-width: 100%
    }

    .description-rich-text .row-cols-xl-1>* {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }

    .description-rich-text .row-cols-xl-2>* {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .row-cols-xl-3>* {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .row-cols-xl-4>* {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .row-cols-xl-5>* {
        -webkit-flex: 0 0 20%;
        -moz-box-flex: 0;
        flex: 0 0 20%;
        max-width: 20%
    }

    .description-rich-text .row-cols-xl-6>* {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-xl-auto {
        -webkit-flex: 0 0 auto;
        -moz-box-flex: 0;
        flex: 0 0 auto;
        width: auto;
        max-width: 100%
    }

    .description-rich-text .col-xl-1 {
        -webkit-flex: 0 0 8.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 8.3333333333%;
        max-width: 8.3333333333%
    }

    .description-rich-text .col-xl-2 {
        -webkit-flex: 0 0 16.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 16.6666666667%;
        max-width: 16.6666666667%
    }

    .description-rich-text .col-xl-3 {
        -webkit-flex: 0 0 25%;
        -moz-box-flex: 0;
        flex: 0 0 25%;
        max-width: 25%
    }

    .description-rich-text .col-xl-4 {
        -webkit-flex: 0 0 33.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 33.3333333333%;
        max-width: 33.3333333333%
    }

    .description-rich-text .col-xl-5 {
        -webkit-flex: 0 0 41.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 41.6666666667%;
        max-width: 41.6666666667%
    }

    .description-rich-text .col-xl-6 {
        -webkit-flex: 0 0 50%;
        -moz-box-flex: 0;
        flex: 0 0 50%;
        max-width: 50%
    }

    .description-rich-text .col-xl-7 {
        -webkit-flex: 0 0 58.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 58.3333333333%;
        max-width: 58.3333333333%
    }

    .description-rich-text .col-xl-8 {
        -webkit-flex: 0 0 66.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 66.6666666667%;
        max-width: 66.6666666667%
    }

    .description-rich-text .col-xl-9 {
        -webkit-flex: 0 0 75%;
        -moz-box-flex: 0;
        flex: 0 0 75%;
        max-width: 75%
    }

    .description-rich-text .col-xl-10 {
        -webkit-flex: 0 0 83.3333333333%;
        -moz-box-flex: 0;
        flex: 0 0 83.3333333333%;
        max-width: 83.3333333333%
    }

    .description-rich-text .col-xl-11 {
        -webkit-flex: 0 0 91.6666666667%;
        -moz-box-flex: 0;
        flex: 0 0 91.6666666667%;
        max-width: 91.6666666667%
    }

    .description-rich-text .col-xl-12 {
        -webkit-flex: 0 0 100%;
        -moz-box-flex: 0;
        flex: 0 0 100%;
        max-width: 100%
    }
}

.description-rich-text img {
    max-width: 100%
}

.description-rich-text .container-fluid {
    max-width: 1070px;
    margin: 0 auto;
    padding-top: 1rem
}

body {
    overflow-x: hidden;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale
}

*,
html {
    font-family: Roboto
}

.page--loading {
    position: relative
}

.page--loading .MuiBackdrop-root {
    position: absolute;
    z-index: 1000;
    -webkit-align-items: start;
    -moz-box-align: start;
    align-items: start;
    padding-top: 50px
}

.cms-content img {
    max-width: 100%
}

.MuiAutocomplete-groupLabel {
    line-height: 24px !important
}

a {
    color: inherit
}

.input-range__slider {
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    background: #3f51b5;
    border: 1px solid #3f51b5;
    border-radius: 100%;
    cursor: pointer;
    display: block;
    height: 1rem;
    margin-left: -.5rem;
    margin-top: -.65rem;
    outline: none;
    position: absolute;
    top: 50%;
    -webkit-transition: box-shadow .3s ease-out, -webkit-transform .3s ease-out;
    transition: box-shadow .3s ease-out, -webkit-transform .3s ease-out;
    transition: transform .3s ease-out, box-shadow .3s ease-out;
    transition: transform .3s ease-out, box-shadow .3s ease-out, -webkit-transform .3s ease-out;
    width: 1rem
}

.input-range__slider:active {
    -webkit-transform: scale(1.3);
    transform: scale(1.3)
}

.input-range__slider:focus {
    box-shadow: 0 0 0 5px rgba(63, 81, 181, .2)
}

.input-range--disabled .input-range__slider {
    background: #ccc;
    border: 1px solid #ccc;
    box-shadow: none;
    -webkit-transform: none;
    transform: none
}

.input-range__slider-container {
    -webkit-transition: left .3s ease-out;
    transition: left .3s ease-out
}

.input-range__label {
    color: #aaa;
    font-family: Helvetica Neue, san-serif;
    font-size: .8rem;
    -webkit-transform: translateZ(0);
    transform: translateZ(0);
    white-space: nowrap
}

.input-range__label--max,
.input-range__label--min {
    bottom: -1.4rem;
    position: absolute
}

.input-range__label--min {
    left: 0
}

.input-range__label--max {
    right: 0
}

.input-range__label--value {
    position: absolute;
    top: -1.8rem
}

.input-range__label-container {
    left: -50%;
    position: relative
}

.input-range__label--max .input-range__label-container {
    left: 50%
}

.input-range__track {
    background: #eee;
    border-radius: .3rem;
    cursor: pointer;
    display: block;
    height: .3rem;
    position: relative;
    -webkit-transition: left .3s ease-out, width .3s ease-out;
    transition: left .3s ease-out, width .3s ease-out
}

.input-range--disabled .input-range__track {
    background: #eee
}

.input-range__track--background {
    left: 0;
    margin-top: -.15rem;
    position: absolute;
    right: 0;
    top: 50%
}

.input-range__track--active {
    background: #3f51b5
}

.input-range {
    height: 1rem;
    position: relative;
    width: 100%
}

.alice-carousel .animated {
    -webkit-animation-fill-mode: both;
    animation-fill-mode: both
}

.alice-carousel .animated-out {
    z-index: 1
}

.alice-carousel .fadeOut {
    -webkit-animation-name: fadeOut;
    animation-name: fadeOut
}

@-webkit-keyframes fadeOut {
    0% {
        opacity: 1
    }

    to {
        opacity: 0;
        visibility: hidden
    }
}

@keyframes fadeOut {
    0% {
        opacity: 1
    }

    to {
        opacity: 0;
        visibility: hidden
    }
}

.alice-carousel {
    position: relative;
    width: 100%;
    margin: auto;
    direction: ltr
}

.alice-carousel__wrapper {
    overflow-x: hidden;
    overflow-y: hidden;
    height: auto
}

.alice-carousel__stage,
.alice-carousel__wrapper {
    position: relative;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    width: 100%
}

.alice-carousel__stage {
    height: 100%;
    margin: 0;
    padding: 0;
    white-space: nowrap;
    transform-style: flat;
    -webkit-transform-style: flat;
    backface-visibility: hidden;
    -webkit-backface-visibility: hidden
}

.alice-carousel__stage-item {
    position: relative;
    display: inline-block;
    padding: 0;
    margin: 0;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    width: 100%;
    height: 100%;
    vertical-align: top;
    white-space: normal;
    line-height: 0
}

.alice-carousel__stage-item * {
    line-height: normal
}

.alice-carousel__stage-item.__hidden {
    opacity: 0;
    overflow: hidden
}

.alice-carousel__next-btn,
.alice-carousel__prev-btn {
    display: inline-block;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
    width: 50%;
    padding: 10px 5px
}

.alice-carousel__next-btn [data-area]:after,
.alice-carousel__prev-btn [data-area]:after {
    position: relative;
    content: attr(data-area);
    text-transform: capitalize
}

.alice-carousel__prev-btn {
    text-align: right
}

.alice-carousel__next-btn-item,
.alice-carousel__prev-btn-item {
    display: inline-block;
    cursor: pointer;
    padding: 5px;
    margin: 0;
    color: #465798
}

.alice-carousel__next-btn-item:hover,
.alice-carousel__prev-btn-item:hover {
    color: darkred
}

.alice-carousel__next-btn-item.__inactive,
.alice-carousel__prev-btn-item.__inactive {
    opacity: .4;
    pointer-events: none
}

.alice-carousel__play-btn {
    position: absolute;
    top: 30px;
    left: 20px;
    display: inline-block
}

.alice-carousel__play-btn:hover {
    cursor: pointer
}

.alice-carousel__play-btn-wrapper {
    position: relative;
    width: 32px;
    height: 32px;
    padding: 10px;
    border-radius: 50%;
    background-color: #fff
}

.alice-carousel__play-btn-item {
    position: absolute;
    width: 32px;
    height: 32px;
    cursor: pointer;
    border: 0;
    outline: none;
    background: 0 0
}

.alice-carousel__play-btn-item:after,
.alice-carousel__play-btn-item:before {
    position: absolute;
    pointer-events: none;
    display: block;
    width: 0;
    height: 0;
    content: "";
    -webkit-transition: all .4s linear;
    transition: all .4s linear;
    border-color: transparent transparent transparent #465798;
    border-style: solid;
    border-width: 8px 0 8px 15px
}

.alice-carousel__play-btn-item:before {
    left: 5px;
    height: 14px
}

.alice-carousel__play-btn-item:after {
    top: 7px;
    left: 18px
}

.alice-carousel__play-btn-item.__pause:after,
.alice-carousel__play-btn-item.__pause:before {
    height: 30px;
    border-width: 0 0 0 10px
}

.alice-carousel__play-btn-item.__pause:after {
    top: 0;
    left: 18px
}

.alice-carousel__dots {
    margin: 30px 3px 5px;
    padding: 0;
    list-style: none;
    text-align: center
}

.alice-carousel__dots>li {
    display: inline-block
}

.alice-carousel__dots-item:not(.__custom) {
    width: 8px;
    height: 8px;
    cursor: pointer;
    border-radius: 50%;
    background-color: #e0e4fb
}

.alice-carousel__dots-item:not(.__custom):not(:last-child) {
    margin-right: 20px
}

.alice-carousel__dots-item:not(.__custom).__active,
.alice-carousel__dots-item:not(.__custom):hover {
    background-color: #6e7ebc
}

.alice-carousel__slide-info {
    position: absolute;
    top: 20px;
    right: 20px;
    display: inline-block;
    padding: 5px 10px;
    color: #465798;
    border-radius: 5px;
    background-color: rgba(224, 228, 251, .6)
}

.alice-carousel__slide-info-item {
    vertical-align: middle;
    line-height: 0
}

.jss224 {
    width: auto !important;
    background: transparent;
    text-align: center;
    text-decoration: none;
    border-radius: 5px;
}

.MuiGrid-spacing-xs-3>.MuiGrid-item {
    padding: 12px;
}

.MuiGrid-grid-sm-6 {
    flex-grow: 0;
    max-width: 50%;
}

.MuiGrid-item {
    box-sizing: border-box;
}</style>
