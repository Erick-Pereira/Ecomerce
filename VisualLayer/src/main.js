import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import Produto from './view/Produto.vue'
import Principal from './view/Principal.vue'
import Carrinho from './view/Carrinho.vue'

import { createRouter, createWebHistory} from 'vue-router'


const routes = [
    { path: '/', component: Principal },
    { path: '/Produto/:id', component: Produto,props:true},
    { path: '/Carrinho', component: Carrinho},
  ]
const router = createRouter({
    history: createWebHistory(),
    routes, 
})
export default router
createApp(App).use(router).mount('#app')