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
        		if (DaftarMenu.menus[i].kuantitas >= args[0]) {
        			DaftarMenu.menus[i].kuantitas -= args[0]
        			daftarItem << [nama:methodName, kuantitas:args[0]]	
        		} else {
        			println methodName+" tersisa "+DaftarMenu.menus[i].kuantitas+" saja. Beli "+methodName+" dibatalkan."
        		}
        		
        	} else {
        		i++
        	}
        }
    }

	def hitung() {
		//Buat struk pembayaran
		println "STRUK MAKAN------------------------------------------"
		def i = 0
		println "No. | Nama item    | Kuantitas | Harga satuan | Harga"
		println "====================================================="
		hargaTotal = 0
		for (item in daftarItem) {
			for (menu in DaftarMenu.menus) {
				if (item.nama == menu.nama) {
					i++
					print i+"   | "+item.nama
					for (def j = item.nama.length(); j< 13; j++) {
						print " "
					}
					
					print "| "+item.kuantitas
					for (def j = item.kuantitas.toString().length(); j<10; j++) {
						print " "
					}

					print "| "+menu.harga
					for (def j = menu.harga.toString().length(); j<13; j++) {
						print " "
					}
					println "| "+item.kuantitas*menu.harga
					hargaTotal += item.kuantitas*menu.harga
				}
			}
		}
		daftar[this.index].put('harga', hargaTotal)
		this.index++
		daftarItem = []
		println"----------------------------------------------------+"
		print "Total"
		def totSpace = 47 -hargaTotal.toString().length() 
		for (def j=0; j<totSpace; j++) {
			print " "
		}
		println hargaTotal+"\n"
		if (!this.isBungkus) {
			tempatMakan.kurang()
			println "Pelanggan makan di tempat. Ketersediaan tempat makan = "+tempatMakan.ketersediaan+"\n\n"
		}
		return hargaTotal
	}

	def bungkus(boolean isBungkus) {
		this.isBungkus = isBungkus
	}

	def pulang() {
		tempatMakan.tambah()
		println "Satu pelanggan selesai dan pergi. Ketersediaan tempat makan = "+tempatMakan.ketersediaan+"\n\n"
	}

	def riwayatPembelian() {
		return daftar
	}
}