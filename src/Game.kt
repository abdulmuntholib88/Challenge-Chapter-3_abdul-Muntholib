
fun main() {


        println("============================")
        println("= GAME SUIT TERMIAL VERSION =")
        println("============================")
//masukan nama pemain
        print("Masukan Nama Permain Ke-1 : ")
        var player1 = readLine().toString()

        print("Masukan Nama Permaian Ke-2 : ")
        var player2 = readLine().toString()

//masukan pilihan
        println("Masukan Pilihan Pemain Ke-1  (Kertas,Batu,Gunting)")
        print("Input :")
        player1 = readLine().toString()

        println("Masukan Pilihan Pemain Ke-2  (Kertas,Batu,Gunting)")
        print("Input :")
        player2 = readLine().toString()

        var status = false


        // Menetukan peraturan
        if (player1.toLowerCase().equals(player2.toLowerCase())) {
                println("DRAW $player1 dengan $player2")
        } else if (player1.toLowerCase().equals("gunting")) {
                if (player2.toLowerCase().equals("batu")) {
                        status = false
                        hasil(status, player1, player2)
                } else {
                        status = true
                        hasil(status, player1, player2)
                }
        } else if (player1.toLowerCase().equals("gunting")) {
                if (player2.toLowerCase().equals("kertas")) {
                        status = true
                        hasil(status, player1, player2)
                } else {
                        status = false
                        hasil(status, player1, player2)
                }
        } else if (player1.toLowerCase().equals("kertas")) {
                if (player2.toLowerCase().equals("batu")) {
                        status = true
                        hasil(status, player1, player2)
                } else {
                        status = false
                        hasil(status, player1, player2)
                }
        } else if (player1.toLowerCase().equals("batu")) {
                if (player2.toLowerCase().equals("kertas")) {
                        status = false
                        hasil(status, player1, player2)
                } else {
                        status = true
                        hasil(status, player1, player2)
                }
        } else if (player1.toLowerCase().equals("kertas")) {
                if (player2.toLowerCase().equals("gunting")) {
                        status = false
                        hasil(status, player1, player2)
                } else {
                        status = true
                        hasil(status, player1, player2)
                }
        }
}


        fun hasil (status: Boolean, p1: String, p2: String) {
                if (status) {
                        println("ya  Menang dari !! $p1 mengalahkan $p2")
                } else {
                        println("Aduh Kalah dari  !! $p2 mengalahkan $p1")
                }
                }
