interface Animal {
    void fazerSom();
    void mover();
}

class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro corre!");
    }
}

class Gato implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato faz: Miau!");
    }

    @Override
    public void mover() {
        System.out.println("O gato pula!");
    }
}

