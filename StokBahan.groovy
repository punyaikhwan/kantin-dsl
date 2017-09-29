class StokBahan {
	public static def bahans = []
	def nama
	def kuantitas

	def static buat(closure) {
        StokBahan stok= new StokBahan()
        // any method called in closure will be delegated to the StokBahan class
        closure.delegate = stok
        closure()
	}

	def tambahStok(clo) {
		clo()
	}
	
	def methodMissing(String methodName, args) {
        int i = 0
        boolean found = false
        while (found == false && i != bahans.size()) {
        	if (bahans[i].nama == methodName) {
        		found = true
        		bahans[i].kuantitas += args[0]
        	} else {
        		i++
        	}
        }
        if (found == false) {
        	bahans << [nama: methodName, kuantitas: args[0]]
        }
    }

	def cekStokBahan() {
		return bahans
	}
}