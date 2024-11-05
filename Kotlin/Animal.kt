interface Animal {
    fun fazerSom()
    fun mover()
}

class Cachorro : Animal {
    override fun fazerSom() {
        println("Cachorro faz: Au Au")
    }

    override fun mover() {
        println("Cachorro está correndo")
    }
}

class Gato : Animal {
    override fun fazerSom() {
        println("Gato faz: Miau")
    }

    override fun mover() {
        println("Gato está caminhando silenciosamente")
    }
}
