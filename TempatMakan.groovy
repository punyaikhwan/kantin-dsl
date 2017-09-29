class TempatMakan{
	public static def ketersediaan

	def static buat(closure) {
        TempatMakan tempatMakan= new TempatMakan()
        // any method called in closure will be delegated to the TempatMakan class
        closure.delegate = tempatMakan
        closure()
	}

	def awal(int ketersediaan) {
		this.ketersediaan = ketersediaan
	}

	def tambah() {
		this.ketersediaan ++
	}

	def kurang() {
		this.ketersediaan --
	}
}