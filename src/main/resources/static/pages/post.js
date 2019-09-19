var postView = Vue.component("PostView", {
    template: `
        <div>
            <ul v-for="post in posts">
                <li>
                    {{post.id}}
                    {{post.name}}
                    {{post.content}}
                    <button v-on:click="postDelete(post.id)">삭제</button>
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
        this.getPost();
    },
    methods: {
        goPostCreate: function() {
            this.$router.push("/post/create");
        },
        postDelete: function(postId) {
            axios.delete(`http://localhost:8080/api/post/${postId}`).then(res => {
                console.log('delete complete');
                this.getPost();
            })
        },
        getPost: function() {
            const BASE_URL = "http://localhost:8080/api";
            axios.get(BASE_URL + "/post").then(response => {
                console.log(response.data);
                this.posts = response.data;
            })
        }
    }
})