object CaesarCypher{
    def encrypt(text: String, shift: Int) = {
        text.map( char =>
            if(char.isLetter){
                var startIndex = if (char.isUpper) 'A' else 'a' 
                ((char - startIndex + shift) % 26 + startIndex).toChar
            }else{
                char
            }
        )
    }

    def decrypt(text: String, shift: Int) = {
        text.map( char =>
            if(char.isLetter){
                var startIndex = if (char.isUpper) 'A' else 'a' 
                ((char - startIndex - shift + 26) % 26 + startIndex).toChar
            }else{
                char
            }
        )
    }

    def cypher(enc: ((String, Int) => String), dec: ((String, Int) => String)) = {
        print("Enter text :")
        var text = scala.io.StdIn.readLine().toString
        print("Enter shift amount :")
        var shift = scala.io.StdIn.readLine().toInt
        shift = if(shift >= 0 ) shift else shift*(-1)//making sure shift in positive

        println("your original text is : " + text)
        var encText = enc(text, shift)
        println("your encrypted text is : " + encText)
        var decText = dec(encText, shift)
        println("your decrypted text is : " + text)
    }

    def main(args: Array[String]) = {
        cypher(encrypt, decrypt);
    }
}