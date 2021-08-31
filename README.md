# TweetFilteredAPI ReadMe File
## The project for the API of tweetfiltered - you can find the tweetfiltered app structure at [this repo](https://github.com/vilkata41/tweetfiltered)

The main purpose of this project is to access certain **twitter posts** that the account [**tweetfiltered**](https://twitter.com/tweetfiltered) is mentioned in.<br><br>
Then, the posts' information *(such as author, text and media)* is stored into a Post class that is later accessed by the API layer.<br><br>
Our API is made with the help of [Spring Boot for Java](https://spring.io/projects/spring-boot). It is layered in such way that we have the main "pillar code" in a separate class. This code is then accessed by our service layer which is then accessed by the controller layer (*such layered structure may be unnecessary for smaller projects like this one but are rather useful for larger ones*).<br><br>
The application is then executed on a localhost:8080. For certain pages of the API we have assigned different methods *(such as getPosts() and getRecent())* that are mapped to different pages - **getPosts()** is mapped to the page ```localhost:8080/api/tweetfilteredV1/all``` and **getRecent()** - to the page ``localhost:8080/api/tweetfiltered/recent``. <br><br>
Additionally, we have deployed the finished product of the API to the [Google Cloud Platform](https://cloud.google.com/gcp) with the help of [Google AppEngine](https://cloud.google.com/appengine).<br><br>
Check out the all posts page [HERE](https://tweetfilteredrestapi.ey.r.appspot.com/api/tweetfilteredV1/all).<br>
And the recent post page [HERE](https://tweetfilteredrestapi.ey.r.appspot.com/api/tweetfilteredV1/recent).<br><br>
This stage is the first of two for the whole TweetFiltered Project. The second step involves working with the media on the already accessed posts on twitter with the help of this project.<br><br>
You can check the second stage *(applying the filters)* [in THIS repo](https://github.com/vilkata41/filterApplication).
