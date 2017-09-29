import DaftarMenu
import TempatMakan

class Pelanggan {
	public static def daftar = []
	def daftarItem = []
	def index = 0
	def hargaTotal = 0
	def isBungkus = false
	TempatMakan tempatMakan = new TempatMakan()
	
	def static buat(closure) {
		 Pelanggan pelanggan= new Pelanggan()
        // any method called in closure will be delegated to the Pelanggan class
        closure.delegate = pelanggan
        closure()
	}

	def daftarBeli(clo) {
		isBungkus = false
		clo()
		daftar << [items: daftarItem]
	}

	def methodMissing(String methodName, args) {
        int i = 0
        boolean found = false
        while (found == false && i != DaftarMenu.menus.size()) {
        	if (DaftarMenu.menus[i].nama == methodName) {
        		found = true
        		DaftarMenu.menus[i].kuantitas -= args[0]
        	} else {
        		i++
        	}
        }
		daftarItem << [nama:methodName, kuantitas:args[0]]
    }

	def hitung() {
		hargaTotal = 0
		for (item in daftarItem) {
			for (menu in DaftarMenu.menus) {
				if (item.nama == menu.nama) {
					hargaTotal += item.kuantitas*menu.harga
				}
			}
		}
		daftar[this.index].put('harga', hargaTotal)
		this.index++
		daftarItem = []
		if (!this.isBungkus) {
			tempatMakan.kurang()
		}
		return hargaTotal
	}

	def bungkus(boolean isBungkus) {
		this.isBungkus = isBungkus
	}

	def pulang() {
		tempatMakan.tambah()
	}

	def riwayatPembelian() {
		return daftar
	}
}