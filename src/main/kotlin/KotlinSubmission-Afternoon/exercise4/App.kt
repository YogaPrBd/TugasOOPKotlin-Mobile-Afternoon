package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.NumberFormatException

fun main() {
    var result: String = ""

    println("Masukkan Skor disini: ")
    val scoreInput = readLine()

    try {
        if (scoreInput != null) {
            val score = scoreInput.toInt()
            if (score > 100 || score < 0) result = "Invalid Score"
            else if (score >= 90) result = "Selamat! Anda mendapatkan nilai A."
            else if (score in 80..89) result = "Anda mendapatkan nilai B."
            else if (score in 70..79) result = "Anda mendapatkan nilai C."
            else if (score in 60..69) result = "Anda mendapatkan nilai D."
            else if (score < 60) result = "Anda mendapatkan nilai E."
        }
    }catch (e:NumberFormatException){
        result = "Input tidak valid, Mohon masukkan angka"
    }

    println(result)
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
