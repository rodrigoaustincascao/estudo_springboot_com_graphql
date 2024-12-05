# GraphqlServer

```bash
query{
    postById(id: xxxxxx){
        id
        content
        comments{
            id
            content
            postId
        }
    }
}
```
- Criar Comentario
```bash
mutation{
    createComment(
        content: "Conteúdo do comentário"
        postId: "xxxxxxxxxxxxx"
    ){
        id
        content
        postId
    }
}
```

- Criar Post
```bash
mutation{
    createPost(
        content: "Conteúdo do Post")
        {
            id,
            content
        }
}
```