var homeView = Vue.component("Home", {
    template: `
        <div>
            <h3>으어어어어어어어어어</h3>
            <button v-on:click="goPost">포스트</button>
        </div>
    `,
    methods: {
        goPost: function() {
            this.$router.push("/post")
        }
    }
})