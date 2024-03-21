public class Cachorro {
    public String nome;
    public int idade;
    public double peso;
    public String raca;
    public String cor;
    public String sexo;
    private String dono;

    public Cachorro(String nome, int idade, double peso, String raca, String cor, String sexo, String dono) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
        this.cor = cor;
        this.sexo = sexo;
        this.dono = dono;
    }


    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dono='" + dono + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public static void latir() {
        System.out.println("Au au!");
    }
        public static void passear() {
            System.out.println("Estou passeando!");
        }

        public static void comer() {
            System.out.println("Estou comendo!");
        }

        public static void dormir() {
            System.out.println("Estou dormindo!");
        }

        public static void brincar() {
            System.out.println("Estou brincando!");
        }
        public static void cagar() {
            System.out.println("Estou cagando!");
        }
        public static void mijar() {
            System.out.println("Estou mijando!");
        }
        public static void correr() {
            System.out.println("Estou correndo!");
        }
        public static void rosnar() {
            System.out.println("Estou rosnando!");
        }
        public static void morder() {
            System.out.println("Estou mordendo!");
        }
    }

