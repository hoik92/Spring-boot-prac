Vue.use(VueRouter);

let router = new VueRouter({
    routes: routes
});

var app = new Vue({
    router
}).$mount('#app');