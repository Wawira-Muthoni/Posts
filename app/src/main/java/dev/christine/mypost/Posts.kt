package dev.christine.mypost


data class Posts(
    var userId:Int,
    var id:Int,
    var tittle:String,
    var body:String)


data class Comment(
    var postId:Int,
    var id :Int,
    var name:String,
    var email:String,
    var body:String)


