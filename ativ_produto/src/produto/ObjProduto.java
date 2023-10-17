package produto;

public class ObjProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto(1,"mariaca",0.10);
		System.out.println(produto.getId());
		System.out.println("Nome: "+ produto.getNome());
		System.out.println("Preço: "+ produto.getPreco());
		
		Sorvete sorv = new Sorvete(2, "flocos",10.5,25.5);
		System.out.println(sorv.getId());
		System.out.println("Sabor: "+ sorv.getNome());
		System.out.println("Valor: "+ sorv.getPreco());
		System.out.println("Tempo Adequado: "+ sorv.getTempoAdequado());
		
		Camisa cam = new Camisa(3, "manga comprida", 123.5, "preto", "algodão", "M");
		System.out.println(cam.getId());
		System.out.println("Nome: "+ cam.getNome());
		System.out.println("Preço: "+ cam.getPreco());
		System.out.println("Cor: "+ cam.getCor());
		System.out.println("Tecido: "+ cam.getTecido());
		System.out.println("Tamanho: "+ cam.getTamanho());

	}

}
