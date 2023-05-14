package biblioteca;

public abstract class Lettura {
	
	private String codISBN;
	private String titolo;
	private int anno;
	private int pagineN;
	
	public Lettura(String isbn, String titolo, int anno, int numPag) {
		this.codISBN = isbn;
		this.titolo = titolo;
		this.anno = anno;
		this.pagineN = numPag;
	}

	public String getISBN() {
		return codISBN;
	}

	public void setISBN(String isbn) {
		this.codISBN = isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getPagineN() {
		return pagineN;
	}

	public void setPagineN(int numPag) {
		this.pagineN = numPag;
	}

	@Override
	public String toString() {
		 return "Lettura: " + titolo + ", pubblicato nel: " + anno + ", lunghezza: " + pagineN + "pagine; cod. ISBN:" + codISBN;
	}

}
