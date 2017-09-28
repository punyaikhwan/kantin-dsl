import DaftarMenu
class Pelanggan {
	public static def daftar = []
	def daftarItem = []
	def index = 0
	def hargaTotal = 0
	
	def static buat(closure) {
		 Pelanggan pelanggan= new Pelanggan()
        // any method called in closure will be delegated to the Pelanggan class
        closure.delegate = pelanggan
        closure()
	}

	def daftarBeli(clo) {
		clo()
		daftar << [items: daftarItem]
	}

	def tambahItem(String makanan, int kuantitas) {
		daftarItem << [nama:makanan, kuantitas:kuantitas]
		def i = 0
		for (menu in DaftarMenu.menus) {
			if (makanan == menu.nama) {
				DaftarMenu.menus[i].kuantitas -= kuantitas
			}
			i++
		}
	}

	def hitung() {
		for (item in daftarItem) {
			for (menu in DaftarMenu.menus) {
				if (item.nama == menu.nama) {
					hargaTotal += item.kuantitas*menu.harga
				}
			}
		}
		daftar[this.index].put('harga', hargaTotal)
		this.index++
		return hargaTotal
	}

	def riwayatPembelian() {
		return daftar
	}
}