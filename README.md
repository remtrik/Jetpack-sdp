
# Jetpack-sdp

An sdp like UI scaling solution for Jetpack Compose framework

## How to use:
For now just drop the sdp.kt in your project
Then you can use it like this for example: 

modifier = Modifier.size(50.sdp())

And like this for texts:

fontSize = 30.ssp()

## Things to note:
* Like the original sdp it uses approximation in the math operations to improve performance (Although I dont think it speeds up anything with my bad implementation lol)

