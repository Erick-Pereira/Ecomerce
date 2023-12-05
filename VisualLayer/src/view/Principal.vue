<script setup>
import { ref,computed,onMounted   } from 'vue'
import axios from 'axios'
import ComponenteProdutos from './../components/ComponenteProdutos.vue'
let produtos = ref([]);
let carrinho = ref([])

onMounted(() => {
    
  axios.get('http://localhost:8080/Product')
    .then(response => {
        produtos.value = response.data
    })
    if(produtos == null){
        location.reload(); 
    }
    let carro = JSON.parse(localStorage.getItem("Carrinho"));
    if(carro._value != null || carro._rawValue != null ){
        carro = [];
        localStorage.setItem("Carrinho", JSON.stringify(carro));
    }
}
)

window.onload = function () {
    carrinho =  JSON.parse(localStorage.getItem("Carrinho"));
};
let filtroProduto = ref('')
const produtosFiltrados = computed(() => {
  if (filtroProduto.value == '') {
    return produtos.value
  }
  return produtos.value.filter(n => {
    return n.nome.toLowerCase().match(filtroProduto.value.toLowerCase())
  })
})

</script>
<template>
    <div>
          <input placeholder="type something" id="filtroProduto" type="text" v-model="filtroProduto">
        </div>
        <div>
            <section class="jss532">
              <h2 class="MuiTypography-root jss526 MuiTypography-h5">Something</h2>

                <div class="MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3">
                    <ComponenteProdutos v-if="produtos" class="Products MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-6 MuiGrid-grid-md-4 MuiGrid-grid-lg-3 MuiGrid-grid-xl-2" v-for="(p) in produtosFiltrados" :key="p.nome" :ID="p.id" :Nome="p.nome"
                        :Valor="p.valor"
                        :Imagem="p.imagens[0].imagemUrl"></ComponenteProdutos>
                </div>
            </section>
        </div>
</template>
<style scoped>

.jss526 {
    position: center;
    text-align: center;
}
.jss532 {
    position: center;
    display: block;
  margin-left: auto;
  margin-right: auto;
  width: 70%;
    padding-top: 1rem;
}


*, *::before, *::after {
    box-sizing: inherit;
}
*, html {
    font-family: Roboto;
}
user agent stylesheet
section {
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
.Products {
    background: transparent;
    box-shadow: none;
    display: inline-grid;
    grid-template-columns: 100px 50px 40px 30px ;
}
.MuiGrid-container{
    width: 100%;
    display: flex;
    flex-wrap: wrap;
    box-sizing: border-box;
}
.MuiGrid-spacing-xs-3 {
    width: calc(100% + 24px);
    margin: -12px;
}

</style>
