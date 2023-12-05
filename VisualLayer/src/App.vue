<script setup>
import { ref } from 'vue'
import { RouterView } from 'vue-router';
</script>

<template>
  <header>
    <nav>
      <div class="navbar">
        <div>
          <router-link to="/" class="nav-item">Home</router-link> | <router-link to="/Carrinho"
            class="nav-item">Cart</router-link>
        </div>
        
      </div>
    </nav>
  </header>
  <RouterView>
  </RouterView>
</template>

<style scoped>
</style>
