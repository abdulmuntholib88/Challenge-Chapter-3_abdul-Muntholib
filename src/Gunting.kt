
fun main() {


    println("============================")
    println("= GAME SUIT TERMIAL VERSION =")
    println("============================")

//masukan nama pemain
    print("Masukan Nama Permain Ke-1 :")
    var nama1 = readLine().toString()

    print("Masukan Nama Permaian Ke-2 :")
    var nama2 = readLine().toString()

//masukan pilihan
    println("Masukan Pilihan Pemain Ke-1  (kertas,batu,gunting)")
    print("Input :")
    val player1 = readLine().toString()

    println("Masukan Pilihan Pemain Ke-2  (kertas,batu,gunting)")
    print("Input :")
    val player2 = readLine().toString()




    // Menetukan peraturan
    if (player1!!.toLowerCase().equals(player2.toLowerCase())) {
        println("DRAW $player1 dengan $player2")
    } else if (player1 == "gunting" && player2 == "batu") {
        print(" Selamat Pemain : $nama2 Menang dari pemain bernama $nama1")
    } else if (player1 == "gunting" && player2 == "kertas") {
        print("Selamat Pemain : $nama1 Menang dari pemain bernama $nama2")
    }else if  (player1 == "kertas" && player2 == "batu") {
        print("Selamat Pemain : $nama2 Menang dari pemain bernama $nama1")
    }else if  (player1 == "batu" && player2 == "kertas") {
        print("Selamat Pemain : $nama1 Menang dari pemain bernama $nama2")
    }else if (player1 == "kertas" && player2 == "gunting") {
        print("Selamat Pemain : $nama2 Menang dari pemain bernama $nama1")
    }
}