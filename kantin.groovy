import DaftarMenu
import Pelanggan

def menu = new DaftarMenu()
def pelanggan = new Pelanggan()

menu.buat {
	tambahMenu("Donat", 40, 5000)
	tambahMenu("Nasi", 20, 4000)
	tambahMenu("Tahu", 10, 500)
	tambahMenu("Sayur", 10, 2000)
}

pelanggan.buat {
	daftarBeli {
		tambahItem("Nasi", 1)
		tambahItem("Tahu", 2)
		tambahItem("Sayur", 1)
	}
	hitung()
}

pelanggan.buat {
	print riwayatPembelian()
}