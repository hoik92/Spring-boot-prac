const routes = [
    {
        name: "home",
        path: "/",
        component: homeView
    },
    {
        name: "post",
        path: "/post",
        component: postView
    },
    {
        name: "postCreate",
        path: "/post/create",
        component: postCreateView
    },
    {
        name: "postDetail",
        path: "/post/:id",
        component: postDetailView
    }
]