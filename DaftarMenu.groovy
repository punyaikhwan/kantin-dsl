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
		clo()
		//tambah ke daftar menu
		menus << [nama: this.nama, kuantitas: this.kuantitas, harga:this.harga]
		daftarBahanTerpakai = []

	}

	def methodMissing(String methodName, args) {
        int i = 0
        boolean found = false
        while (found == false && i != StokBahan.bahans.size()) {
        	if (StokBahan.bahans[i].nama == methodName) {
        		found = true
        		StokBahan.bahans[i].kuantitas += args[0]
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
		clo()
	}

	def cekStokMenu() {
		return menus
	}

}
