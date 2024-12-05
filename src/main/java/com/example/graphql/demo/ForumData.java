package com.example.graphql.demo;

record Post(String id, String content) {

}

record Comment(String id, String content, String postId) {
}