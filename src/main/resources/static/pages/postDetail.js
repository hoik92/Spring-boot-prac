var postDetailView = Vue.component("PostDetail", {
    template: `
    <div>
        id : {{post.id}}
        name : {{post.name}}
        content : {{post.content}}
    </div>
    `,
    data() {
        return {
            post: {}
        }
    },
    methods: {
        getPost: function() {
            this.id = this.$route.params.id;
            var that = this;
            axios.get('http://localhost:8080/api/post/' + that.id)
                .then(response => {
                    console.log(response);
                    that.post = response.data;
                })
        }
    },
    mounted: function() {
        this.getPost();
    }
})