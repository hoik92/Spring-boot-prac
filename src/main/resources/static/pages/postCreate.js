var postCreateView = Vue.component("PostCreate", {
    template: `
        <div>
            이름 : <input v-model="name"/>
            내용 : <input v-model="content"/>
            <button v-on:click="createPost">작성</button>
            name : {{name}}
            content : {{content}}
        </div>
    `,
    data() {
        return {
            name: "",
            content: ""
        }
    },
    methods: {
        createPost: function() {
            var that = this;
            const body = {
                name: this.name,
                content: this.content
            };
            axios.post('http://localhost:8080/api/post', body, {
                headers: {
                    'Content-type': 'application/json'
                }
            }).then(reponse => {
                console.log('success');
                this.name = "";
                this.content = "";
                that.$router.push("/post");
            })
        }
    }
})