package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val fistName: String = "Yoga"
    val lastName: String = "Pradana Budiyanto"
    val age: Int = 21
    val single: Boolean = true
    val profile: String

    if (single) profile= "Nama saya $fistName $lastName, Usia saya $age tahun, dan saya single"
    else profile= "Nama saya $fistName $lastName, Usia saya $age tahun, dan saya tidak single"
    println(profile)
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return "Saya dari grup $groupId, dengan anggota $groupMember, kami dari sesi $session"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    return listOf("Yoga, Rizky, Afif, Ardini, Steffany, Alif, Rafi, Dedi, Aland, Irfan")
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Ka Jovian", "Ka Imam")
    val countOfGroup = arrayOf<String>("Yoga", "Rizky", "Afif", "Ardini", "Steffany", "Alif", "Rafi", "Dedi", "Aland", "Irfan")

    val mentorCount: Int = mentor.size
    val memberCount: Int = countOfGroup.size
    val totalCount: Int = memberCount + mentorCount

    return totalCount
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("UNLIMITED INNOVATION", listOf(myTeam), "B Afternoon")

}