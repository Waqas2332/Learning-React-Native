fun main(){
    val password = "ABC"
    val textToShow = when{
        password == "" -> "Password can't be empty"
        password.length < 7 -> "Password should be at least of 7 characters"
        else -> "the password is ok"
    }

    println(textToShow)
}