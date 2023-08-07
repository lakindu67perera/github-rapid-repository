object CaesarCipher {

  def encrypt(text: String, shift: Int): String = {
    val encryptedText = text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val shiftedChar = (char - base + shift) % 26
        val wrappedChar = (if (shiftedChar < 0) shiftedChar + 26 else shiftedChar) + base
        wrappedChar.toChar
      } else {
        char
      }
    }
    encryptedText
  }

  def decrypt(encryptedText: String, shift: Int): String = {
    encrypt(encryptedText, 26 - shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "hi i am lakindu"
    val shift = 2


    val encrypted = encrypt(plaintext, shift)
    println(s"Encrypted text: $encrypted")


    val decrypted = decrypt(encrypted, shift)
    println(s"Decrypted text: $decrypted")
  }
}
