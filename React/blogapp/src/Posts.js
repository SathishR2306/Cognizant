import React,{Component} from "react";

class Posts extends Component{

    constructor(props){
        super(props);

        this.state={
            posts:[]
        };
    }

    loadPosts(){

        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(res=>res.json())
            .then(data=>{

                this.setState({
                    posts:data.slice(0,10)
                });

            });

    }

    componentDidMount(){

        this.loadPosts();

    }

    componentDidCatch(error){

        alert(error);

    }

    render(){

        return(

            <div>

                <h1>Posts</h1>

                {

                    this.state.posts.map(post=>

                        <div key={post.id}>

                            <h3>{post.title}</h3>

                            <p>{post.body}</p>

                        </div>

                    )

                }

            </div>

        );

    }

}

export default Posts;