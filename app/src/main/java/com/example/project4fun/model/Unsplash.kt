package com.example.project4fun.model

data class Unsplash(
    var id:String,
    var blur_hash:String,
    var description:String,
    var likes:Int,
    var user:user,
    var urls:urls,
    var links:links,
    var location:location
)
data class urls(
    var raw:String,
    var full:String,
    var regular:String,
    var small:String,
    var thumb:String
)
data class links(
    var self:String,
    var html:String,
    var download:String,
    var download_location:String
)
data class user(
    var id:String,
    var username:String,
    var name:String,
    var portfolio_url:String,
    var profile_image:Map<String,String>,
    var total_likes:String,
    var total_photos:String,
    var bio:String,
    var location:String,
)
data class location(
    var title:String,
    var name:String,
    var country:String,
    var city:String,
    var views:Int,
    var downloads:Int,
    var position:position
    )
data class position(
    var latitude:String,
    var longtitude:String
)
