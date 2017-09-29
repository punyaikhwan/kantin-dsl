import DaftarMenu
import Pelanggan
import StokBahan

def menu = new DaftarMenu()
def pelanggan = new Pelanggan()
def stok = new StokBahan()

stok.buat {
	tambahStok{
		bawang_merah 10
		bawang_putih 10
		bayam 10
		beras 10
	}
	println cekStokBahan()
}

menu.buat {
	masak {
		nama "Nasi"
		kuantitas 10
		harga 3000
		bahan {
			beras 5
		}
	}
	masak {
		nama "Tahu"
		kuantitas 10
		harga 500
		bahan {
			tahu 10
		}
	}
	masak {
		nama "Sayur Bayam"
		kuantitas 10
		harga 2000
		bahan {
			bayam 5
			garam 3
			bawang_merah 10
		}
	}
}

pelanggan.buat {
	daftarBeli {
		tambahItem("Nasi", 1)
		tambahItem("Tahu", 2)
		tambahItem("Sayur", 1)
	}
	hitung()
}