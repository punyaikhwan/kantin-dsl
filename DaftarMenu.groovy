import StokBahan
class DaftarMenu {
	public static def menus = []

	def nama //nama makanan
	def kuantitas //kuantitas makanan
	def harga //harga makanan
	def daftarBahanTerpakai = []

	def static buat(closure) {
        DaftarMenu daftarMenu= new DaftarMenu()
        // any method called in closure will be delegated to the DaftarMenu class
        closure.delegate = daftarMenu
        closure()
	}

	def masak(clo) {
		if (clo() == 0) {
			//tambah ke daftar menu
			menus << [nama: this.nama, kuantitas: this.kuantitas, harga:this.harga]	
		}
	}

	def methodMissing(String methodName, args) {
        int i = 0
        boolean found = false
        while (found == false && i != StokBahan.bahans.size()) {
        	if (StokBahan.bahans[i].nama == methodName) {
        		found = true
        		if (StokBahan.bahans[i].kuantitas >= args[0]) {
        			StokBahan.bahans[i].kuantitas -= args[0]
        			return 0	
        		} else {
        			println methodName+" hanya tersisa "+StokBahan.bahans[i].kuantitas+"."
        			println nama+" batal dimasak."
        			return -1
        		}
        	} else {
        		i++
        	}
        }
    }

	def nama(String nama) {
		this.nama = nama
	}

	def kuantitas(int kuantitas) {
		this.kuantitas = kuantitas
	}

	def harga (int harga) {
		this.harga = harga
	}
	def bahan(clo) {
		return clo()
	}

	def cekStokMenu() {
		return menus
	}

}
