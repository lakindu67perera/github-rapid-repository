object CaesarCipher {

  def encrypt(normText: String, shift: Int): String = {
    val encryptedText = normText.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
    encryptedText
  }

  def decrypt(encryptedText: String, shift: Int): String = {
    val decryptedText = encryptedText.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base - shift + 26) % 26 + base).toChar
      } else {
        char
      }
    }
    decryptedText
  }

  def main(args: Array[String]): Unit = {
    val shift = 2 
    val normText = "hi lakindz" 

    val encryptedText = encrypt(normText, shift)
    println(s"Encrypted Text: $encryptedText")

    val decryptedText = decrypt(encryptedText, shift)
    println(s"Decrypted Text: $decryptedText")}
}