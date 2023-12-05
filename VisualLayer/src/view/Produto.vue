<script setup>
import { ref,onMounted} from 'vue';
import axios from 'axios'
import PaginaProduto from '../components/PaginaProduto.vue';
let props = defineProps(['id', 'Carrinho'])
let produto = ref();
let carrinho = ref([])
window.onload = function () {
    //for (let index = 0; index < produtos.value.length; index++) {
    //    if(produtos.value[index].id===ID)
    //    {
    //        produto = ref(produtos.value[index]);
    //        return;
    //    }
    //    
    //}
    carrinho = localStorage.getItem(carrinho);
};

onMounted(() => {
  axios.get('http://localhost:8080/Product/'+props.id)
    .then(response => {
        produto.value = response.data
    })

}
)


</script>
<template>
    <div>
        <div>
            <PaginaProduto v-if="produto" :id="produto.id" :valor="produto.valor" :marca="produto.marca" :dispo="produto.disponibilidade" :descricao="produto.descricao" :nome="produto.nome" :imagens="produto.imagens"></PaginaProduto>
        </div>
    </div>
</template>
<style scoped>
</style>
