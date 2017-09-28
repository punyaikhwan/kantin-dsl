class DaftarMenu {
	public static def menus = []
	def static buat(closure) {
        DaftarMenu daftarMenu= new DaftarMenu()
        // any method called in closure will be delegated to the DaftarMenu class
        closure.delegate = daftarMenu
        closure()
	}

	def tambahMenu(String menu, int kuantitas, int harga) {
		menus << [nama: menu, kuantitas: kuantitas, harga:harga]
	}

	def cekStokMenu() {
		return menus
	}

}