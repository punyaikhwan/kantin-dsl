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
}

menu.buat {
	masak {
		nama "nasi"
		kuantitas 10
		harga 3000
		bahan {
			beras 5
		}
	}
	masak {
		nama "tahu"
		kuantitas 10
		harga 500
		bahan {
			tahu 10
		}
	}
	masak {
		nama "sayur_bayam"
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
		nasi 1
		tahu 3
		sayur_bayam 4
	}
	println "Harga Bayar : "+ hitung()
}