<template>
    <a-layout-header class="header">
        <div class="logo" >
        </div>
        <a-menu
                theme="dark"
                mode="horizontal"
                :default-selected-keys="['2']"
                :style="{ lineHeight: '64px' }"
        >
            <a-menu-item key="/">
                <router-link to="/">首页</router-link>
            </a-menu-item>
            <a-menu-item key="/admin/admin-ebook">
                <router-link to="/admin/admin-ebook">电子书管理</router-link>
            </a-menu-item>
            <a-menu-item key="/admin/admin-category">
                <router-link to="/admin/admin-category">分类管理</router-link>
            </a-menu-item>
            <a-menu-item key="about">
                <router-link to="/about">关于</router-link>
            </a-menu-item>
        </a-menu>
    </a-layout-header>
</template>

<script lang="ts">
    import { defineComponent } from 'vue';

    export default defineComponent({
        name: 'the-header'
    });
</script>