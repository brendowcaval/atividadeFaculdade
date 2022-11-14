import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;



@Entity
public class Produto {

    @Id
    @Column(name = "codigos")
    @GeneratedValue
    private int codigo;
    @Column(name = "nomes")
    private String nome;

    @Column(name = "precos")
    private int preco;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome (String nome) {
        this. nome = nome;
    }

    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }

}
