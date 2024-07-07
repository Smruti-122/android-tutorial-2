fun main() {
    val pal = isPalindrome("ababa")
    if(pal){
        println("String is palindrome")
    }
    else{
        println("String is not palindrome")
    }
}
fun isPalindrome(s: String): Boolean{
    var length = s.length
    var i: Int
    for(i in 0 until length/2 ){
        if(s[i] != s[length-i-1]){
            return false
        }
    }
    return true
}
