var postView = Vue.component("PostView", {
    template: `
        <div>
            <ul v-for="post in posts">
                <li>
                    {{post.id}}
                    {{post.name}}
                    {{post.content}}
                </li>
            </ul>
            <button v-on:click="goPostCreate">포스트 작성</button>
        </div>
    `,
    data() {
        return {
            posts: []
        }
    },
    mounted: function() {
        const BASE_URL = "http://localhost:8080/api";
        axios.get(BASE_URL + "/post").then(response => {
            console.log(response.data);
            this.posts = response.data;
        })
    },
    methods: {
        goPostCreate: function() {
            this.$router.push("/post/create");
        }
    }
})