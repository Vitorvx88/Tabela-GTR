package tabela;

public class AttLista {
	private int ID;
	private int Abates=0;
	private int Quedas=0;
	private String Time;
	private int total=0;
	private int Index=0;
	private String setar;
	private int queda;
	private int queda1;
	private int queda2;
	private String ok;
	
	public AttLista () {
		
	}
	public AttLista (int id,String nome,int quedas,int abates,int total,int queda0, int queda1, int queda2) {
		this.ID=id;
		this.Time=nome;
		this.Quedas=quedas;
		this.Abates=abates;
		this.total=total;
		this.queda=queda0;
		this.queda1=queda1;
		this.queda2=queda2;
		//this.ok=ok;
		
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getAbates() {
		return Abates;
	}
	public void setAbates(int abates) {
		Abates = abates;
	}
	public int getQuedas() {
		return Quedas;
	}
	public void setQuedas(int quedas) {
		Quedas = quedas;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public int getIndex() {
		return Index;
	}
	public void setIndex(int index) {
		Index = index;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	public String getSetar() {
		return setar;
	}
	public void setSetar(String setar) {
		this.setar = setar;
	}
	public int getQueda() {
		return queda;
	}
	public void setQueda(int queda) {
		this.queda = queda;
	}
	public int getQueda1() {
		return queda1;
	}
	public void setQueda1(int queda1) {
		this.queda1 = queda1;
	}
	public int getQueda2() {
		return queda2;
	}
	public void setQueda2(int queda2) {
		this.queda2 = queda2;
	}
	public String getOk() {
		return ok;
	}
	public void setOk(String ok) {
		this.ok = ok;
	}
	
}
